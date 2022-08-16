package Semestre2;
public class ProductosCongelados extends Productos
{
    //contenedor
    private String temperatura;
    
    
    
    //Constructor de la subclase: incluimos como parametros al menos los del constructor de la superclase
    
    
    //inicia constructor
    public ProductosCongelados(String fechaCaducidad, int lote)
    {super (fechaCaducidad,lote);
    this.temperatura = "Codigo de embasado:";
    this.lote = 75;}
    
    //Metodos especficos de la subclase
    public void settemperatura (String temperatura)
    {this.temperatura = temperatura;}
    
    public String gettemperatura ()
    {return temperatura;}
        
    
    
    public void mostrarSaludo ()
    {System.out.println ("La fecha de caducidad del producto congelado es: " +getfechaCaducidad() + " Su lote es: " + getlote() + " La temperatura necesaria es: " +gettemperatura());}
    
    
}
