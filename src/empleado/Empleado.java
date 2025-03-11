package empleado;

import java.util.Objects;

public class Empleado {
	private String dni;
	private String nombre;
	private double sueldoBase;
	private int horasExtra;
	private static double importeHorasExtra;
	
	public Empleado(String dni) {
		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}
	}
	public Empleado(String dni, String nombre, double sueldoBase, int horasExtra) {
		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (sueldoBase > 0) {
			this.sueldoBase = sueldoBase;
		}
		if (horasExtra >= 0) {
			this.horasExtra = horasExtra;
		}

	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		if (sueldoBase > 0) {
			this.sueldoBase = sueldoBase;
		}
	}

	public int getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(int horasExtra) {
		if (horasExtra >= 0) {
			this.horasExtra = horasExtra;
		}
	}

	public double calcularComplemento() {
		return this.horasExtra * Empleado.importeHorasExtra;
	}

	public double sueldoBruto() {
		return this.sueldoBase + this.calcularComplemento();
	}
	
	public double getImporteHorasExtra() {
		return importeHorasExtra;
	}
	
	static public void setImporteHorasExtra(double importeHorasExtra) {
		if (importeHorasExtra > 0) {
			Empleado.importeHorasExtra = importeHorasExtra;
		}
	}

	@Override
	public String toString() {
		return this.dni + " " + this.nombre + "\n" + "Horas Extra: " + this.horasExtra + "\n" + "Sueldo bruto: "
				+ this.sueldoBruto();
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		Empleado other = (Empleado) obj;
		return Objects.equals(dni, other.dni);
	}

}
