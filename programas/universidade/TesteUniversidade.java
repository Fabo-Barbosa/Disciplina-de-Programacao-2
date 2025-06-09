public class TesteUniversidade {
	
	public static void main(String[] args) {
		
		Universidade uni = new Universidade("UFPA");
		
		Departamento dep1 = new Departamento("Noc");
		Departamento dep2 = new Departamento("Secretaria");
		Departamento dep3 = new Departamento("Sistemas");
		
		Pessoa p1 = new Pessoa("Lucas", "lucas@gmail.com", "4444-5555");
		Pessoa p2 = new Pessoa("Wallace", "wal@gmail.com", "4444-5555");
		Pessoa p3 = new Pessoa("Jair", "jair@gmail.com", "4444-5555");
		Pessoa p4 = new Pessoa("João", "jo@gmail.com", "4444-5555");
		Pessoa p5 = new Pessoa("Fabio", "fabio@gmail.com", "4444-5555");
		Pessoa p6 = new Pessoa("Zeno", "zz@gmail.com", "4444-5555");
		
		dep1.addPessoa(p1);
		dep1.addPessoa(p2);
		dep2.addPessoa(p3);
		dep2.addPessoa(p4);
		dep3.addPessoa(p5);
		dep3.addPessoa(p6);
		
		uni.addDepartamento(dep1);
		uni.addDepartamento(dep2);
		uni.addDepartamento(dep3);
		
		uni.listarDep();
		
	}
}