package Semestre3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;


public class GotasdeLluvia extends JFrame implements ActionListener, ChangeListener{

    private Random aleatorio;
    private JButton boton;
    private JPanel panel;
    private JSlider slider;
    private JLabel  label;
    private JTextField campo;
    private javax.swing.Timer timer;   
    
    public static void main (String [] args){
    GotasdeLluvia frame = new GotasdeLluvia();
    frame.setSize(700,700);
    frame.crearGUI();
    frame.setVisible(true);
    
    }
    
    public void crearGUI(){ //interfaz grafica
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());
        aleatorio =new Random();
        panel = new JPanel ();
        panel.setPreferredSize(new Dimension (500,500));
        panel. setBackground(Color.white);
        window.add(panel);
        
        campo= new JTextField (5);
        window.add(campo);
        
        label = new JLabel ("Intervalo de tiempo: ");
        window.add(label);
        
        slider = new JSlider(JSlider.HORIZONTAL, 200, 1000, 500);
        
        window.add(slider);
        campo.setText(Integer.toString(slider.getValue()));
        slider.addChangeListener(this);
        
        timer = new javax.swing.Timer(1000,this);
        timer.start();
        
        

   }
    

    public void actionPerformed (ActionEvent event)
    {
        int x,y,tamaño, tamaño1;
        Graphics papel = panel.getGraphics();
        x=aleatorio.nextInt(500);
        y=aleatorio.nextInt(500);
        tamaño = aleatorio.nextInt(20);
        tamaño1 = aleatorio.nextInt(30);
        papel.setColor(Color.cyan);
        papel.fillOval(x,y, tamaño, tamaño1);
        
    }
    
    public void stateChanged(ChangeEvent e)
    {
      int timegap = slider.getValue();
      campo.setText(Integer.toString(timegap));
      timer.setDelay(timegap);
    }
}