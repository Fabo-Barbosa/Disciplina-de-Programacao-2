// Testando a classe biblioteca

public class MainBiblioteca {
	
	public static void main(String[] args) {
		
		Biblioteca bl = new Biblioteca();
		
		bl.adicionarLivro("C", "Davi", 1907);
		
		bl.adicionarLivro("C", "Davi", 1955);
		
		bl.adicionarLivro("B", "Washinton", 2013);
		
		bl.adicionarLivro("A", "Chloe", 2003);
		
		System.out.println("Livros\n");
		bl.exibirAcervo();
		
		System.out.println("Livros ordenados por titulo:\n");
		bl.exibirLivrosOrdenadosT();
		
		System.out.println("Livros ordenados pelo ano:\n");
		bl.exibirLivrosOrdenadosA();
	}
}