package Semestre1;
/**
 * Write a description of class SegundosSobrecargas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SegundosSobrecargas extends JFrame implements ActionListener
{
    private JButton boton;
    private JPanel panel;
    private JLabel  labelhoras;
    private JLabel  labelminutos;
    private JLabel  labelsegundos;
    private JTextField horastexto;
    private JTextField minutostexto;
    private JTextField segundostexto;
    

    
    
    public static void main (String [] args){
    SegundosSobrecargas frame = new SegundosSobrecargas();
    frame.setSize(300,400);
    frame.crearGUI();
    frame.setVisible(true);
    
    }
    
    public void crearGUI(){ //interfaz grafica
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());
                
               
        labelhoras  = new JLabel ("Escribe las horas:");
        horastexto = new JTextField (10);
        window.add(labelhoras);
        window.add(horastexto);
        
        
        labelminutos = new JLabel ("Escribe los minutos:");
        minutostexto = new JTextField (10);
        window.add(labelminutos);
        window.add(minutostexto);
        
        
        labelsegundos = new JLabel ("Escribe los segundos:");
        segundostexto = new JTextField (10);
        window.add(labelsegundos);
        window.add(segundostexto);
            
        boton = new JButton ("Haz click");
        window.add(boton);
        boton.addActionListener(this);
        
        horastexto.setText("0");
        minutostexto.setText("0");
        segundostexto.setText("0");
   }
    
    
   private void segsEn (int horas, int minutos, int segundos)
    {
        
        
        int segundostotales = (horas*3600) + (minutos*60) + segundos;
        JOptionPane.showMessageDialog(null, "El tiempo, escrito en segundos es: " +segundostotales);
    }
    
    
   private  void segsEn (int minutos, int segundos)
   {
       int horas = 0;
       int segundostotales = (minutos*60) + segundos;
       JOptionPane.showMessageDialog(null, "El tiempo, escrito en segundos es: " +segundostotales);
    }

    public void actionPerformed (ActionEvent event)
    {
             
        
        int horas = Integer.parseInt(horastexto.getText());
        int minutos = Integer.parseInt(minutostexto.getText());
        int segundos = Integer.parseInt(segundostexto.getText());;
        segsEn(horas, minutos, segundos);
        
        
                
    }
}
