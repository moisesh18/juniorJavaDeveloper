package Semestre2;
/**
 * Write a description of class Exame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.*;
import javax.swing.*;
import java.util.Scanner;

public class Examen {
  
    public static void main (String [] args){
       int filas,columnas; 
       Scanner teclado = new Scanner(System.in);
       int juego = 0;
        
       System.out.println("Minesweeper Check");
       int n = teclado.nextInt();
       int ganaste=1;
      
       juego++;  
       
       do{
       
       do{
        filas= teclado.nextInt();
        do{
        columnas= teclado.nextInt();
            }while (columnas>20 && columnas>1);
       }while (filas>20 && filas>1);
       
       char numeros [][] = new char [filas][columnas];
       for (int i=0;i<numeros.length;i++){ 
           String x = teclado.next();
           for (int j=0;j<numeros[0].length;j++){
               numeros [i][j] = x.charAt(j);
           }   
       }

       char oculto [][] = new char [filas][columnas]; 
        for (int i=0;i<oculto.length;i++){ 
           for (int j=0;j<oculto[0].length;j++){
           if (numeros [i][j]=='F'){
               oculto[i][j]='F';           
            }
           else if (numeros [i][j]!='F'){
             oculto[i][j] = (char) (48+CuentaVecinos(numeros,i,j));
            }
        }
        }
        
        for (int i=0;i<oculto.length;i++){ 
           for (int j=0;j<oculto[0].length;j++){
           if (numeros[i][j]!=oculto[i][j]){
           ganaste=0;
                      }
        }
        }
        
        /*
        System.out.println(" ");
        System.out.println("oculto");
        for (int i=0;i<oculto.length;i++){ 
           for (int j=0;j<oculto[0].length;j++){
           System.out.print(oculto[i][j]+ " ");
        }
        System.out.println(" ");
        }
        
        System.out.println(" ");
        System.out.println("numeros");
        
        for (int i=0;i<numeros.length;i++){ 
           for (int j=0;j<numeros[0].length;j++){
           System.out.print(numeros[i][j]+ " ");
        }
        System.out.println(" ");
        } 
        */
        
             
        if (ganaste==1){
            System.out.println("Well done Clark!");
            ganaste=0;
        }else {
            System.out.println("Please sweep the mine again!");
            ganaste=1;
        }  
    }while(juego<=n); 
       

       }
         
    public static int CuentaVecinos(char [][]Buscaminas,int f, int c){
      int conteo=0;
        
      //superior izquierda
      if (f-1>=0 && c-1>=0 && Buscaminas[f-1][c-1]=='F'){
         conteo++;
      }
        
      //superior centro
      if (f-1>=0 && Buscaminas[f-1][c]=='F'){
         conteo++;
      }
        
      //superior derecha
      if (f-1>=0 && c+1<Buscaminas[0].length && Buscaminas[f-1][c+1]=='F'){
         conteo++;
      }
        
      //centro izquierda
      if (f>=0 && c-1>=0 && Buscaminas[f][c-1]=='F'){
         conteo++;
      }
               
      //centro derecha
      if (f>=0 && c+1<Buscaminas[0].length && Buscaminas[f][c+1]=='F'){
         conteo++;
      }
        
      //abajo izquierda
      if (f+1<Buscaminas.length && c-1>=0 && Buscaminas[f+1][c-1]=='F'){
         conteo++;
      }
        
      //abajo centro
      if (f+1<Buscaminas.length && Buscaminas[f+1][c]=='F'){
         conteo++;
      }
        
      //abajo derecha
      if (f+1<Buscaminas.length && c+1<Buscaminas[0].length && Buscaminas[f+1][c+1]=='F'){
         conteo++;
      }
      return conteo;
  }   
 }
        
   
