package halloweenClasses;

public class TrajeBarney extends Traje {

	@Override
	public int dameTuCapacidadDeAsustar(Niño niño) {
		// TODO Auto-generated method stub
		if (niño.getSexo() == 'F') {

			return niño.getNivelMaldad();
		} else {
			return 0;
		}

	}

}
