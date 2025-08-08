import java.util.Random;

public class TestForma2d {
	
	public static void main(String[] args) {
		Random rand = new Random();
		float max = 10;
		Forma2D[] array = new Forma2D[5];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = getRandomForma(rand, max);
		}
		
		for (Forma2D f : array) {
			System.out.printf("%s%nArea: %f Perimetro: %f%n%n", f.getNome(), f.calcularArea(), f.calcularPerimetro());
		}
	}
	
	static Forma2D getRandomForma(Random r, float max) {
		int formaSorteada = r.nextInt(3);
		
		if (formaSorteada == 0) {
			return new Retangulo(1 + (max - 1) * r.nextFloat(), 1 + (max - 1) * r.nextFloat());
		} else if (formaSorteada == 1) {
			return new Quadrado(1 + (max - 1) * r.nextFloat());
		} else {
			return new Circulo(1 + (max - 1) * r.nextFloat());
		}
	}
}