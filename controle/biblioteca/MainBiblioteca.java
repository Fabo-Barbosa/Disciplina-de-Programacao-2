// Testando a classe biblioteca

public class MainBiblioteca {
	
	public static void main(String[] args) {
		
		Biblioteca bl = new Biblioteca();
		
		bl.adicionarLivro("A");
		
		bl.adicionarLivro("B", "Washinton");
		
		bl.adicionarLivro("C", "Davi", 1907);
		
		bl.exibirAcervo();
	}
}