/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingenieriatp4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Capotes
 */
public class Perfil {

    private double estatura;
    private double peso;
    private ColorPelo colorPelo;
    private ColorOjos colorOjos;
    private Nivel nivelCultural;
    private Nivel nivelDeCariño;
    private Nivel compañerismo;
    private Nivel alegre;
    private Nivel salidor;
    private ArrayList<String> aficiones;

    public Perfil(double estatura,double peso, ColorPelo colorPelo, 
        ColorOjos colorOjos, Nivel nivelCultura, Nivel nivelCariño, 
        Nivel compañerismo, Nivel alegre, Nivel salidor, ArrayList aficiones ) {
    }

    
    

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public ColorPelo getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(ColorPelo colorPelo) {
        this.colorPelo = colorPelo;
    }

    public ColorOjos getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(ColorOjos colorOjos) {
        this.colorOjos = colorOjos;
    }

    public Nivel getNivelCultural() {
        return nivelCultural;
    }

    public void setNivelCultural(Nivel nivelCultural) {
        this.nivelCultural = nivelCultural;
    }

    public Nivel getNivelDeCariño() {
        return nivelDeCariño;
    }

    public void setNivelDeCariño(Nivel nivelDeCariño) {
        this.nivelDeCariño = nivelDeCariño;
    }

    public Nivel getCompañerismo() {
        return compañerismo;
    }

    public void setCompañerismo(Nivel compañerismo) {
        this.compañerismo = compañerismo;
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

    public ArrayList<String> getAficiones() {
        return aficiones;
    }

    public void setAficiones(ArrayList<String> aficiones) {
        this.aficiones = aficiones;
    }

    
 

}
