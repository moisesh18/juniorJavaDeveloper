package Semestre2;


    
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;


public class Chescos extends JFrame implements ActionListener{
    
    private JTextField textField;
    private JButton boton;
    private JLabel label,resultado;
    private int moneda5=0, moneda2=0, moneda1=0, moneda10=0, moneda20=0, moneda50=0;
    private int precio = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto cuesta el producto?"));
    private int pago = Integer.parseInt(JOptionPane.showInputDialog("¿Con cuanto pagaras?"));
    private int cambio = pago-precio;
    
    
    public static void main (String [] args){
        Chescos frame = new Chescos();
    frame.setSize(250,250);
    frame.crearGUI();
    frame.setVisible(true);
    
    }
    
    public void crearGUI(){ //interfaz grafica
        this.setLocationRelativeTo(null); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());
        
        //Calculando el cambio
         
        
        moneda50 = (cambio/50);
        moneda20 = ((cambio)-(moneda50*50))/(20);
        moneda10 = ((cambio)-(moneda20*20)-(moneda50*50))/(10);
        moneda5 = ((cambio)-(moneda20*20)-(moneda50*50)-(moneda5*5))/(5);
        moneda2 = ((cambio)-(moneda20*20)-(moneda50*50)-(moneda5*5)-(moneda2*2))/(2);
        moneda1 = ((cambio)-(moneda20*20)-(moneda50*50)-(moneda5*5)-(moneda2*2)-(moneda1*1))/(1);
        
        resultado = new JLabel ("El resu");
          

           
        //Desplegando el resultado
        JOptionPane.showMessageDialog(null, "");
        
        //Salir
        System.exit(0);
        
    }
    

    public void actionPerformed (ActionEvent event)
    {
        
        }

   
    }