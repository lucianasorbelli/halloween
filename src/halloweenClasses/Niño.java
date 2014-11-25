package halloweenClasses;

public class Niño extends TipoAsustador {

	private int edad;
	private char sexo;
	private int nivelMaldad;
	private Traje traje;

	public Niño(int edad, int caramelosDelNiño, char sexo, int nivelMaldad,
			Traje traje) {
		this.edad = edad;

		this.sexo = sexo;
		this.nivelMaldad = nivelMaldad;
		this.traje = traje;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getNivelMaldad() {
		return nivelMaldad;
	}

	public void setNivelMaldad(int nivelMaldad) {
		this.nivelMaldad = nivelMaldad;
	}

	public Traje getTraje() {
		return traje;
	}

	public void setTraje(Traje traje) {
		this.traje = traje;
	}

	@Override
	public void cargarCaramelos(int variable) {

		bolsaDeCaramelos = bolsaDeCaramelos + (variable / 2);

	}

	@Override
	public boolean asustarAdulto(Adulto adulto) {

		return adulto.teAsustas(this);

	}

	public int capacidadDeAsustar() {

		return traje.dameTuCapacidadDeAsustar(this);
	}

}
