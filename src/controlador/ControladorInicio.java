/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Persona;
import modelo.Tienda;
import vista.frmInicio;

/**
 *
 * @author tintaya
 */
public class ControladorInicio {
    Tienda modelo;
    frmInicio vista;
     public ControladorInicio(Tienda modelo, 
            frmInicio vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btnSalir.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        this.vista.btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Persona p = modelo.autenticar(vista.txtEmail.getText(), vista.txtContrasena.getText());
                if(p!=null){
                    JOptionPane.showMessageDialog(vista, p);
                }else{
                    JOptionPane.showMessageDialog(vista, "Credencial invalida");
                }
            }
        });
     }
     
}
