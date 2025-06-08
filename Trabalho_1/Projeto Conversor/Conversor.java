import java.util.Scanner;

public class Conversor {
	
	// instância de um Scanner para entrada de dados
	static Scanner input = new Scanner(System.in);
	
	// variável que será convertida
	static double valor;
	
	// variáveis utilizadas para escolher escala
	static int op1, op2;
	
	public static void main(String[] args) {
		
		// variável de controle do laço principal
		int op;
		
		// laço principal
		while (true) {
			
			menu();
			
			op = input.nextInt();
			
			switch (op) {
				
				case 1:
					convertTemp();
					break;
				
				case 2:
					convertComp();
					break;
				
				case 3:
					convertMassa();
					break;
				
				case 4:
					convertCoin();
					break;
					
				default:
					return;
			}
		}
	}
	
	public static void menu() {
		System.out.println("1: Converter temperatura;");
		System.out.println("2: Converter comprimento;");
		System.out.println("3: Converter massa;");
		System.out.println("4: Converter moeda;");
		System.out.println("*: Sair.");
	}
	
	public static boolean instruct(int inicio, int fim) {
		
		System.out.print("Converter de: ");
		op1 = input.nextInt();
		
		if (op1 < inicio || op1 > fim) {
			System.out.println("Opção inválida...");
			return false;
		}
		
		System.out.print("Para: ");
		op2 = input.nextInt();
		
		if (op2 == op1 || op1 < inicio || op1 > fim) {
			System.out.println("Opção inválida...");
			return false;
		}
		
		System.out.print("Valor: ");
		valor = input.nextDouble();
		
		return true;
		
	}
	
	public static void convertTemp() {
		
		System.out.println("1 - Celsius\n2 - Fahrenheit\n3 - Kelvin");
		
		if(!instruct(1, 3)) return;
		
		double result = 0;
		
		String strOp1 = "", strOp2 = "";
		
		if (op1 == 1 && op2 == 2) {
			
			strOp1 = "Celsius";
			strOp2 = "Fahrenheit";
			
			result = (valor * (9 / 5)) + 32;
			
		} else if (op1 == 1 && op2 == 3) {
			
			strOp1 = "Celsius";
			strOp2 = "Kelvin";
			
			result = valor + 273.15;
			
		}else if (op1 == 2 && op2 == 1) {
			
			strOp1 = "Fahrenheit";
			strOp2 = "Celsius";
			
			result = (valor - 32) * (5 / 9);
			
		}else if (op1 == 2 && op2 == 3) {
			
			strOp1 = "Fahrenheit";
			strOp2 = "Kelvin";
			
			result = ((valor - 32) * (5 / 9)) + 273.15;
			
		}else if (op1 == 3 && op2 == 1) {
			
			strOp1 = "Kelvin";
			strOp2 = "Celsius";
			
			result = valor - 273.15;
			
		}else if (op1 == 3 && op2 == 2) {
			
			strOp1 = "Kelvin";
			strOp2 = "Fahrenheit";
			
			result = (valor - 273.15) * (9 / 5);
			
		}
		
		System.out.printf("%s: %.2f | %s: %.2f%n%n", strOp1, valor, strOp2, result);
		
	}
	
	public static void convertComp() {
		
		System.out.println("1 - Metros\n2 - Contimetros\n3 - Milímetros\n4 - Polegadas\5 - Pés");
		
		if(!instruct(1, 5)) return;
		
		if (valor < 0) {
			
			System.out.println("Valor negativo não é possível nessa conversão...");
			
			return;
			
		}
		
		double aux = 0.0;
		
		String strOp1 = "", strOp2 = "";
		
		if (op2 == 1) strOp2 = "Metros";
		else if (op2 == 2) strOp2 = "Centimetros";
		else if (op2 == 3) strOp2 = "Milimetros";
		else if (op2 == 4) strOp2 = "Polegadas";
		else if (op2 == 5) strOp2 = "Pés";
		
		if (op1 == 1) {
			
			strOp1 = "Metros";
			
			if (op2 == 2) aux = 100;
			else if (op2 == 3) aux = 1000;
			else if (op2 == 4) aux = 39.3701;
			else if (op2 == 5) aux = 3.28084;
	
		} else if (op1 == 2) {
			
			strOp1 = "Centimetros";
			
			if (op2 == 1) aux = 0.01;
			else if (op2 == 3) aux = 10;
			else if (op2 == 4) aux = 0.393701;
			else if (op2 == 5) aux = 0.0328084;
			
		} else if (op1 == 3) {
			
			strOp1 = "Milimetros";
			
			if (op2 == 1) aux = 0.001;
			else if (op2 == 2) aux = 0.1;
			else if (op2 == 4) aux = 0.0393701;
			else if (op2 == 5) aux = 0.00328084;
			
		} else if (op1 == 4) {
			
			strOp1 = "Polegadas";
			
			if (op2 == 1) aux = 0.0254;
			else if (op2 == 2) aux = 2.54;
			else if (op2 == 3) aux = 25.4;
			else if (op2 == 5) aux = 0.0833333;
			
		} else if (op1 == 5) {
			
			strOp1 = "Pés";
			
			if (op2 == 1) aux = 0.3048;
			else if (op2 == 2) aux = 30.48;
			else if (op2 == 3) aux = 304.8;
			else if (op2 == 4) aux = 12;
			
		}
		
		System.out.printf("%s: %.2f | %s: %.2f%n%n", strOp1, valor, strOp2, aux * valor);
		
	}
	
	public static void convertMassa() {
		
		System.out.println("1 - Quilogramas\n2 - Gramas\n3 - Libras");
		
		if(!instruct(1, 3)) return;
		
		if (valor < 0) {
			
			System.out.println("Valor negativo não é possível nessa conversão...");
			
			return;
		}
		
		double aux = 0.0;
		
		String strOp1 = "", strOp2 = "";
		
		if (op2 == 1) strOp2 = "Quilogramas";
		else if (op2 == 2) strOp2 = "Gramas";
		else if (op2 == 3) strOp2 = "Libras";
		
		if (op1 == 1) {
			
			strOp1 = "Quilogramas";
			
			if (op2 == 2) aux = 1000;
			else if (op2 == 3) aux = 2.20462;
			
		} else if (op1 == 2) {
			
			strOp1 = "Gramas";
			
			if (op2 == 1) aux = 0.001;
			else if (op2 == 3) aux = 0.00220462;
			
		} else if (op1 == 3) {
			
			strOp1 = "Libras";
			
			if (op2 == 1) aux = 0.453592;
			else if (op2 == 2) aux = 453.592;
			
		}
		
		System.out.printf("%s: %.2f | %s: %.2f%n%n", strOp1, valor, strOp2, aux * valor);
	}
	
	public static void convertCoin() {
		
		System.out.println("1 - Real\n2 - Dólar\n3 - Euro\n4 - Libra");
		
		if(!instruct(1, 4)) return;
		
		if (valor < 0) {
			
			System.out.println("Valor negativo não é possível nessa conversão...");
			
			return;
		}
		
		double aux = 0.0;
		
		String strOp1 = "", strOp2 = "";
		
		if (op2 == 1) strOp2 = "Real";
		else if (op2 == 2) strOp2 = "Dólar";
		else if (op2 == 3) strOp2 = "Euro";
		else if (op2 == 4) strOp2 = "Libra";
		
		if (op1 == 1) {
			
			strOp1 = "Real";
			
			if (op2 == 2) aux = 0.20;
			else if (op2 == 3) aux = 0.18;
			else if (op2 == 4) aux = 0.15;
			
		}else if (op1 == 2) {
			
			strOp1 = "Dólar";
			
			if (op2 == 1) aux = 5.00;
			else if (op2 == 3) aux = 0.90;
			else if (op2 == 4) aux = 0.78;
			
		}else if (op1 == 3) {
			
			strOp1 = "Euro";
			
			if (op2 == 1) aux = 5.50;
			else if (op2 == 2) aux = 1.11;
			else if (op2 == 4) aux = 0.86;
			
		}else if (op1 == 4) {
			
			strOp1 = "Libra";
			
			if (op2 == 1) aux = 6.60;
			else if (op2 == 2) aux = 1.28;
			else if (op2 == 3) aux = 1.16;
			
		}
		
		System.out.printf("%s: %.2f | %s: %.2f%n%n", strOp1, valor, strOp2, aux * valor);
		
	}
}