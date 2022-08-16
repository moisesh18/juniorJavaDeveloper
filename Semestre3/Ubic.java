package Semestre3;


/**
 * Write a description of class Orden here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ubic
{
    private int f;
    private int c; 
   
    public Ubic(int f, int c){
        this.f=f;
        this.c=c;
    }

    //getters obtener
    public int getF(){
        return f;
    }
    
    public int getC(){
        return c;
    }
    
    //setters
    public void setF(int f){
        this.f=f;
    }
    
    public void setC(int c){
        this.c=c;
    }
    
}
