import java.text.DecimalFormat;
import java.util.Scanner;

public class Romberg
{
	private static DecimalFormat decimales = new DecimalFormat("0.0000000");
	
    public static void main (String [] args){
        System.out.println("Algoritmo de Romberg");
        System.out.println("Escribe cuantas particiones quieres (en numeros pares)");
        Scanner entrada = new Scanner (System.in);
        int num = entrada.nextInt(); //inicial
        double [][] matriz1 =  new double [num/2][num/2];
        
        for (int j=0;j<num/2;j++){
                matriz1[j][1]= Trapecios.main((float) Math.pow(2,j));
                matriz1[j][0]= (float) Math.pow(2,j);
        }
        matriz1[0][1]=0;
        
        for (int i=2;i<num/2;i++){
        	for (int j=1;j<num/2;j++){
        	    	matriz1[j][i] = (double) (Math.pow(4,i-1)*(matriz1[j][i-1]-matriz1[j-1][i-1]))/(Math.pow(4,i-1)-1);	
        	}
        }
        imprimir(matriz1);  
    }
    
    public static void imprimir (double [][] matriz1){
        for (int i=0;i<matriz1.length;i++){
            for (int j=0;j<matriz1.length;j++){
                    System.out.print(decimales.format(matriz1[i][j]) + "|");
            }
            System.out.println();
        }
        System.out.println();
    }   
}

