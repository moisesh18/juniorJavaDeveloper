package Semestre1;
/**
 * Write a description of class EjemploTriangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EjemploTriangulo extends JFrame implements ActionListener
{
    private JButton boton;
    private JPanel panel;
    private JLabel  Tan, equis;
    private JLabel Th, ye;
    private JTextField valoran, valorx, valory;
    private JTextField valorh;
    
    
    public static void main (String [] args){
    EjemploTriangulo frame = new EjemploTriangulo();
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
        
        Tan = new JLabel ("Esribe el valor de la Anchura");
        window.add (Tan);
        valoran = new JTextField (10);
        window.add (valoran);
        Th = new JLabel ("Escribe el valor de la altura");
        window.add (Th);
        valorh = new JTextField (10);
        window.add (valorh);
        
        equis = new JLabel ("Dame coordenadas en X");
        window.add (equis);
        valorx = new JTextField (10);
        window.add (valorx);
        
        ye = new JLabel ("Dame coordenada en Y      ");
        window.add (ye);
        valory = new JTextField (10);
        window.add (valory);
   }
    
    
   private void dibujarTriangulo(Graphics hoja, int x, int y, int h, int an)
    {
        h = Integer.parseInt (valorh.getText());
        an = Integer.parseInt (valoran.getText());
        x= Integer.parseInt (valorx.getText());
        y=  Integer.parseInt (valory.getText());
        hoja.drawLine   (x,y,x,(y+h)); 
        hoja.drawLine(x,y+h,(x+an),(y+h));
        hoja.drawLine((x+an),(y+h),x,y);
        
    }

    public void actionPerformed (ActionEvent event)
    {
        Graphics papel = panel.getGraphics ();
        dibujarTriangulo (papel,50,100,50,50);
    }
}