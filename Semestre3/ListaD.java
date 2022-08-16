package Semestre3;


/**
 * Write a description of class ListaD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaD{
    private NodoD raiz;
    
    //constructor
    public ListaD (){
        raiz=null;
    }
    
    //constructor firma
    public ListaD (NodoD raiz){
        this.raiz=raiz;
    }
    
    //getter
    public NodoD getRaiz(){
        return raiz;
    }
    
    //setter
    public void setRaiz(NodoD x){
        this.raiz = raiz;
    }
    
    //agregando por el fin
    public void agregarFinal(NodoD x){
        if (raiz==null){
            raiz=x;
        }else{
            //creamos un temporal para cuidar a la raiz
            NodoD tmp = raiz;
            //recorremos
            while(tmp.getPtrForward()!=null){
            tmp=tmp.getPtrForward();
            }
            //cumplio su trabajo y ahora sustituimos los valores
            x.setPtrBack(tmp);
            tmp.setPtrForward(x);
        }
    }
    
    
    //agregando por el inicio
    public NodoD agregarPrincipio(NodoD x){
        if (raiz==null){
            raiz=x;
        }else{
            x.setPtrForward(raiz);
            raiz.setPtrBack(x);
            raiz=x;
        }
        return x;
        //edite
    }
    
    public void imprimirNormal(){
        NodoD tmp = raiz;
        System.out.println();
        System.out.println("**Imprimir Normal**");
        while(tmp!=null){
            System.out.print("|" + tmp.getInfo());
            tmp=tmp.getPtrForward();
        }
    }
    
    public void imprimirInverso(){
        NodoD tmp = raiz;
        System.out.println();
        while(tmp.getPtrForward()!=null){
            tmp=tmp.getPtrForward();
        }
        System.out.println("**Imprimir Inverso**");   
        if (tmp.getPtrForward()==null){
            while(tmp!=null){
                System.out.print("|" + tmp.getInfo());
                tmp=tmp.getPtrBack();
            }
        }
    }    
    
    public void eliminaPrincipioSimple(){
        if (raiz!=null){
            raiz=raiz.getPtrForward();
        }
    }
    
    public NodoD eliminaPrincipio(){
        NodoD tmp = raiz;
        if (raiz!=null){
            raiz = tmp.getPtrForward();
            raiz.setPtrBack(null);
            tmp.setPtrForward(null);
        }
        return tmp;
    }

    
    public NodoD eliminarFinal(){
        NodoD tmp=raiz;
        NodoD tmp2=null;
        while (tmp.getPtrForward()!=null){
            tmp2=tmp;
            tmp=tmp.getPtrForward();
        }
        if (tmp2!=null){
            tmp2.setPtrForward(null);
            tmp.setPtrBack(null);
        }else{
            raiz=null;
        }
        return tmp;
    }
    
    public NodoD eliminarPos(int x){
        NodoD tmp=raiz;
        NodoD antes=null;
    
        for(int j=1;j!=x;j++){
            antes=tmp;
            tmp= tmp.getPtrForward();
        }
     
        antes.setPtrForward(tmp.getPtrForward());
        tmp.getPtrForward().setPtrBack(antes);
        tmp.setPtrForward(null);
        tmp.setPtrBack(null);
        return tmp;
    
    }
}