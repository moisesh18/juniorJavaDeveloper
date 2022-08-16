package Semestre3;


/**
 * Write a description of class ListaArreglos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Vector;
import java.util.Scanner;

public class ListaArreglos
{
    public static void main (String [] args){
        Vector <Integer> lista = new Vector <Integer>();
        Vector [] orden = new Vector [10];
          System.out.println("***ORDENAMIENTO POR RAIZ***");
          System.out.println("¿Cuantos numeros quieres acomodar?");
          Scanner t = new Scanner (System.in);
          int n = t.nextInt();
          int y=0;
  
        for (int i=0;i<n;i++){
            int c = (int) (Math.random()*10000);
            lista.add(c);
        }
        
        for (int i=0;i<10;i++){
            orden[i]= new Vector();
        }
       System.out.println("Los numeros aleatorios son: ");
        System.out.println(lista);
        
        for (int q=1;q<=4;q++){
            
            
            for (int j=0;j<n;j++){  
                    int b = (int) lista.remove(0);
                    int f;
                    
                    if (q==1){
                    f = (b%10);
                    }else if (q==2){
                         f = (b/10)%10;
                    }else if (q==3){
                         f = (b/100)%10;
                    }else if (q==4){
                         f = (b/1000)%10;
                    }else{
                        f=0;
                    }
                    
                    orden[f].add(b);
            } 
            
            for (int i=0;i<10;i++){
                boolean c;
                do{
                    
                    if (orden[i].size()!=0){
                    lista.add((int) orden[i].remove(0));
                    }
                    }while(orden[i].size()!=0);
            }
            
       }
       

       
       System.out.println("Numeros Ordenados con la API de Vectores:");
       System.out.println(lista);
}
}
