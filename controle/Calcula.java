// programa deve seguir os seguintes passos:
// 1 : receber um inteiro a
// 2 : receber um caracter de operação aritmética [+, -, * ou /]
// 3 : receber um inteiro b
// Então processar e exibir o resultado

import java.util.Scanner;

public class Calcula {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Calculadora: ");
		
		System.out.print("Ineiro a: ");
		int a = input.nextInt();
		
		System.out.print("Operador [+, -, *, /]: ");
		char op = input.next().charAt(0);
		
		System.out.print("Ineiro b: ");
		int b = input.nextInt();
		
		switch (op) {
			
			case '+':
				System.out.println(a + b);
				break;
			
			case '-':
				System.out.println(a - b);
				break;
			
			case '*':
				System.out.println(a * b);
				break;
				
			case '/':
				System.out.println(a / b);
				break;
			
			default:
				System.out.println("Não foi possível concluir...");
				
		}
	}
}