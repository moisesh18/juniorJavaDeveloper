package Semestre1;
/**
 * Write a description of class EjemploDibujo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EjemploDibujo extends JFrame implements ActionListener
{
    private JButton boton;
    private JPanel panel;
    
    
    public static void main (String [] args){
    EjemploDibujo frame = new EjemploDibujo();
    frame.setSize(500,700);
    frame.crearGUI();
    frame.setVisible(true);
    }
    
    private void crearGUI(){ //interfaz grafica
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());
        
        panel = new JPanel();
        panel. setPreferredSize (new Dimension (400,500));
        panel.setBackground (Color.orange);
        window.add(panel);
        
        boton = new JButton ("Haz click");
        window.add(boton);
        boton.addActionListener(this);
    }
    
    
   private void dibujarlogo(Graphics hoja, int x, int y)
    {
        hoja.drawRect(x,y,40,40); //y2
        hoja.drawRect(x,y,20,20);
        hoja.drawRect(x,y,10,10);
        
    }

    public void actionPerformed (ActionEvent event)
    {
        Graphics papel = panel.getGraphics ();
        dibujarlogo (papel,100,100);
    }
}