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
public class Venta {
    private float total;
    private Date fecha;
    private boolean estado;

    public Venta(float total, Date fecha, boolean estado) {
        this.total = total;
        this.fecha = fecha;
        this.estado = estado;
    }

    public float getTotal() {
        return total;
    }

    public Date getFecha() {
        return fecha;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    public void agregarProducto(Producto c){
        
    }
    public boolean eliminarProducto(Producto p, int cantidad){
        boolean result = false;
        
        return result;
    }
    public float validarCarrito(){
        return 0;
             
    }
}
