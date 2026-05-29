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
public class Cobro {
    
    
int id_cobro;
Date fecha;
double costo;
boolean descuento;
String estado;

    public Cobro(int id_cobro, Date fecha, double costo, boolean descuento, String estado) {
        this.id_cobro = id_cobro;
        this.fecha = fecha;
        this.costo = costo;
        this.descuento = descuento;
        this.estado = estado;
    }
    
    
    


    
    
}
