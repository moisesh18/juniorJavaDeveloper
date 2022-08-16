package Semestre1;
/**
 * Write a description of class boveda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

    import java.awt.*;
    import java.awt.event.*;
    import javax.swing.*;
    import java.awt.event.KeyAdapter;
    import java.awt.event.KeyEvent;



public class boveda extends JFrame implements ActionListener
{
    private JButton boton;
    private JPanel panel;
    private JLabel a;
    private JPasswordField b;

    
    public static void main (String [] args){
    boveda frame = new boveda();
    frame.setSize(300,400);
    frame.crearGUI();
    frame.setVisible(true);
    
    }
    
    public void crearGUI(){ //interfaz grafica
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());
                
               
        a = new JLabel ("Escribe la contraseña:");
        window.add(a);
        
        b = new JPasswordField(7);
        window.add(b);
        
        boton = new JButton ("Entrar");
        window.add(boton);
        boton.addActionListener(this);
        b.addKeyListener(new PresionarTecla());

    }
   
    
       
    public void actionPerformed (ActionEvent event)
    {
      Icon icono = new ImageIcon("bienvenido.png"); 
      Icon icono2 = new ImageIcon("triste.png"); 
        
        if ( (b.getText().equals("moy") )) 
      { 
          JOptionPane.showMessageDialog(null, "","¡Muy bien!",JOptionPane.PLAIN_MESSAGE,icono); 
      }          
      else 
      {
          int conteo = 0;
          conteo = conteo+1;
          if (conteo>3) 
          {System.exit(1);
           } 
          else 
          {
           JOptionPane.showMessageDialog(null, "","¡Intentalo de nuevo!",JOptionPane.PLAIN_MESSAGE,icono2);  
          }
      }
}


public class PresionarTecla extends KeyAdapter 
{
 
      public void keyPressed(KeyEvent ke) {
          if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
              boton.requestFocusInWindow();
              boton.doClick();
              b.requestFocusInWindow();
          }
      }
}

 }