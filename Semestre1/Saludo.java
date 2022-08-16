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

public class Saludo extends JFrame {
    private JTextField textField ;
    
    public static void main (String [] args){
    Saludo marco = new Saludo();
    marco.setSize(150,200);
    marco.createGUI();
    marco.setVisible(true);
    }
    
    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());
        textField = new JTextField("hola como están?");
        window.add(textField);
    }
}
