/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingenieriatp4;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Capotes
 */
class Tarjeta {
    
private int numcod;
private String titular;
private LocalDate fechaVenc;
private String banco;
private int codigo;

    public Tarjeta(int numcod, String titular, LocalDate fechaVenc, String banco, int codigo) {
        this.numcod = numcod;
        this.titular = titular;
        this.fechaVenc = fechaVenc;
        this.banco = banco;
        this.codigo = codigo;
    }

    public int getNumcod() {
        return numcod;
    }

    public void setNumcod(int numcod) {
        this.numcod = numcod;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public LocalDate getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(LocalDate fechaVenc) {
        this.fechaVenc = fechaVenc;
    }


    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "numcod=" + numcod + ", titular=" + titular + ", fechaVenc=" + fechaVenc + ", banco=" + banco + ", codigo=" + codigo + '}';
    }

    
    public boolean validarTarjeta(){
        
        LocalDate fechaActual = LocalDate.now();
    
        if (this.fechaVenc != null && this.fechaVenc.isBefore(fechaActual)) {
            System.out.println("Error: La tarjeta está vencida.");
            return false;
        }
        
        if (this.codigo < 100 || this.codigo > 999) {
            System.out.println("Error: El código de seguridad debe tener 3 dígitos.");
            return false;
        }
        
        if (this.titular == null || this.titular.trim().isEmpty() || 
            this.banco == null || this.banco.trim().isEmpty()) {
            System.out.println("Error: Faltan datos del titular o banco emisor.");
            return false;
        }
        
        if (this.numcod <= 0) {
            System.out.println("Error: Número de tarjeta inválido.");
            return false;
        }
        
        System.out.println("¡Tarjeta validada con éxito de forma local!");
        return true;
    
    }

    
    
    
}
