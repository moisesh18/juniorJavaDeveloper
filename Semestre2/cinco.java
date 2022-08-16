package Semestre2;

/**
 * Write a description of class cinco here.
 * 
 * @author Moises Hernandez 
 * @version 1.0
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class cinco extends JFrame implements ActionListener
{
    private JTextField texto;
    private JButton Agregar;
    private JButton Mostrar;
    private JButton Buscar;
    private String [] arr = new String [10];
    
    
    public static void main (String [] args){
    cinco frame = new cinco();
    frame.setSize(600,480);
    frame.crearGUI();
    frame.setVisible(true);
    }
    
    private void crearGUI(){ //interfaz grafica
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());
        
        
        texto = new JTextField (10);
        window.add(texto);
        
                
        Agregar = new JButton ("Agregar");
        window.add(Agregar);
        Agregar.addActionListener(this);
        
        Mostrar = new JButton ("Mostrar");
        window.add(Mostrar);
        Mostrar.addActionListener(this);
        
        Buscar = new JButton ("Buscar");
        window.add(Buscar);
        Buscar.addActionListener(this);
        
   }
   
   public void actionPerformed (ActionEvent event)
    {
      
    if (event.getSource()==Agregar)
    {
       
        int a=0;
       String palabra = texto.getText();
       arr[a] = palabra;
       a++;
       texto.setText ("") ;
       
    }
     
    
    if (event.getSource()==Mostrar)
    {
        
        for (String b:arr)
        {System.out.println(b);}

    }
    
    if (event.getSource()==Buscar)
    {
    }}}
     
    
