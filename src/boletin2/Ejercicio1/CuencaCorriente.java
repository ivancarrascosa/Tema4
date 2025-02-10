package boletin2.Ejercicio1;

/**
 * Clase para almacenar las cuentas corrientes de las personas con las distintas
 * operaciones que se pueden realizar con estas.
 */
public class CuencaCorriente {
	// creo un enumerado con las dos naciones que pueden estar
	enum NACION {ESPAÑOLA, EXTRANJERA}
	/**
	 * DNI del dueño de la cuenta
	 */
	String DNI;
	/**
	 * Nombre del dueño de la persona
	 */
	String nombre;
	/**
	 * Saldo en la cuenta de la persona
	 */
	float saldo;
	/**
	 * Nacionalidad de la persona
	 */
	NACION nacionalidad;
	
	
}
