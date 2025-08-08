public class TestAnimal {
	public static void main(String[] args) {
		IFerramentas f = new Ferramentas();
		IAnimal[] listAnimal = new Animal[10];
		listAnimal[0] = new Animal("Reptil", "Tartaruga");
		listAnimal[1] = new Animal("Mamifero", "Urso");
		listAnimal[2] = new Animal("Ave", "Gavião");
		listAnimal[3] = new Animal("Reptil", "Jacaré");
		listAnimal[4] = new Animal("Mamifero", "Baleia");
		listAnimal[5] = new Animal("Ave", "Águia");
		listAnimal[6] = new Animal("Mamifero", "Morcego");
		listAnimal[7] = new Animal("Reptil", "Cobra");
		listAnimal[8] = new Animal("Ave", "Pinguim");
		listAnimal[9] = new Animal("Mamifero", "Onça");
		
		Resultado[] teste = listQuantidadeEspecie(listAnimal, f);
		
		System.out.println("Especie\tQuantidade");
		for (Resultado r : teste) {
			System.out.printf("%s\t%d%n", r.getNomeEspecie(), r.getQuantidade());
		}
	}
	
	// Método que conta a quantidade de animais de cada espécie e retorna uma array
	// de objetos Resultado contendo nome de espécie e quantidade.
	static Resultado[] listQuantidadeEspecie(IAnimal[] animais, IFerramentas ferramentas) {
		String[] especies = ferramentas.classificaEspecies(animais);
		Resultado[] r = new Resultado[especies.length];
		for (int i = 0; i < especies.length; i++) {
			IAnimal[] aux = ferramentas.filtraEspecie(animais, especies[i]);
			r[i] = new Resultado(especies[i], aux.length);
		}
		
		return r;
	}
}