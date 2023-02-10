import java.util.Scanner;

public class Tabuada {
	
	public static void main(String args[]){
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.print("Qual tabuada exibir? "); 
		int n = entrada.nextInt(); 
		
		System.out.println("---Resultado---");  
		
		//Montar a tabuada.   
		// i x n = n*i
		for(int i = 1; i < 11; i++){
			System.out.println(" | " + n + " x " + i + " = " + (n*i));
			
		}
		
		System.out.println("---------------");
	}
	
}
