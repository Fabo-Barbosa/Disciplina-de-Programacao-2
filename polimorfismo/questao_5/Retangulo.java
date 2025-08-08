public class Retangulo extends Forma2D {
	private float largura;
	private float altura;
	
	public Retangulo(float largura, float altura) {
		super("Retangulo");
		this.altura = altura > 0 ? altura : 1;
		this.largura = largura > 0 ? largura : 1;
	}
	
	public float calcularArea() {
		return largura * altura;
	}
	
	public float calcularPerimetro() {
		return 2 * (largura + altura);
	}
}