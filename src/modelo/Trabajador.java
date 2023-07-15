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
public class Trabajador extends Persona{
    private String password;
    private String email;

    public Trabajador(String password, String email, String nombre, String paterno, String materno, Date nacimiento, String numDocumento) {
        super(nombre, paterno, materno, nacimiento, numDocumento);
        this.password=password;
        this.email=email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public boolean ingresar(String email, String password){
        boolean result = false;
        if(this.email.equals(email)&&this.password.equals(password)){
            result = true;
        }        
        return result;
    }
    public boolean salir(){
        boolean result = false;
        if(result!=false){
            System.exit(0);
        }
        return result;        
    }
    public boolean crearVenta(Cliente c){
        boolean result = false;

        return result;
    }
}
