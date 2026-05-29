/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingenieriatp4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Capotes
 */
public class Match {
    
    
    
private int id_HistoryMatch;
private Soltero soltero1;
private Soltero soltero2;
private Date fechaDeIni;
private Date fechaDeFin;
private List <Meeting> salidas;
private int totalPuntos;


    
    
  
public void agregarMeenting(Meeting m){
    
    salidas.add(m);
    
    actualizarPuntos();
    
 
}



public int getTotalPuntos(){
return totalPuntos;
}

public void actualizarPuntos(){

 totalPuntos = 0;

 List<Lugar> lugaresVisitados=new ArrayList<>();
 
 
 
        for (Meeting m : salidas) {

            totalPuntos += m.getTotalPuntos();

        
        
        if(!lugaresVisitados.contains(m.getLugar())){
        
      
        lugaresVisitados.add(m.getLugar());
        
        totalPuntos +=5;
        
        
        }
        }
      
        
        

}

public void registarUnmatch(Soltero soltero1, Soltero soltero2){
    
       
}


public boolean verificaSiEsMatchExitoso(){

    actualizarPuntos();
    if (totalPuntos >= 80 || salidas.size() == 5) {
            soltero1.asignarCrush(soltero2);
            soltero2.asignarCrush(soltero1);
            return true;
        }
        return false;
    
    


}



}
