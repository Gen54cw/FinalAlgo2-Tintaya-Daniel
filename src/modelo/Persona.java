/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author tintaya
 */
public class Persona implements Serializable{
    private String nombre;
    private String paterno;
    private String materno;
    private Date nacimiento;
    private String numDocumento;
    Trabajador trabajador;
    private Cliente cliente;

    public Persona(String nombre, String paterno, String materno, Date nacimiento, String numDocumento) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.nacimiento = nacimiento;
        this.numDocumento = numDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
