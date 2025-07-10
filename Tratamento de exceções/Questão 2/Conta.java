// classe conta, cujo método saca lança um exceção
// instanciada de ContaExcecao

public class Conta {
	private double saldo;
	private double limite;
	private double countSacado;
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) throws ContaExcecao {
		// possívei erros que lançarão uma exceção do tipo ContaExcecao
		// valor maior que o saldo
		// valor excede o limite diário
		if (valor > this.saldo || this.limite < (this.countSacado + valor))
			throw new ContaExcecao(this.saldo);
		this.saldo -= valor;
		this.countSacado += valor;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
}