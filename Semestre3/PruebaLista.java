package Semestre3;


/**
 * Write a description of class PruebaLista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class PruebaLista
{
    public static void main (String [] args){
        Lista miLista = new Lista();
        Scanner teclado = new Scanner(System.in);
        System.out.println("**** Acomodador de numeros ****");
        System.out.println("Escribe el numero de numeros que quieras");
        int x = teclado.nextInt();
        Lista [] matriz =new Lista[10];

        for (int j=0;j<10;j++){
            matriz[j] = new Lista();
        }
        
        for (int j=0;j<x;j++){
            int numero = (int)(Math.random()*10);
            miLista.agregarPrincipio(new Nodo(numero));
        }
        
        System.out.println("Los numeros random fueron: ");
        miLista.imprimir();
        
        
        for (int j=0;j<x;j++){
           Nodo t = miLista.eliminarFinal();
       
           int y = t.getInfo();
           if (y==0){
           matriz[0].agregarPrincipio(new Nodo(y));
           }
           else if (y==1){
           matriz[1].agregarPrincipio(new Nodo(y));
           }    
           else if (y==2){
           matriz[2].agregarPrincipio(new Nodo(y));
           }
           else if (y==3){
           matriz[3].agregarPrincipio(new Nodo(y));
           }    
           else if (y==4){
           matriz[4].agregarPrincipio(new Nodo(y));
           }
           else if (y==5){
           matriz[5].agregarPrincipio(new Nodo(y));
           }
           else if (y==6){
           matriz[6].agregarPrincipio(new Nodo(y));
           } 
           else if (y==7){
           matriz[7].agregarPrincipio(new Nodo(y));
           }
           else if (y==8){
           matriz[8].agregarPrincipio(new Nodo(y));
           }    
           else if (y==9){
           matriz[9].agregarPrincipio(new Nodo(y));
           }             
        }
        
        System.out.println();
        System.out.print("Los numeros acomodados en los arreglos son: ");
        for (int j=0;j<10;j++){
            matriz[j].imprimir();
            System.out.println();
        }
        
        
        for (int j=0;j<10;j++){
        Nodo t;
        do{   
           t = matriz[j].eliminaPrincipio();
           if (t!=null){
               int num=t.getInfo();
               miLista.agregarFinal(new Nodo(num));
            }
        }while(t!=null);
    }
            
        System.out.println();
        System.out.print("Estos son los numeros acomodados en miLista inicial: ");
        miLista.imprimir();

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
