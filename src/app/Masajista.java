package app;

/**
 * Clase masajista hereda de integrante, implementa ISecundario
 * @author francisco
 *
 */
public class Masajista extends Integrante implements ISecundarios{

	// Atributos
	private String titulo;
	private int anosExperiencia;
	
	//Constructores
	public Masajista() {
		super();
	}
	
	/**
	 * @param titulo
	 * @param anosExperiencia
	 * @returns instancia de masajista
	 */
	public Masajista(String nombre, String apellido, int edad, String titulo, int anosExperiencia) {
		super(nombre, apellido, edad);
		setTitulo(titulo);
		setAnosExperiencia(anosExperiencia);
	}

	// Getters & Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnosExperiencia() {
		return anosExperiencia;
	}

	public void setAnosExperiencia(int anosExperiencia) {
		this.anosExperiencia = anosExperiencia;
	}
	
	@Override
	public void darAsistencia() {
		System.out.println(getNombre() + " " + getApellido() + " esta asistiendo.");
	}
	
	@Override
	public String toString() {
		return "Masajista" + super.toString();
	}
}
