package Semestre3;

/**
 * Write a description of class Orden here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class NodoBi
{
    private int info;
    private NodoBi left,rigth,up;

    public NodoBi(){
        info=0;
        left=null;
        rigth=null;
        up=null;
    }

    public NodoBi (int info){
        this.info=info;
    }

    public int getInfo(){
        return info;
    }

    public NodoBi getLeft(){
        return left;
    }

    public NodoBi getRigth(){
        return rigth;
    }

    public NodoBi getUp(){
        return up;
    }

    public void setInfo(int info){
        this.info=info;
    }

    public void setLeft(NodoBi left){
        this.left=left;
    }

    public void setRigth(NodoBi rigth){
        this.rigth=rigth;
    }

    public void setUp(NodoBi up){
        this.up=up;
    }        
}
