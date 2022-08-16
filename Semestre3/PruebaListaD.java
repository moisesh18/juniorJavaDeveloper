package Semestre3;


/**
 * Write a description of class PruebaListaD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class PruebaListaD
{
    public static void main (String [] args){
        ListaD miListaD = new ListaD();        
        
        for (int j=10;j<=20;j++){
            miListaD.agregarFinal(new NodoD(j));
        }
        
        for (int j=0;j<=10;j++){
            miListaD.agregarPrincipio(new NodoD(j));
        }        
        
        int a = miListaD.eliminaPrincipio().getInfo();
        int b = miListaD.eliminarFinal().getInfo();
        int c= miListaD.eliminarPos(3).getInfo();
        
        
        //imprimir
        miListaD.imprimirNormal();
        miListaD.imprimirInverso();
        System.out.println();
        System.out.println("Elimina principio: " +a + " Elimina final: " +b+ " EliminaPos: " +c);
    }
}
