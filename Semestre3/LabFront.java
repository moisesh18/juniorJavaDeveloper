package Semestre3;
/**
 * Write a description of class LabFront here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Stack;

public class LabFront extends JFrame implements ActionListener
{
    private JButton boton, botonPi, botonCol;
    private static JPanel panel;
    private JLabel  Tan, equis;
    private JLabel Th, ye;
    private JTextField valoran, valorx, valory;
    private JTextField valorh;
    static int [][] x = LaberintoCreator.main(null);
    
   public static void main (String [] args){
    LabFront frame = new LabFront();
    frame.setSize(900,900);
    frame.crearGUI();
    frame.setVisible(true);
   }
    
    private void crearGUI(){ //interfaz grafica
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());
        
        panel = new JPanel();
        panel.setPreferredSize (new Dimension (805,805));
        panel.setBackground (Color.white);
        window.add(panel);
        
        boton = new JButton ("Generar Laberinto");
        window.add(boton);
        boton.addActionListener(this);
        botonPi = new JButton ("Resolver Pila");
        window.add(botonPi);
        botonPi.setEnabled(false);
        botonPi.addActionListener(this);   
        botonCol = new JButton ("Resolver Col");
        window.add(botonCol);
        botonCol.setEnabled(false);
        botonCol.addActionListener(this);          
   }
   
   public void actionPerformed (ActionEvent event)
    {
        if (event.getSource().equals(boton)){
            botonCol.setEnabled(true);
            botonPi.setEnabled(true);
            Graphics papel = panel.getGraphics ();
            papel.setColor(Color.white);
            papel.fillRect(0,0,805,805);
            x=LaberintoCreator.main(null);
            for (int f=0;f<x.length;f++){
                for (int c=0;c<x.length;c++){
                    if (x[f][c]==0){
                        papel.setColor(Color.black);
                        papel.fillRect(23*c,23*f,23,23);
                    }
                }
            }
        } else if (event.getSource().equals(botonPi)){
            botonCol.setEnabled(false);
            LaberintoPi.main(null);
            boton.setEnabled(true);
            botonPi.setEnabled(false); 
        } else if (event.getSource().equals(botonCol)){
            botonPi.setEnabled(false);
            Graphics papel = panel.getGraphics ();
            Stack <Ubic> pila = LaberintoCol.main(null);
            for (int f=0;f<x.length;f++){
                for (int c=0;c<x.length;c++){
                    if (!pila.isEmpty()){
                        Ubic t = pila.pop();
                        f = t.getF();
                        c = t.getC();
                        papel.setColor(Color.blue);
                        papel.fillRect(23*c,23*f,23,23);
                        pausa(60);
                    }
                }
            } 
            botonCol.setEnabled(false);
        }
    }
    
   public static int[][] regresarLab(){
        return x;
    }
   public static JPanel regresarPanel(){
        return panel;
    }
           
    public void pausa(long sleeptime) {
    try {
        Thread.sleep(sleeptime);
    } catch (InterruptedException ex) {
        //ToCatchOrNot
    }
    }    
}