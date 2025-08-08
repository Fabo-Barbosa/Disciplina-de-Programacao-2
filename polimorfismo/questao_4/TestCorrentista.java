public class TestCorrentista {
	
	public static void main(String[] args) {
		
		OperacoesBanco op = new MenuBancario();
		
		Correntista C[] = {new Correntista("1111111111", 13),
						new Correntista("1111111112", 55),
						new Correntista("1111111113", 234),
						new Correntista("1111111114", 1415)};
						
		MovimentoConta M[] = {new AtualizacaoDeSaldo("1111111111", -10),
						new AtualizacaoDeSaldo("1111111112", 12),
						new AtualizacaoDeSaldo("1111111113", -134),
						new AtualizacaoDeSaldo("1111111114", -15)};
		
		System.out.println("Antes da atualização de saldos");
		for (Correntista c : C) {
			System.out.printf("CPF: %s   Saldo: %.2f%n", c.getCpf(), c.getSaldo());
		}
		
		atualizaSaldos(C, M, op);
		
		System.out.println("\nDepois da atualização de saldos");
		for (Correntista c : C) {
			System.out.printf("CPF: %s   Saldo: %.2f%n", c.getCpf(), c.getSaldo());
		}
		
	}
	
	
	// método que recebe as listas de Correntista e MovimentoConta, e um parâmetro OperacoesBanco
	// ele atualiza apenas se o movimento for referente a um determinado correntista dentro da lista
	// C, caso o valor do movimento for 0 ou superior, o saldo do correntista referente não muda.
	static void atualizaSaldos(Correntista C[], MovimentoConta M[], OperacoesBanco op) {
		for (MovimentoConta m : M) {
			Correntista c = op.encontraCorrentista(C, m.getCpfCorrentista());
			if (c!=null) {
				if (m.getValorMovimento() < 0) {
					float saldoAtualizado = c.getSaldo() + m.getValorMovimento();
					c.setSaldo(saldoAtualizado);
				}
			}
		}
	}
}