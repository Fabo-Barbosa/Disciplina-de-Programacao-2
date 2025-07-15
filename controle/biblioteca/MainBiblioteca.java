// Testando a classe biblioteca

public class MainBiblioteca {
	
	public static void main(String[] args) {
		
		Biblioteca bl = new Biblioteca();
		
		bl.adicionarLivro("C", "Davi", 1907);
		
		bl.adicionarLivro("C", "Davi", 1955);
		
		bl.adicionarLivro("B", "Washinton");
		
		bl.adicionarLivro("A");
		
		
		bl.exibirAcervo();
		
		bl.exibirLivrosOrdenados();
	}
}