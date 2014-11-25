package halloweenClasses;

import java.util.List;

public class RepartoAlLider implements ModoReparto {

	@Override
	public void cargaComoQueres(int variable,
			List<TipoAsustador> listaAsustadores) {

		dameElprimerElementoDeLalista(listaAsustadores).cargarCaramelos(
				variable);

	}

	public TipoAsustador dameElprimerElementoDeLalista(
			List<TipoAsustador> listaAsustadores) {

		return listaAsustadores.get(1);
	}

}
