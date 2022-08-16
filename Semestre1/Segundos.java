package Semestre1;
/**
 * Write a description of class Segundos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Segundos extends JFrame 
{
    private JButton boton;
    private JPanel panel;
    private JLabel  escribir;
    private JTextField texto;

    
    
    public static void main (String [] args){
    Segundos frame = new Segundos();
    frame.setSize(500,700);
    frame.crearGUI();
    
    
    }
    
    public void crearGUI(){ //interfaz grafica
        
                
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Escribe las horas"));
        int minutos = Integer.parseInt(JOptionPane.showInputDialog("Escribe las minutos"));
        int segundos = Integer.parseInt(JOptionPane.showInputDialog("Escribe las segundos"));
        segsEn (horas,minutos,segundos); 
        
        
   }
    
    
   private void segsEn (int horas, int minutos, int segundos)
    {
        int segundostotales = (horas*3600) + (minutos*60) + segundos;
        JOptionPane.showMessageDialog(null, "El tiempo, escrito en segundos es: " +segundostotales);
    }
    

   
}
