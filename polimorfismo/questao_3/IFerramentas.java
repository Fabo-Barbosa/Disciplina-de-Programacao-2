public interface IFerramentas {
	public IAnimal[] filtraEspecie(IAnimal[] completo, String especieFiltrar);
	public String[] classificaEspecies(IAnimal[] completo);
}