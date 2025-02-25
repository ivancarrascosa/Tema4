package boletin2.Ejercicio1;

import java.util.Objects;

/**
 * Clase para almacenar las cuentas corrientes de las personas con las distintas
 * operaciones que se pueden realizar con estas.
 */
public class CuentaCorriente {
	// creo un enumerado con las dos naciones que pueden estar
	enum NACION {
		ESPAÑOLA, EXTRANJERA
	}

	/**
	 * DNI del dueño de la cuenta
	 */
	private String DNI;
	/**
	 * Nombre del dueño de la persona
	 */
	private String nombre = "";
	/**
	 * Saldo en la cuenta de la persona
	 */
	private float saldo;
	/**
	 * Nacionalidad de la persona
	 */
	private NACION nacionalidad = NACION.ESPAÑOLA;
	
	/**
	 * Constructor con DNI
	 * @param DNI de la cuenta corriente
	 */
	public CuentaCorriente(String DNI) {
		if (DNI != null && !DNI.isBlank()) {
			this.DNI = DNI;
		}
	}
	/**
	 * Constructor con DNI y saldo
	 * 
	 * @param DNI   DNI de la persona
	 * @param saldo saldo de la persona
	 */
	public CuentaCorriente(String DNI, float saldo) {
		if (DNI != null && !DNI.isBlank()) {
			this.DNI = DNI;
		}
		if (saldo > 0) {
			this.saldo = saldo;
		}
		
	}

	/**
	 * Constructor con DNI, nombre y saldo
	 * 
	 * @param DNI    DNI de la persona
	 * @param nombre nombre de la persona
	 * @param saldo  saldo de la persona
	 */
	public CuentaCorriente(String DNI, String nombre, float saldo) {
		this.DNI = DNI;
		this.nombre = nombre;
		if (saldo > 0) {
			this.saldo = saldo;
		}

	}
	/**
	 * Constructor con todos los atributos de la clase
	 * @param DNI DNI de la persona
	 * @param nombre nombre de la persona
	 * @param saldo saldo de la persona
	 * @param nacionalidad nacionalidad de la persona
	 */
	public CuentaCorriente(String DNI, String nombre, float saldo, String nacionalidad) {
		// Lo paso a mayúscula para que entre en el enumerado aunqu esté en minusculas
		nacionalidad = nacionalidad.toUpperCase();
		if (DNI != null && !DNI.isBlank()) {
			this.DNI = DNI;
		}
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		this.saldo = saldo;
		switch (nacionalidad) {
		case "ESPAÑOLA":
			this.nacionalidad = NACION.ESPAÑOLA;
			break;
		case "EXTRANJERA":
			this.nacionalidad = NACION.EXTRANJERA;
			break;
		default:
			
			break;
		}
	}
	/**
	 * getter para obtener el DNI 
	 * @return DNI de la persona
	 */
	public String getDNI() {
		return DNI;
	}
	/**
	 * getter para obtener el nombre
	 * @return nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * setter para cambiar el nombre de una persona
	 * @param nombre nombre que le queremos poner a la persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * getter para el saldo de la persona
	 * @return saldo de la persona
	 */
	public float getSaldo() {
		return saldo;
	}
	/**
	 * Setter para el saldo de la persona
	 * @param saldo saldo de la persona
	 */
	public void setSaldo(float saldo) {
		if (saldo > 0) {
			this.saldo = saldo;
		}
	}
	/**
	 * Getter para la nacionalidad de la persona 
	 * @return nacionalidad de la persona
	 */
	public NACION getNacionalidad() {
		return nacionalidad;
	}
	/**
	 * Método para sacar dinero de una cuenta corriente
	 * @param dinero dinero que queremos sacar de la cuenta
	 * @return true si hay suficiente dinero en la cuenta, false si no hay suficiente
	 */
	public boolean sacarDinero(float dinero) {
		boolean res = true;
		if (this.saldo < dinero) {
			res = false;
		} else {
			this.saldo -= dinero;
		}
		return res;
	}
	/**
	 * Método para ingresar dinero en una cuenta corriente
	 * @param dinero dinero que queremos ingresar en la cuenta
	 * @return true si la cantidad que queremos ingresar es positiva, false si no lo es
	 */
	public boolean ingresarDinero(float dinero) {
		boolean res = true;
		if (dinero <= 0) {
			res = false;
		} else {
			this.saldo += dinero;
		}
		return res;
	}
	/**
	 * Método to String que devuelve un string con todos los atributos del objeto
	 * @return todos los atributos del objeto
	 */
	@Override
	public String toString() {
		return "DNI=" + DNI + ", nombre=" + nombre + ", saldo=" + saldo + "€, nacionalidad="
				+ nacionalidad;
	}
	@Override
	public int hashCode() {
		return Objects.hash(DNI);
	}
	
	/**
	 * Método equals que compara los objetos
	 * @return si el DNI y el nombre son iguales
	 */
	@Override
	public boolean equals(Object obj) {
		CuentaCorriente other = (CuentaCorriente) obj;
		return this.DNI.equals(other.DNI);
	}
	
	
	
	
	
}
