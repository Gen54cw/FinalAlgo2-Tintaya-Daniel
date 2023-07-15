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
public class Producto {
    private float precio;
    private String nombre;
    private int stock;
    private String marca;
    private Categoria cat;

    public Producto(float precio, String nombre, int stock, String marca) {
        this.precio = precio;
        this.nombre = nombre;
        this.stock = stock;
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getMarca() {
        return marca;
    }

    public Categoria getCat() {
        return cat;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public boolean vender(int cantidad){
        boolean result = false;
        if(this.stock>=cantidad){

            result=true;
        }
        return result;        
    }
    public boolean reponer(int cantidad){
        boolean result = false;
        this.stock+=cantidad;
        return result;        
    }
}
