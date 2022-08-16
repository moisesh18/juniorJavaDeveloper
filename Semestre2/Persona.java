package Semestre2;

/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    private String nombre;
    private String apellidos;
    private int edad;
    
    public Persona (String nombre, String apellidos, int edad)
    {this.nombre = nombre;
     this.apellidos = apellidos;
     this.edad = edad;}
    
    public String getNombre ()
    {return nombre;}
     
    public String getApellidos ()
    {return apellidos;}
    
    public int getEdad ()
    {return edad;}

}




