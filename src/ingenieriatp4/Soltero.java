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
public class Soltero {
    
    
    
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriela
 */

       
    
private int dni;
private String nombre;
private String apellido;
private String direccion;
private String localidad;
private String email;
private int edad;
private String sexo;
private boolean hijos;
private String foto;
private Tarjeta tarjeta;
private Soltero crush;
 private EstadoCivil estadoCivil;
private Perfil perfil;
private Preferencias preferencias;
 
private boolean activo;
private EstadoCivil estado;

private String estadoMatch;

   
 

    public Soltero() {
    }



   public Soltero(int dni, String nombre, String apellido) {
    this.dni = dni;
    this.nombre = nombre;
    this.apellido = apellido;
    this.activo = true;
    this.estadoMatch = "unmatched";
    
}
    
    
public void cerrarSesion(){

}
public void modificarDatos(){}


public void darseDeBaja(){
    this.activo=false;
    
    
this.crush=null;

}



public void asignarCrush(Soltero nuevoCrush){
this.crush=nuevoCrush;
this.estadoMatch = "matched";

}


public void eliminarCrush(){

    this.crush=null;
    this.estadoMatch = "unmatched";
    

}






    
    

    


    
    
}

    
    
    

