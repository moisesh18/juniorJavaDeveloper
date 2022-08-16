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

public class DolaresaPesos extends JFrame implements ActionListener{
    private JTextField textField;
    private JButton boton;
    private JLabel label;
    
    public static void main (String [] args){
    DolaresaPesos marco = new DolaresaPesos();
    marco.setSize(150,200);
    marco.createGUI();
    marco.setVisible(true);
    }
    
    private void createGUI(){ //interfaz grafica
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
  
    }
    
    public void actionPerformed (ActionEvent event){
        int centavos;
        int dolares;
        int centavosdedolar;
        centavos = Integer.parseInt (textField.getText());
        dolares = centavos / 100; //cociente
        centavosdedolar = centavos %100; //residuo
        JOptionPane.showMessageDialog(null, "Tu tienes " +dolares+ " dolares y " +centavosdedolar+ " centavos" );
    }
}
