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

public class Tiempo extends JFrame {
    private JTextField textField;
    private JButton boton;
    private JLabel label;
    
    public static void main (String [] args){
    Tiempo marco = new Tiempo();
    marco.setSize(150,200);
    marco.createGUI();
    marco.setVisible(true);
    }
    
    private void createGUI(){ //interfaz grafica
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());
        
        int segundos = Integer.parseInt(JOptionPane.showInputDialog("Escribe los segundos"));
        int horas = segundos/3600;
        int  minutos = (segundos-(3600*horas))/60;
        int segundostiempo = segundos-((horas*3600)+(minutos*60));    
        JOptionPane.showMessageDialog(null, "Son " +horas + " horas con " +minutos + " minutos y " +segundostiempo+ " segundos");
        System.exit(0);
        
    }
    
}
