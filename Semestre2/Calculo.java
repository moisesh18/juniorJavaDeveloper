package Semestre2;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.text.DecimalFormat;


public class Calculo extends JFrame implements ActionListener{
    
    private int año=1;
    private double montoAnterior;
    private JButton boton;
    private JLabel etiquetaInicial;
    private JTextField campoInicial;
    private JLabel etiquetaIntereses;
    private JTextField campoIntereses;
    private JTextArea areaTexto;
    private JScrollPane panelDesplazable;
    DecimalFormat formateador = new DecimalFormat("####.####");
    
    public static void main (String [] args){
    Calculo frame = new Calculo();
    frame.setSize(550,300);
    frame.crearGUI();
    frame.setVisible(true);
    
    }
    
    public void crearGUI(){ //interfaz grafica
        this.setLocationRelativeTo(null); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());
        
        
        etiquetaInicial = new JLabel ("Escribe el monto inicial");
        window.add(etiquetaInicial);
        campoInicial = new JTextField (3);
        window.add(campoInicial);
        
        etiquetaIntereses = new JLabel ("Escribe la tasa de interés");
        window.add(etiquetaIntereses);
        campoIntereses = new JTextField(3);
        window.add(campoIntereses);
        
        boton = new JButton ("Otro año");
        window.add(boton);
        boton.addActionListener (this);
        
        areaTexto = new JTextArea (20,60);
        window.add(areaTexto);
        
        panelDesplazable = new JScrollPane(areaTexto);
        window.add(areaTexto);
    }
    

    public void actionPerformed (ActionEvent event)
    {
       unAño();
    }
    
    private void unAño()
    {String nuevaLinea = "\r\n";
    double tasa, montoNuevo;
    int dolares, centavos;

    if (año == 1);
    {montoAnterior = Double.parseDouble(campoInicial.getText());}
    
    tasa= Double.parseDouble(campoIntereses.getText());
    montoNuevo = montoAnterior + (montoAnterior * tasa /100);
    dolares = (int) montoNuevo;
    centavos = (int) Math.round (100*(montoNuevo - dolares));
    areaTexto.append("Después de " +Integer.toString (año) + " año " + Integer.toString(dolares) + " Dolares y " + Integer.toString(centavos) + " centavos " + nuevaLinea);
    montoAnterior = montoNuevo;
    año++;
}
        
        
     
}