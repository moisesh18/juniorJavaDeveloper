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

public class conversionNumerosString extends JFrame {
    private JTextField textField ;
    
    public static void main (String [] args){
    conversionNumerosString marco = new conversionNumerosString();
    marco.setSize(150,200);
    marco.createGUI();
    marco.setVisible(true);
    }
    
    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());
        String s1, s2; //cadena de valores
        int num = 44;
        double d= 1.234;
        s1 = Integer.toString (num); //lo convierte de integrer a cadena de caracteres y el num sale 
        s2 = Double.toString (d);
        s1 = "44"; //LAS COMILLAS LO DISTINGUE STRING, PORQUE LO ACABAMOS DE CONVERTIR
        s2 = "1.234";
        //Integer.parseInt()
        //Double.parseDouble()
        JOptionPane.showMessageDialog (null, "La respuesta es" + s1);
        
    }
}
