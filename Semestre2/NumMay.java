package Semestre2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;


public class NumMay extends JFrame {
     
    
    public static void main (String [] args){
    NumMay frame = new NumMay();
    frame.setSize(550,250);
    frame.crearGUI();
    
    
    }
    
     public void crearGUI(){ //interfaz grafica
             
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el primer numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el segundo numero"));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el tercer numero"));
        int ab = Math.max(n1,n2);
        int c = Math.max(ab,n3);
        JOptionPane.showMessageDialog(null, "El numero mayor es:  " +c);
        
        
   }
    

    }
   