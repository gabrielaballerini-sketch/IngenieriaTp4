/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingenieriatp4;

import java.time.LocalDate;

/**
 *
 * @author Capotes
 */
public class Cobro {
    
    
private int id_cobro;
private LocalDate fecha;
private double costo;
private boolean descuento;
private String estado;

    public Cobro(int id_cobro, LocalDate fecha, double costo, boolean descuento, String estado) {
        this.id_cobro = id_cobro;
        this.fecha = fecha;
        this.costo = costo;
        this.descuento = descuento;
        this.estado = estado;
    }

    public int getId_cobro() {
        return id_cobro;
    }

    public void setId_cobro(int id_cobro) {
        this.id_cobro = id_cobro;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cobro{" + "id_cobro=" + id_cobro + ", fecha=" + fecha + ", costo=" + costo + ", descuento=" + descuento + ", estado=" + estado + '}';
    }
    
    public double calcularMontoFinal() {
        if (this.descuento) {
            return this.costo * 0.25;
        }
        return this.costo;
    }
    
    public boolean procesarPago(Tarjeta tarjetaAsociada) {
        System.out.println("Iniciando procesamiento del cobro ID: " + this.id_cobro);
        
        if (tarjetaAsociada != null && tarjetaAsociada.validarTarjeta()) {
            double montoAPagar = calcularMontoFinal();
            
            System.out.println("¡Transacción Exitosa!");
            System.out.println("Se debitaron $" + montoAPagar + " de la tarjeta de " + tarjetaAsociada.getTitular());
            
            this.estado = "PROCESADO";
            return true;
        } else {
            System.out.println("Transacción Rechazada: Tarjeta inválida o inexistente.");
            this.estado = "RECHAZADO";
            return false;
        }
    }
    
    public void emitirFactura() {
        System.out.println("\n======= FACTURA DIGITAL =======");
        System.out.println("ID Cobro: " + this.id_cobro);
        System.out.println("Fecha: " + this.fecha);
        System.out.println("Costo Base: $" + this.costo);
        System.out.println("¿Aplicó Descuento?: " + (this.descuento ? "SÍ (75% OFF)" : "NO"));
        System.out.println("Monto Final Debitado: $" + calcularMontoFinal());
        System.out.println("Estado del Pago: " + this.estado);
        System.out.println("===============================\n");
    }
   
}
