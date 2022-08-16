import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		 System.out.println("Binary Search Tree of Letters Creator");
	        System.out.println("Write input:");
	        Scanner entrada = new Scanner (System.in);
	        String input = "";
	       
	        do{
		        do{
		        input+= entrada.nextLine(); //inicial
		        }while(!input.contains("*") & !input.contains("$"));
		        Tree tree = new Tree ();
		        boolean ultimo = false;
		        if(input.contains("$")){
		        	ultimo = true;
		        }
		        input = input.substring(0,input.length()-1);
		        for (int i=input.length()-1;i>=0;i--){
		        	tree.setBST(input.charAt(i),input.charAt(i));
		        }
		        System.out.println("Answer: ");
		        tree.PrintPreOrder(tree.getRoot());
		        tree = new Tree ();
		        input="";
				if (ultimo==true){
		        	break;
		        }
		        System.out.println();
		        System.out.println("Write input:");
	        }while(true);  
	        System.out.println();
	        System.out.println("¡GRACIAS POR ENSEÑARNOS TAN BIEN PROFE!");
	} 
	
}
