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
public class Tienda {
    private String nombre;
    private String ruc;
    private String direccion;
    private Categoria categoria;
    private Producto producto;
    private Persona[] persona;

    public Tienda(String nombre, String ruc, String direccion, Categoria categoria, Producto producto, Persona persona) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void agregarCliente(Cliente c){
        
    }
    public void agregarCategoria(Categoria cat){
        
    }
    public void agregarProducto(Producto p){
        
    }
    public Producto buscarProductoPorCategoria(Categoria cat){
        Producto p = null;
        
        return p;
    }
    public Producto buscarProductoPorNombre(String nombre){
        Producto p = null;
        
        return p;       
    }
    public Persona autenticar(String email,String password){
        Persona per = null;
        
        return per;
    }
}
