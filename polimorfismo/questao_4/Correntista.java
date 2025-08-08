public class Correntista {
	private String cpf;
	private float saldo;
	
	public Correntista(String cpf, float saldo) {
		this.saldo = saldo;
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(float newSaldo) {
		this.saldo = newSaldo;
	}
}