package Semestre3;


/**
 * Write a description of class OrdenamientoRaiz here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;


public class OrdenamientoRaiz
{
  public static void main (String []args){
          ListaD lista = new ListaD();
          ListaD [] orden = new ListaD[10];
          System.out.println("***ORDENAMIENTO POR RAIZ***");
          System.out.println("¿Cuantos numeros quieres acomodar?");
          Scanner t = new Scanner (System.in);
          int n = t.nextInt();
  
        for (int i=0;i<n;i++){
            int c = (int) (Math.random()*10000);
            lista.agregarPrincipio(new NodoD(c));
        }
  
        for (int i=0;i<10;i++){
            orden[i]= new ListaD();
        }
    
        for (int q=1;q<=4;q++){
            for (int j=0;j<n;j++){      
                    NodoD e= lista.eliminarFinal();
                    int b= e.getInfo();
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
                    //orden[f].agregarPrincipio(e);

                    for (int i=0;i<10;i++){
                        if (f==i){
                        orden[i].agregarPrincipio(new NodoD(b));
                    }
                }
            }   
            
            for (int i=0;i<10;i++){
                NodoD y;
                    do{
                        y=orden[i].eliminaPrincipio();
                            if (y!=null){
                                int num=y.getInfo();
                                lista.agregarFinal(new NodoD(num));
                            }
                    }while(y!=null);
            }
       }
        System.out.println("Numeros Ordenados: ");
        lista.imprimirNormal();
  


    }
}