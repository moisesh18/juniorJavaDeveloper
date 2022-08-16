package Semestre3;

/**
 * Write a description of class Hashtable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Hashtable;
import java.util.Vector;
import java.util.Scanner;
public class Codificador
{
    public static void main (String argseart []){
        System.out.println("Hola");
        Hashtable <String,Integer> tabla = new Hashtable <String,Integer> ();
        Scanner teclado = new Scanner (System.in);
        String frase = teclado.nextLine(); //inicial
        int key=0;
        String seleccionado=  "";
        String encuentra = "";
        int prueba = frase.length();
        for (int i='a';i<'z';i++){
            if(frase.contains(Character.toString((char) i))){
                tabla.put(Character.toString((char) i),key);
                key++;
            }
        }
        System.out.println(tabla);
        seleccionado +=  frase.valueOf(frase.charAt(0));
        for (int i=0;i<frase.length();i++){ 
            if (tabla.containsKey(seleccionado)){
                    if (i+1==frase.length()){
                    System.out.print(tabla.get(seleccionado)+",");    
                    }else{
                        encuentra = seleccionado;
                        seleccionado+=frase.valueOf(frase.charAt(i+1));
                        
                    }
                }else{
                System.out.print(tabla.get(encuentra)+",");
                tabla.put(seleccionado,key);
                key++;
                seleccionado =  frase.valueOf(frase.charAt(i));
                i--;  
            }
        } 
    }
    
}
