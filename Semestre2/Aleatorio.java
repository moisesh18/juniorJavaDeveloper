package Semestre2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.text.DecimalFormat; 

public class Aleatorio extends JFrame {
     
    
    public static void main (String [] args){
    Aleatorio frame = new Aleatorio();
    frame.setSize(550,250);
    frame.crearGUI();
    
    
    }
    
     public void crearGUI(){ //interfaz grafica
        DecimalFormat decimales = new DecimalFormat("0");           
           
        double RA = (Math.random()*6); 

        JOptionPane.showMessageDialog(null, "Tu numero de la suerte hoy es: " +decimales.format(RA) );
        
        
   }
    

    }
  