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
		
		public boolean añadirAlumno(Alumno alumno) {
			return alumnos.add(alumno);
		}
		
		public Alumno buscarAlumno(Alumno alumno){
			Alumno a = null;
			for (Alumno alumnoTemp : alumnos) {
				if (alumnoTemp.equals(alumno)) {
					a = alumnoTemp;
				}
			}
			return a;
		}
		
		public boolean borrarAlumno(Alumno alumno){
			boolean res = false;
			for (Alumno alumnoTemp : alumnos) {
				if (alumnoTemp.equals(alumno) ) {
					alumno = alumnoTemp;
					res = true;
				}				
				}
			if (res) {
				alumnos.remove(alumno);
			}
			return res;
		}
		
		public boolean cambiarNota(Alumno alumno, float nota) {
			boolean res = false;
			alumno = buscarAlumno(alumno);
			if (alumno != null) {
				alumno.setNotaMedia(nota);
				res = true;
			}
			return res;
		}
}
