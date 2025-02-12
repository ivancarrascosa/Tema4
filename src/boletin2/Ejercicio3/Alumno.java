package boletin2.Ejercicio3;

/**
 * Clase que almacena los alumnos con su nombre y nota media
 */
public class Alumno {
	/**
	 * Nombre del alumno
	 */
	private String nombre;
	
	/**
	 * Nota media del alumno
	 */
	private float notaMedia;
	
	/**
	 * Constructor de la clase para crear un alumno con su nombre y nota media
	 * @param nombre nombre del alumno
	 * @param notaMedia nota media del alumno
	 */
	public Alumno(String nombre, float notaMedia) {
		if (nombre != null && !nombre.isBlank() ) {
			this.nombre = nombre;
		}
		if (notaMedia >= 0 && notaMedia <= 10) {
			this.notaMedia = notaMedia;			
		}

	}
	
	/**
	 * Setter para obtener el nombre del alumno
	 * @return nombre del alumno
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Setter para el nombre del alumno
	 * @param nombre nombre que le queremos asignar al alumno
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank() ) {
			this.nombre = nombre;
		}
	}
	
	/**
	 * Getter para obtener la nota media del alumno
	 * @return nota media del alumno
	 */
	public float getNotaMedia() {
		return notaMedia;
	}
	/**
	 * Setter para cambiar la nota media del alumno
	 * @param notaMedia nota media que queremos establecer al alumno
	 */
	public void setNotaMedia(float notaMedia) {
		if (notaMedia >= 0 && notaMedia <= 10) {
			this.notaMedia = notaMedia;			
		}
	}
	/**
	 * Método toString para convertir la información de un alumno en String
	 * @return Cadena con el nombre y la nota media del alumno
	 */
	public String toString() {
		return "" + this.nombre + " " + this.notaMedia;
	}
	/**
	 * Método equals para comprobar si dos alumnos son iguales
	 * @return true si dos alumnos tienen el mismo nombre, false si no lo tienen
	 */
	@Override
	public boolean equals(Object obj) {
		Alumno other = (Alumno) obj;
		return this.nombre.equals(other.nombre);
	}

}
