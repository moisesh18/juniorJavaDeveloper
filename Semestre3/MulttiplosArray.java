package Semestre3;

/**
 * Write a description of class MulttiplosArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class MulttiplosArray
{
    public static void main (String [] args){
        System.out.println("Software de Multiplos");   
        System.out.println("Escribe el ultimo numero para saber si es impar"); 
        Scanner entradaTeclado = new Scanner (System.in); 
        int tamaño = entradaTeclado.nextInt();

        boolean [] numeros = new boolean [tamaño];

        for(int i=0;i<tamaño;i++){        
            numeros[i]=true;
        }

        for (int i=2;i<tamaño;i++){

            if (numeros[i]==true){
                for (int j=i;i*j<tamaño;j++){
                    numeros[i*j]=false;
                }
            }
        }

        for (int i=1;i<tamaño;i++){
            if (numeros[i]){
                System.out.print(i+ " ");
            }
        }
    }
}
