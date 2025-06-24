// Programa recebe uma string nomeDoMes
// e retorna se o mes especificado está
// no primeiro ou no segundo semestre
// Regras : usar switch case e BufferedReader

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MesDoAno {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		// instrução para o usuário
		System.out.print("Informe um mês: ");
		
		// variável
		String nomeDoMes = bf.readLine();
		
		// Estrutura switch case
		switch (nomeDoMes) {
			
			case "janeiro", "fevereiro", "marco", "maio", "abril", "junho":
				System.out.println("Primeiro semestre...");
				break;
				
			case "julho", "agosto", "setembro", "outubro", "novembro", "dezembro":
				System.out.println("Segundo Semestre...");
				break;
				
			default:
				System.out.println("Mes inválido...");
				
		}
	}
}