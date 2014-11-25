package halloweenClasses;

public class AdultoComun extends Adulto {


	@Override
	public boolean teAsustas(Niño niño) {

		if (niño.getNivelMaldad() > this.tolerancia) {
			niño.cargarCaramelos(tolerancia);
			return true;

		} else {
			this.tolerancia = tolerancia + 1;
			return false;
		}

	}
}
