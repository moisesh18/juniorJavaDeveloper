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

public class Promedio extends JFrame {
    private JTextField textField;
    private JButton boton;
    private JLabel label;
    
    public static void main (String [] args){
    Promedio marco = new Promedio();
    marco.setSize(150,200);
    marco.createGUI();
    marco.setVisible(true);
    }
    
    private void createGUI(){ //interfaz grafica
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());
        
        int calificacion1 = Integer.parseInt(JOptionPane.showInputDialog("Matematicas"));
        int  calificacion2 = Integer.parseInt(JOptionPane.showInputDialog("Programación"));
        int calificacion3 = Integer.parseInt(JOptionPane.showInputDialog("Pensamiento Critico"));
        double promedio = (calificacion1+calificacion2+calificacion3)/3;
        JOptionPane.showMessageDialog(null, "El promedio es " +promedio);
        System.exit(0);
        
    }
    
}
