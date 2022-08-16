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
import java.text.DecimalFormatSymbols;
import java.text.DecimalFormat;


public class PromedioDouble extends JFrame {
    private JTextField textField;
    private JButton boton;
    private JLabel label;
    
    
    public static void main (String [] args){
    PromedioDouble marco = new PromedioDouble();
    marco.setSize(150,200);
    marco.createGUI();
    marco.setVisible(true);
    }
    
    private void createGUI(){ //interfaz grafica
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());
        
        double calificacion1 = new Double(JOptionPane.showInputDialog("Calculo Diferencial"));
        double  calificacion2 = new Double(JOptionPane.showInputDialog("Programación"));
        double calificacion3 = new Double(JOptionPane.showInputDialog("Mecanica"));
        double PromedioDouble = (calificacion1+calificacion2+calificacion3)/3;
        DecimalFormatSymbols simbolo = new DecimalFormatSymbols();
        simbolo.setDecimalSeparator('.');
        DecimalFormat formateador = new DecimalFormat("##.##",simbolo);
        JOptionPane.showMessageDialog(null,"El Promedio es "+ Double.valueOf(formateador.format(PromedioDouble)));

        System.exit(0);
        
    }
    
}
