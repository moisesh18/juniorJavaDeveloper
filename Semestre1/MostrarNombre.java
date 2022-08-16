package Semestre1;
/**
 * Write a description of class MostrarNombre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MostrarNombre extends JFrame implements ActionListener
{
    private JButton boton;
    private JPanel panel;
    private JLabel  escribir;
    private JTextField texto;

    
    
    public static void main (String [] args){
    MostrarNombre frame = new MostrarNombre();
    frame.setSize(500,700);
    frame.crearGUI();
    frame.setVisible(true);
    
    }
    
    public void crearGUI(){ //interfaz grafica
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());
        
        escribir = new JLabel ("Escribe:");
        window.add(escribir);
        
        texto = new JTextField (10);
        window.add(texto);
        
        boton = new JButton ("Haz click");
        window.add(boton);
        boton.addActionListener(this);
   }
    
    
   private void mostrarNombre ()
    {
        String hola = texto.getText();
        JOptionPane.showMessageDialog(null, "" +hola );
        
    }
    

  
    
    public void actionPerformed (ActionEvent event)
    {
        mostrarNombre ();  
                
    }
}