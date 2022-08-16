public class Trapecios{
    public static double main (float n){
        float x0=0; float xf=1; //limites
        float h=(xf-x0)/n; //tamaño de paso

        float f0= (float) java.lang.Math.sin(Math.PI*x0); //valor inicial
        float fn= (float) java.lang.Math.sin(Math.PI*xf); //valor final
        float suma=0;

        for (int i=1;i<=n-1;i++){
            float xi=x0+h;
            float fxi= (float) java.lang.Math.sin(Math.PI*xi);
            suma=suma+fxi;
            x0=xi;
        }
        float resultado = (h/2)*(f0+fn+2*suma);
        return resultado;
    }      
}