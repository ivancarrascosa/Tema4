package boletin2.Ejercicio3;

import java.util.Scanner;

public class MainAlumno {
	
	// Creo un escáner
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		// Creo una variable para almacenar la opción que elija el usuario
		int opc;
		
		// Creo una variable para almacenar un objeto del tipo alumno
		Alumno alumno;
		
		// Creo una variable para almacenar el nombre de un alumno
		String nombre;
		
		// Creo una variable para almacenar la nota de un alumno
		float notaAlumno;
		
		AlumnoCRUD alumnos = new AlumnoCRUD();
		do {
			mostrarMenu();
			opc = reader.nextInt();
			reader.nextLine();
			switch (opc) {
			case 1 -> alumnos.listarAlumnos();
			case 2 -> {
				alumno = crearAlumno();
				alumnos.añadirAlumno(alumno);
			}
			case 3 -> {
				System.out.println("Introduzca el nombre del alumno que quiere buscar:");
				nombre = reader.nextLine();
				alumno = new Alumno(nombre);
				System.out.println("Introduzca la nueva nota media del alumno");
				notaAlumno = reader.nextFloat();
				reader.nextLine();
				alumno = alumnos.buscarAlumno(alumno);
				if (alumno != null) {
					alumno.setNotaMedia(notaAlumno);
					System.out.println("Nota cambiada correctamente.");
				} else {
					System.out.println("No se encontró a este alumno.");
				}
			}
			
			case 4 -> {
				System.out.println("Introduzca el nombre del alumno que quiere buscar:");
				nombre = reader.nextLine();
				alumno = new Alumno(nombre);
				if(alumnos.borrarAlumno(alumno)) {
					System.out.println("Alumno borrado correctamente.");
				} else {
					System.out.println("Alumno no encontrado.");
				}
			}
			
			case 5 -> System.out.println("Saliendo del programa...");
			default ->
			System.out.println("No se ha elegido una opción correcta.");
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
	
	private static Alumno crearAlumno() {
		String nombre;
		float notaMedia;
		Alumno a = null;
		
		System.out.println("Introduzca el nombre del alumno:");
		nombre = reader.nextLine();
		System.out.println("Introduzca la nota media del alumno.");
		notaMedia = reader.nextFloat();
		reader.nextLine();
		a = new Alumno(nombre, notaMedia);
		return a;
		
	}


}
