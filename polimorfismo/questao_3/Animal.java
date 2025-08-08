public class Animal implements IAnimal {
	private String nomeEspecie;
	private String nomeAnimal;
	
	public Animal(String nomeEspecie, String nomeAnimal) {
		this.nomeEspecie = nomeEspecie;
		this.nomeAnimal = nomeAnimal;
	}
	
	public String getNomeEspecie() {
		return this.nomeEspecie;
	}
	
	public String getNomeAnimal() {
		return this.nomeAnimal;
	}
}