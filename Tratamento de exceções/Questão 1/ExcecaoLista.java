// primeiro exercício
// tratamento das possíveis excessões
// do código informado.

// erros gerados nos testes de estressamento do código
import java.lang.ArrayIndexOutOfBoundsException;
import java.util.InputMismatchException;

// classe para entrada de dados 
import java.util.Scanner;

public class ExcecaoLista {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Preencha 3 valores no array na posição desejada.");
		
		String pos[] = {"primeira", "segunda", "terceira"};
		int valores[] = new int[3];
		int control = 0;
	
		while (control < pos.length) {
			try {
				System.out.print("Diga a " + pos[control] + " posição: ");
				int idx = scan.nextInt();
				System.out.print("Diga o valor da posição " + idx + ": ");
				int val = scan.nextInt();
				valores[idx] = val;
				control++;
			}catch (ArrayIndexOutOfBoundsException| InputMismatchException e) {
				System.err.println("Entrada inválida! Digite novamente:");
				scan.next(); // Consume the invalid input to prevent an infinite loop
			}
		}
		
		System.out.print("Os 3 valores são: ");
		
		for (int v : valores)
			System.out.print(v + " ");
		
		scan.close();
	}

}