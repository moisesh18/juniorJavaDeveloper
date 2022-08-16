package Semestre1;
    
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;


public class SalarioTurnos extends JFrame implements ActionListener, ChangeListener{
    
    private Random aleatorio;
    private JPanel panel;
    private JButton boton;
    private JButton boton2;
    private JLabel label, label2;
    private JLabel resultado;
    private JTextField texto;
    private JTextField texto2;
    private JLabel inicio; 
    public Font font;
    public JComboBox dia, horario;
    
    
    public static void main (String [] args){
        SalarioTurnos frame = new SalarioTurnos();
    frame.setSize(250,250);
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
        
        inicio = new JLabel ("Salarios");  
        inicio.setForeground(Color.black);
        inicio.setFont(font);
        window.add(inicio);
        
        
        label = new JLabel ("Ingresa las horas trabajadas");
        window.add(label);
        texto = new JTextField (3);
        window.add(texto);
       
        
        String[] horarioStrings = {"Elige el horario", "Diurno", "Nocturno"};
        horario = new JComboBox(horarioStrings);
        horario.setSelectedIndex(0);
        window.add(horario);
        
        String[] diaStrings = {"Elige el día", "domingo","lunes","martes","miercoles","jueves","viernes","sabado"};
        dia = new JComboBox(diaStrings);
        dia.setSelectedIndex(0);
        dia.addActionListener(this);
        window.add(dia);
        
        resultado = new JLabel ("");
        window.add(resultado);
        
        
    }
    

    public void actionPerformed (ActionEvent event)
    {
        int a= 100;
        int b=200;
        int numero = Integer.parseInt(texto.getText());
        int d = 20;
        int no= 45;
        
        
        //diurno
        if (horario.getSelectedItem().equals("Diurno"))
        {
        resultado.setText("El salario es: " + Double.toString (numero*a));
        
        if (dia.getSelectedItem().equals("domingo")) 
        {resultado.setText("El salario es: " + Double.toString ((numero*100*0.20)+(numero*100)));}
        }
        
        
        //nocturno
        if (horario.getSelectedItem().equals("Nocturno"))
        {resultado.setText("El salario es: " +  Double.toString (numero*b));
        
        if (dia.getSelectedItem().equals("domingo")) 
        {resultado.setText("El salario es:" + Double.toString ((numero*200*0.45)+(numero*200)));}
        }
        
        
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
    }}

    
   