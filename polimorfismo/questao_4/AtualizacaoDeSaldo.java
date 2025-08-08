public class AtualizacaoDeSaldo implements MovimentoConta {
	private String cpfCorrentista;
	private float valorMovimento;
	
	public AtualizacaoDeSaldo(String cpfCorrentista, float valorMovimento) {
		this.cpfCorrentista = cpfCorrentista;
		this.valorMovimento = valorMovimento;
	}
	
	public String getCpfCorrentista() {
		return this.cpfCorrentista;
	}
	
	public float getValorMovimento() {
		return this.valorMovimento;
	}
}