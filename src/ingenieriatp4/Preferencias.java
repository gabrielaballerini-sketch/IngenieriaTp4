
package ingenieriatp4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Cetera Evelyn
 */
public class Preferencias {
    
    private EstadoCivil estadoCivilBusc;
    private double estaturaMin, estaturaMax;
    private double pesoMin, pesoMax;
    private int edadMin, edadMax;
    private boolean aceptaHijo;
    private ColorPelo colorPeloBusc;
    private ColorOjos colorOjosBusc;
    private Nivel nivelCultural;
    private Nivel nivelDeCarinio;
    private Nivel companierismo;
    private Nivel alegre;
    private Nivel salidor;
    private String aficiones;
    private LocalDate fechaModificacion;
    private Map <String, Integer> ponderaciones;

    public Preferencias(EstadoCivil estadoCivilBusc, double estaturaMin, double estaturaMax, double pesoMin, double pesoMax, int edadMin, int edadMax, boolean aceptaHijo, 
            ColorPelo colorPeloBusc, ColorOjos colorOjosBusc, Nivel nivelCultural, Nivel nivelDeCarinio, Nivel companierismo, Nivel alegre, Nivel salidor, String aficiones, 
            LocalDate fechaModificacion, Map<String, Integer> ponderaciones) {
        this.estadoCivilBusc = estadoCivilBusc;
        this.estaturaMin = estaturaMin;
        this.estaturaMax = estaturaMax;
        this.pesoMin = pesoMin;
        this.pesoMax = pesoMax;
        this.edadMin = edadMin;
        this.edadMax = edadMax;
        this.aceptaHijo = aceptaHijo;
        this.colorPeloBusc = colorPeloBusc;
        this.colorOjosBusc = colorOjosBusc;
        this.nivelCultural = nivelCultural;
        this.nivelDeCarinio = nivelDeCarinio;
        this.companierismo = companierismo;
        this.alegre = alegre;
        this.salidor = salidor;
        this.aficiones = aficiones;
        this.fechaModificacion = fechaModificacion;
        this.ponderaciones = ponderaciones;
    }

    public EstadoCivil getEstadoCivilBusc() {
        return estadoCivilBusc;
    }

    public void setEstadoCivilBusc(EstadoCivil estadoCivilBusc) {
        this.estadoCivilBusc = estadoCivilBusc;
    }

    public double getEstaturaMin() {
        return estaturaMin;
    }

    public void setEstaturaMin(double estaturaMin) {
        this.estaturaMin = estaturaMin;
    }

    public double getEstaturaMax() {
        return estaturaMax;
    }

    public void setEstaturaMax(double estaturaMax) {
        this.estaturaMax = estaturaMax;
    }

    public double getPesoMin() {
        return pesoMin;
    }

    public void setPesoMin(double pesoMin) {
        this.pesoMin = pesoMin;
    }

    public double getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(double pesoMax) {
        this.pesoMax = pesoMax;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }

    public int getEdadMax() {
        return edadMax;
    }

    public void setEdadMax(int edadMax) {
        this.edadMax = edadMax;
    }

    public boolean isAceptaHijo() {
        return aceptaHijo;
    }

    public void setAceptaHijo(boolean aceptaHijo) {
        this.aceptaHijo = aceptaHijo;
    }

    public ColorPelo getColorPeloBusc() {
        return colorPeloBusc;
    }

    public void setColorPeloBusc(ColorPelo colorPeloBusc) {
        this.colorPeloBusc = colorPeloBusc;
    }

    public ColorOjos getColorOjosBusc() {
        return colorOjosBusc;
    }

    public void setColorOjosBusc(ColorOjos colorOjosBusc) {
        this.colorOjosBusc = colorOjosBusc;
    }

    public Nivel getNivelCultural() {
        return nivelCultural;
    }

    public void setNivelCultural(Nivel nivelCultural) {
        this.nivelCultural = nivelCultural;
    }

    public Nivel getNivelDeCarinio() {
        return nivelDeCarinio;
    }

    public void setNivelDeCarinio(Nivel nivelDeCarinio) {
        this.nivelDeCarinio = nivelDeCarinio;
    }

    public Nivel getCompanierismo() {
        return companierismo;
    }

    public void setCompanierismo(Nivel companierismo) {
        this.companierismo = companierismo;
    }

    public Nivel getAlegre() {
        return alegre;
    }

    public void setAlegre(Nivel alegre) {
        this.alegre = alegre;
    }

    public Nivel getSalidor() {
        return salidor;
    }

    public void setSalidor(Nivel salidor) {
        this.salidor = salidor;
    }

    public String getAficiones() {
        return aficiones;
    }

    public void setAficiones(String aficiones) {
        this.aficiones = aficiones;
    }

    public LocalDate getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(LocalDate fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public int getPonderaciones(String claveAtributo) {
        if (this.ponderaciones.containsKey(claveAtributo)) {
            return this.ponderaciones.get(claveAtributo);
        } else {
            return 1; 
        }
    }

    public void setPonderaciones(Map<String, Integer> ponderaciones) {
        this.ponderaciones = ponderaciones;
    }
    public String trueOrFalse (boolean aceptaHijo){ //metodo para cambiar los valores de los atributos booleanos... por si o por no. Meramente gráfico para la consola!!!
        String valor;
        if (aceptaHijo){
            valor = "SI";
        }else {
            valor = "NO";
        }
        return valor;
    }
    @Override
    public String toString() {
        return "Preferencias{" + "Estado Civil Buscado: " + estadoCivilBusc + ",\n"
                + "Estatura Min: [" + estaturaMin + "] - Estatura Max: [" + estaturaMax + "],\n Peso Min: [" + pesoMin + "] - Peso Max: " + pesoMax + ",\n"
                + "Edad Min: [" + edadMin + "] -  Edad Max: [" + edadMax + "]\n Acepta Hijo: [" + trueOrFalse(aceptaHijo) + "],\n Color de Pelo: " + colorPeloBusc + ",\n Color de Ojos: " + colorOjosBusc + "\n" 
                + "Nivel Cultural: " + nivelCultural + ",\n Nivel De Carinio: " + nivelDeCarinio + ",\n Companierismo: " + companierismo + ",\n Alegre: " + alegre + ",\n Salidor: " + salidor + "\n" 
                + "Aficiones: " + aficiones + ",\n Fecha de Modificacion: [" + fechaModificacion + "],\n Ponderaciones: " + ponderaciones + '}';
    }




    public Preferencias modificarPreferencias(
        EstadoCivil estCiv, double nuevaEstaturaMin, double nuevaEstaturaMax, double nuevaPesoMin, double nuevaPesoMax, int nuevaEdadMin, int nuevaEdadMax, boolean nuevaAceptaHijo, 
            ColorPelo nuevoColorPelo, ColorOjos nuevoColorOjos, Nivel nuevoNivCultural, Nivel nuevoNivelDeCarinio, Nivel nuevoCompanierismo, Nivel nuevoAlegre, Nivel nuevoSalidor, String nuevasAficiones, 
            LocalDate nuevaFecha, Map<String, Integer> nuevasPonderaciones) {
        return new Preferencias(
            estCiv, nuevaEstaturaMin, nuevaEstaturaMax, nuevaPesoMin, nuevaPesoMax, nuevaEdadMin, nuevaEdadMax,  nuevaAceptaHijo, 
             nuevoColorPelo, nuevoColorOjos, nuevoNivCultural, nuevoNivelDeCarinio, nuevoCompanierismo, nuevoAlegre,  nuevoSalidor, nuevasAficiones, 
             nuevaFecha, nuevasPonderaciones
        );
    }



    public int calcularAfinidadCon(Soltero candidato) {
        int afinidadSimulada = 8;
        return afinidadSimulada;
    }
    
}
