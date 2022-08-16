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
import java.text.DecimalFormat;

public class Llamada extends JFrame implements ActionListener {
    private JTextField hr,min,segs;
    private JLabel lhoras, lminutos, lsegundos, resultado;
    private JButton boton;
    double segundo,r,hora, minuto, costo;
    
    //constructor
    public Llamada ()
    {
        lhoras = new JLabel ("Ingresa las horas:");
        lminutos = new JLabel ("Ingresa los minutos:");
        lsegundos = new JLabel ("Ingresa los segundos:");
        hr = new JTextField (3);
        min = new JTextField (3);
        segs = new JTextField (3);
        boton = new JButton ("Calculo");
              
    }
    
    
    public static void main (String [] args){
            Llamada marco = new Llamada();
            marco.setSize(159,250);
            marco.createGUI();
            marco.setVisible(true);}
     
    private void createGUI(){ //interfaz grafica
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());

        //agregando a la interfaz        
        window.add(lhoras);
        window.add(hr);
        window.add(lminutos);
        window.add(min);
        window.add(lsegundos);
        window.add(segs);
        window.add(boton);
        boton.addActionListener(this); 
        
        
    }
    
    public void actionPerformed (ActionEvent event)
    {
        DecimalFormat formateador = new DecimalFormat("$##.#");
        hora = (Double.parseDouble(hr.getText()))*(60)*(10);
        minuto = (Double.parseDouble(min.getText()))*(10);
        segundo = (Double.parseDouble(segs.getText()))*(0.016667)*(10);
        r= (hora+minuto+segundo)/(100);
        JOptionPane.showMessageDialog(null, "El costo de la llamada es:  " +formateador.format(r));
    }
}
