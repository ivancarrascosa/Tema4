package CRUD.Ejercicio4;

import java.util.Scanner;

public class DiscoMain {
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		// Creo una variable para almacenar la opción seleccionada por el usuario
		int opc;

		// Creo un escáner
		Scanner reader = new Scanner(System.in);

		// Creo un objeto de tipo CRUD
		DiscoCRUD discos = new DiscoCRUD();

		// Creo las variables para los atributos del disco
		int codigo;
		String autor;
		String titulo;
		int duracion;
		String genero;

		do {
			// Muestro el menu y almaceno la variable introducida
			mostrarMenu();
			opc = reader.nextInt();
			reader.nextLine();
			
			// Hago un switch con la opción introducida
			switch (opc) {

			// Si es 1, se imprime la lista de los discos
			case 1 -> discos.listarDiscos();

			// Si es 2 , se piden todos los atributos de un disco y se almacenan en un
			// objeto de tipo disco
			case 2 -> {
				codigo = pedirCodigo(reader);
				System.out.println("Introduzca el autor del disco:");
				autor = reader.nextLine();
				System.out.println("Introduzca el título del disco:");
				titulo = reader.nextLine();
				System.out.println("Introduzca la duración del disco:");
				duracion = reader.nextInt();
				reader.nextLine();
				System.out.println("Introduzca el genero del disco:");
				genero = reader.nextLine();
				// Creo un nuevo objeto con los atributos que ha introducido el usuario por
				// consola
				Disco disco = new Disco(codigo, autor, titulo, duracion, genero);

				// Si devuelve true imprimo que se ha podido añadir
				if (discos.nuevoDisco(disco)) {
					System.out.println("Disco añadido adecuadamente.");
				} else { // Si no se ha podido añadir imprimo eso
					System.out.println("Este disco ya está en la base de datos");
				}
			}

			case 3 -> {
				// Creo un objeto de tipo disco con solo el atributo código
				codigo = pedirCodigo(reader);
				Disco disco = new Disco(codigo);
				// Si se ha podido eliminar adecuadamente, lo imprimo por pantalla
				if (discos.eliminarDisco(disco)) {
					System.out.println("Disco eliminado correctamente.");
				} else { // En caso contrario, se lo comunico al usuario
					System.out.println("Disco no encontrado.");
				}
			}
			// Si es 4 imprimo que se está saliendo del programa por pantalla
			case 4 -> {
				System.out.println("Saliendo del programa...");
			}

			default -> System.out.println("Introduzca una opción válida");
			}
		} while (opc != 4);

	}
	// Función para pedir el código
	private static int pedirCodigo(Scanner reader) {
		int codigo;
		System.out.println("Introduzca el código del disco que quiere borrar: ");
		codigo = reader.nextInt();
		reader.nextLine();
		return codigo;
	}
	// Función para mostrar menú
	static public void mostrarMenu() {
		System.out.println("Seleccione una opción:");
		System.out.println("1. Listado.");
		System.out.println("2. Nuevo disco.");
		System.out.println("3. Borrar disco.");
		System.out.println("4. Salir.");
	}
}
