public class MenuBancario implements OperacoesBanco {
	public Correntista encontraCorrentista(Correntista todosCorrentistas[],
											String cpfProcurado) {
		for (Correntista c : todosCorrentistas) {
			if (c.getCpf().equals(cpfProcurado)) {
				return c;
			}
		}
		
		return null;
	}
}