package Semestre2;
public class Programador extends Persona
{
    //contenedor
    private String SO_Favorito;
    private String Marca_PC;
       
    //Constructor de la subclase: incluimos como parametros al menos los del constructor de la superclase
       
    //inicia constructor
    public Programador (String nombre, String apellidos, int edad)
    {
    super (nombre,apellidos,edad);
    this.SO_Favorito = "Windows";
    this.Marca_PC = "Microsoft";
    }
    
    //Metodos especficos de la subclase
    public void setSO_Favorito (String SO_Favorito)
    {this.SO_Favorito = SO_Favorito;}
    
    public String getSO_Favorito ()
    {return SO_Favorito;}
    
    
    
    public void setMarca_PC (String Marca_PC)
    {this.Marca_PC= Marca_PC;}
    
    public String getMarca_PC()
    {return Marca_PC;}
    
    
    public void mostrarSaludos ()
    {System.out.println ("El nombre del programador:" +getNombre() + "" + getApellidos() + "y su SO favorito es:" + getSO_Favorito() + "y la marca de su pc es:" +getMarca_PC()  );}
    
}
