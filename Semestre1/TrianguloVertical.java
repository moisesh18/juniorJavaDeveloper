package Semestre1;
/**
 * Write a description of class TrianguloVertical here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TrianguloVertical extends JFrame implements ActionListener
{
    private JButton boton;
    private JPanel panel;
    private JLabel  Tan, equis;
    private JLabel Th, ye;
    private JTextField valoran, valorx, valory;
    private JTextField valorh;
    
    
    public static void main (String [] args){
    TrianguloVertical frame = new TrianguloVertical();
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
    
    
   private void dibujarTriangulo(Graphics hoja, int x, int y, int h, int an)
    {
        h = 100;
        an = 100;
        x= 50;
        y=  50;
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