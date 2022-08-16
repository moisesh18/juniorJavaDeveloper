package Semestre3;

/**
 * Write a description of class MulttiplosArray here.
 * 
 * @author Moises Hernandez 
 * @version 8/23/16
 */

import java.util.Scanner;

public class Egyptian
{
    public static void main (String [] args){     
    System.out.println("Walk like Egyptian");
    System.out.println("Escribe el numero de casos");
    Scanner teclado = new Scanner (System.in);
    int casos = teclado.nextInt();
    int juego = 0;
    int [][] pyramid = new int [casos][casos];
    

    int fila=casos-1;
    int col=0;
    int numero=1;
    pyramid[fila][col]=numero++;
    juego++;
       
   
    
    do{
    //sube
    col++;
        pyramid[fila][col]=numero++;
        
        do{
        fila--;
        pyramid[fila][col]=numero++;
        }while(col+fila!=(casos-1));
        
        do {
        col--;
        pyramid[fila][col]=numero++;    
        }while(col!=0);
      
    //baja

        
    if (fila>0){
    fila--;
        col=0;
        pyramid[fila][col]=numero++;
        
        do {
        col++;
        pyramid[fila][col]=numero++;    
        }while(col+fila!=(casos-1));
        
       fila++;
        do {
        pyramid[fila][col]=numero++; 
        fila++;
        }while(fila<casos);
     fila--;
    }
    }while(numero<=casos*casos);
 
       
        for (int i=0;i<pyramid.length;i++){ 
        for (int j=0;j<pyramid[0].length;j++){
            if (pyramid[i][j] < 10){
            System.out.print("  " + pyramid[i][j] + " ");
            } else {
            System.out.print(" " + pyramid[i][j] + " ");
            
            }
            
        }
        System.out.println(" ");
        }
        int abc= pyramid[0].length-1;
    System.out.println("El numero de la esquina superior derecha es: " + pyramid[0][abc]);    
    }
}


