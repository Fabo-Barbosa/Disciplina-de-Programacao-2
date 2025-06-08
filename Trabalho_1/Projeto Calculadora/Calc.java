// Calculadora completa com as seguintes operações
// -> Adição, Subtração, Multiplicação, Divisão,
// -> exponenciação, divisão inteira, resto da divisão, fatorial,
// -> arranjos, permutações, piso, teto, raízes de grau n,
// -> validador de número primo e validador de quadrado perfeito
// O programa tem um menu por onde o usuário deve escolher as operações e adicionar os valores

import java.util.Scanner; // para entrada de dados

public class Calc {
	public static void main(String[] args) {
		
		// fornecer a variável de controle
		Scanner input = new Scanner(System.in);
		
		// variável de controle
		int continua = 1;
		
		// Processamento
		while (continua == 1){
			// instrução ao usuário
			menu();
		
			//processamento
			try {
				principal();
				// continuar ou sair
				System.out.print("Fazer uma operação [1: sim] [qualquer outro valor: sair]:");
				continua = input.nextInt();
			}catch(final Exception e) {
				System.out.println("Algo não saiu como planejado...");
				continua = 0; // faz com que saia imediatamente do laço
			}
		
			
		}
		
	}
	
	// função que exibe as opções de operação para o usuário
	public static void menu() {
		System.out.println("Escolha a operação:");
		System.out.println("1- Adição");
		System.out.println("2- Subtração");
		System.out.println("3- Multiplicação");
		System.out.println("4- Divisão");
		System.out.println("5- Potência");
		System.out.println("6- Divisão inteira");
		System.out.println("7- Resto da divisão");
		System.out.println("8- Fatorial");
		System.out.println("9- Arranjo");
		System.out.println("10- Permutação");
		System.out.println("11- Piso");
		System.out.println("12- Teto");
		System.out.println("13- Radiciacao");
		System.out.println("14- E um primo?");
		System.out.println("15- E um quadrado perfeito?");
	}
	
	public static void principal() {
		
		// instância da classe Calculadora
		Calculadora cal = new Calculadora();
		
		// instância da classe Scanner
		Scanner input = new Scanner(System.in);
		
		// operações 
		int op = input.nextInt();
		
		// operações realizadas com dois valores doubles
		if (op == 1 || op == 2 || op == 3 || op == 4){
			System.out.print("Valor 1:");
			double val1 = input.nextDouble();
			System.out.print("Valor 2:");
			double val2 = input.nextDouble();
			
			switch (op) {
			case 1:
				System.out.printf("Resultado= %.2f%n", val1 + val2);
				break;
			case 2:
				System.out.printf("Resultado= %.2f%n", val1 - val2);
				break;
			case 3:
				System.out.printf("Resultado= %.2f%n", val1 * val2);
				break;
			case 4:
				System.out.printf("Resultado= %.2f%n", val1 / val2);
				break;
			}
			
		// operações realizadas com dois valores inteiros 
		}else if (op == 5 || op == 6 || op == 7 || op == 9 || op == 13) {
			System.out.print("Valor 1:");
			int val1 = input.nextInt();
			System.out.print("Valor 2:");
			int val2 = input.nextInt();
			
			int result;
			
			switch (op) {
				case 5:
					result = cal.pot(val1, val2);
					if (result == -1)
						System.out.println("Há algo de errado com os valores.");
					else
						System.out.printf("Resultado= %d%n", result);
					break;
				case 6:
					if (val2 == 0)
						System.out.println("Há algo de errado com os valores.");
					else
						System.out.printf("Resultado= %d%n", val1 / val2);
					break;
				case 7:
					if (val2 == 0)
						System.out.println("Há algo de errado com os valores.");
					else 
						System.out.printf("Resultado= %d%n", val1 % val2);
					break;
				case 9:
					result = cal.arranjo(val1, val2);
					if (result == -1)
						System.out.println("Há algo de errado com os valores.");
					else
						System.out.printf("Resultado= %d%n", result);
					break;
				case 13:
					result = cal.raizN(val1, val2);
					if (result == -1)
						System.out.println("Há algo de errado com os valores.");
					else
						System.out.printf("Resultado= %d%n", result);
					break;
			}
			
		// operações realizadas com um valor double ou inteiro 
		}else if (op == 8 || op == 10 || op == 11 || op == 12 || op == 14 || op == 15) {
			System.out.print("Valor:");
			int valI = 0; // Valor inteiro
			double valD = 0; // valor com ponto flutuante
			int resultI; // resultado inteiro
			boolean resultB; // resultado booleano
			
			if (op == 11 || op == 12) // op 11 e 12 usam ponto flutuante
				valD = input.nextDouble();
			else // o resto das op usam inteiro
				valI = input.nextInt();
			
			switch (op) {
				case 8:
					resultI = cal.fat(valI);
					if (resultI == -1)
						System.out.println("Há algo de errado com os valores.");
					else
						System.out.printf("Resultado= %d%n", resultI);
					break;
				case 10:
					resultI = cal.fat(valI);
					if (resultI == -1)
						System.out.println("Há algo de errado com os valores.");
					else
						System.out.printf("Resultado= %d%n", resultI);
					break;
				case 11:
					resultI = cal.piso(valD);
					System.out.printf("Resultado= %d%n", resultI);
					break;
				case 12:
					resultI = cal.teto(valD);
					System.out.printf("Resultado= %d%n", resultI);
					break;
				case 14:
					resultB = cal.primo(valI);
					if (resultB)
						System.out.println("E primo...");
					else 
						System.out.println("Nao e primo...");
					break;
				case 15:
					resultB = cal.quadPerfeito(valI);
					if (resultB)
						System.out.println("E um quadrado perfeito...");
					else 
						System.out.println("Nao e um quadrado perfeito...");
					break;
			}
		}else
			System.out.println("Operação não encontrada...");
	}
}
