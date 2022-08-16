package Semestre1;
/**
 * Write a description of class Estacionamiento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Estacionamiento extends JFrame implements ActionListener
{
    private JButton boton;
    private JPanel panel;
    private JLabel  Tan, equis;
    private JLabel Th, ye;
    private JTextField valoran, valorx, valory;
    private JTextField valorh;
    private int conteoauto=0;
    
    
    public static void main (String [] args){
    Estacionamiento frame = new Estacionamiento();
    frame.setSize(500,700);
    frame.crearGUI();
    frame.setVisible(true);
    
    }
    
    public void crearGUI(){ //interfaz grafica
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());
        
        panel = new JPanel();
        panel. setPreferredSize (new Dimension (400,500));
        panel.setBackground (Color.orange);
        window.add(panel);
        
        boton = new JButton ("Haz click para sumar un auto");
        window.add(boton);
        boton.addActionListener(this);
        
        
   }
    
    
   private void cuentas()
    {
        conteoauto=conteoauto+1;               
        
    }
    

  
    
    public void actionPerformed (ActionEvent event)
    {
        cuentas ();  
        JOptionPane.showMessageDialog(null, "Tienes" + conteoauto);
        
    }
}