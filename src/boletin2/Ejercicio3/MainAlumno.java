package boletin2.Ejercicio3;

import java.util.Scanner;

public class MainAlumno {

	public static void main(String[] args) {
		// Creo una variable para almacenar la opción que elija el usuario
		int opc;

		// Creo un escáner
		Scanner reader = new Scanner(System.in);

		do {
			mostrarMenu();
			opc = reader.nextInt();
			switch (opc) {
			case 1 -> {
				for (int i = 0 ; i < )
			}
			}
		} while (opc != 5);

	}

	static void mostrarMenu() {
		System.out.println("1. Listado");
		System.out.println("2. Nuevo Alumno");
		System.out.println("3. Modificar");
		System.out.println("4. Borrar");
		System.out.println("5. Salir");

	}

}
