public class Universidade {
	
	private String nome;
	private Departamento[] departamentos = new Departamento[10];
	private int quantDep;
	
	public Universidade(String nome) {
		
		this.quantDep = 0;
		this.nome = nome;
		
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
	
	public void addDepartamento(Departamento dep) {
		
		if (quantDep < 10) {
			
			this.departamentos[quantDep] = dep;
			this.quantDep++;
			
			System.out.println("Departamento " + dep.getNome() + " adicionado...");
			
		}else {
			
			System.out.println("Quantidade de departamentos excedida!");
			
		}
	}
	
	
	public void listarDep() {
		
		if (quantDep == 0) {
			
			System.out.println("Não há departamentos!");
			
		}else {
			
			for (int i = 0; i < quantDep; i++) {
				
				departamentos[i].exibirNome();
				departamentos[i].listarPess();
				
			}
			
		}
		
	}
	
}