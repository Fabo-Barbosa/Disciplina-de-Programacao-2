// Programa que recebe um inteiro de 1 à 7
// e printa na tela o dia da semana correspondente
// Regra : Usar switch case

import java.util.Scanner;

public class DiaDaSemana {
	
	public static void main(String[] args) {
		
		// input para entrada de dados
		Scanner input = new Scanner(System.in);
		
		// instrução
		System.out.print("Digite um número inteiro de 1 à 7: ");
		// variável que será escolhida pelo usuário
		int diaInt = input.nextInt();
		
		// variável que armazenará o dia com string
		String diaStr = "";
			
		switch (diaInt) {
			
			case 1:
				diaStr = "Domigo";
				break;
				
			case 2:
				diaStr = "Segunda-Feira";
				break;
				
			case 3:
				diaStr = "Terça-Feira";
				break;
				
			case 4:
				diaStr = "Quarta-Feira";
				break;
				
			case 5:
				diaStr = "Quinta-Feira";
				break;
				
			case 6:
				diaStr = "Sexta-Feira";
				break;
				
			case 7:
				diaStr = "Sábado";
				break;
			
			default:
				diaStr = "Entrada inválida...";
	
		}
		
		System.out.println(diaStr);
	}
}