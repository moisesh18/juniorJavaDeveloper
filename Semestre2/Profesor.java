package Semestre2;
public class Profesor extends Persona
{
    //contenedor
    private String IdProfesor;
    private String Escuela;
    
    
    //Constructor de la subclase: incluimos como parametros al menos los del constructor de la superclase
    
    
    //inicia constructor
    public Profesor(String nombre, String apellidos, int edad)
    {super (nombre,apellidos,edad);
    this.IdProfesor = "Desconocido";}
    
    //Metodos especficos de la subclase
    public void setIdProfesor (String IdProfesor)
    {this.IdProfesor = IdProfesor;}
    
    public String getIdProfesor ()
    {return IdProfesor;}
    
    
    public void mostrarSaludo ()
    {System.out.println ("El nombre del profesor:" +getNombre() + "" + getApellidos() + "con ID:" +getIdProfesor() );}
    
    
}
