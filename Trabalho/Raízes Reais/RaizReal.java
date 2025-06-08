// classe que encontra as raízes reais de um polinômio do segundo grau
// método principal: menu com entrada dos termos a, b e c, e o retorno do resultado
// além do main, criou-se três métodos que calculam partes do processo bhaskara
// métodos além do main: delta, x1 e x2
import java.util.Scanner;

public class RaizReal {
	
	public static void main(String[] args) {
		
		// instanciando um Scanner para entrada de dados
		Scanner input = new Scanner(System.in);
		
		// Variáveis necessárias no cálculo
		int a, b, c;
		
		// variável que indica se fica ou sai do programa
		int continuar = 1;
		
		// laço principal do algoritmo
		while (continuar == 1) { // controle do laço
			
			System.out.print("Encontrar as raízes para um polinômio de grau 2? [sim: 1 | não: *] ");
			continuar = input.nextInt(); // valor dirferente de 1 sai do programa 
			
			if (continuar != 1) { // caso usuário escolha sair do programa
				
				continue;
				
			}else { // caso o usuário escolha continuar
				
				while (true) { // laço que força o usuário digitar um valor diferente de 0 para o termo a
				
					System.out.print("Termo a (não pode ser 0): ");
					a = input.nextInt();
				
					if (a == 0) {
					
						System.out.println("Escolha outro valor para a");
					
					}else {
						
						break;
						
					}
				}
					
					// termo b
					System.out.print("Termo b (se não houver, digite 0): ");
					b = input.nextInt();
					
					// termo c
					System.out.print("Termo c (se não houver, digite 0): ");
					c = input.nextInt();
					
					// pré-processamento do calculo
					int del = delta(a, b, c);
					double quadDel = Math.sqrt(del); // raiz quadrada do delta
					int negB = b * (-1); // mudando o sinal do termo b
					
					if (del < 0) { // discriminante negativo, pressupõe que não há raizes reais
						
						System.out.println("O polinômio não possui raízes reais...\n");
						
					}else if (del == 0) { // discriminante igual a 0, diz que x' e x'' são iguais
						
						System.out.printf("O polinômio possui apenas uma raiz: %.2f%n", x1(a, negB, quadDel));
						
					}else { // discriminante positivo, possui 2 raizes reais
						
						System.out.printf("Polinômio com duas raízes: %.2f e %.2f%n", x1(a, negB, quadDel), x2(a, negB, quadDel));
						
					}
					
				}
				
			}
		}
		
	// método que encontra o discriminante
	public static int delta(int a, int b, int c) {
		
		int del = (b * b) - (4 * a * c);
		
		return del;
			
	}
	
	// encontrando x'
	// argumentos: termo a, termo -b, raiz quadrada de delta
	public static double x1(int a, int negB, double quadDel) {
		
		return (negB + quadDel) / (2 * a);
	
	}
	
	// encontrando x''
	// mesmos argumentos do x'
	public static double x2(int a, int negB, double quadDel) {
			
		return (negB - quadDel) / (2 * a);
		
	}
		
}
	