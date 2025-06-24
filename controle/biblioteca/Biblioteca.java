// classe biblioteca com métodos sobrecarregados
// Método: adicionarLivro

import java.util.ArrayList;

public class Biblioteca {
	
	private ArrayList<Livro> livros = new ArrayList<>();
	private int quantLivros = 0;
	
	public void adicionarLivro(String titulo) {
		
		Livro livro = new Livro(titulo);
		livros.add(livro);
		
		quantLivros++;
	}
	
	public void adicionarLivro(String titulo, String autor) {
		
		Livro livro = new Livro(titulo, autor);
		livros.add(livro);
		
		quantLivros++;
	}
	
	public void adicionarLivro(String titulo, String autor, int ano) {
		
		Livro livro = new Livro(titulo, autor, ano);
		livros.add(livro);
		
		quantLivros++;
	}
	
	public void exibirAcervo() {
		
		System.out.println("TITULO\tAUTOR\tANO");
		for (int i = 0; i < quantLivros; i++) {
			
			System.out.print(livros.get(i).getTitulo() + "\t");
			
			if (livros.get(i).getAutor() == null) {
				System.out.println("-\t-");
			} else {
				
				System.out.print(livros.get(i).getAutor() + "\t");
				
				if (livros.get(i).getAno() == 0)
					System.out.println("-");
				else
					System.out.println(livros.get(i).getAno());
			}
		}
	}
}