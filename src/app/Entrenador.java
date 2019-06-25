package app;

/**
 * Clase entrenador hereda de integrante, implementa ITecnico.
 * 
 * @author francisco
 *
 */
public class Entrenador extends Integrante implements ITecnico {

	// Atributos
	private String sistemaDeJuego;
	private String estilo;

	// Constructores
	public Entrenador() {
		super();
		setSistemaDeJuego("");
		setEstilo("");
	}

	public Entrenador(String nombre, String apellido, int edad, String sistemaDeJuego, String estilo) {
		super(nombre, apellido, edad);
		setSistemaDeJuego(sistemaDeJuego);
		setEstilo(estilo);
	}

	// Getters & Setters
	public String getSistemaDeJuego() {
		return sistemaDeJuego;
	}

	public void setSistemaDeJuego(String sistemaDeJuego) {
		this.sistemaDeJuego = sistemaDeJuego;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	@Override
	public void jugarPartido() {
		System.out.println(getNombre() + " " + getApellido() + " esta dirigiendo tecnicamente.");
	}

	@Override
	public void prepararEntrenamiento() {
		System.out.println(getNombre() + " " + getApellido() + " esta preparando el entrenamiento.");
	}
	
	@Override
	public String toString() {
		return "Entrenador" + super.toString();
	}
}
