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
    
    
    
 private String nombre;
 private  String direccion;
 private String descripcion;
 private Enum tipoLugar;

    public Lugar(String nombre, String direccion, String descripcion, Enum tipoLugar) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.descripcion = descripcion;
        this.tipoLugar = tipoLugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Enum getTipoLugar() {
        return tipoLugar;
    }

    public void setTipoLugar(Enum tipoLugar) {
        this.tipoLugar = tipoLugar;
    }
    
    
    


}