package Semestre3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class JuegoVida extends JFrame implements ActionListener{
    private Random aleatorio;
    private JPanel panel;
    private JLabel  label;
    private JTextField campo;
    private javax.swing.Timer timer;
    private int tamaño = 100;
    private char [][] life = new char [tamaño][tamaño];
    private char [][] life2 = new char [tamaño][tamaño];
    
   public static void main (String [] args){
    JuegoVida frame = new JuegoVida();
    frame.setSize(750,770);
    frame.crearGUI();
    frame.setVisible(true);
    
   }
    
    public void crearGUI(){ //interfaz grafica
    //frame
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());
        
    //panel
        panel = new JPanel ();
        panel.setPreferredSize(new Dimension (700,700));
        panel.setBackground(Color.white);
        
    //timer
        timer = new javax.swing.Timer(5,this);
        timer.start();
        aleatorio =new Random();
        
    //Agregando     
        window.add(panel);
    int vidas=tamaño*10;
    
    //Llenamos con celulas
            for (int i=1;i<=vidas;i++){
            int fila, col;
            do{ //haz esto:
                fila = (int) (Math.random()*life.length); 
                col = (int) (Math.random()*(life.length)); 
            }while(life[fila][col]=='*'); 
            life[fila][col]='*';
            }
            
            
            for (int f=0;f<life.length;f++){
                for (int c=0;c<life[0].length;c++){
                    if (life[f][c]!='*'){
                    life[f][c]= (char) (48+CuentaVecinos(life,f,c));
                    life2[f][c]= (char) (48+CuentaVecinos(life,f,c));
                    }
                    
                    else if (life[f][c]=='*'){
                    life2[f][c]= (char) (48+CuentaVecinos(life,f,c));
                    }
                                      
                }
            }
   }
    

    public void actionPerformed (ActionEvent event)
   {
    Graphics papel = panel.getGraphics();
    int var = 700/tamaño;
    
    for (int f=0;f<tamaño;f++){
       for (int c=0;c<tamaño;c++){
        //circulos
        if (life[f][c]=='*'){
        papel.setColor(Color.white);
        papel.fillRect(c*var,f*var,var,var);
        
        papel.setColor(Color.gray);
        papel.fillOval(c*var,f*var,var,var);
        papel.drawRect(c*var,f*var,var,var);
        }
        
        //cuadricula
        if (life[f][c]!='*'){
           papel.setColor(Color.white);
           papel.fillRect(c*var,f*var,var,var);            
           papel.setColor(Color.gray);
           papel.drawRect(c*var,f*var,var,var);
        }
       }
    }
    
        //segunda generacion
    for (int f=0;f<life2.length;f++){
            for (int c=0;c<life2[0].length;c++){
                
                
                /*
                if (life[f][c]!='*'){
                    life2[f][c]= (char) (48+CuentaVecinos(life,f,c));
                }else{
                life2[f][c]= (char) (48+CuentaVecinos(life,f,c));
                }
                */
                
         
                //si esta muerta, para que nazca
                if (life[f][c]!='*'){
                    
                    if (life2[f][c]=='3'){
                        life[f][c]='*';
                             
                    }else{
                        life[f][c]= (char) (48+CuentaVecinos(life,f,c));  
                    }
                }
                
                //si esta viva
                else if (life[f][c]=='*'){
                    if (life2[f][c]=='2' || life2[f][c]=='3'){
                    life[f][c]='*';
                    //life2[f][c]= (char) (48+CuentaVecinos(life,f,c));  
                    }                 
                    else if (life2[f][c]!='3' || life2[f][c]!='2'){
                        life[f][c]=life2[f][c];
                        //life2[f][c]= (char) (48+CuentaVecinos(life,f,c));
                    }
                }
                
            }
        }
        
        
        
    //leyendo matriz nueva
                for (int f=0;f<life.length;f++){
                for (int c=0;c<life[0].length;c++){
                    if (life[f][c]!='*' || life[f][c]=='*'){
                        life2[f][c]= (char) (48+CuentaVecinos(life,f,c)); 
                    }
                }
            }
    }

 
   public static int CuentaVecinos(char [][]life,int f, int c){
      int conteo=0;
        
      //superior izquierda
      if (f-1>=0 && c-1>=0 && life[f-1][c-1]=='*'){
         conteo++;
      }
        
      //superior centro
      if (f-1>=0 && life[f-1][c]=='*'){
         conteo++;
      }
        
      //superior derecha
      if (f-1>=0 && c+1<life[0].length && life[f-1][c+1]=='*'){
         conteo++;
      }
        
      //centro izquierda
      if (f>=0 && c-1>=0 && life[f][c-1]=='*'){
         conteo++;
      }
               
      //centro derecha
      if (f>=0 && c+1<life[0].length && life[f][c+1]=='*'){
         conteo++;
      }
        
      //abajo izquierda
      if (f+1<life.length && c-1>=0 && life[f+1][c-1]=='*'){
         conteo++;
      }
        
      //abajo centro
      if (f+1<life.length && life[f+1][c]=='*'){
         conteo++;
      }
        
      //abajo derecha
      if (f+1<life.length && c+1<life[0].length&& life[f+1][c+1]=='*'){
         conteo++;
      }
      return conteo;
   }
}