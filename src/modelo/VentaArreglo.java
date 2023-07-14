/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author tintaya
 */
public class VentaArreglo {
    private int indice;
    private Venta[] venta;

    public VentaArreglo(int tamano) {
        this.venta = new Venta[tamano];
        this.indice=0;
    }
    public boolean registrarVenta(Venta v){
        boolean result = false;
        
        return result;        
    }
    public void agregar(Venta v){
        this.venta[this.indice] = v;
        this.indice++;
    }
}
