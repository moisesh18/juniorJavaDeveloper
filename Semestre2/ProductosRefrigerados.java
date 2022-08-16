package Semestre2;
public class ProductosRefrigerados extends Productos
{
    //contenedor
    private String codigo_organismo;
    
    
    
    //Constructor de la subclase: incluimos como parametros al menos los del constructor de la superclase
    
    
    //inicia constructor
    public ProductosRefrigerados(String fechaCaducidad, int lote)
    {super (fechaCaducidad,lote);
    this.codigo_organismo = "Codigo de embasado:";
    this.lote = 33;}
    
    //Metodos especficos de la subclase
    public void setcodigo_organismo (String codigo_organismo)
    {this.codigo_organismo = codigo_organismo;}
    
    public String getcodigo_organismo ()
    {return codigo_organismo;}
        
    
    
    public void mostrarSaludo ()
    {System.out.println ("La fecha de caducidad del producto refrigerado es: " +getfechaCaducidad() + " Su lote es: " + getlote() + " El codigo de organismo es: " +getcodigo_organismo());}
    
    
}
