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

public class Globo extends JFrame implements ActionListener {
    private JTextField textField ;
    private JButton crecer, mover;
    private JPanel panel;
    private Globo globo;
    
    public static void main (String [] args){
    Globo marco = new Globo();
    marco.setSize(500,500);
    marco.createGUI();
    marco.setVisible(true);
    }
    
    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());
        
        // creando panel
        panel = new JPanel();
        panel. setPreferredSize (new Dimension (350,350));
        panel.setBackground (Color.white);
        window.add(panel);
        
        //botones de accion
        crecer = new JButton ("Haz click para crecer");
        window.add(crecer);
        crecer.addActionListener(this);
        mover = new JButton ("Haz click para mover");
        window.add(mover);        
        mover.addActionListener(this);
        
        globo = new Globo();
    }
    
    public void actionPerformed (ActionEvent event)
    { 
      Graphics papel = panel.getGraphics(); 
        if (event.getSource()==crecer)
      {}
        
      else if (event.getSource()==mover)
      {} 
    
      papel.setColor(Color.blue);
      papel.fillRect(0,0,180,180);
      
    }
    
    
}
