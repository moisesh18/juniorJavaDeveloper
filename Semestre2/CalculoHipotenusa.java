package Semestre2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.text.DecimalFormat; 

public class CalculoHipotenusa extends JFrame {
    
    
    
    public static void main (String [] args){
        CalculoHipotenusa frame = new CalculoHipotenusa();
    frame.setSize(550,250);
    frame.crearGUI();
    
    
    }
    
     public void crearGUI(){ //interfaz grafica
        
        DecimalFormat decimales = new DecimalFormat("0.00");         
        double cateto1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el cateto Opuesto"));
        double cateto2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el cateto Adyacente"));
        Hipotenusa (cateto1,cateto2,decimales); 
        
        
        
   }
    
    
   private void Hipotenusa (double cateto1, double cateto2,DecimalFormat decimales)
    {
        double hip2 = Math.pow(cateto1,2) + Math.pow(cateto2,2);
        double resultado=Math.sqrt(hip2);
        JOptionPane.showMessageDialog(null, "La hipotenusa es: " +decimales.format(resultado));
    }
    

   
    }