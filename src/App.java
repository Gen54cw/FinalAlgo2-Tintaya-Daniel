
import static configuracion.Datos.tienda;
import controlador.ControladorInicio;
import java.util.Date;
import modelo.Tienda;
import modelo.Trabajador;
import vista.frmInicio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tintaya
 */
public class App {
    public static void main(String[] args){
        frmInicio fInicio = new frmInicio();
        configuracion.Datos.tienda.agregarTrabajador(new Trabajador("123","daniel54","Daniel","Tintaya","Avila",new Date(12, 5,2000),"1354"));
        configuracion.Datos.tienda.agregarTrabajador(new Trabajador("123","juan54","Juan","Tintaya","Avila",new Date(12, 5,2000),"1354"));
        configuracion.Datos.tienda.agregarTrabajador(new Trabajador("123","david54","David","Tintaya","Avila",new Date(12, 5,2000),"1354"));
        librerias.SerializadoraGen.serializar("info", tienda);
        ControladorInicio controlador = new ControladorInicio(configuracion.Datos.tienda, fInicio);
        controlador.iniciar();
    }
}
