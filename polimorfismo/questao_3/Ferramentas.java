public class Ferramentas implements IFerramentas {
	
	public IAnimal[] filtraEspecie(IAnimal[] completo, String especieFiltrar) {
		IAnimal[] filtrado = completo.clone();
		int count = 0;
		int countEspecie = 0;
		for (IAnimal a : completo) {
			if (a.getNomeEspecie() != especieFiltrar) {
				filtrado[count] = null;
			}else {
				countEspecie++;
			}
			count++;
		}
		
		count = 0;
		IAnimal[] result = new Animal[countEspecie];
		for (IAnimal a : filtrado) {
			if (a != null) {
				result[count] = a;
				count++;
			}
		}
		
		if (result[0] == null){
			return new Animal[0];
		}
		
		return result;
	}
	
	public String[] classificaEspecies(IAnimal[] completo) {
		
		String[] especies = new String[completo.length];
		int countEspecie = 0;
		for (int i = 0; i < completo.length; i++) {
			
			for (int j = 0; j < especies.length; j++) {
				
				if (completo[i].getNomeEspecie().equals(especies[j])) {
					break;
				}
				
				if (especies[j] == null) {
					especies[j] = completo[i].getNomeEspecie();
					countEspecie++;
					break;
				}
			}
			
		}
		
		String[] especiesFinal = new String[countEspecie];
		
		for (int i = 0; i < countEspecie; i++) {
			especiesFinal[i] = especies[i];
		}
		
		return especiesFinal;
	}
}