
/**
 * Write a description of class Esfera here.
 * 
 * @author Moises Hernandez 
 * @version 1.0
 */


public class NaveEspacial extends Esfera
{
    public NaveEspacial(short x, short y)
    {
        setX(x);
        setY(y);
     }
    
    
    protected void arriba()
    {if (y>0)
        {setY((short)(y-10));}
    }
    
    protected void abajo()
    { if (y<180)
        {setY((short)(y+10));}
         } 
    
    protected void izquierda()
    {if (x>0)
        {setX((short)(x-10));}} 
    
    protected void derecha()
    {if (x<480)
        {setX((short)(x+10));} }
    
    
  }