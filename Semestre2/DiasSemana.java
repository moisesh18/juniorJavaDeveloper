package Semestre2;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;


public class DiasSemana extends JFrame implements ActionListener, ChangeListener{
    
    private Random aleatorio;
    private JPanel panel;
    private JButton boton;
    private JButton boton2;
    private JLabel label;
    private JTextField texto;
    private JLabel resultado;
    private JLabel resultado2;
    private JLabel inicio;
    private JLabel inicio2; 
    public Font font;
    
    public static void main (String [] args){
    DiasSemana frame = new DiasSemana();
    frame.setSize(550,250);
    frame.crearGUI();
    frame.setVisible(true);
    
    }
    
    public void crearGUI(){ //interfaz grafica
        this.setLocationRelativeTo(null); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());
        aleatorio =new Random();
        
         Font font = new Font("Tahoma", Font.BOLD,40); 
         Font font2 = new Font("Tahoma", Font.BOLD,30);
        
        inicio = new JLabel ("Canto ");  
        inicio2 = new JLabel ("Hoy puedo vivir otra vez");
        inicio.setForeground(Color.yellow);
        inicio.setFont(font);
        inicio2.setForeground(Color.yellow);
        inicio2.setFont(font2);

        window.add(inicio);
        window.add(inicio2);
        label = new JLabel ("Ingresa el numero del dia:");
        window.add(label);
        
        texto = new JTextField (10);
        window.add(texto);
        texto.addKeyListener(new PresionarTecla());
        
        boton = new JButton ("Enviar");
        window.add(boton);
        boton.addActionListener(this);
        
        boton2 = new JButton ("Canto completo");
        window.add(boton2);
        boton2.addActionListener(this);       
        
        resultado = new JLabel ("");
        window.add(resultado);
        
        resultado2 = new JLabel ("");
        window.add(resultado2);
    }
    

    public void actionPerformed (ActionEvent event)
    {
              
        if (event.getSource().equals(boton))
        {
               if (Integer.parseInt(texto.getText())== 1)
        {resultado.setText("Domingo ");
         resultado2.setFont(font);
         resultado2.setText ("sufrió mi corazón.");
         }
        
        if (Integer.parseInt(texto.getText())== 2)
        {resultado.setText("       Lunes ");
         resultado2.setFont(font);
         resultado2.setText ("yo recibi perdon.");}
        
        if (Integer.parseInt(texto.getText())== 3)
        {resultado.setText("       Martes ");
         resultado2.setFont(font);
         resultado2.setText ("lloré, lloré y lloré.");}
        
        if (Integer.parseInt(texto.getText())== 4)
        {resultado.setText("       Miercoles ");
         resultado2.setFont(font);
         resultado2.setText ("le alabaré.");}
        
        if (Integer.parseInt(texto.getText())== 5)
        {resultado.setText("       Jueves ");
         resultado2.setFont(font);
         resultado2.setText ("yo comencé a orar.");}
        
        if (Integer.parseInt(texto.getText())==6)
        {resultado.setText("       Viernes ");
         resultado2.setFont(font);
         resultado2.setText ("la biblia a estudiar.");}
        
        if (Integer.parseInt(texto.getText())==7)
        {resultado.setText("       Sabado ");
         resultado2.setFont(font);
         resultado2.setText ("el cielo se abrió, yo tengo a Cristo en mi corazón.");
        }
    }
        
        
        else if (event.getSource().equals(boton2))
        {JOptionPane.showMessageDialog(null, "Hoy puedo vivir otra vez, \n Hoy puedo reir otra vez aah. \n Hoy puedo amar otra vez. \n Yo tengo a Cristo en mi corazón. \n Tristezas Jesús enjugó, \n tristezas Jesús se llevó oooh, \n pensar en morir no hay razón. \n Yo tengo a Cristo en mi corazón.");}
         
    }
   
    
    
    public void stateChanged(ChangeEvent e)
    {
       
    }
      
    public class PresionarTecla extends KeyAdapter 
    {
 
      public void keyPressed(KeyEvent ke) {
          if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
              boton.requestFocusInWindow();
              boton.doClick();
              texto.requestFocusInWindow();
          }
      }
     }
    
    
}