package Semestre3;


/**
 * Write a description of class Diagonales here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Diagonales
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
    
    int f=0;
    int c=0;
    String resultado = "Sus diagonales son:";
    String temporal = "";
    
        for (int cp=0;cp<x.length;cp++){
            f=0;
            c=cp;
        
            do{
                temporal+=" " + x[f][c]+",";
                c--;
                f++;     
            }while(c>=0);
        }
    
        for (int fp=1;fp<x.length;fp++){
            f=fp;
            c=x.length-1;
        
            do{
                temporal+=" " + x[f][c]+",";
                c--;
                f++;     
            }while(f<x.length);
        }
    resultado+=" " + temporal;
    System.out.print("" +resultado);
    
}
}
