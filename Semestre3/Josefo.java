package Semestre3;
import java.util.LinkedList;
import java.util.Scanner;
public class Josefo
{
    public static void main (String [] args){
        LinkedList <Integer> miLista = new LinkedList <Integer> ();
        Scanner teclado = new Scanner (System.in);
        System.out.println ("***VIERNES 13***");
        System.out.println ("***Inserta el numero de personas: ***");
        int p = teclado.nextInt();
        System.out.println ("***Inserta cada cuando muere alguien: ***");
        int m = teclado.nextInt();       
        int c = 0;
        int d = 1;
        for (int i=1;i<=p;i++){
            miLista.add(i);
        }
        while(miLista.size()!=1){
            System.out.println(miLista);
            d=c+(m-1);
            
                while(d>=miLista.size()){
                    d-=miLista.size();
                }
            miLista.remove(d);
            c=d;
        }
        System.out.println ("El unico que quedo vivo fue: ");
        System.out.print (miLista);
        }
    }