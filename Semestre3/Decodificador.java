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
public class Decodificador{
    public static void main (String argseart []){
        System.out.println("Decodificador");
        Hashtable <Integer,String> tabla = new Hashtable <Integer,String> ();
        Scanner entrada = new Scanner (System.in);
        System.out.println("Inserta el diccionario (separado por comas)");
        String dic = entrada.nextLine(); //inicial
        String [] diccionario = dic.split(",");
        int key=0;
        for (int i=0;i<diccionario.length;i++){
                tabla.put(key,diccionario[i]);
                key++;            
        }
        System.out.println("Inserta el codigo (separado por comas)");
        dic = entrada.nextLine(); //inicial
        String [] codigo = dic.split(",");
        
        //algoritmo de descompresion
        int d = Integer.parseInt(codigo[0]);
        System.out.print(tabla.get(Integer.parseInt(codigo[0])));
        
        for (int i=1;i<codigo.length;i++){
                int p= Integer.parseInt(codigo[i]);
                String textp = tabla.get(p);
                int q=Integer.parseInt(codigo[i-1]);
                String textq = tabla.get(q); 
                String salida = new String ();
                if (tabla.containsKey(p)){
                   salida = textq+textp.charAt(0);
                   System.out.print(textp);
                   tabla.put(key,salida);
                   key++;                    
                }else{
                   salida = textq+textq.charAt(0);
                   tabla.put(key,salida);
                   key++; 
                   System.out.print(textp);
                }
        }
        
    }
    
}