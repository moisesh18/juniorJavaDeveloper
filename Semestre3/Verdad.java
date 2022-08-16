package Semestre3;

/**
 * Write a description of class Verdad here.
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
public class Verdad{
    public static boolean[][] main (String args){
        JTextArea consola = Discretas.returnTxt();
        //consola.append('\n' +"***Tabla de Verdad***");   
        //consola.append('\n' +"Escribe la ecuacion usando las variables 'a' o 'b'. Con or=+ and=* y not=! (el not va despues de la variable)"); 
        char a = args.charAt(0);
        char q = args.charAt(1);
        char b = args.charAt(2);
        int tamaño=0;
        boolean or = false;
        boolean and = false;
        for (int t=0;t<args.length();t++){
            char x = args.charAt(t);
            if (x!='!' && x!='+' && x!='*'){
                tamaño++;
            }
            if (x=='+'){
                or=true;
            }
            if (x=='*'){
                and=true; 
            }
        }
        int ff = (int) Math.pow(2,tamaño);
        int fc = tamaño;
        boolean [][] ejemplo =new boolean [ff][fc];
        boolean [] tabla =new boolean [ff];

        for (int c=0;c<tamaño;c++){
            int potencia = ((int) Math.pow(2,(tamaño-c)))/2;    
            int f=potencia;
            while (f<(int) Math.pow(2,tamaño)){
                int g= f+potencia-1;
                for (int w=f;w<=g;w++){
                    ejemplo[f][c]=true;
                    f++;
                }    
                f=f+potencia; 
            } 
        } 

        //!
        for (int t=0;t<args.length();t++){
            char x = args.charAt(t);
            if (x=='!'){
                char y = args.charAt(t-1);

                if (y=='a'){
                    for (int i=0;i<ff;i++){
                        if (ejemplo[i][0]==true){
                            ejemplo[i][0]=false;
                        }else{
                            ejemplo[i][0]=true;
                        }
                    }
                }else if (y=='b'){
                    for (int i=0;i<ff;i++){
                        if (ejemplo[i][1]==true){
                            ejemplo[i][1]=false;
                        }else{
                            ejemplo[i][1]=true;
                        }
                    }                    

                }
            }
        }

        //+        
        if (or==true){
            for (int c=0;c<ff;c++){
                if (ejemplo[c][0]==true | ejemplo[c][1]==true){
                    tabla[c]=true;                
                }
            }
        }
        //*        
        if (and==true){
            for (int c=0;c<ff;c++){

                if (ejemplo[c][0]==true && ejemplo[c][1]==true){
                    tabla[c]=true;                
                }           
            }
        }        
        
                
        consola.append('\n' +"El resultado de " +args+ " es " +'\n');    
        for (int i=0;i<ff;i++){
            for (int j=0;j<fc;j++){
                if (ejemplo[i][j]==true){
                    consola.append("1|");
                }else{
                    consola.append("0|");
                }
            }
            if (tabla[i]==true){
                consola.append("V");
            }else{
                consola.append("F");
            }
            consola.append('\n' +"");
        }
        
        return ejemplo;
    } 
}  

