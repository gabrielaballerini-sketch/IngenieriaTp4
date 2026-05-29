/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingenieriatp4;

import java.util.Date;

/**
 *
 * @author Capotes
 */
class Meeting {

    private int idMeeting;
    private Lugar lugar;
    private Date fecha;
    private String detalle;
    private Soltero soltero1;
    private Soltero soltero2;
    private NivelEncuentro reaccion1;
    private NivelEncuentro reaccion2;
    private int totalPuntos;

    public Meeting(int idMeeting, Lugar lugar, Date fecha, String detalle, Soltero soltero1, Soltero soltero2) {
        this.idMeeting = idMeeting;
        this.lugar = lugar;
        this.fecha = fecha;
        this.detalle = detalle;
        this.soltero1 = soltero1;
        this.soltero2 = soltero2;
        this.totalPuntos = 0;
    }

    public int getIdMeeting() {
        return idMeeting;
    }

    public void setIdMeeting(int idMeeting) {
        this.idMeeting = idMeeting;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Soltero getSoltero1() {
        return soltero1;
    }

    public void setSoltero1(Soltero soltero1) {
        this.soltero1 = soltero1;
    }

    public Soltero getSoltero2() {
        return soltero2;
    }

    public void setSoltero2(Soltero soltero2) {
        this.soltero2 = soltero2;
    }

    public NivelEncuentro getReaccion1() {
        return reaccion1;
    }

    public void setReaccion1(NivelEncuentro reaccion1) {
        this.reaccion1 = reaccion1;
    }

    public NivelEncuentro getReaccion2() {
        return reaccion2;
    }

    public void setReaccion2(NivelEncuentro reaccion2) {
        this.reaccion2 = reaccion2;
    }

   
    
    
    public void registrarReaccion(Soltero s, NivelEncuentro reaccion){
    
    
    if(s==soltero1){
    
    reaccion1=reaccion;
    }
    
    if(s==soltero2){
    reaccion2=reaccion;
    
    }
    calcularPuntos();
    
    
    }
        
    
    
    public void calcularPuntos() {
        totalPuntos = obtenerPuntos(reaccion1) + obtenerPuntos(reaccion2);

    }

    private int obtenerPuntos(NivelEncuentro reaccion) {

          
        if(reaccion== null){
           return 0;
        }
                
        
        switch (reaccion) {
            
          
            case LIKE:
                return 20;

            case REGULAR:
                return 10;

            case DISLIKE:
                return -50;

            default:
                return 0;

        }

    }

    public int getTotalPuntos(){
    
    return totalPuntos;
    }
    
    
    
}
