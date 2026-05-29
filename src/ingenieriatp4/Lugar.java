/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingenieriatp4;

/**
 *
 * @author Capotes
 */
class Lugar {
    
    
    
 String nombre;
  String direccion;
 String descripcion;
 Enum tipoLugar;

    public Lugar(String nombre, String direccion, String descripcion, Enum tipoLugar) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.descripcion = descripcion;
        this.tipoLugar = tipoLugar;
    }
    
    
    


}