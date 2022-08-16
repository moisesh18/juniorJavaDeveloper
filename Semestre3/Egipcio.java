package Semestre3;

import java.util.Scanner;
/**
 * @author HumbertoMCarmona
 */
public class Egipcio {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        int n = tec.nextInt();
        
        int [][]a= new int[n][n]; 
        a[n-1][0]=1;
        int num=2;
        
        int fi=0;
        
        int col=1;
        
        
        do{
            for(int f=1;f<=(col+1);f++){
                a[n-f][col]=num++;
                fi=n-f;
            }
            
            for(int c=col-1; c>=0;c--){
                a[fi][c]=num++;
            }
            
           
        
        int f=n-3;
        int c=0;
        int i=2;
        
        while(f>=0){
        while(f!=n-1){
            if(c<=i){
                a[f][c]=num++;
                c++;
            }else{
                f++;
                a[f][c-1]=num++;
            }
        }
        i+=2;
        f=n-i-1;
        c=1;
        }
         col+=2;
        }while(col<n);
        
        for(int x=0; x<a.length; x++){
            for (int y=0;y<a.length; y++) {
                System.out.print(a[x][y]+ "\t");
            }
            System.out.println("\n");
        }  
        
        
    }
    
    }
