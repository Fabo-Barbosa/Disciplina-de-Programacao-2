public class Circulo extends Forma2D {
	private float raio;
	
	public Circulo(float raio) {
		super("Circulo");
		this.raio = raio > 0 ? raio : 1;
	}
	
	public float calcularArea() {
		return (float) (Math.PI * Math.pow(2, this.raio));
	}
	
	public float calcularPerimetro() {
		return 2 * (float) Math.PI * this.raio;
	}
}