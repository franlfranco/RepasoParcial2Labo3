package app;

import java.util.HashSet;

/**
 * 
 * @author francisco
 *
 */
public class Federacion {

	// Atributos
	private String nombre;
	private String fechaFundacion;
	private int cantCopasMundiales;
	private HashSet<Integrante> lista;

	// Constructores
	public Federacion() {
		super();
		setNombre("");
		this.fechaFundacion = "";
		setCantCopasMundiales(0);
		lista = new HashSet<Integrante>();
	}

	public Federacion(String nombre, String fechaFundacion, int cantCopasMundiales) {
		super();
		setNombre(nombre);
		this.fechaFundacion = fechaFundacion;
		setCantCopasMundiales(cantCopasMundiales);
		lista = new HashSet<Integrante>();
	}

	// Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantCopasMundiales() {
		return cantCopasMundiales;
	}

	public void setCantCopasMundiales(int cantCopasMundiales) {
		this.cantCopasMundiales = cantCopasMundiales;
	}

	public HashSet<Integrante> getLista() {
		return lista;
	}

	public String getFechaFundacion() {
		return fechaFundacion;
	}

	// Metodos varios
	/**
	 * Metodo que agrega integrante, chequea el tipo de integrante y luego cantidad
	 * segun los tipos
	 * 
	 * @param nuevoIntegrante
	 * @throws ListaCompletaException
	 */
	public void agregarIntegrante(Integrante nuevoIntegrante) throws ListaCompletaException {
		if (nuevoIntegrante instanceof Futbolista) {
			if (cantidadFutbolistas() < 23) {
				lista.add(nuevoIntegrante);
			} else {
				throw new ListaCompletaException(nuevoIntegrante);
			}
		} else if (nuevoIntegrante instanceof Entrenador) {
			if (!hayEntrenador()) {
				lista.add(nuevoIntegrante);
			} else {
				throw new ListaCompletaException(nuevoIntegrante);
			}
		} else {
			lista.add(nuevoIntegrante);
		}
	}

	
	
	/**
	 * Metodo que chequea la existencia de un integrante en la lista, si existe lo elimina.
	 * @param integrante
	 * @throws IntegranteNoExisteException
	 */
	public void eliminarIntegrante(Integrante integrante) throws IntegranteNoExisteException{
		boolean flag = lista.remove(integrante);
		if(!flag) {
			throw new IntegranteNoExisteException(integrante);
		}
	}
	
	/**
	 * Metodo que muestra el plantel entero.
	 */
	public void mostrarPlantel() {
		for(Integrante e : lista) {
			System.out.println(e.toString());
		}
	}
	
	/**
	 * @return cantidad de jugadores
	 */
	public int cantidadFutbolistas() {
		int contador = 0;
		for (Integrante e : lista) {
			if (e instanceof Futbolista) {
				contador++;
			}
		}
		return contador;
	}

	/**
	 * @return true si hay entrenador, false si no
	 */
	public boolean hayEntrenador() {
		for (Integrante e : lista) {
			if (e instanceof Entrenador) {
				return true;
			}
		}
		return false;
	}
}
