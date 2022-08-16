package Semestre3;


/**
 * Write a description of class Parentesis     here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Stack;
import java.util.Scanner;

public class Parentesis
{
    public static void main (String [] args){
        Stack <Character> pila = new Stack <Character> ();
        Stack <Character> check = new Stack <Character> ();
        Scanner teclado = new Scanner (System.in);
        System.out.println ("Postfijo");
        System.out.println ("***Inserta la formula: ***");
        String p = teclado.next();
        String resultado = "";
        boolean bien = true;
        
            for (int i=0;i<p.length();i++){
               char x = p.charAt(i);
               
               if (x=='('){
               check.push(x); 
               }
               
               if (x==')'){
                   check.pop();
               }
            }
            
            if (check.empty()){
                        for (int i=0;i<p.length();i++){
            char x = p.charAt(i);
            
            if (x=='('){
                pila.push(x);
            } else if (x==')'){
                while(!pila.empty()){
                        char temp;
                            temp = pila.pop();
                            if (temp!='('){
                            resultado+=""+ temp;
                            }else{
                                break;
                            }
                }
            
            } else if (x=='+' || x=='-' || x=='/' || x=='*'){
                pila.push(x);
            }else{
                resultado+=""+ x;
            }} 
                
        }else{
            System.out.println("Error"); 
        }
        System.out.println(resultado);
    }
    
    
}

