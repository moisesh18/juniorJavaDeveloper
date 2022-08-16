package Semestre3;


/**
 * Write a description of class LabNodo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LabNodo
{
    public char [][] laberinto;
    public boolean seUso;
    public Ubic E;
    public Ubic S;
   
    public LabNodo(char [][] laberinto, Ubic E, Ubic S){
        this.laberinto=laberinto;
        this.E=E;
        this.S=S;
    }
}
