/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author tintaya
 */
public class Cliente extends Persona{
    private int celular;
    private float dinero;

    public Cliente(int celular, float dinero, String nombre, String paterno, String materno, Date nacimiento, String numDocumento) {
        super(nombre, paterno, materno, nacimiento, numDocumento);
        this.celular=celular;
        this.dinero=dinero;
        
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }
    public boolean paga(){
        boolean resultado = false;
        
        return resultado;
    }
    public boolean recargarDinero(){
        boolean resultado = false;
        
        return resultado;
    }
}
