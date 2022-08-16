package Semestre2;
/**
 * Write a description of class Esfera here.
 * 
 * @author Moises Hernandez 
 * @version 1.0
 */

import java.awt.*;


public class Esfera
{
    protected short x;
    protected short y;
    
    protected void setX(short nuevaX) 
    {x = nuevaX;}
    
    protected void setY(short nuevaY)
    {y = nuevaY;}
    
    public void mostrar(Graphics papel)
    {papel.drawOval(x,y,20,20);}
}
