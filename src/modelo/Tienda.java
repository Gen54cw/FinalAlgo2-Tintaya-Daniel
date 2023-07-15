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
    private Categoria[] categoria;
    private Producto[] producto;
    private Persona[] persona;
    private int indiceCategoria=0;
    private int indiceProducto=0;
    private int indicePersona=0;

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
        this.persona[this.indicePersona] = new Persona(c.getNombre(),c.getPaterno(),c.getMaterno(),c.getNacimiento(), c.getNumDocumento());
        this.persona[this.indicePersona].setCliente(c);
        this.indicePersona++;
        
    }
    public void agregarCategoria(Categoria cat){
        this.categoria[this.indiceCategoria] = new Categoria(cat.getNombre(),cat.isDisponible());
        this.indiceCategoria++;
    }
    public void agregarProducto(Producto p){
        this.producto[this.indiceProducto] = new Producto(p.getPrecio(), p.getNombre(),p.getStock(), p.getMarca());
        this.indiceProducto++;
    }
    public Producto buscarProductoPorCategoria(Categoria cat){
        Producto resultado = null;
        for(Producto p:this.producto){
            if(p.getCat().equals(cat)){
                resultado = p;
                break;
            }
        }
        return resultado;        
    }
    public Producto buscarProductoPorNombre(String nombre){
        Producto resultado = null;
        for(Producto p:this.producto){
            if(p.getNombre().equalsIgnoreCase(nombre)){
                resultado = p;
                break;
            }
        }
        return resultado;       
    }
    public Persona autenticar(String email,String password){
        Persona resultado = null;
        for(Persona p: this.persona){
            if(p.trabajador.ingresar(email, password)){
                resultado=p;
                break;
            }
        }
        return resultado;
    }
}
