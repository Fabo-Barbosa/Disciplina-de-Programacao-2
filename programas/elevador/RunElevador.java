public class RunElevador {
	
	public static void main(String[] args) {
		
		Elevador elevador = new Elevador();
		
		elevador.inicializa(5, 3);
		
		// teste de entrada
		elevador.setQuantPessoas(4);
		elevador.entra();
		elevador.entra();
		
		
		// teste de saída
		elevador.setQuantPessoas(1);
		elevador.sai();
		elevador.sai();
		
		// teste subida
		elevador.setAndarAtual(2);
		elevador.sobe();
		elevador.sobe();
		
		// teste descida
		elevador.setAndarAtual(1);
		elevador.desce();
		elevador.desce();
		
	}
}