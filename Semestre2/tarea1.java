package Semestre2;
import java.awt.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class tarea1 extends JFrame implements ActionListener
{
    private JButton boton;
    private JPanel panel;
    
    
    public static void main (String [] args){
    tarea1 frame = new tarea1();
    frame.setSize(700,570);
    frame.crearGUI();
    frame.setVisible(true);
    }
    
    private void crearGUI(){ //interfaz grafica
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());
        
        panel = new JPanel();
        panel. setPreferredSize (new Dimension (670,410));
        panel.setBackground (Color.orange);
        window.add(panel);
        
        boton = new JButton ("Haz click");
        window.add(boton);
        boton.addActionListener(this);
    }
    
    
   private void dibujarlogo(Graphics hoja, int x, int y)
    {
        
        
        hoja.setColor(Color.lightGray);
        hoja.fillRect(0,0,100,100);
        
        hoja.setColor(Color.gray);
        hoja.fillRect(110,0,100,100);
       
        hoja.setColor(Color.darkGray);
        hoja.fillRect(220,0,100,100);
        
        hoja.setColor(Color.red);
        hoja.fillRect(330,0,100,100);
        
        hoja.setColor(Color.black);
        hoja.fillRect(440,0,100,100);
        
        hoja.setColor(Color.pink);
        hoja.fillRect(550,0,100,100);
        
        hoja.setColor(Color.magenta);
        hoja.fillRect(0,150,100,100);
        
        hoja.setColor(Color.yellow);
        hoja.fillRect(110,150,100,100);
        
        hoja.setColor(Color.green);
        hoja.fillRect(220,150,100,100);
        
        hoja.setColor(Color.magenta);
        hoja.fillRect(330,150,100,100);
        
        hoja.setColor(Color.cyan);
        hoja.fillRect(440,150,100,100);
        
        hoja.setColor(Color.blue);
        hoja.fillRect(550,150,100,100);
        
        hoja.setColor(Color.blue );
        hoja.fillRect(220,300,100,100);
        
    }
    
    public void actionPerformed (ActionEvent event)
    {
        Graphics papel = panel.getGraphics ();
        dibujarlogo (papel,0,0);
    }
}