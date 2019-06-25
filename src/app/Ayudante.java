package app;

/**
 * Clase ayudante hereda de integrante e implementa ITecnico
 * 
 * @author francisco
 *
 */
public class Ayudante extends Integrante implements ITecnico {

	// Atributos
	private String metodologia;

	// Constructores
	public Ayudante() {
		super();
		setMetodologia("");
	}

	public Ayudante(String nombre, String apellido, int edad, String metodologia) {
		super(nombre, apellido, edad);
		setMetodologia(metodologia);
	}

	// Getters & Setters
	public String getMetodologia() {
		return metodologia;
	}

	public void setMetodologia(String metodologia) {
		this.metodologia = metodologia;
	}

	@Override
	public void jugarPartido() {
		System.out.println(getNombre() + " " + getApellido() + " esta asistiendo al entrenador durante el partido.");
	}

	@Override
	public void prepararEntrenamiento() {
		System.out.println(getNombre() + " " + getApellido() + " esta asistiendo al entrenador en la preparacion.");
	}

	@Override
	public String toString() {
		return "Ayudante" + super.toString();
	}
}
