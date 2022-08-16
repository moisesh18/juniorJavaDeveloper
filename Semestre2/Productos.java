package Semestre2;

/**
 * Write a description of class Productos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Productos
{
    public String fechaCaducidad;
    public int lote;
    
    public Productos (String fechaCaducidad, int lote)
    {this.fechaCaducidad = fechaCaducidad;
     this.lote = lote;}
    
    public String getfechaCaducidad ()
    {return fechaCaducidad;}
     
    public int getlote ()
    {return lote;}

}




