// aplicativo que estima o valor da constante matemática e 
// entrada: número de termos

import java.util.Scanner;

public class ConstanteE {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o número de termos: ");
		
		int termos = input.nextInt(); // número de termos
		
		double e = 1; // variável que armazena o resultado
		
		double fat = 1; // variável que guarda o resultado do fatorial
		
		for (int i = 2; i <= termos; i++) {
			
			fat *= (i - 1);
			e += (1 / fat);
			
		}
		
		System.out.println(e);
	}
	
	
}