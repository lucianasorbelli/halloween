package halloweenClasses;

import java.util.List;
import java.util.stream.Stream;

public class RepartoEquitativo implements ModoReparto {

	@Override
	public void cargaComoQueres(int variable,
			List<TipoAsustador> listaAsustadores) {

		listaAsustadores.forEach(TipoAsustador -> TipoAsustador
				.cargarCaramelos(variable));

	}

}
