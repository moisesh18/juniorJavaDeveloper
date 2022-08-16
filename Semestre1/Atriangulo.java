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
import java.text.DecimalFormat;

public class Atriangulo extends JFrame{
    private JTextField pul,ps;
    private JLabel lpulgadas,lpies;
    private JButton boton;
    double r;
    
   
    public static void main (String [] args){
    Atriangulo frame = new Atriangulo();
    frame.setSize(550,250);
    frame.crearGUI();
       
    }
    
    
    private void crearGUI()
    {
              
        double a = Integer.parseInt(JOptionPane.showInputDialog("Escribe el cateto Adyacente"));
        double b = Integer.parseInt(JOptionPane.showInputDialog("Escribe el cateto Opuesto"));
        double comprobacion = a+b;
        double c = Integer.parseInt(JOptionPane.showInputDialog("Escribe la Hipotenusa. Esta debe ser menor a " +comprobacion));
        
        while (c>=comprobacion) 
        {c = Integer.parseInt(JOptionPane.showInputDialog("LA HIPOTENUSA DEBE SER MENOR A " +comprobacion + "!!!"));}
        
        DecimalFormat formateador = new DecimalFormat("###.#");
        double s = (a+b+c)/(2);
        double area = Math.sqrt((s)*(s-a)*(s-b)*(s-c));
        JOptionPane.showMessageDialog(null, "El resultado es: " +formateador.format(area));
    }
    
    
     
    }