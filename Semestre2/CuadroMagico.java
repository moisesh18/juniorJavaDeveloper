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


public class CuadroMagico
{
    public static void main (String [] args){
    int n = Integer.parseInt(JOptionPane.showInputDialog("Escribe el numero impar"));
    int [][]arr=new int [n][n];
    int fa =0;
    int ca =arr.length/2;
    arr[fa][ca]=1;
    for (int i=2;i<=(arr.length*arr.length);i++)
    {
    int fn=fa-1;
    int cn=ca+1;
    
        if (fn<0){
            fn=arr.length-1;
        }
        
        if (cn>=arr.length){
            cn=0;
        }

        if (arr[fn][cn]==0){
            fa=fn;
            ca=cn;
            arr[fa][ca]=i;
        }else{
            fa=fa+1;
            arr[fa][ca]=i;  
        }
    }
    
    
    for (int []x:arr){ 
       for (int z:x){
        if (z < 10){
            System.out.print("  " + z + " ");
        } else {
            System.out.print(" " + z + " ");
            
        }
    
       }
    System.out.println();
      }
}}
