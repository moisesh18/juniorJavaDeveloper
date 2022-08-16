package Semestre1;
/**
 * Write a description of class Salarios here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Salarios extends JFrame 
{
    private JButton boton;
    private JPanel panel;
    private JLabel  escribir;
    private JTextField texto;

    
    
    public static void main (String [] args){
    Salarios frame = new Salarios();
    frame.setSize(500,700);
    frame.crearGUI();
    
    
    }
    
    public void crearGUI(){ //interfaz grafica
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());
                
        int salario = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto gana el empleado mensualmente?"));
        int año = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos años trabajo?"));
        mostrarIngresos (salario,año);  
       }
    
    
   private void mostrarIngresos (int salario, int año)
    {
        JOptionPane.showMessageDialog(null, "El ingreso del empleado es: " +salario*12*año);
    }
}
        