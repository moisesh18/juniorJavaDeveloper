
/**
 * Write a description of class PruebaPersona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PruebaPersona
{
    public static void main (String [] args)
    {
    
    Profesor profesor1 = new Profesor ("Juan", "Hernandez Garcia", 33);
    profesor1.setIdProfesor ("Profe 23-287-11");
    profesor1.mostrarSaludo();
    
    Programador prog = new Programador ("Jonathan", "Gomez Perez", 18);
    prog.setSO_Favorito("Windows");
    prog.setMarca_PC ("HP");
    prog.mostrarSaludos();
    
    Futbolista fut = new Futbolista ("Rubens", "Sambueza", 30);
    fut.setEquipo("America");
    fut.mostrarSaludos();
}
}