package Semestre2;


/**
 * Write a description of class CuadroMagico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;


public class CuadroMagico2
{
    public static void main (String [] args){
    //Escribe el numero
    int n = Integer.parseInt(JOptionPane.showInputDialog("Escribe el numero"));
    
    //CuadroMagico Impares
    if (n%2!=0)
        {
        //Codigo CuadroMagico
        }
    
    //CuadroMagico No multiplos de 4
     if (n%4!=0)
    {
    //CuadroMagico No 4     
    int [][]arr=new int [n][n];
    int arrm = arr.length/2;
    
    
    
    
        //Creamos array con los patrones
    char[][]patron= new char [arrm][arrm];
    int patronm = patron.length/2;
    
                //Llenamos de L
    for (int i=0;i<=patronm;i++)
    {
    for (int j=0;j<patron.length;j++){   
     patron[i][j] = 'L';
    }}
    
                //Llenamos de U
    for (int i=patronm+1;i==patronm+1;i++)
    {
     for (int j=0;j<patron.length;j++){   
     patron[i][j] = 'U';
    }}
    
    
                //Llenamos de X
    for (int i=patronm+2;i<patron.length;i++)
    {
     for (int j=0;j<patron.length;j++){   
     patron[i][j] = 'X';
    }}
    
                //intercambio de mitades
    char a= patron[patronm][patronm];
    patron[patronm][patronm]= patron[patronm+1][patronm];
    patron[patronm+1][patronm] = a;
    
    
    
    //Creamos el array con los numeros
    int [][]numeros=new int [arrm][arrm];
    int fa =0;
    int ca =numeros.length/2;
    numeros[fa][ca]=1;
    for (int i=2;i<=(numeros.length*numeros.length);i++)
    {
    int fn=fa-1;
    int cn=ca+1;
    char m = patron[fa][ca];
    int l = numeros[fa][ca];
       
    
    if (patron[fa][ca]=='L'){
    arr[fa*2][ca*2+1]=l*4-3;
    arr[fa*2+1][ca*2]=l*4-2;
    arr[fa*2+1][ca*2+1]=l*4-1;
    arr[fa*2][ca*2]=l*4;
    }
    
    if (patron[fa][ca]=='U'){
    arr[fa*2][ca*2]=l*4-3;
    arr[fa*2+1][ca*2]=l*4-2;
    arr[fa*2+1][ca*2+1]=l*4-1;
    arr[fa*2][ca*2+1]=l*4;
    }
    
    if (patron[fa][ca]=='X'){
    arr[fa*2][ca*2]=l*4-3;
    arr[fa*2+1][ca*2+1]=l*4-2;
    arr[fa*2+1][ca*2]=l*4-1;
    arr[fa*2][ca*2+1]=l*4;    
    }
    
    
    
        if (fn<0){
            fn=numeros.length-1;
        }
        
        if (cn>=numeros.length){
            cn=0;
        }

        if (numeros[fn][cn]==0){
            fa=fn;
            ca=cn;
            numeros[fa][ca]=i;
        }else{
            fa=fa+1;
            numeros[fa][ca]=i;  
        }
    
    
    }
        
    
    
    for (int []x:arr)
    { 
       for (int z:x){
        if (z < 10){
            System.out.print("  " + z + " ");
        } else {
            System.out.print(" " + z + " ");
            
        }
    
       }
    System.out.println();
    }
    
    
    
    
    
    
}
}
}
