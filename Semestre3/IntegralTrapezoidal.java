package Semestre3;


/**
 * Write a description of class ListaPrimero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.util.ArrayList;

public class IntegralTrapezoidal{
    public static void main (String [] args){
        System.out.println(trapezoidal(1,2,100000));
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public static float funcion(float x){
        return 2.0f*x;
    }

    
    public static float trapezoidal (float a, float b, float n){
        float delta = (b-a)/n;
        float suma=0;
        
        for (int i=1;i<n-1;i++){
            suma+=funcion(a+i*delta);
        }
        suma*=2;
        float fx0= funcion(a);
        float fxn= funcion(b);
        float resultado= ((b-a)/(2.0f*n))*(fx0+suma+fxn);
        return resultado;
    }
}