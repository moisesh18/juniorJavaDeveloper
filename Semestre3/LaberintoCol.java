package Semestre3;


/**
 * Write a description of class Laberinto1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;


public class LaberintoCol
{
    public static Stack main (String [] args){
        Stack <Ubic> pila = new Stack <Ubic>();
        Queue <Ubic> cola = new LinkedList <Ubic>();
        int [][] segundo = LabFront.regresarLab();
        int [][] laberinto =  new int [segundo.length][segundo.length];
        
        for (int r=0;r<segundo.length;r++){
            for (int g=0;g<segundo.length;g++){
                if (segundo[r][g]==0){
                    laberinto[r][g]=-1;
                }
                
                if (segundo[r][g]==1){
                    laberinto[r][g]=0;
                }
                
                if (segundo[r][g]==3){
                    laberinto[r][g]=0;
                }                
                
            }
        }
        
        int f = 0;
        int c =0;
        int finicio = 0;
                
        
        
        for (int b=0;b<segundo.length;b++){
          if (segundo[b][0]==1){
              f=b;
              finicio=b;
            }
        }     
        //final
        int z = segundo.length;
        int ff=0;
        for (int b=0;b<segundo.length;b++){
          if (segundo[b][segundo.length-1]==3){
              ff=b;
            }
        }        
        Ubic fin = new Ubic (ff,segundo.length-1);
        pila.push(new Ubic (ff,segundo.length-1));
        int SDLKnskj= fin.getF();
        int jnkjn = fin.getC();
        int x=0;
        
        do{
           
           //cola 
           if (c+1<laberinto.length && laberinto[f][c+1]==0){
               cola.offer(new Ubic (f,c+1)); 
               laberinto[f][c+1]= laberinto[f][c]+1;
           }
           if (f+1<laberinto.length && laberinto[f+1][c]==0){
                cola.offer(new Ubic (f+1,c));
                laberinto[f+1][c]= laberinto[f][c]+1;
           }
           if (c-1>0 && laberinto[f][c-1]==0){
                cola.offer(new Ubic (f,c-1));
                laberinto[f][c-1]= laberinto[f][c]+1;
           }
           if (f-1>0 && laberinto[f-1][c]==0){
                cola.offer(new Ubic (f-1,c)); 
                laberinto[f-1][c]= laberinto[f][c]+1;
           }
           
           Ubic ultima = cola.poll();
           f = ultima.getF();
           c = ultima.getC();
        }while(f!=fin.getF() || c!=fin.getC());   

           f= fin.getF();
           c=fin.getC();
        do{          
            //pila
           if (c+1<laberinto.length && laberinto[f][c+1]==laberinto[f][c]-1){
               pila.push(new Ubic (f,c+1));
               c++;
           }
           if (f+1<laberinto.length && laberinto[f+1][c]==laberinto[f][c]-1){
                pila.push(new Ubic (f+1,c));
                f++;
           }
           if (c-1>0 && laberinto[f][c-1]==laberinto[f][c]-1){
                pila.push(new Ubic (f,c-1));
                c--;
           }
           if (f-1>0 && laberinto[f-1][c]==laberinto[f][c]-1){
                pila.push(new Ubic (f-1,c)); 
                f--;
           }
           
           
        }while(f!=(finicio) || c!=1);         
        
        pila.push(new Ubic (finicio,0));
        return pila;
        /*
        imprimir(laberinto);
            //Imprimir pila
        for (Ubic y:pila){
                System.out.print(" | " + y.getF()+", " + y.getC() + " | ");
        }
        */
    }
    
    public static void imprimir (int[][] laberinto){
                //imprimir laberinto
        for (int[]y:laberinto){
            for (int z:y){
                    if (z>=0 && z<10){
                    System.out.print(" "+ z+ " ");
                    }else{
                        System.out.print(" " + z);
                    }
            }
            System.out.println();
        }
        System.out.println();
    }   
}