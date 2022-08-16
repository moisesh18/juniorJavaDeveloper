package Semestre2;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Contador extends JFrame implements ActionListener
{
    private JButton iniciar;
    private JPanel panel;
    private JLabel  minutos;
    private JLabel  segundos;
    private JTextField campominutos;
    private JTextField camposegundos;
    private javax.swing.Timer tiempo;
    private int tics=0;
    private JButton detener;

    
    
    public static void main (String [] args){
    Contador frame = new Contador();
    frame.setSize(100,300);
    frame.crearGUI();
    frame.setVisible(true);
    
    }
    
    private void crearGUI(){ //interfaz grafica
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());
        
        campominutos = new JTextField (4);
        window.add(campominutos);
        minutos = new JLabel ("Min");
        window.add(minutos);
        
        
        camposegundos= new JTextField (4);
        window.add(camposegundos);
         segundos = new JLabel ("Seg");
        window.add(segundos);
        
        tiempo = new javax.swing.Timer (1000, this);
        iniciar = new JButton ("Iniciar");
        window.add(iniciar);
        iniciar.addActionListener(this);
        detener  = new JButton ("Detener");
        window.add(detener);
        detener.addActionListener(this);
   }
    

    public void actionPerformed (ActionEvent event)
    {
        if (event.getSource().equals(iniciar))
        {tiempo.start();
        camposegundos.setText (Integer.toString(tics%60));
        campominutos.setText (Integer.toString(tics/60));
        tics++;}
        else if (event.getSource().equals(detener))
            {tiempo.stop();}
        }
}