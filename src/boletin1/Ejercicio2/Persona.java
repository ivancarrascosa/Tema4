package boletin1.Ejercicio2;

/**
 * Clase en la que vamos a almacenar a personas con los atributos DNI, nombre,
 * apellidos y edad
 */
public class Persona {
	/**
	 * DNI de la persona
	 */
	private String dni;
	/**
	 * Nombre de la persona
	 */
	private String nombre;
	/**
	 * Apellidos de la persona
	 */
	private String apellidos;
	/**
	 * Edad de la persona
	 */
	private int edad;

	/**
	 * Constructor de la clase Persona con todos los parámetros
	 * 
	 * @param dni       DNI de la persona
	 * @param nombre    Nombre de la persona
	 * @param apellidos Apellidos de la persona
	 * @param edad      Edad de la persona
	 */
	Persona(String dni, String nombre, String apellidos, int edad) {
		if (dni != null && !dni.isBlank() && dni.length() == 9) {
			this.dni = dni;
		}
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (apellidos != null && !apellidos.isBlank()) {
			this.apellidos = apellidos;
		}
		if (edad > 0) {
			this.edad = edad;
		}
	}

	/**
	 * Getter para obtener el DNI de la persona
	 * 
	 * @return DNI de la persona
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Getter para obtener el nombre de la persona
	 * 
	 * @return nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter para cambiar el nombre de una persona
	 * 
	 * @param nombre que queremos establecer a la persona
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Getter para obtener los apellidos de la persona
	 * 
	 * @return apellidos de la persona
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Setter para cambiar los apellidos de una persona
	 * 
	 * @param apellidos que queremos establecer a la persona
	 */
	public void setApellidos(String apellidos) {
		if (apellidos != null && !apellidos.isBlank()) {
			this.apellidos = apellidos;
		}
	}

	/**
	 * Getter para obtener la edad de la persona
	 * 
	 * @return edad de la persona
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Setter para cambiar la edad de una persona
	 * 
	 * @param edad que queremos establecer a la persona
	 */
	public void setEdad(int edad) {
		if (edad > 0) {
			this.edad = edad;
		}
	}

}
