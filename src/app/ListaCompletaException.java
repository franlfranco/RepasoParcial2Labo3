package app;

/**
 * Excepcion para cuando las listas se encuentran completas
 * 
 * @author francisco
 *
 */
public class ListaCompletaException extends Exception {

	// Atributos
	private Integrante integrante;

	// Constructores
	public ListaCompletaException() {
		super();
	}

	public ListaCompletaException(Integrante integrante) {
		super();
		this.integrante = integrante;
	}

	@Override
	public String getMessage() {
		return "No se pudo agregar a" + integrante.getNombre() + " " + integrante.getApellido()
				+ " a la lista, lo ve por tele";
	}

}
