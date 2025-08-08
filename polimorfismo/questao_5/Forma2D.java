public abstract class Forma2D {
	private final String nome;
	
	public Forma2D(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public abstract float calcularArea();
	public abstract float calcularPerimetro();
	
}