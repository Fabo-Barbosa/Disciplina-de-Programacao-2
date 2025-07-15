public class Livro implements Comparable<Livro> {
	
	private String titulo;
	private String autor;
	private int ano;
	
	public Livro(String titulo) {
		
		this.titulo = titulo;
		
	}
	
	public Livro(String titulo, String autor) {
		
		this.titulo = titulo;
		this.autor = autor;
		
	}
	
	public Livro(String titulo, String autor, int ano) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	// reescrevendo métodos do java
	// equals(Object ob)
	public boolean equals(Object  ob) {
		Livro livro = (Livro) ob;
		return this.titulo == livro.getTitulo();
	}
	
	// compareTo
	public int compareTo(Livro l) {
		
		return this.titulo.compareTo(l.getTitulo());
	}
	
}