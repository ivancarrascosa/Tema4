package empleado;

import java.util.Scanner;

public class ListadoEmpleados {
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		int opc;

		String dni;
		String nombre;
		double sueldoBase;
		int horasExtra;
		double importeHorasExtra;

		ListaEmpleados listaEmpleados = new ListaEmpleados();

		Empleado empleado;

		System.out.println("Bienvenido al listado de empleados: ");
		do {
			System.out.println("Introduzca una opción");
			mostrarMenu();
			opc = reader.nextInt();
			reader.nextLine();
			switch (opc) {
			case 1 -> {
				dni = pedirDNI();
				System.out.println("Introduzca el nombre del empleado que quiere añadir:");
				nombre = reader.nextLine();
				System.out.println("Introduzca el sueldo base del empleado:");
				sueldoBase = reader.nextDouble();
				reader.nextLine();
				System.out.println("Introduzca las horas extra que ha hecho el empleado este mes:");
				horasExtra = reader.nextInt();
				empleado = new Empleado(dni, nombre, sueldoBase, horasExtra);
				if (listaEmpleados.añadirEmpleado(empleado)) {
					System.out.println("Empleado añadido correctamente.");
				} else {
					System.out.println("Empleado ya presente en la lista de empleados.");
				}
			}

			case 2 -> {
				listaEmpleados.listarEmpleados();
			}

			case 3 -> {
				System.out.println("Introduzca el dni de la persona de la cual quiere cambiar las horas extra.");
				dni = reader.nextLine();
				empleado = new Empleado(dni);
				System.out.println("Introduzca las horas extra que le quiere asignar:");
				horasExtra = reader.nextInt();
				reader.nextLine();
				System.out.println();
				if (listaEmpleados.modificarHorasExtra(empleado, horasExtra)) {
					System.out.println("Horas extra cambiadas con éxito.");
				} else {
					System.out.println("Empleado no encontrado.");
				}
			}

			case 4 -> {
				System.out.println("Introduzca el importe de las horas extra que quiere establecer:");
				importeHorasExtra = reader.nextDouble();
				reader.nextInt();
				reader.nextLine();
				listaEmpleados.cambiarImporteHorasExtra(importeHorasExtra);
				System.out.println("Cambio realizado con éxito.");
			}

			case 5 -> {
				dni = pedirDNI();
				empleado = new Empleado(dni);
				if (listaEmpleados.eliminarEmpleado(empleado)) {
					System.out.println("Empleado eliminado correctamente.");
				} else {
					System.out.println("No se ha podido eliminar el empleado");
				}
			}
			
			case 0 -> {
				System.out.println("Saliendo del sistema...");
			}

			default -> System.out.println("Opción seleccionada incorrecta.");

			}
		} while (opc != 0);

	}

	public static void mostrarMenu() {
		System.out.println("1. Añadir empleado.");
		System.out.println("2. Listar empleados.");
		System.out.println("3. Modificar horas extra.");
		System.out.println("4. Modificar importe horas extra.");
		System.out.println("5. Eliminar empleado.");
		System.out.println("0. Salir.");
	}

	public static String pedirDNI() {
		System.out.println("Introduzca el DNI del empleado:");
		return reader.nextLine();
	}
}
