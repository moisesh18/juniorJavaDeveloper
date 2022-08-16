
/**
 * Write a description of class LaberintoCreator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Vector;

public class LaberintoCreator
{
    public static int[][] main (String [] args){
          int i = 35;
          int [][]a= new int[i][i];
          Vector <Ubic> posibles = new <Ubic>  Vector ();
          Vector <Ubic> reales = new <Ubic> Vector ();
         
          
        for (int f=1;f<a.length;f+=2){
            for (int c=1;c<a.length;c+=2){     
                a[f][c]=3;
            }
        }
        
        int af=(int) (Math.random()*(i/2))*2+1;
        int ac=(int) (Math.random()*(i/2))*2+1;
        Ubic primero = new Ubic (af,ac);
        Ubic posicion=new Ubic (0,0);
        posibles.add(primero);
        while(posibles.isEmpty()==false){
            int m = (int) Math.random()*(posibles.size());
            Ubic aleatorio = (Ubic) posibles.get(m);
            int r = aleatorio.getF();
            int j = aleatorio.getC();
            
            a[r][j]=1;
            posibles.remove(m);
            //arriba
            if(r>=3){
                if (a[r-2][j]==1){
                    posicion = new Ubic (r-1,j);
                    reales.add(posicion);
                }
                
                if (a[r-2][j]==3){
                    a[r-2][j]=2;
                    posicion = new Ubic (r-2,j);
                    posibles.add(posicion);
                }
            }
            
            //derecha
            if(j+3<=a[r].length){
                if (a[r][j+2]==1){
                    posicion = new Ubic (r,j+1);
                    reales.add(posicion);
                }
                
                if (a[r][j+2]==3){
                    a[r][j+2]=2;
                    posicion = new Ubic (r,j+2);
                    posibles.add(posicion);
                }    
            }
            
            //izquierda
            if(j>=3){
                if (a[r][j-2]==1){
                    posicion = new Ubic (r,j-1);
                    reales.add(posicion);
                }
                
                if (a[r][j-2]==3){
                    a[r][j-2]=2;
                    posicion = new Ubic (r,j-2);
                    posibles.add(posicion);
                }                
            }
            
            if(r+3<=a[r].length){
                if (a[r+2][j]==1){
                    posicion = new Ubic (r+1,j);
                    reales.add(posicion);
                }
                
                if (a[r+2][j]==3){
                    a[r+2][j]=2;
                    posicion = new Ubic (r+2,j);
                    posibles.add(posicion);
                }                
                
            }
            
            if(reales.isEmpty()==false){
            int y = (int) (Math.random()*reales.size());
            Ubic aleatorio2 = (Ubic) reales.get(y);
            int r2 = aleatorio2.getF();
            int j2 = aleatorio2.getC();
            
            a[r2][j2]=1;
            reales.clear();
            }
        }
        
        //entradas y salidas
        int f,c;
        do{
        f = (int) (Math.random()*a.length);
        }while(a[f][1]!=1);
        
        do{
        c = (int) (Math.random()*a.length);
        }while(a[c][a.length-2]!=1);        
        a[f][0]=1;  
        a[c][a.length-1]=3;
        
        
        
        
        //imprimir(a);
        //System.out.print("af "+af+" ac " +ac); 
        return a;
    }
    
    public static void imprimir (int[][] a){
        //imprimir laberinto
        for (int f=0;f<a.length;f++){
            for (int c=0;c<a.length;c++){
                System.out.print(a[f][c]);
            }
            System.out.println();    
            }
        System.out.println();
    }
    
}
