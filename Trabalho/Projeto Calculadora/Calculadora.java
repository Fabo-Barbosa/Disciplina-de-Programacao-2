// Classe com operações básicas de uma calculadora
// exponenciação, fatorial, arranjos,
// piso, teto, raízes de grau n,
// validador de número primo e validador de quadrado perfeito

public class Calculadora {
	// método de exponenciação 
	public int pot(int num, int exp) {
		if (exp == 0 && num == 0) { // Para 0 elevado a 0
			return -1;
		}else if (exp < 0) { // para expoente negativo
			return -1;
		}else { // concretiza a exponeciação
			int result = 1;
			for (int i = 1; i <= exp; i++) {
				result = result * num;
			}
			return result;
		}
	}
	
	// Método de fatorial
	public int fat(int num) {
		if (num == 0) { // usuário não pode entrar com 0
			return -1;
		}else if (num > 16){ // para resultados que excedem a representção
			return -1;
		}else {
			int result = 1;
			if (num < 0) { // caso entre com um número negativo
				num = num * (-1); // converte o número em positivo
			}
			for (int i = num; i >= 1; i--) { // realiza o fatorial
				result = result * i;
			}
			return result;
		}
	}
	
	// método fatorial com parada
	// fatorial com suporte a valores alto
	// usado nos arranjos
	// equivalente ao corte em divisões
	private int fatp(int num, int parada) {
		// a parada não pode ser maior que o valor
		// parada não pode ser maior que um
		if (parada > num || parada < 1) {
			return -1;
		}
		int result = 1;
		for (int i = num; i >= 1; i--) {
			if (i == parada) { // valor = a parada, o laço é quebrado
				break;
			}
			result = result * i;
		}
		
		return result;
	}
	
	// método arranjo 
	public int arranjo(int n, int p) {
		if (n < 1 || p < 1) { // p e n não podem ser menores do que 1
			return -1;
		}
		
		if (n < p) { // p não pode ser maior do que n
			return -1;
		}
		
		int sub = n - p;
		return this.fatp(n, sub);// realiza o calculo preciso com corte
	}
	
	// função piso
	public int piso(double num) {
		return (int) num;
	}
	
	// função teto
	public int teto(double num) {
		if (num % 2 == 1 || num % 2 == 0) { // caso o valor não tenha parte depois da virgula
			return (int) num;
		}
		return (int) num + 1;
	}
	
	// Método raízes de grau n 
	public int raizN(int num, int n) {
		if (n == 1) { // se o grau for menor que 2 não ira realizar o processo
			return num;
		}
		
		if (num == 1) { // raiz de 1 para qualquer n será 1
			return 1;
		}
		
		int aux = num / 2; // o resultado não pode ser maior que a metade do número
		int result = -1; // caso num for menor que 2, não entrará no for e retornará -1
		for (int i = 2; i <= aux; i++) {
			int val = this.pot(i, n);
			if (val > num) { // se o val passar de num, não há raiz, retorne -1
				break;
			}
			if (val == num) { // se o val for igual a num, result é igual a i (resultado satisfatório)
				result = i;
				break;
			}
		}
		
		return result; // possibilidades: raiz ou -1 caso não possua raiz
	}
	
	// Método validador de número primo
	public boolean primo(int num) {
		boolean result = true; // estado inicial do resultado é verdadeiro
		
		if (num < 2) { // único primo que é par é o 2 (não entra no if se for 2)
			result = false; // 1 ou menor não são primos (muda o estado inicial para falso)
		}
		
		for (int i = 2; i <= num/2; i++) { // verificação a partir do 3, apenas em números impares
			if (num % i == 0) { // se houver um divisor de num entre a metade de num e 3 então não é primo
				result = false; // muda o estado inicial para false
				break;
			}
		}
		
		return result; // false ou true
	}
	
	// Método validador de quadrado perfeito
	public boolean quadPerfeito(int num) {
		boolean result = true; // valor de retorno inicial é verdadeiro
		int aux; // usada para auxiliar no laço for
		
		if (num < 1) { // o menor quadrado perfeito é 1
			result = false; // se for menor do que 1, modifique o valor para falso
		}
		
		for (int i = 1; i <= num; i++) {
			aux = this.pot(i, 2); // resultado de i ao quadrado
			if (aux == num){ // se aux for igual ao número 
				break; // saia do laço, e consequantemete retornará verdadeiro
			}
			
			if (aux > num) { // se aux passar de num
				result = false; // mude o retorno para falso 
				break;
			}
		}
		
		return result; // true ou false
	}
	
	
}