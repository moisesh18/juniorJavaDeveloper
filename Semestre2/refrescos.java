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

public class refrescos extends JFrame {
    private JTextField textField;
    private JButton boton;
    private JLabel label;
    
    public static void main (String [] args){
    refrescos marco = new refrescos();
    marco.setSize(150,200);
    marco.createGUI();
    marco.setVisible(true);
    }
    
    private void createGUI(){ //interfaz grafica
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());
        
        int moneda5=0;
        int moneda2=0;
        int moneda1=0;
        int moneda10=0;
        int moneda20=0;
        int moneda50=0;
        int precio = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto cuesta el producto?"));
        int pago = Integer.parseInt(JOptionPane.showInputDialog("¿Con cuanto pagaras?"));
        int cambio = pago-precio;
         moneda50 = (cambio/50);
         moneda20 = ((cambio)-(moneda50*50))/(20);
         moneda10 = ((cambio)-(moneda20*20)-(moneda50*50))/(10);
         moneda5 = ((cambio)-(moneda20*20)-(moneda50*50)-(moneda5*5))/(5);
         moneda2 = ((cambio)-(moneda20*20)-(moneda50*50)-(moneda5*5)-(moneda2*2))/(2);
         moneda1 = ((cambio)-(moneda20*20)-(moneda50*50)-(moneda5*5)-(moneda2*2)-(moneda1*1))/(1);
        
        JOptionPane.showMessageDialog(null, "cambio " +cambio+ "\n moneda 50 " +moneda50 + "\n moneda 20 " +moneda20 + "\n moneda de 10 " +moneda10+ "\n moneda de 5 " +moneda5+ "\n moneda de 2 " +moneda2+ "\n moneda de 1 " +moneda1);
        //
        System.exit(0);
        
    }
    
}
