package app;

public class Main {

	public static void main(String[] args) {

		Federacion afa = new Federacion("AFA", "10/10/1000", 2);
		ManejadoraJSON manejadora = new ManejadoraJSON(afa, "JSON.gab");

		Integrante integrante1 = new Futbolista("Diego", "Maradona", 30, "10", "Mediocampista");
		Integrante integrante2 = new Entrenador("Alejandro", "Sabella", 70, "ma o meno", "ma o meno");
		// Integrante integrante3 = new Entrenador("Alejandro", "Sabella", 70, "ma o meno", "ma o meno"); // Para probar la excepcion
		Integrante integrante4 = new Masajista("Roberto", "Masajista", 60, "masajista", 10);
		Integrante integrante5 = new Ayudante("Juan", "Ayudante", 50, "unaMetodologia");
		Integrante integrante6 = new Futbolista("Juan", "Riquelme", 41, "10", "Mediocampista");
		Integrante integrante7 = new Ayudante("Juan", "Ayuda", 65, "otraMetodologia");

		try {
			afa.agregarIntegrante(integrante1);
			afa.agregarIntegrante(integrante2);
			// afa.agregarIntegrante(integrante3);
			afa.agregarIntegrante(integrante4);
			afa.agregarIntegrante(integrante5);
			afa.agregarIntegrante(integrante6);
			afa.agregarIntegrante(integrante7);

			afa.mostrarPlantel();

			afa.eliminarIntegrante(integrante5);

			manejadora.cargarArchivo();

			System.out.println();

			afa.mostrarPlantel();

		} catch (ListaCompletaException | IntegranteNoExisteException e) {
			System.out.println(e.getMessage());
		}
	}
}
