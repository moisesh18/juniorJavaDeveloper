package Semestre2;


/**
 * Write a description of class diez here.
 * 
 * @author Moises Hernandez 
 * @version 1.0
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class diez extends JFrame implements ActionListener
{
    private JTextField texto;
    private JButton Agregar;
    private JButton Mostrar;
    private JButton Borrar;
    private String [] arr = new String [100];
    private String [] conteo = new String [5];
    private int a=0;
    private JPanel panel;
  
    
    
    public static void main (String [] args){
    diez frame = new diez();
    frame.setSize(600,480);
    frame.crearGUI();
    frame.setVisible(true);
    }
    
    private void crearGUI(){ //interfaz grafica
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());
        
        panel = new JPanel();
        panel.setPreferredSize (new Dimension (600,100));
        panel.setBackground (Color.white);
        window.add(panel);
        
        texto = new JTextField (10);
        window.add(texto);
        
                
        Borrar = new JButton ("Borrar");
        window.add(Borrar);
        Borrar.addActionListener(this);
        
        Mostrar = new JButton ("Mostrar");
        window.add(Mostrar);
        Mostrar.addActionListener(this);
        
        for (int a=0;a<100;a++)
        {
        String b=(String)Math.floor(Math.random()*6);
        arr[a]= b;
        }
        
       for (int b:arr)
       {
       String busqueda = 5;
       String contar=0;
       
       if (busqueda.equals(b))
       {
        conteo [0] = contar++;
        System.out.println(conteo);
       }
       }
        
   }
   
   public void actionPerformed (ActionEvent event)
    {
    Graphics papel=panel.getGraphics();
    
    
    
        
    if (event.getSource()==Borrar)
    {
       papel.setColor(Color.white);
       papel.fillRect(0,0,500,500);
       papel.setColor(Color.black);
    }
     
    
    
    if (event.getSource()==Mostrar)
    {
     for (int b:arr)
        {System.out.println(b);}        
    }
    
    
    }

   }

     
    
