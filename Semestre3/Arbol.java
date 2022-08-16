package Semestre3;

/**
 * Write a description of class Arbol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Queue;
import java.util.LinkedList;
public class Arbol
{
    public Arbol(){
    }
    
    public void imprimirNivel (NodoBi x){
        Queue <NodoBi> cola = new LinkedList <NodoBi> ();
        do{
            if (x!=null){
                System.out.print(x.getInfo()+",");
                if (x.getLeft()!=null){
                    cola.offer(x.getLeft());
                }
                if (x.getRigth()!=null){
                    cola.offer(x.getRigth());
                }
            }
        }while(!cola.isEmpty());
    }

    public void imprimirPreOrden (NodoBi x){
        if (x!=null){
            System.out.println(x.getInfo());
            if (x.getLeft()!=null){
                imprimirPreOrden(x.getLeft());
            }
            if (x.getRigth()!=null){
                imprimirPreOrden(x.getRigth());
            }
        }
    }
    
    public void imprimirEnOrden (NodoBi x){
        if (x!=null){
            if (x.getLeft()!=null){
                imprimirEnOrden(x.getLeft());
            }
            System.out.println(x.getInfo());
            if (x.getRigth()!=null){
                imprimirEnOrden(x.getRigth());
            }
        }
    }
    
    public void imprimirPostOrden (NodoBi x){
        if (x!=null){
            if (x.getLeft()!=null){
                imprimirPostOrden(x.getLeft());
            }
            if (x.getRigth()!=null){
                imprimirPostOrden(x.getRigth());
            }
            System.out.println(x.getInfo());
        }
    }       
}
					