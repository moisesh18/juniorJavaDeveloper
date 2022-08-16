package Semestre3;

/**
 * Write a description of class NodoD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NodoD{
    private int info;
    private NodoD ptrForward, ptrBack;

    public NodoD(){
        info=0;
        ptrForward=null;
        ptrBack=null;
    }

    public NodoD (int info){
        this.info=info;
    }

    public int getInfo(){
        return info;
    }

    public NodoD getPtrForward(){
        return ptrForward;
    }

    public NodoD getPtrBack(){
        return ptrBack;
    }

    public void setInfo(int info){
        this.info=info;
    }

    public void setPtrForward(NodoD ptr){
        this.ptrForward=ptr;
    }

    public void setPtrBack(NodoD ptr){
        this.ptrBack=ptr;
    }
}
