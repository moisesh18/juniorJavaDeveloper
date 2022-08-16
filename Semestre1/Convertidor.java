package Semestre1;
/**
 * Write a description of class Convertidor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Convertidor extends JFrame 
{
    private JButton boton;
    private JPanel panel;
    private JLabel  escribir;
    private JTextField texto;

    
    
    public static void main (String [] args){
    Convertidor frame = new Convertidor();
    frame.crearGUI();
    
    
    }
    
    public void crearGUI(){ //interfaz grafica
        
        double pulgadas = Integer.parseInt(JOptionPane.showInputDialog("Escribe las pulgadas"));
        conversiones (pulgadas);  
        
        
   }
    
    
   private void conversiones (double pulgadas)
    {
        JOptionPane.showMessageDialog(null, "Los centimetros son: " +pulgadas*2.5);
    }
   
}
