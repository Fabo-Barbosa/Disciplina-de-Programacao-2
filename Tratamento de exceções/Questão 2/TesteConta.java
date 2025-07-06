// código modificado para capturar a exceção
// lançada pelo método sacar

public class TesteConta {
	public static void main(String args[]) {
		Conta c = new Conta();
		c.depositar(100);
		c.setLimite(50);
		
		boolean sacou = false;
		
		try {
			c.sacar(50);
			sacou = true;
		} catch (ContaExcecao e) {
			System.err.printf("Saldo atual: %.2f%n", e.getSaldo());
		}finally {
			if (sacou)
				System.out.println("Operação bem sucedida...");
			else
				System.out.println("Operação não pôde ser finalizada! Tente novamente...");
		}
	}
}