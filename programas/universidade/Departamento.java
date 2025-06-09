public class Departamento {
	
	private String nome;
	private Pessoa[] pessoas = new Pessoa[15];
	private int quantPessoas;
	
	public Departamento(String nome) {
		
		this.nome = nome;
		this.quantPessoas = 0;
		
	}
	
	public void setNome(String nome) {
		
		this.nome = nome;
		
	}
	
	public String getNome() {
		
		return this.nome;
		
	}
	
	public void exibirNome() {
		
		System.out.println(this.nome);
		
	}
	
	public void addPessoa(Pessoa pes) {
		
		if (quantPessoas < 15) {
			
			this.pessoas[quantPessoas] = pes;
			quantPessoas++;
			
		}else {
			
			System.out.println("Quantidade de pessoas excedida!");
			
		}
		
	}
	
	public void listarPess() {
		
		if (this.quantPessoas == 0) {
			
			System.out.println("- Não há pessoas!");
			
		}else {
			
			for (int i = 0; i < quantPessoas; i++) {
				
				System.out.println("- " + pessoas[i].getNome());
				
			}
			
		}
		
	}
	
}