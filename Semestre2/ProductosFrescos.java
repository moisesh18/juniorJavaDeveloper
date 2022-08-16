package Semestre2;
public class ProductosFrescos extends Productos
{
    //contenedor
    public String fecha_embasado;
    public String pais_de_origen;
    
    
    //Constructor de la subclase: incluimos como parametros al menos los del constructor de la superclase
    
    
    //inicia constructor
    public ProductosFrescos(String fechaCaducidad, int lote)
    {super (fechaCaducidad,lote);
    this.fecha_embasado = "Codigo de embasado:";
    this.lote = 20;}
    
    //Metodos especficos de la subclase
    public void setfecha_embasado (String fecha_embasado)
    {this.fecha_embasado = fecha_embasado;}
    
    public String getfecha_embasado ()
    {return fecha_embasado;}
        
    public String getpais_de_origen ()
    {return pais_de_origen;}
    
    public void setpais_de_origen (String setpais_de_origen)
    {this.pais_de_origen = setpais_de_origen;}
    
    
    
    public void mostrarSaludo ()
    {System.out.println ("La fecha de caducidad del producto fresco es: " +getfechaCaducidad() + " Su lote es: " + getlote() + " Su fecha de embasado es: " +getfecha_embasado()+ " y su país de origen es: " +getpais_de_origen() );}
    
    
}
