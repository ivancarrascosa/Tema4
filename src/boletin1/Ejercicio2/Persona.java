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
	
	/**
	 * Método para saber si una persona es mayor de edad 
	 * @return true si la persona es mayor de edad, false si no lo es
	 */
	public boolean esMayorEdad() {
		return (this.edad >= 18);
	}
	
	/**
	 * Método para saber si una persona es jubilada o no
	 * @return true si la persona es jubilada, false si no lo es
	 */
	public boolean esJubilado() {
		return (this.edad >= 65);
	}
	
	/**
	 * Método para saber la diferencia de edad entre dos personas 
	 * @param p Persona con la que queremos saber la diferencia de edad
	 * @return diferencia de edad
	 */
	public int diferenciaEdad(Persona p) {
		return Math.abs(this.edad - p.edad);
	}
	
	public String toString() {
		return ("DNI: " + this.dni + ", Nombre: " + this.nombre + ", apellidos: " + this.apellidos + ", edad:" + this.edad);
	}

}
