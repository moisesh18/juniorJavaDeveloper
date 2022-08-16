package Semestre1;
/**
 * Write a description of class LineasAleatorias here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class LineasAleatorias extends JFrame implements ActionListener
{
    private JButton boton;
    private JPanel panel;
    private Random aleatorio = new Random();
    
    
    public static void main (String [] args){
    LineasAleatorias frame = new LineasAleatorias();
    frame.setSize(500,700);
    frame.crearGUI();
    frame.setVisible(true);
    }
    
    private void crearGUI(){ //interfaz grafica
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());
        
        // creando panel
        panel = new JPanel();
        panel. setPreferredSize (new Dimension (150,150));
        panel.setBackground (Color.orange);
        window.add(panel);
        
        //crear boton
        boton = new JButton ("Haz click");
        window.add(boton);
        boton.addActionListener(this);
   }
    
    
   private void crearlineas ()
   {
       int xt=aleatorio.nextInt(150);
        int yt=aleatorio.nextInt(150);
        int x2t = aleatorio.nextInt(150);
        int y2t= aleatorio.nextInt(150);
        Graphics papel = panel.getGraphics();
        papel.drawLine(xt,xt,x2t,y2t);
    }
    
   
    public void actionPerformed (ActionEvent event)
    { crearlineas();
        crearlineas();
        crearlineas();
        crearlineas();
        crearlineas();
        
    }
}
