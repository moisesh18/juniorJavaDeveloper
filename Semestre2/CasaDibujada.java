package Semestre2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;



public class CasaDibujada extends JFrame implements ActionListener
{
    private JButton boton;
    private JPanel panel;
    private JLabel  Tan, equis;
    private JLabel Th, ye;
    private JTextField valoran, valorx, valory;
    private JTextField valorh;
    private Image background;
    private ImageIcon arco;
    private Color color1;
    
    public static void main (String [] args){
    CasaDibujada frame = new CasaDibujada();
    frame.setSize(700,600);
    frame.crearGUI();
    frame.setVisible(true);
    }
    
    private void crearGUI(){ //interfaz grafica
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());
        
        panel = new JPanel();
        panel. setPreferredSize (new Dimension (650,480));
        panel.setBackground (Color.white);
        window.add(panel);
        
        boton = new JButton ("Haz click");
        window.add(boton);
        boton.addActionListener(this);
        
        
        
     
   }
    
    
   private void dibujarTriangulo(Graphics hoja, int x, int y, int an, int h)
    {
        arco = new ImageIcon("arco.jpg");
        Graphics papel= panel.getGraphics();
        arco.paintIcon(this,papel,0,0);
       
        
               
        //Rect
        hoja.fillRect (x,y+h,an,y+h);
        
        
        //puerta
        hoja.setColor(Color.darkGray);
        hoja.fillRect(245,400,60,75);
        
        
        //ventana
        hoja.setColor(Color.lightGray);
        hoja.fillRect (180,300,50,50);
        hoja.fillRect (330,300,50,50);
        
        
    }
    
    public void actionPerformed (ActionEvent event)
    {
        
        int h=200;
        int an=200;
        Graphics papel = panel.getGraphics ();
        papel.setColor(Color.blue);
        dibujarTriangulo (papel,180,40,h,an);
        
    }
}