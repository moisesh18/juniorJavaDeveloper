package Semestre1;
/**
 * Write a description of class Saludo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DolaresaPesosLabel extends JFrame implements ActionListener{
    private JTextField textField;
    private JButton boton;
    private JLabel label;
    private JLabel label2;
    private JLabel label3;
    
    public static void main (String [] args){
    DolaresaPesosLabel marco = new DolaresaPesosLabel();
    marco.setSize(150,200);
    marco.createGUI();
    marco.setVisible(true);
    }
    
    public void createGUI(){ //interfaz grafica
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());
        
        label= new JLabel ("Ingresa Centavos");
        window.add (label);
        textField = new JTextField (10);
        window.add (textField);
        boton = new JButton ("Haz click");
        window.add (boton);
        boton.addActionListener (this);
        label2 = new JLabel ("\n Tu tienes:");
        window.add (label2);
        label3 = new JLabel ("");
        label3.setVisible (false);
    }
    
    public void actionPerformed (ActionEvent event){
        int centavos;
        int dolares;
        int centavosdedolar;
        centavos = Integer.parseInt (textField.getText());
        dolares = centavos / 100; //cociente
        centavosdedolar = centavos %100; //residuo
        label3.setVisible (true);
        label3 = new JLabel ("Tu tienes " +dolares+ " dolares y " +centavosdedolar+ " centavos" );
    }
}