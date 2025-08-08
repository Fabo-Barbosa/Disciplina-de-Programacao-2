public class Resultado {
	private String nomeEspecie;
	private int quantidade;
	
	public Resultado(String nomeEspecie, int quantidade) {
		this.nomeEspecie = nomeEspecie;
		this.quantidade = quantidade;
	}
	
	public String getNomeEspecie() {
		return this.nomeEspecie;
	}
	
	public int getQuantidade() {
		return this.quantidade;
	}
}