package Semestre3;


/**
 * Write a description of class Diagonales here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Examen
{
    public static void main(String[] args) {
    System.out.println("Diagonales");
    Scanner teclado = new Scanner(System.in);
    System.out.println("Escribe el número de tamaño de cuadricula que desees");
    int tamaño = teclado.nextInt();
    int m=1;
    byte [][] x = new byte [tamaño][tamaño];
    
    for (int i=0;i<x.length;i++){
        for (int j=0;j<x[0].length;j++){
            x[i][j]=(byte) m++;
        }
    }
    System.out.println("");
    System.out.println("Esta es la matriz: ");
    for (int i=0;i<x.length;i++){
        for (int j=0;j<x[0].length;j++){
                if (x[i][j]>=10){
                    System.out.print(" "+x[i][j]+" ");
                }else{
                    System.out.print("  "+x[i][j]+" ");
                }
        }
        System.out.println("");
    }
    System.out.println("");
    
    

    String resultado = "El resultado es:";
    String temporal = "";

    int f=0;
    int c=0;    
    int num=0;
    
    for (f=0;f!=tamaño;f++){
        
        if (f%2==0){
        for (int cp=0;cp<x.length;cp++){
            c=cp;
            temporal+=" " + x[f][c]+",";   
        }
        }else{
        for (int cp=x.length-1;cp>=0;cp--){
            c=cp;
            temporal+=" " + x[f][c]+",";   
        }
        }
    } 
        
    

            
    resultado+=" " + temporal;
    System.out.print("" +resultado);
    
}
}

