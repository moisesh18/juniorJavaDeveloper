package Semestre3;


/**
 * Write a description of class Orden here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NodoH
{
    private String f;
    private int c=0; 
    private String path=""; 
    private NodoH ptrForward, ptrBack;
   
    public NodoH(String f, int c){
        this.f=f;
        this.c=c;
    }

    //getters obtener
    public String getF(){
        return f;
    }
    
    public int getC(){
        return c;
    }
    
    public String getPath(){
        return path;
    }    
    
    public NodoH getPtrForward(){
    return ptrForward;
    }
    
    public NodoH getPtrBack(){
    return ptrBack;
    }
    
    //setters
    public void setF(String f){
        this.f=f;
    }
    
    public void setC(int c){
        this.c=c;
    }
    
    public void setPath(String path){
        this.path=path;
    } 
    
    public void setPtrForward(NodoH ptr){
    this.ptrForward=ptr;
    }
    
    public void setPtrBack(NodoH ptr){
    this.ptrBack=ptr;
    }
    
}
