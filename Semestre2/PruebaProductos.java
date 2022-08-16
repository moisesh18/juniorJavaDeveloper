package Semestre2;
/**
 * Write a description of class PruebaPersona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PruebaProductos
{
    public static void main (String [] args)
    {
    
    ProductosFrescos producto1= new ProductosFrescos ("18/06/2016", 33);
    producto1.setfecha_embasado ("18/06/2016");
    producto1.setpais_de_origen ("China");
    
    producto1.mostrarSaludo();
    
    ProductosRefrigerados producto2 = new ProductosRefrigerados ("18/06/2016", 33);
    producto2.setcodigo_organismo("NUMERODECODIGODEORGANISMO");
    producto2.mostrarSaludo();
    
    ProductosCongelados producto3 = new ProductosCongelados("18/06/2016", 33);
    producto3.settemperatura("18 grados");
    producto3.mostrarSaludo();
}
}