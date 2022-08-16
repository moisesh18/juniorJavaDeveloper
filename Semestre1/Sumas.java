package Semestre1;
/**
 * Write a description of class Sumas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sumas extends JFrame implements ActionListener
{
    private JButton boton;
    private JPanel panel;
    private JLabel  signomas;
    private JTextField a;
    private JTextField b;
    private JTextField c;
    private JLabel  signoigual;

    
    
    public static void main (String [] args){
    Sumas frame = new Sumas();
    frame.setSize(300,400);
    frame.crearGUI();
    frame.setVisible(true);
    
    }
    
    public void crearGUI(){ //interfaz grafica
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());
                
               
        a = new JTextField (2);
        window.add(a);
        
        signomas = new JLabel ("+");
        window.add(signomas);
        
        b = new JTextField (2);
        window.add(b);
        
        signoigual = new JLabel ("=");
        window.add(signoigual);
        
        c = new JTextField (3);
        window.add(c);
        
   
        boton = new JButton ("Haz click para sumar, bb");
        window.add(boton);
        boton.addActionListener(this);
               
   }
    
       
    public void actionPerformed (ActionEvent event)
    {
      int n1 = Integer.parseInt(a.getText());
      int n2 = Integer.parseInt(b.getText());
      c.setText(Integer.toString(n1+n2));
                
    }
}
