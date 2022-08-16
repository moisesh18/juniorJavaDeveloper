package Semestre3;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import javax.swing.ButtonGroup;
import java.text.DecimalFormat;
public class MetodoGJ {
    public static DecimalFormat decimales = new DecimalFormat("0.0");
    public static double []o = new double [3];
    public static JTextArea consola = Discretas.returnTxt();
    public static void main(double [][]m,double[]n) {
                        /*
                        double [] [] m = {{2.0,-1.0,1.0},
                                {3.0,1.0,-2.0}, 
                                {-1.0,2.0,5.0}};
                        double []n = {2.0,9.0,-5.0};
                        */
        //imprimir(m,n);
        GaussJordan(m,n);
        imprimirfinal(o);
    }

    public static void imprimir (double [][] a,double[]n){
        for (int f=0;f<a.length;f++){
            for (int c=0;c<a.length;c++){
                consola.append(decimales.format(a[f][c])+"|");
            }
            consola.append(decimales.format(n[f]));
            consola.append('\n'+"");    
        }
        consola.append('\n' +"");
    }

    public static void imprimirfinal (double [] a){
        consola.append('\n' +"El resultado es:");
        for (int f=0;f<a.length;f++){
            consola.append('\n' +decimales.format(a[f]));  
        }
        consola.append('\n' +"");
    }

    public static void GaussJordan(double [][] a, double []b){
        for (int i=0;i<a.length;i++){
            for (int k=0;k<a.length;k++){
                if (k!=i){
                    b[k] = b[k]-(a[k][i]/a[i][i])*b[i];
                    for (int j=i+1;j<a.length;j++){
                        a[k][j]= ((a[k][j])-((a[k][i])/a[i][i])*a[i][j]);
                    }
                    a[k][i]=0;
                }
            }
        }

        for (int m=0;m<a.length;m++){
            o[m]=b[m]/a[m][m];
        }
        consola.append('\n' +"Asi esta la matriz despues de aplicar GaussJordan: " +'\n');
        imprimir(a,o);
    }

}
