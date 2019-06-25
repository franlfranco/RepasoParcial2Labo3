package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ManejadoraJSON {

	Federacion federacion;
	JSONObject root;
	private String ruta;
	File archivo;

	public ManejadoraJSON(Federacion federacion, String ruta) {
		super();
		this.federacion = federacion;
		this.root = new JSONObject();
		this.ruta = ruta;
	}

	/**
	 * Metodo privado que genera JSON, llamado desde cargarArchivo()
	 */
	private void generarJSON() {
		root.put("federacion", federacion.getNombre());
		root.put("fechaFundacion", federacion.getFechaFundacion());
		root.put("cantCopasMundiales", federacion.getCantCopasMundiales());

		JSONObject integrantes = new JSONObject();
		JSONArray futbolistas = getArrayFutbolistas();
		JSONArray ayudantes = getArrayAyudantes();
		// JSONObject entrenador = getEntrenador();

		integrantes.put("futbolistas",futbolistas);
		integrantes.put("ayudantes",ayudantes);

		root.put("integrantes", integrantes);

	}

	/**
	 * Metodo que crea y carga archivo
	 */
	public void cargarArchivo() {
		archivo = new File(ruta);

		try (PrintWriter writer = new PrintWriter(archivo)) {
			generarJSON();
			writer.print(root.toJSONString());
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * 
	 * @return JSON Array de futbolistas
	 */
	private JSONArray getArrayFutbolistas() {
		JSONArray futbolistas = new JSONArray();

		Iterator it = federacion.getLista().iterator();
		while (it.hasNext()) {
			Integrante e = (Integrante) it.next();
			if (e instanceof Futbolista) {
				JSONObject futbolista = new JSONObject();

				futbolista.put("nombre", e.getNombre());
				futbolista.put("apellido", e.getApellido());
				futbolista.put("edad", e.getEdad());
				futbolista.put("numeroCamiseta", ((Futbolista) e).getNumeroCamiseta());
				futbolista.put("puesto", ((Futbolista) e).getPuesto());

				futbolistas.add(futbolista);
			}
		}
		return futbolistas;
	}

	/**
	 * 
	 * @return JSON Array de ayudantes
	 */
	private JSONArray getArrayAyudantes() {
		JSONArray ayudantes = new JSONArray();

		Iterator it = federacion.getLista().iterator();
		while (it.hasNext()) {
			Integrante e = (Integrante) it.next();
			if (e instanceof Ayudante) {
				JSONObject ayudante = new JSONObject();

				ayudante.put("nombre", e.getNombre());
				ayudante.put("apellido", e.getApellido());
				ayudante.put("edad", e.getEdad());
				ayudante.put("numeroCamiseta", ((Ayudante) e).getMetodologia());

				ayudantes.add(ayudante);
			}
		}
		return ayudantes;
	}
}
