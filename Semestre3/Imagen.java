package Semestre3;


/**
 * Write a description of class Imagen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
public class Imagen
{
    public static void main (String [] args){
          System.out.println("***BITS DE IMAGEN***");
          System.out.println("¿Cuantos numeros quieres la 'imagen'? (que sea mayor a 15, para que lo notes)");
          Scanner t = new Scanner (System.in);
          int i = t.nextInt();
        
        int [][]a= new int[i][i];
        
        
        for (int f=0;f<i*10;f++){
                int c = (int)(Math.random()*i-1);
                int d = (int)(Math.random()*i-1);
                a[d][c]=1;
        }
        imprimir(a);     
        
        int n=1;
        Queue <Ubic> cola = new LinkedList <Ubic>();        
        for (int fil=0;fil<a.length;fil++){
            for (int col=0;col<a.length;col++){
                int f=fil;
                int c=col;
                
                if (a[f][c]==1){
                    n++;
                    a[f][c]=n;
                    cola.offer(new Ubic (f,c));
                    while(cola.size()>0){
                        Ubic ultima = cola.poll();
                        f = ultima.getF();
                        c = ultima.getC();
                        if (c+1<a.length && a[f][c+1]==1){
                            a[f][c+1]=n;
                            cola.offer(new Ubic (f,c+1));
                        }
                        if (f+1<a.length && a[f+1][c]==1){
                            a[f+1][c]=n;
                            cola.offer(new Ubic (f+1,c));
                        }
                        if (c-1>0 && a[f][c-1]==1){
                            a[f][c-1]=n;
                            cola.offer(new Ubic (f,c-1));
                        }
                        if (f-1>0 && a[f-1][c]==1){
                            a[f-1][c]=n;
                            cola.offer(new Ubic (f-1,c));
                        }
                    }   
                    
                }
                
            }
            
        }
        
        
        imprimir(a); 
        }
        
        
        
    public static void imprimir (int[][] a){
        //imprimir laberinto
        for (int f=0;f<a.length;f++){
            for (int c=0;c<a.length;c++){
                if (a[f][c]<10){                
                System.out.print(" "+ a[f][c]+ " ");
                }else{
                System.out.print(a[f][c]+" ");
                }
            }
            System.out.println();
        }        
        System.out.println();
    }
}
