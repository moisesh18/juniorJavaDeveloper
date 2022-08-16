package Semestre1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;


public class Divisor extends JFrame implements ActionListener, ChangeListener{
    
    private Random aleatorio;
    private JPanel panel;
    private JButton boton;
    private JButton boton2;
    private JLabel label, label2;
    private JLabel resultado;
    private JTextField texto;
    private JTextField texto2;
    private JLabel inicio; 
    public Font font;
     
    
    public static void main (String [] args){
        Divisor frame = new Divisor();
    frame.setSize(620,250);
    frame.crearGUI();
    frame.setVisible(true);
    
    }
    
    public void crearGUI(){ //interfaz grafica
        this.setLocationRelativeTo(null); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());
        aleatorio =new Random();
        
         Font font = new Font("Tahoma", Font.BOLD,40); 
         Font font2 = new Font("Tahoma", Font.BOLD,30);
        
        inicio = new JLabel ("¿Mis numeros son divisores?");  
        inicio.setForeground(Color.black);
        inicio.setFont(font);
        window.add(inicio);
        
        
        label = new JLabel ("Ingresa el numero 1:");
        window.add(label);
        texto = new JTextField (3);
        window.add(texto);
              
        label2 = new JLabel ("Ingresa el numero 2:");
        window.add(label2);
        texto2 = new JTextField (3);
        window.add(texto2);
        texto2.addKeyListener(new PresionarTecla());
        
        
        boton = new JButton ("Enviar");
        window.add(boton);
        boton.addActionListener(this);
        
        
        resultado = new JLabel ("");
        window.add(resultado);
        
          
    }
    

    public void actionPerformed (ActionEvent event)
    {
          int numero =  Integer.parseInt(texto.getText());
            int numero2 = Integer.parseInt(texto2.getText());
        
        
        if (numero%numero2 != 0)
        {resultado.setText("                    Los numeros no son divisibles");
         resultado.setForeground(Color.red);}
         
        if (numero%numero2 == 0)
        {resultado.setText("                                       ¡Son divisibles!");
         resultado.setForeground(Color.green);}
    }

   
    
    
    public void stateChanged(ChangeEvent e)
    {
       
    }

    public class PresionarTecla extends KeyAdapter 
{
 
      public void keyPressed(KeyEvent ke) {
          if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
              boton.requestFocusInWindow();
              boton.doClick();
              texto.requestFocusInWindow();
          }
        }
    }}

    
   