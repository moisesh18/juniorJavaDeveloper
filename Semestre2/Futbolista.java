package Semestre2;
public class Futbolista extends Persona
{
    //contenedor
    private String Equipo;
    private String posicion;
           
        //Constructor de la subclase: incluimos como parametros al menos los del constructor de la superclase
           
        //inicia constructor
        public Futbolista (String nombre, String apellidos, int edad)
        {
    super (nombre,apellidos,edad);
    this.Equipo = "America";
    this.posicion = "Defensa";
    }
    
    //Metodos especficos de la subclase
    public void setEquipo (String Equipo)
    {this.Equipo = Equipo;}
    
    public String getEquipo ()
    {return Equipo;}
    
    
    
    public void setposicion (String posicion)
    {this.posicion= posicion;}
    
    public String getposicion()
    {return posicion;}
    
    
    public void mostrarSaludos ()
    {System.out.println ("El nombre del programador:" +getNombre() + "" + getApellidos() + "y su SO favorito es:" + getEquipo() + "y la marca de su pc es:" +getposicion()  );}
    
}