// classe biblioteca com métodos sobrecarregados
// Método: adicionarLivro

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
	
	// função usa implicitamente o compareTo do contrato Comparable
	public void exibirLivrosOrdenadosT() {
		Collections.sort(this.livros);
		this.exibirAcervo();
	}
	
	// função usa implicitamente o compareTo do contrato Comparable
	public void exibirLivrosOrdenadosA() {
		Collections.sort(this.livros, new ComparaAno());
		this.exibirAcervo();
	}
	
	public int contaRepetidos(Livro l) {
		int count = 0;
		
		for (Livro liv: this.livros) {
			if (l.equals(liv)) {
				count++;
			}
		}
		
		return count;
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

class ComparaAno implements Comparator<Livro> {
	
	public int compare(Livro l1, Livro l2) {
		
		return l1.getAno() - l2.getAno();
	}
}