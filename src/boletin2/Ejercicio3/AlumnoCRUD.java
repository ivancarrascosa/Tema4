package boletin2.Ejercicio3;

import java.util.HashSet;
import java.util.Set;

public class AlumnoCRUD {
	
	// Atributo que va a ser la coleccion donde almacenar nuestros objetos
		private Set<Alumno> alumnos = new HashSet<Alumno>();
	
		public void listarAlumnos() {
			for (Alumno alumno : alumnos) {
				System.out.println(alumno);
				System.out.println("-------------------");
			}
		}
}
