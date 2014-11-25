package halloweenClasses;

import java.util.ArrayList;
import java.util.List;

public class Legion extends TipoAsustador {

	private List<TipoAsustador> listaAsustadores = new ArrayList<TipoAsustador>();
	private ModoReparto repartija;

	@Override
	public void cargarCaramelos(int variable) {
		// TODO Auto-generated method stub
		repartija.cargaComoQueres(variable, listaAsustadores);

	}

	@Override
	public boolean asustarAdulto(Adulto adulto) {
		// TODO Auto-generated method stub
		return listaAsustadores.stream().allMatch(
				TipoAsustador -> TipoAsustador.asustarAdulto(adulto));

	}

}
