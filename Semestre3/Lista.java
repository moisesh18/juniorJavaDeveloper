package Semestre3;


/**
 * Write a description of class Lista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lista
{
    private Nodo raiz;
    
    //constructor
    public Lista (){
        raiz=null;
    }
    
    //constructor firma
    public Lista (Nodo raiz){
        this.raiz=raiz;
    }
    
    //getter
    public Nodo getRaiz(){
        return raiz;
    }
    
    //setter
    public void setRaiz(Nodo x){
        this.raiz = raiz;
    }
    
    //agregando por el fin
    public void agregarFinal(Nodo x){
        if (raiz==null){
            raiz=x;
        }else{
            //creamos un temporal para cuidar a la raiz
            Nodo tmp = raiz;
            //recorremos
            while(tmp.getPtr()!=null){
            tmp=tmp.getPtr();
            }
            //cumplio su trabajo y ahora sustituimos los valores
            tmp.setPtr(x);
        }
    }
    
    
    //agregando por el inicio
    public Nodo agregarPrincipio(Nodo x){
        if (raiz==null){
            raiz=x;
        }else{
            x.setPtr(raiz);
            raiz=x;
        }
        return x;
        //edite
    }
    
    public void imprimir(){
        Nodo tmp = raiz;
        while(tmp!=null){
            System.out.print(tmp.getInfo());
            tmp=tmp.getPtr();
        }
    }
    
    public void eliminaPrincipioSimple(){
        if (raiz!=null){
            raiz=raiz.getPtr();
        }
    }
    
    public Nodo eliminaPrincipio(){
        Nodo tmp = raiz;
        if (raiz!=null){
            raiz = raiz.getPtr();
            tmp.setPtr(null);
        }
        return tmp;
    }

    
    public Nodo eliminarFinal(){
        Nodo tmp=raiz;
        Nodo tmp2=null;
        while (tmp.getPtr()!=null){
            tmp2=tmp;
            tmp=tmp.getPtr();
        }
        if (tmp2!=null){
            tmp2.setPtr(null);
        }else{
            raiz=null;
        }
        return tmp;
    }
    
}