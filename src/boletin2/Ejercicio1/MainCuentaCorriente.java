package boletin2.Ejercicio1;

import java.util.Scanner;

public class MainCuentaCorriente {

	public static void main(String[] args) {
		// Creo un objeto de tipo escáner
		Scanner reader = new Scanner(System.in);

		// Creo una variable para almacenar la opción elegida por el usuario
		int opc;

		// Creo variables para almacenar los distintos atributos de una CuentaCorriente
		String DNI;
		String nombre;
		float saldo;
		String nacionalidad;

		// Creo un obketo del tipo cuentacorriente
		CuentaCorriente cuenta;

		// Creo un objeto de tipo CuentaCorrienteCRUD
		CuentaCorrienteCRUD cuentas = new CuentaCorrienteCRUD();
		
		// Creo una variable para almacenar la cantidad ingresada
		float ingreso;
		
		// Creo una variable para almacenar la cantidad gastada 
		float gasto;

		do {
			mostrarMenu();
			opc = reader.nextInt();
			reader.nextLine();
			switch (opc) {
			case 1 -> {
				DNI = pedirDni(reader);
				System.out.println("Introduzca el nombre del titular de la cuenta:");
				nombre = reader.nextLine();
				System.out.println("Introduzca el saldo de la cuenta:");
				saldo = reader.nextFloat();
				reader.nextLine();
				System.out.println("Introduzca si es de nacionalidad extranjera o española:");
				nacionalidad = reader.nextLine();
				cuenta = new CuentaCorriente(DNI, nombre, saldo, nacionalidad);
				if (cuentas.crearCuenta(cuenta)) {
					System.out.println("Cuenta creada adecuadamente");
				} else {
					System.out.println("Este DNI ya tiene una cuenta asociada");
				}

			}

			case 2 -> {
				DNI = pedirDni(reader);
				// Creo un objeto con este DNI como atributo
				cuenta = new CuentaCorriente(DNI);
				cuentas.mostrarSaldo(cuenta);
			}
			
			case 3 -> {
				DNI = pedirDni(reader);
				cuenta = new CuentaCorriente(DNI);
				if (cuentas.eliminarCuenta(cuenta)) {
					System.out.println("Cuenta eliminada correctamente.");
				} else {
					System.out.println("Cuenta no encontrada.");
				}
			}
			
			case 4 -> {
				DNI = pedirDni(reader);
				System.out.println("Introduzca la cantidad que se va a ingresar en la cuenta:");
				ingreso = reader.nextFloat();
				reader.nextLine();
				cuenta = new CuentaCorriente(DNI);
				cuentas.ingresarDinero(cuenta, ingreso);
			}
			
			case 5 -> {
				DNI = pedirDni(reader);
				cuenta = new CuentaCorriente(DNI);
				System.out.println("Introduzca la cantidad que se va a retirar de la cuenta");
				gasto = reader.nextFloat();
				reader.nextLine();
				cuentas.retirarDinero(cuenta, gasto);
			}
			
			case 6 -> System.out.println("Saliendo del programa...");

			default -> System.out.println("Seleccione una opción correcta");
			}
			
		} while (opc != 6);
	}

	private static String pedirDni(Scanner reader) {
		String DNI;
		System.out.println("Introduzca el DNI de la cuenta corriente:");
		DNI = reader.nextLine();
		return DNI;
	}

	static public void mostrarMenu() {
		System.out.println("Seleccione una opción:");
		System.out.println("1. Nueva cuenta corriente.");
		System.out.println("2. Mostrar saldo");
		System.out.println("3. Borrar cuenta corriente.");
		System.out.println("4. Ingreso");
		System.out.println("5. Gasto");
		System.out.println("6. Salir.");
	}

}
