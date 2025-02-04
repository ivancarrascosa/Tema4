package boletin1.Ejercicio2;
/**
 * Clase en la que vamos a almacenar a personas con los atributos DNI, nombre, apellidos y edad
 */
public class Persona {
	/**
	 * DNI de la persona
	 */
	String dni;
	/**
	 * Nombre de la persona
	 */
	String nombre;
	/**
	 * Apellidos de la persona
	 */
	String apellidos;
	/**
	 * Edad de la persona
	 */
	int edad;
	
	/**
	 * Constructor de la clase Persona con todos los parámetros
	 * @param dni DNI de la persona
	 * @param nombre Nombre de la persona
	 * @param apellidos Apellidos de la persona
	 * @param edad Edad de la persona
	 */
	Persona(String dni, String nombre, String apellidos, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
}
