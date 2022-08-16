package Semestre3;


/**
 * Write a description of class Huffman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import javax.swing.ButtonGroup;
public class Huffman
{
    private static JTextArea consola = Discretas.returnTxt();
    public static void main (String args){
        
        consola.append('\n' + "El Algoritmo de Huffman para la palabra "+args + " es:");
        Stack pila = new Stack ();
        Vector <NodoH> orden = new Vector <NodoH> ();
        Vector <NodoH> primero = new Vector <NodoH> ();
        Vector <NodoH> y = new Vector <NodoH> ();
        Vector <Character> letras = new Vector <Character> ();
        NodoH temp = new NodoH ("0",0);
        NodoH nc = new NodoH ("0",0);
        for (int i=0;i<args.length();i++){
            char x = args.charAt(i); 
            
            if (letras.contains(x)==false){
                letras.add(x);
                orden.add(new NodoH ( Character.toString(x),1));                
            }else{
                int j = 0;
                    for (int e=0;e<orden.size();e++){
                        temp =  orden.elementAt(e);
                        
                        if (temp.getF().equals(Character.toString(x))){
                            j=temp.getC()+1;
                            orden.remove(e);
                            orden.add(e,new NodoH (Character.toString(x),j));
                        }
                    }
            }
        }
        
        
        do{
            orden = ordenar(orden,primero,args.length());
            nc = new NodoH ("0",0);
            NodoH na = orden.remove(0);
            NodoH nb = orden.remove(0);
            nc.setPtrForward(nb);
            nc.setPtrBack(na);
            String vna = na.getF();
            String vnb = nb.getF();
            nc.setF(vna+vnb);
            nc.setC(nb.getC()+na.getC());
            orden.add(0,nc);
        }while(orden.size()!=1);
        int c=orden.size(); 
    
        temp =  (NodoH) orden.elementAt(0);
        String path="";
        prefijo(temp,path);
    }
    
    
    public static void preorden(NodoH temp,Vector orden){
            if (temp.getPtrForward()!=null){
                preorden(temp.getPtrForward(),orden);
            }
            if (temp.getPtrBack()!=null){
                preorden(temp.getPtrBack(),orden);
            } 
    }
    
    
    public static void prefijo(NodoH temp, String path){
            if (temp.getPtrForward()==null && temp.getPtrBack()==null){
                print(temp, path);
            }
            if (temp.getPtrForward()!=null){
                prefijo(temp.getPtrForward(),path+"1");
            }
            if (temp.getPtrBack()!=null){
                prefijo(temp.getPtrBack(),path+"0");
            }        
        }     
    
    
    public static void print(NodoH temp, String path){
        consola.append('\n' + temp.getF()+ " path " + path+" ");
    }     
    
    public static Vector ordenar(Vector orden, Vector primero, int tamaño){
        NodoH temp = new NodoH ("0",0);
        for (int c=0;c<tamaño;c++){
                for (int e=0;e<orden.size();e++){
                    temp = (NodoH) orden.elementAt(e);
                    
                    if (temp.getC()==c){
                        primero.add(primero.size(),temp);
                    }
                }
        }
        orden.clear();
        orden = (Vector) primero.clone();
        primero.clear();
        return orden;
    }      
     
}
