package Semestre2;


/**
 * Juego de Buscaminas en cumplimiento de la materia de POO.
 * 
 * @author Moisés Hernández 
 * @version 1.0 - 11/5
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Buscaminas extends JFrame implements MouseListener{
    private static int n = Integer.parseInt(JOptionPane.showInputDialog("Escribe el numero de tamaño"));
    private int cantMinas = Integer.parseInt(JOptionPane.showInputDialog("Escribe las minas"));;
    private char [][] Buscaminas = new char [n][n];
    private char [][] oculto = new char [n][n];
    private JButton [][] botones = new JButton[n][n];
    private int casi=0;
    
  public static void main (String [] args){
    Buscaminas frame = new Buscaminas();
    frame.setSize(n*70,n*70);
    frame.crearGUI();
    frame.setVisible(true);
   }
    
    
  public void crearGUI(){ //interfaz grafica
      this.setLocationRelativeTo(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      Container window = getContentPane ();
      window.setLayout(new GridLayout(n,n));
      
      //Se declara la parte grafica, una matriz de botones
      for(int fila = 0 ; fila<botones.length; fila++ ){
          for(int columna = 0;columna <botones.length ; columna++ ){
            botones[fila][columna] = new JButton();
            botones[fila][columna].addMouseListener(this);
            window.add(botones[fila][columna]);
           }
      }
      
      empezar(window);
  }
    
  public void mouseClicked(MouseEvent e) {
     JButton presion = (JButton) e.getSource();
     String presionx = presion.getText();
     if(e.isMetaDown()){
       if (presion.isEnabled()){
           
       if (presion.getText().equals("P")){
                        presion.setText("");
                        presion.setBackground(null);
                        
       }     
       
       else if (presion.getText().equals("")){
                        presion.setText("P");
                        presion.setBackground(java.awt.Color.green);
                        
       }
         System.out.println("casi " +casi);
       }
     } 
    
     else if (SwingUtilities.isLeftMouseButton(e)){
           if (presion.getText().equals("P")){}
           else{      
               for (int i = 0; i < n; i++){
                    for (int j = 0; j < n; j++){
                        if(botones[i][j]==presion){
                           presion.setText(Character.toString(Buscaminas[i][j]));
                           botones[i][j].setEnabled(false);
                           presion.setBackground(null);

                           if (Buscaminas [i][j]=='0'){
                               destapaSerie(oculto,Buscaminas,i,j);
                               botones[i][j].setText("");
                           }
            
                           if (presion.getText().equals("x")){
                               ImageIcon bomba = new ImageIcon(getClass().getResource("bomba1.png"));
                               presion.setIcon(bomba);   
                               for (i = 0; i < n; i++){
                                   for (j = 0; j < n; j++){
                                       if (Buscaminas[i][j]=='x'){
                                           if (botones[i][j].isEnabled()){
                                       bomba = new ImageIcon(getClass().getResource("bomba1.png"));
                                       botones[i][j].setIcon(bomba);
                                       botones[i][j].setText(Character.toString(Buscaminas[i][j]));
                                       botones[i][j].setEnabled(false);
                              
                                       }                               
                                       }
                                     }
                                 }
                                       
                               int c = JOptionPane.showConfirmDialog(this,"Perdiste, ¿Deseas jugar de nuevo?","Perdiste",JOptionPane.YES_NO_OPTION);
                               opciones(c);
                             }
                        } 
                    }
               }
   
   
               casi=0;
               for (int i = 0; i < n; i++){
                   for (int j = 0; j < n; j++){
                       if (botones[i][j].isEnabled()==false){
                           casi++;
                        }
                    }
                }
               System.out.println("casi " +casi);
     }
     }
   
     if (casi==(n*n-cantMinas)){
        int c = JOptionPane.showConfirmDialog(this,"Felicidades, ganaste. ¿Deseas jugar de nuevo?","Ganaste",JOptionPane.YES_NO_OPTION);
        opciones(c);
    }
  } 
  
  public void empezar(Container window){
    casi=0;
      
      //Se declara la parte grafica, una matriz de botones
      for(int fila = 0 ; fila<botones.length; fila++ ){
          for(int columna = 0;columna <botones.length ; columna++ ){
            botones[fila][columna].setIcon(null);
            botones[fila][columna].setText("");
            botones[fila][columna].setEnabled(true);
            botones[fila][columna].setBackground(null);
        }
      }
      
      //inicializamos valores a 0
    for (int f=0;f<Buscaminas.length;f++){
            for (int c=0;c<Buscaminas[0].length;c++){
                if (Buscaminas[f][c]=='x'){
                    Buscaminas[f][c]= '0';
                }
            }
    }  
    
    //Llenamos el Buscaminas con sus respectivas minas
        for (int i=1;i<=cantMinas;i++){
            int fila, col;
            do{ //haz esto:
                fila = (int) (Math.random()*Buscaminas.length); 
                col = (int) (Math.random()*(Buscaminas[0].length)); 
            }while(Buscaminas[fila][col]=='x'); 
                Buscaminas[fila][col]='x';
        }
        
      //Llamamos al metodo CuentaVecinos para poner numeros
        for (int f=0;f<Buscaminas.length;f++){
            for (int c=0;c<Buscaminas[0].length;c++){
                if (Buscaminas[f][c]!='x'){
                    Buscaminas[f][c]= (char) (48+CuentaVecinos(Buscaminas,f,c));
                }
            }
        }
    
      //Llenamos de T la nueva matriz
      for (int i=0;i<oculto.length;i++){
          for (int j=0;j<oculto[0].length;j++){
            oculto[i][j]='T';
            }
        }
      
      System.out.println(" ");
      System.out.println(" ");
      System.out.println("Juego nuevo");
      
      //imprimimos la logica del juego
        for (int i=0;i<Buscaminas.length;i++){ 
           for (int j=0;j<Buscaminas[0].length;j++){
           System.out.print(Buscaminas[i][j]+ " ");
        }
        System.out.println(" ");
        }
  }
  
  public void opciones(int c){
  if(c==0){
      Container window = getContentPane ();
      window.setLayout(new GridLayout(n,n));
      
      empezar(window);
  } 
                    
  if(c==1){
     System.exit(0);
     System.out.close();
  } 
  }
  
  public static int CuentaVecinos(char [][]Buscaminas,int f, int c){
      int conteo=0;
        
      //superior izquierda
      if (f-1>=0 && c-1>=0 && Buscaminas[f-1][c-1]=='x'){
         conteo++;
      }
        
      //superior centro
      if (f-1>=0 && Buscaminas[f-1][c]=='x'){
         conteo++;
      }
        
      //superior derecha
      if (f-1>=0 && c+1<Buscaminas[0].length && Buscaminas[f-1][c+1]=='x'){
         conteo++;
      }
        
      //centro izquierda
      if (f>=0 && c-1>=0 && Buscaminas[f][c-1]=='x'){
         conteo++;
      }
               
      //centro derecha
      if (f>=0 && c+1<Buscaminas[0].length && Buscaminas[f][c+1]=='x'){
         conteo++;
      }
        
      //abajo izquierda
      if (f+1<Buscaminas.length && c-1>=0 && Buscaminas[f+1][c-1]=='x'){
         conteo++;
      }
        
      //abajo centro
      if (f+1<Buscaminas.length && Buscaminas[f+1][c]=='x'){
         conteo++;
      }
        
      //abajo derecha
      if (f+1<Buscaminas.length && c+1<Buscaminas[0].length&& Buscaminas[f+1][c+1]=='x'){
         conteo++;
      }
      return conteo;
  }
    
  public void destapavisual (int f, int c){
        
       if (botones[f][c].getText().equals("P")){}
       else{
       botones[f][c].setText(Character.toString(Buscaminas[f][c]));
        botones[f][c].setEnabled(false);
        
        if (Buscaminas [f][c]=='0'){
                 botones[f][c].setText(" ");
        }
       }
  }
  
  public void destapaSerie (char [][] oculto, char[][] Buscaminas,int f, int c){
        
        //superior izquierda
        if (f-1>=0 && c-1>=0 && oculto[f-1][c-1]=='T'){
            destapavisual(f-1,c-1);
            oculto[f-1][c-1] = Buscaminas [f-1][c-1];
            
                if (oculto[f-1][c-1]=='0'){
                    destapaSerie(oculto, Buscaminas, f-1,c-1);
                    
                } 
        }
        
        //superior centro
        if (f-1>=0 && oculto[f-1][c]=='T'){
            destapavisual(f-1,c); 
            oculto[f-1][c] = Buscaminas [f-1][c];
             
                if (oculto[f-1][c]=='0'){
                    destapaSerie(oculto, Buscaminas, f-1,c);
                   
                } 
        }
        
        //superior derecha
        if (f-1>=0 && c+1<Buscaminas[0].length && oculto[f-1][c+1]=='T'){
            destapavisual(f-1,c+1);
            oculto[f-1][c+1] = Buscaminas [f-1][c+1];
            
                if (oculto[f-1][c+1]=='0'){
                    destapaSerie(oculto, Buscaminas, f-1,c+1);
                    
                } 
        }
        
        //centro izquierda
        if (f>=0 && c-1>=0 && oculto[f][c-1]=='T'){
            destapavisual(f,c-1);
            oculto[f][c-1] = Buscaminas [f][c-1];
            
                if (oculto[f][c-1]=='0'){
                    destapaSerie(oculto, Buscaminas, f,c-1);
                    
                } 
        }
               
        //centro derecha ARREGLADO 5:08
        if (f>=0 && c+1<Buscaminas[0].length && oculto[f][c+1]=='T'){
            destapavisual(f,c+1);
            oculto[f][c+1] = Buscaminas [f][c+1];
            
                if (oculto[f][c+1]=='0'){
                    destapaSerie(oculto, Buscaminas, f,c+1);
                    
                }
        }
        
        
        //abajo izquierda y correccion 14:33
        if (f+1<Buscaminas.length && c-1>=0 && oculto[f+1][c-1]=='T'){
            destapavisual(f+1,c-1);
            oculto[f+1][c-1] = Buscaminas [f+1][c-1];
            
                if (oculto[f+1][c-1]=='0'){
                    destapaSerie(oculto, Buscaminas, f+1,c-1);
                    
                }
        }
        
        //abajo centro CORRRECCION 14:48
        if (f+1<Buscaminas.length && oculto[f+1][c]=='T'){
            destapavisual(f+1,c);
            oculto[f+1][c] = Buscaminas [f+1][c];
            
                if (oculto[f+1][c]=='0'){
                    destapaSerie(oculto, Buscaminas, f+1,c);
                    
                }
        }
        
        //abajo derecha CORREGIDO 5:08
        if (f+1<Buscaminas.length && c+1<Buscaminas[0].length && oculto[f+1][c+1]=='T'){
            destapavisual(f+1,c+1);
            oculto[f+1][c+1] = Buscaminas [f+1][c+1];
            
                if (oculto[f+1][c+1]=='0'){
                    destapaSerie(oculto, Buscaminas, f+1,c+1);
                    
                }
        }
  }
   
  public void mousePressed(MouseEvent evento){};    
  public void mouseReleased(MouseEvent evento){};
  public void mouseEntered(MouseEvent evento){};
  public void mouseExited(MouseEvent evento){};
}
