package Semestre3;
import java.util.Scanner;
/**
 * @author HumbertoMCarmona
 */
public class CoordinateNumber {
    public static void main(String[] args) {
        System.out.println("Coordinate Numbers");
        Scanner tec= new Scanner(System.in);
        byte casos = (byte) tec.nextInt();
    for (byte c=0;c<casos;c++){    
        
        int x = tec.nextInt();
        int y = tec.nextInt();
        
        int pares = x+y;
        int impares = x+y-1;
    
    
        //pares e iguales
        if (x==y){
            if (x%2==0 & y%2==0){
                System.out.println("El numero par que está en (" +x+ "," +y+") es: " +pares);
            } else{
                System.out.println("El numero impar que está en (" +x+ "," +y+") es: " +impares);
            }
        
            }else if (y==(x-2)){
                System.out.println("El numero mixto que está en (" +x+ "," +y+") es: " +pares);
            }else {
                System.out.println("No hay numeros en las coordenadas (" +x+ "," +y+")");
    }
    
    }
}
}

/*
 3 
 3 3
 2 2
 3 2
 
 */
