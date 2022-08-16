package Semestre2;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CirculosConcentricos extends JFrame implements ActionListener
{
    private JButton boton;
    private JPanel panel;
    
    
    public static void main (String [] args){
    CirculosConcentricos frame = new CirculosConcentricos();
    frame.setSize(500,700);
    frame.crearGUI();
    frame.setVisible(true);
    }
    
    private void crearGUI(){ //interfaz grafica
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());
        
        panel = new JPanel();
        panel. setPreferredSize (new Dimension (500,500));
        panel.setBackground (Color.orange);
        window.add(panel);
        
        boton = new JButton ("Haz click");
        window.add(boton);
        boton.addActionListener(this);
    }
    
    
   private void dibujarlogo(Graphics hoja, int x, int y)
    {
        
        hoja.setColor(Color.lightGray);
        hoja.fillOval(100,100,300,300);
        
        hoja.setColor(Color.gray);
        hoja.fillOval(105,105,290,290);
        
        hoja.setColor(Color.magenta);
        hoja.fillOval(110,110,280,280);
        
        hoja.setColor(Color.darkGray);
        hoja.fillOval(115,115,270,270);
        
        hoja.setColor(Color.red);
        hoja.fillOval(120,120,260,260);
        
        hoja.setColor(Color.green);
        hoja.fillOval(125,125,250,250);
        
        hoja.setColor(Color.yellow);
        hoja.fillOval(130,130,240,240);
        
        hoja.setColor(Color.cyan);
        hoja.fillOval(135,135,230,230);
        
        hoja.setColor(Color.pink);
        hoja.fillOval(140,140,220,220);
        
        hoja.setColor(Color.orange);
        hoja.fillOval(145,145,210,210);
        
        hoja.setColor(Color.red);
        hoja.fillOval(150,150,200,200);
        
        hoja.setColor(Color.black);
        hoja.fillOval(155,155,190,190);
        
        hoja.setColor(Color.blue);
        hoja.fillOval(160,160,180,180);
        
        hoja.setColor(Color.darkGray);
        hoja.fillOval(165,165,170,170);
        
        
        hoja.setColor(Color.gray);
        hoja.fillOval(170,170,160,160);
        
        hoja.setColor(Color.gray);
        hoja.fillOval(175,175,150,150);
        
        hoja.setColor(Color.magenta);
        hoja.fillOval(180,180,140,140);
        
        hoja.setColor(Color.magenta);
        hoja.fillOval(185,185,130,130);
        
        hoja.setColor(Color.lightGray);
        hoja.fillOval(190,190,120,120);
        
        hoja.setColor(Color.white );
        hoja.fillOval(195,195,110,110);
        
        hoja.setColor(Color.cyan);
        hoja.fillOval(200,200,100,100);
        
               
        hoja.setColor(Color.pink);
        hoja.fillOval(205,205,90,90);
        
        
        
        
               
        
        
        
        }

    public void actionPerformed (ActionEvent event)
    {
        Graphics papel = panel.getGraphics ();
        dibujarlogo (papel,0,0);
    }
}