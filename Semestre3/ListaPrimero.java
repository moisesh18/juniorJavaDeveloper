package Semestre3;


/**
 * Write a description of class ListaPrimero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.util.ArrayList;

public class ListaPrimero
{
    public static void main (String [] args){
        ArrayList <Integer> miLista = new ArrayList <Integer>();
        Scanner teclado = new Scanner(System.in);
        System.out.println("**** Acomodador de numeros ****");
        System.out.println("Escribe el numero de numeros que quieras");
        int x = teclado.nextInt();
        ArrayList [] matriz =new ArrayList[10];

        for (int j=0;j<10;j++){
            matriz[j] = new ArrayList();
        }
        
        for (int j=0;j<x;j++){
            int numero = (int)(Math.random()*10);
            miLista.add(numero);
        }
        
        System.out.println("Los numeros random fueron: ");
        System.out.println(miLista);
        
        
        for (int j=0;j<x;j++){
           int t = (int) miLista.remove(0);
           matriz[t].add(0,t);
        }
        
        System.out.println();
        System.out.print("Los numeros acomodados en los arreglos son: ");
        for (int j=0;j<10;j++){
            System.out.println(matriz[j]);
        }
        
        
        for (int j=0;j<10;j++){
        
        do{   
           
           if (matriz[j].size()!=0){
               miLista.add((int) matriz[j].remove(0));
            }
        }while(matriz[j].size()!=0);
    }
            
        System.out.println();
        System.out.print("Estos son los numeros acomodados en miLista inicial: ");
        System.out.println(miLista);

        /*
        miLista.agregarPrincipio(new Nodo(100));
        miLista.agregarPrincipio(new Nodo (70));
        miLista.agregarFinal(new Nodo(90));
        miLista.agregarFinal(new Nodo(80));
        Nodo y = miLista.eliminaPrincipio();
        System.out.println("El valor eliminado fue: " + y.getInfo());
        Nodo t= miLista.eliminarFinal();
        System.out.println("El valor eliminado fue: "+t.getInfo());
        */
    }
}
