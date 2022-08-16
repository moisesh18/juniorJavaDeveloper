package Semestre3;


/**
 * Write a description of class Nodo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nodo{
    private int info;
    private Nodo ptr;
    
    public Nodo(){
    info=0;
    ptr = null;
    }
    
    public Nodo(int info){
        this.info=info;
    }
    
    //Nodo x = new Nodo();
    
    //getters obtener
    public int getInfo(){
    return info;
    }
    //System.out.println(x.getInfo());
    
    public Nodo getPtr(){
    return ptr;
    }
    //System.out.println(x.getPrt());
    
    //setters
    public void setInfo(int info){
    this.info=info;
    }
    
    public void setPtr(Nodo ptr){
    this.ptr=ptr;
    }
}
