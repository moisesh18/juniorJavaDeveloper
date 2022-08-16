import java.text.DecimalFormat;
public class MetodoGJ {
	private static double []o = new double [3];
	private static double [] [] m = {{2.0,-1.0,1.0},
									 {3.0,1.0,-2.0},	
									 {-1.0,2.0,5.0}};
	private static double []n = {2.0,9.0,-5.0};
	private static DecimalFormat decimales = new DecimalFormat("0.0");
	public static void main(String[] args) {
    	System.out.println("Esta es la matriz inicial: ");
		imprimir(m,n);
		GaussJordan(m,n);
		imprimirfinal(o);
	}
	
    public static void imprimir (double [][] a,double[]n){
    	for (int f=0;f<a.length;f++){
            for (int c=0;c<a.length;c++){
                System.out.print(decimales.format(a[f][c])+"|");
            }
            System.out.print(decimales.format(n[f]));
            System.out.println();    
            }
        System.out.println();
    }
    
    public static void imprimirfinal (double [] a){
    	System.out.println("El resultado es:");
    	for (int f=0;f<a.length;f++){
            System.out.println(decimales.format(a[f]));  
            }
        System.out.println();
    }
    
    public static void GaussJordan(double [][] a, double []b){
    	for (int i=0;i<a.length;i++){
    		for (int k=0;k<a.length;k++){
    			if (k!=i){
    				b[k] = b[k]-(a[k][i]/a[i][i])*b[i];
    				for (int j=i+1;j<a.length;j++){
    					a[k][j]= ((a[k][j])-((a[k][i])/a[i][i])*a[i][j]);
    				}
    				a[k][i]=0;
    			}
    		}
    	}
    	
    	for (int m=0;m<a.length;m++){
    		o[m]=b[m]/a[m][m];
    	}
		System.out.println("Asi esta la matriz despues de aplicar GaussJordan: ");
		imprimir(m,o);
    }

}
