package halloweenClasses;

import java.util.ArrayList;
import java.util.List;

public class TrajeCompuesto extends Traje {

	private List<Traje> trajes = new ArrayList<Traje>();

	@Override
	public int dameTuCapacidadDeAsustar(Niño niño) {
		// TODO Auto-generated method stub

		int variable = trajes.stream()
				.mapToInt(traje -> traje.dameTuCapacidadDeAsustar(niño))
				.sum();

		return variable;
	}

}
