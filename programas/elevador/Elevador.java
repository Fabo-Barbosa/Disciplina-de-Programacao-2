public class Elevador {
	
	private int andarAtual;
	private int totalAndares;
	private int capacidade;
	private int quantPessoas;
	
	public void inicializa(int capacidade, int totalAndares) {
		
		if (capacidade > 1) this.capacidade = capacidade;
		else this.capacidade = 1;
		
		if (totalAndares > 1) this.totalAndares = totalAndares;
		else this.totalAndares = 1;
		
		this.andarAtual = 0;
		this.quantPessoas = 0;
		
	}
	
	public void entra() {
		
		if (this.quantPessoas == this.capacidade) {
			
			System.out.println("Elevador cheio! Quantidade de pessoas: " + this.quantPessoas + " Capacidade: " + this.capacidade);
			
		}else {
			
			this.quantPessoas++;
			System.out.println("Entrou... Quantidade de pessoas: " + this.quantPessoas + " Capacidade: " + this.capacidade);
			
		}
	}
	
	public void sai() {
		
		if (this.quantPessoas == 0) {
			
			System.out.println("Elevador vazio! Quantidade de pessoas: " + this.quantPessoas + " Capacidade: " + this.capacidade);
			
		}else {
			
			this.quantPessoas--;
			System.out.println("Saiu... Quantidade de pessoas: " + this.quantPessoas + " Capacidade: " + this.capacidade);
			
		}
	}
	
	public void sobe() {
		
		if (this.andarAtual == this.totalAndares) {
			
			System.out.println("Já estamos no último andar!");
			
		}else {
			
			this.andarAtual++;
			System.out.println("Subiu... Andar: " + this.andarAtual);
			
		}
	}
	
	public void desce() {
		
		if (this.andarAtual == 0) {
			
			System.out.println("Já estamos no térreo!");
			
		}else {
			
			this.andarAtual--;
			System.out.println("Desceu... Andar: " + this.andarAtual);
			
		}
		
	}
	
	public void setAndarAtual(int andarAtual) {
		
		this.andarAtual = andarAtual;
		
	}
	
	public void setTotalAndares(int totalAndares) {
		
		this.totalAndares = totalAndares;
		
	}
	
	public void setCapacidade(int capacidade) {
		
		this.capacidade = capacidade;
		
	}
	
	public void setQuantPessoas(int quantPessoas) {
		
		this.quantPessoas = quantPessoas;
		
	}
	
	public int getAndarAtual() {
		
		return this.andarAtual;
		
	}
	
	public int getTotalAndares() {
		
		return this.totalAndares;
		
	}
	
	public int getCapacidade() {
		
		return this.capacidade;
		
	}
	
	public int getQuantPessoas() {
		
		return this.quantPessoas;
		
	}
}