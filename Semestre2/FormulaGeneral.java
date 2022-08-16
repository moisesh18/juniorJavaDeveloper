package Semestre2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;


public class FormulaGeneral extends JFrame {
     
    
    public static void main (String [] args){
    FormulaGeneral frame = new FormulaGeneral();
    frame.setSize(550,250);
    frame.crearGUI();
    
    
    }
    
     public void crearGUI(){ //interfaz grafica
             
        int a = Integer.parseInt(JOptionPane.showInputDialog("Escribe el primer numero"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Escribe el segundo numero"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Escribe el tercer numero"));
        double RA = ((-b)+Math.sqrt((Math.pow(b,2))-(4)*(a)*(c)))/((2)*(a));
        double RB = ((-b)-Math.sqrt((Math.pow(b,2))-(4)*(a)*(c)))/((2)*(a));
        JOptionPane.showMessageDialog(null, "El resultado uno es: " +RA+ " y el resultado dos es: " +RB);
        
        
   }
    

    }
  