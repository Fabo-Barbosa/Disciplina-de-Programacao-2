// classe conta, cujo método saca lança um exceção
// instanciada de ContaExcecao

public class Conta {
	private double saldo;
	private double limite;
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) throws ContaExcecao {
		if (valor > this.saldo || valor > this.limite)
			throw new ContaExcecao(this.saldo);
		this.saldo -= valor;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
}