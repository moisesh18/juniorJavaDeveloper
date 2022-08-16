package Semestre1;
/**
 * Write a description of class Saludo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class nombreCompleto extends JFrame {
    private JTextField textField ;
    
    public static void main (String [] args){
    nombreCompleto marco = new nombreCompleto();
    marco.setSize(150,200);
    marco.createGUI();
    marco.setVisible(true);
    }
    
    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());
        String apellidoPaterno,apellidoMaterno,nombre,nombreCompleto;
        apellidoPaterno = "far  ";
        nombre="mike ";
        nombreCompleto = apellidoPaterno +  nombre;
        JOptionPane.showMessageDialog (null, "Tu nombre es " + nombreCompleto);
    }
}
