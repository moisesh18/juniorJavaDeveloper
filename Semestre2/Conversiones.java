package Semestre2;
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

public class Conversiones extends JFrame implements ActionListener {
    private JTextField pul,ps;
    private JLabel lpulgadas,lpies;
    private JButton boton;
    double r;
    
    //constructor
    public Conversiones ()
    {
        lpulgadas = new JLabel ("Ingresa las pulgadas:");
        lpies = new JLabel ("Ingresa los pies:");
        pul  = new JTextField (3);
        ps  = new JTextField (3);
        boton = new JButton ("Calculo");
              
    }
    
    
    public static void main (String [] args){
      Conversiones marco = new Conversiones();
      marco.setSize(159,250);
      marco.createGUI();
      marco.setVisible(true);}
     
    private void createGUI(){ //interfaz grafica
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());

        //agregando a la interfaz        
        window.add(lpulgadas);
        window.add(pul);
        window.add(lpies);
        window.add(ps);
        window.add(boton);
        boton.addActionListener(this); 
        
        
    }
    
    public void actionPerformed (ActionEvent event)
    {
        
        double pulgadas = (Integer.parseInt(pul.getText()))*(2.54);
        double pies = (Integer.parseInt(ps.getText()))*(30.48);
        r= pulgadas+pies;
        JOptionPane.showMessageDialog(null, "Todo eso son: " +r+ " centimetros");
    }
}
