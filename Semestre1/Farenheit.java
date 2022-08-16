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

public class Farenheit extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton boton;
    private JLabel label;
    private JTextField texto;
    private JComboBox elegir;
    private JLabel descripcion;
    
    public static void main (String [] args){
    Farenheit marco = new Farenheit();
    marco.setSize(500,200);
    marco.createGUI();
    marco.setVisible(true);
    }
    
    private void createGUI(){ //interfaz grafica
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());
        
        
        descripcion = new JLabel ("Escribe los grados que quieres convertir, y selecciona a qué escala lo quieres");
        window.add(descripcion);
        texto = new JTextField (5);
        window.add(texto);
        
        String[] elegirStrings = { "", "Celsius", "Farenheit"};
        elegir = new JComboBox(elegirStrings);
        elegir.setSelectedIndex(0);
        elegir.addActionListener(this);
        window.add(elegir);
    }
    
    
    public void actionPerformed (ActionEvent event)
    {
        if (elegir.getSelectedItem().equals("Celsius"))
          {
        int x = Integer.parseInt(texto.getText());
        int c = (x - 32) * 5 / 9;
        JOptionPane.showMessageDialog(null, "Los grados Farenheits (" +x+ ") que ingresaste, equivalen a " +c+ " grados celsius");  }
          
        if (elegir.getSelectedItem().equals("Farenheit"))
          {
        int x = Integer.parseInt(texto.getText());
        int f = (x* 9/5) + 32 ;
        JOptionPane.showMessageDialog(null, "Los grados Celsius (" +x+ ") que ingresaste, equivalen a " +f+ " grados Farenheits");}
                
    }
    
}
