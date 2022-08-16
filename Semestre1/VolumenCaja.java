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

public class VolumenCaja extends JFrame {
    private JTextField textField;
    private JButton boton;
    private JLabel label;
    
    public static void main (String [] args){
    VolumenCaja marco = new VolumenCaja();
    marco.setSize(150,200);
    marco.createGUI();
    marco.setVisible(true);
    }
    
    private void createGUI(){ //interfaz grafica
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());
        
        double base = new Double(JOptionPane.showInputDialog("Escribe la base"));
        double altura = new Double(JOptionPane.showInputDialog("Escribe la Altura"));
        double anchura = new Double(JOptionPane.showInputDialog("Escribe la anchura"));
        double volumen = base*altura*anchura;
        JOptionPane.showMessageDialog(null, "El volumen es " +volumen + " metros cubicos.");
        System.exit(0);
        
    }
    
}
