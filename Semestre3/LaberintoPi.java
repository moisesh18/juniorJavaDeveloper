package Semestre3;


/**
 * Write a description of class Laberinto1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Stack;

public class LaberintoPi
{
    public static void main (String [] args){
        int [][] hola = LabFront.regresarLab();
        char [][] laberinto =  new char [hola.length][hola.length];
        Stack <Ubic> pila = new Stack <Ubic>();
        
        //inicio
        
        int f = 0;
        int c = 0;
        for (int b=0;b<hola.length;b++){
          if (hola[b][0]==1){
              laberinto[b][0] = '-';
              f=b;
            }        
        }        
        Ubic tp = new Ubic (f,c); 
        
        //final 
        int ff=0;
        for (int b=0;b<hola.length;b++){
          if (hola[b][hola.length-1]==3){
              laberinto[b][hola.length-1] = '-';
              ff=b;
            }
        }      
        Ubic fin = new Ubic (ff,hola.length-1);        
        
        
        //convertir
        for (int r=0;r<hola.length;r++){
            for (int g=0;g<hola.length;g++){
                if (hola[r][g]==0){
                    laberinto[r][g]='x';
                }
                
                if (hola[r][g]==1){
                    laberinto[r][g]='-';
                }
            }
        }          

        
        do{
            if (laberinto[f][c+1]=='-'){
                laberinto[f][c]='*';
                pila.push(new Ubic (f,c));
                laberinto[f][++c]='R';
                Graphics papel = LabFront.regresarPanel().getGraphics ();
                papel.setColor(Color.blue);
                papel.fillRect(23*c,23*f,23,23);  pausa(60); 
            }else if (laberinto[f+1][c]=='-'){
                laberinto[f][c]='*';
                pila.push(new Ubic (f,c));
                laberinto[++f][c]='R';
                Graphics papel = LabFront.regresarPanel().getGraphics ();
                papel.setColor(Color.blue);
                papel.fillRect(23*c,23*f,23,23);  pausa(60); 
            }else if (laberinto[f][c-1]=='-'){
                laberinto[f][c]='*';
                pila.push(new Ubic (f,c));
                laberinto[f][--c]='R';
                Graphics papel = LabFront.regresarPanel().getGraphics ();
                papel.setColor(Color.blue);
                papel.fillRect(23*c,23*f,23,23);  pausa(60); 
            }else if (laberinto[f-1][c]=='-'){
                laberinto[f][c]='*';
                pila.push(new Ubic (f,c));
                laberinto[--f][c]='R';
                Graphics papel = LabFront.regresarPanel().getGraphics ();
                papel.setColor(Color.blue);
                papel.fillRect(23*c,23*f,23,23);  pausa(60); 
            }else{
                
                Graphics papel = LabFront.regresarPanel().getGraphics ();
                papel.setColor(Color.white);
                papel.fillRect(23*c,23*f,23,23);pausa(60);
                laberinto [f][c]='o';
                pila.pop();
                
                if (laberinto[f][c+1]=='*'){
                    laberinto[f][++c]='R';
                }else if (laberinto[f+1][c]=='*'){
                    laberinto[++f][c]='R'; 
                }else if (laberinto[f][c-1]=='*'){
                    laberinto[f][--c]='R'; 
                }else if (laberinto[f-1][c]=='*'){
                    laberinto[--f][c]='R'; 
                }
                
            }
            pila.push(new Ubic (f,c));
        }while(pila.peek().getF()!=fin.getF() || pila.peek().getC()!=fin.getC());   
       /*
        //imprimir laberinto
        for (char[]y:laberinto){
            for (char j:y){
            System.out.print(j + " ");
            }
            System.out.println();
        }
        
        
        //Imprimir pila
        
        for (Ubic x:pila){
            System.out.print(" | " + x.getF()+", " + x.getC() + " | ");
        }
        */
    }
    
    public static void imprimirhola (int[][] laberinto){
                //imprimir laberinto
            for (int d=0;d<laberinto.length;d++){
                for (int s=0;s<laberinto.length;s++){
                System.out.print(laberinto[d][s] + " ");
                }
                System.out.println();
            }
        System.out.println();
    } 
    public static void imprimir (char[][] laberinto){    
                    //imprimir laberinto
        for (char[]y:laberinto){
            for (char j:y){
            System.out.print(j + " ");
            }
            System.out.println();
        }
        int yh=0;
    } 
      
    public static void pausa(long sleeptime) {
    try {
        Thread.sleep(sleeptime);
    } catch (InterruptedException ex) {
        //ToCatchOrNot
    }
    }
}