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


public class LaberintoColreal
{
    public static void main (String [] args){
        int [][] laberinto =  {{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
                               {-1, 0, 0, 0,-1, 0, 0, 0, 0,-1, 0, 0, 0,-1, 0, 0,-1, 0, 0,-1},
                               {-1, 0,-1, 0, 0,-1, 0, 0, 0,-1,-1,-1,-1, 0, 0,-1, 0,-1, 0,-1},
                               {-1, 0,-1, 0,-1, 0, 0, 0, 0, 0, 0, 0, 0, 0,-1, 0,-1,-1, 0,-1},
                               {-1, 0,-1, 0, 0, 0, 0, 0,-1, 0,-1,-1, 0, 0,-1, 0, 0, 0,-1,-1},
                               {0, 0,-1,-1,-1, 0, 0, 0, 0, 0,-1, 0, 0, 0,-1, 0, 0, 0,-1,-1},
                               {-1, 0, 0, 0,-1, 0, 0, 0, 0, 0,-1, 0, 0, 0,-1, 0, 0,-1,-1,-1},
                               {-1, 0,-1, 0,-1, 0, 0, 0, 0, 0,-1,-1, 0, 0,-1, 0, 0, 0, 0,-1},
                               {-1, 0, 0, 0,-1,-1, 0, 0, 0, 0,-1, 0, 0, 0,-1, 0,-1,-1,-1,-1},
                               {-1, 0,-1,-1, 0, 0, 0, 0, 0, 0,-1, 0,-1,-1,-1, 0,-1, 0,-1,-1},
                               {-1, 0,-1, 0, 0, 0, 0, 0,-1, 0,-1, 0, 0, 0, 0, 0,-1,-1,-1,-1},
                               {-1, 0,-1, 0, 0, 0, 0, 0, 0, 0,-1, 0, 0, 0, 0, 0,-1, 0, 0,-1},
                               {-1, 0,-1, 0, 0,-1, 0, 0, 0,-1,-1, 0,-1, 0,-1, 0, 0,-1,-1,-1},
                               {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0,-1, 0, 0, 0,-1, 0, 0, 0,-1,-1},
                               {-1, 0,-1, 0, 0, 0, 0, 0, 0, 0,-1,-1, 0, 0,-1, 0, 0, 0, 0,-1},
                               {-1, 0,-1, 0, 0, 0, 0, 0,-1, 0,-1, 0,-1, 0,-1, 0,-1,-1,-1,-1},
                               {-1, 0,-1, 0, 0,-1, 0, 0, 0, 0, 0, 0, 0,-1,-1, 0, 0, 0, 0,-1},
                               {-1, 0,-1, 0, 0,-1, 0, 0, 0, 0,-1, 0, 0, 0,-1, 0,-1,-1, 0, 0},
                               {-1, 0,-1, 0, 0,-1, 0, 0,-1, 0, 0,-1,-1, 0, 0, 0,-1, 0,-1,-1},
                               {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
                               };
        
                              
        Stack <Ubic> pila = new Stack <Ubic>();
        Queue <Ubic> cola = new LinkedList <Ubic>();
        int f = 5;
        int c =0;
        Ubic fin = new Ubic (17,18);
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
           
           
        }while(f!=6 || c!=1);         
        
        imprimir(laberinto);
            //Imprimir pila
        System.out.print(" | " + fin.getF()+", " + fin.getC() + " | ");    
        for (Ubic y:pila){
                System.out.print(" | " + y.getF()+", " + y.getC() + " | ");
        }
        System.out.print(" | " + "6" +", " + "0" + " | ");   
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