package Semestre3;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import javax.swing.ButtonGroup;
public class Romberg
{
    private static DecimalFormat decimales = new DecimalFormat("0.0000000");
    private static DecimalFormat decimales1 = new DecimalFormat("0");
    private static JTextArea consola = Discretas.returnTxt();
    public static String main (int num){
        //consola.append('\n' +"""Algoritmo de Romberg");
        //consola.append('\n' +"""Escribe cuantas particiones quieres (en numeros pare    ks)");
        double [][] matriz1 =  new double [num/2][num/2];

        for (int j=0;j<num/2;j++){
            matriz1[j][1]= Trapecios.main((float) Math.pow(2,j));
            matriz1[j][0]= (float) Math.pow(2,j);
        }
        matriz1[0][1]=0;

        for (int i=2;i<num/2;i++){
            for (int j=1;j<num/2;j++){
                matriz1[j][i] = (double) (Math.pow(4,i-1)*(matriz1[j][i-1]-matriz1[j-1][i-1]))/(Math.pow(4,i-1)-1); 
            }
        }
        imprimir(matriz1);  
        return decimales.format(matriz1[matriz1.length-1][matriz1.length-1]);
    }

    public static void imprimir (double [][] matriz1){
        consola.append('\n' +"");
        for (int i=0;i<matriz1.length;i++){
            for (int j=0;j<matriz1.length;j++){
                consola.append(decimales.format(matriz1[i][j]) + "|");
            }
            consola.append('\n' +"");
        }
        consola.append('\n' +"");
    }   
    
}

