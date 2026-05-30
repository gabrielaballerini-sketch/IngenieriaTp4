/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingenieriatp4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Capotes
 */
public class IngenieriaTp4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Soltero> listaSolteros = new ArrayList<>();
        List<Lugar> listaLugares = new ArrayList<>();
        List<Match> listaMatches = new ArrayList<>();

        Lugar lugar1 = new Lugar("Odisea", "Lamadrid 1790", "Sala de escape", TipoLugar.FUN);
        Lugar lugar2 = new Lugar("Cafecito", "junin 1667", "Cafeteria de especialidad", TipoLugar.CHILL);
        Lugar lugar3 = new Lugar("Salpicarte", "Mitre 818", "LUgar de diversion asegurada", TipoLugar.FUN);

        listaLugares.add(lugar1);
        listaLugares.add(lugar2);
        listaLugares.add(lugar3);

        System.out.println(Lugar.verLugaresDeAcuerdoAlTipo("Fun", listaLugares));

        Soltero soltero1 = new Soltero(12345, "Candidato", "DePueba");

        Map<String, Integer> ponderacionesDePrueba = new HashMap<>();
        ponderacionesDePrueba.put("edad", 5);
        ponderacionesDePrueba.put("nivelCultural", 3);

        Preferencias p1 = new Preferencias(EstadoCivil.SOLTERO, 1.60, 1.85, 50.0, 90.0, 25, 35, false,
                ColorPelo.MOROCHO, ColorOjos.MARRON,
                Nivel.ALTO,
                Nivel.ALTO,
                Nivel.MEDIO,
                Nivel.ALTO,
                Nivel.MEDIO,
                "Lectura de novelas, running y cine",
                LocalDate.now(),
                ponderacionesDePrueba);

        System.out.println("\n ------------ Ejecutando modificarPreferencias -----------------");

        Preferencias p2 = p1.modificarPreferencias(
                EstadoCivil.DIVORCIADO, p1.getEstaturaMin(), p1.getEstaturaMax(),
                p1.getPesoMin(), p1.getPesoMax(), p1.getEdadMin(), p1.getEdadMax(), p1.isAceptaHijo(),
                ColorPelo.RUBIO,
                ColorOjos.CELESTE,
                p1.getNivelCultural(), p1.getNivelDeCarinio(), p1.getCompanierismo(),
                p1.getAlegre(), p1.getSalidor(), p1.getAficiones(),
                LocalDate.now(), ponderacionesDePrueba
        );

        System.out.println("\nPreferencias (P1): " + p1.toString() + "\n");
        System.out.println("Preferencias (P2): " + p2.toString() + "\n");

        if (p1 != p2 && p1.getColorOjosBusc() == ColorOjos.MARRON) {
            System.out.println("Se modifico la preferencia correctamente");
        } else {
            System.out.println("Error al modificar preferencias.");
        }

        System.out.println("\n ------------ Ejecutando calcularAfinidad -----------------");
        
        int resultAfinidad = p1.calcularAfinidadCon(soltero1);
        System.out.println("\n Afinidad calculada con s1: " + resultAfinidad);
    
    }
    
}
