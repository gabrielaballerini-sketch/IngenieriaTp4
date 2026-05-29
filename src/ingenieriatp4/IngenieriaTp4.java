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
public class IngenieriaTp4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    List<Soltero> listaSolteros = new ArrayList<>();
    List<Lugar> listaLugares = new ArrayList<>();
    List<Match> listaMatches = new ArrayList<>();

    Lugar lugar1= new Lugar("Odisea", "Lamadrid 1790", "Sala de escape", TipoLugar.FUN);
    Lugar lugar2=  new Lugar("Cafecito", "junin 1667", "Cafeteria de especialidad", TipoLugar.CHILL);
    Lugar lugar3=  new Lugar("Salpicarte", "Mitre 818", "LUgar de diversion asegurada", TipoLugar.FUN);
    
    listaLugares.add(lugar1);
    listaLugares.add(lugar2);
    listaLugares.add(lugar3);
    
        System.out.println(Lugar.verLugaresDeAcuerdoAlTipo("Fun", listaLugares));
    
        
        
    }
    
}
