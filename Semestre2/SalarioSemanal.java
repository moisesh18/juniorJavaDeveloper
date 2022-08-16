package Semestre2;


/**
 * Write a description of class SalarioSemanal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SalarioSemanal extends JFrame 
{
    private JButton boton;
    private JPanel panel;
    private JLabel  escribir;
    private JTextField texto;

    
    
    public static void main (String [] args){
    SalarioSemanal frame = new SalarioSemanal();
    frame.crearGUI();
    
    
    }
    
    public void crearGUI(){ //interfaz grafica
        
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Escribe las horas trabajadas"));
        int pago = Integer.parseInt(JOptionPane.showInputDialog("Escribe el pago por hora"));
        salario (horas,pago);  
        
   }
    
    
   private void salario (int horas, int pago)
    {
        
        
        
        
        if (horas<38)
        {JOptionPane.showMessageDialog(null, "El pago correspondiente es de: " +horas*pago);}
        
        
        if (horas>38)
        {int extras = horas-37;
         double horaextra = ((extras*pago)+(pago*0.50));
         int horanormal=37*pago;
         double salariobruto=horaextra+horanormal;
         double salariofinal = salariobruto-(salariobruto*0.10) ;
         
         
         if (salariobruto>5000)
        {JOptionPane.showMessageDialog(null, "El pago correspondiente es de: " +salariobruto+ "\n menos el 10% de impuestos queda en:" +salariofinal);}
        
         if (salariobruto<5000)
        {JOptionPane.showMessageDialog(null, "El pago correspondiente es de: " +salariobruto);}
        
         }
        
        
        
        
    }
   
}
