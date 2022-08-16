package Semestre3;


/**
 * Write a description of class ListaPrimero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import javax.swing.ButtonGroup;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;

public class Matrices
{
    
    public static JTextArea consola = Discretas.returnTxt();
    public static void main (int [][] matriz1,int[][]matriz2){
        /*
        int [][] matriz1 =  {{2,1,3},
                             {4,2,6},
                             {5,7,12}};
        int [][] matriz2 =  {{6,2},
                             {3,6},
                             {1,2}};
        */
        int n = matriz1.length;
        int m = matriz1[0].length;
        int n2 = matriz2.length;
        int m2 = matriz2[0].length;                     
        int [][] matriz3 =  new int [n][m2];
        int c=0;
        if (m != n2){
            consola.append('\n' +"No eran iguales :'v");
        }else{
            for (int i=0;i<n;i++){
                for (int j=0;j<m2;j++){
        
                    for (int k=0;k<n;k++){
                        matriz3[i][j]+=matriz1[i][k]*matriz2[k][j];
                    }
                    c=0;
                }
            }
            consola.append('\n' +"El resultado es: "+ '\n');
            for (int i=0;i<matriz3.length;i++){
                for (int j=0;j<matriz3[0].length;j++){
                    consola.append('n' + matriz3[i][j] + " ");
                }
                consola.append('\n' +"");
            }  
        }        
         
    }
}
