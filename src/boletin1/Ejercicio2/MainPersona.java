package boletin1.Ejercicio2;

import java.util.Scanner;

public class MainPersona {

	public static void main(String[] args) {
		// Creo un escáner
		Scanner sc = new Scanner(System.in);
		
		// Creo variables para almacenar los atributos de los objetos
		String dni;
		String nombre;
		String apellidos;
		int edad;
		
		// Creo los objetos de la clase persona
		Persona per1;
		Persona per2;
		
		// Pido cada una de las caracteristicas y lo introduzco en las variables
		System.out.println("Introduzca el nombre de la persona");
		nombre = sc.nextLine();
		
		System.out.println("Introduzca el DNI de la persona");
		dni = sc.nextLine();
		
		System.out.println("Introduzca los apellidos de la persona");
		apellidos = sc.nextLine();
		
		System.out.println("Introduzca la edad de la persona");
		edad = sc.nextInt();
		sc.nextLine();
		
		per1 = new Persona(dni, nombre, apellidos, edad);
		System.out.println("Introduzca el nombre de la persona");
		nombre = sc.nextLine();
		
		System.out.println("Introduzca el DNI de la persona");
		dni = sc.nextLine();
		
		System.out.println("Introduzca los apellidos de la persona");
		apellidos = sc.nextLine();
		
		System.out.println("Introduzca la edad de la persona");
		edad = sc.nextInt();
		sc.nextLine();
		per2 = new Persona(dni, nombre, apellidos, edad);
		
		System.out.println(per1.getNombre() + per1.getApellidos() + " con DNI " + per1.getDni() + (per1.getEdad() >= 18 ? " es mayor de edad" : " no es mayor de edad"));
		System.out.println(per2.getNombre() + per2.getApellidos() + " con DNI " + per2.getDni() + (per2.getEdad() >= 18 ? " es mayor de edad" : " no es mayor de edad"));
		
		sc.close();
	}

}
