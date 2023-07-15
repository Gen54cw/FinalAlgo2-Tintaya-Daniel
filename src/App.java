
import controlador.ControladorInicio;
import java.util.Date;
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
        configuracion.Datos.tienda.agregarTrabajador(new Trabajador("123","gen54","Daniel","Tintaya","Avila",new Date(12, 5,2000),"1354"));
        ControladorInicio controlador = new ControladorInicio(configuracion.Datos.tienda, fInicio);
        controlador.iniciar();
    }
}
