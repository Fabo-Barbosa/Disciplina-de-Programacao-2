// classe que herda de Exception e guarda o saldo quando
// é lançada

public class ContaExcecao extends Exception {
	
	private double saldoDaConta;
	
	public ContaExcecao(double valor) {
		super();
		this.saldoDaConta = valor;
	}
	
	public double getSaldo() {
		return this.saldoDaConta;
	}
}