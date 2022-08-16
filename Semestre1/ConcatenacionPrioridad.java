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

public class ConcatenacionPrioridad extends JFrame {
    private JTextField textField ;
    
    public static void main (String [] args){
    ConcatenacionPrioridad marco = new ConcatenacionPrioridad();
    marco.setSize(150,200);
    marco.createGUI();
    marco.setVisible(true);
    }
    
    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());
        int n=2, i=3;
        String s, nota = "la respuesta es ";
        // el parentesis da prioridad!
        s =nota + (n +i);
        JOptionPane.showMessageDialog (null, "La respuesta es" + s);
        
    }
}
