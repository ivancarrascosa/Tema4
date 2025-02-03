package boletin1.Ejercicio2;

import java.util.Scanner;

public class MainPersona {

	public static void main(String[] args) {
		// Creo un escáner
		Scanner sc = new Scanner(System.in);
		
		// Creo los objetos de la clase persona
		Persona per1 = new Persona();
		Persona per2 = new Persona();
		
		// Pido cada una de las caracteristicas y lo introduzco en las variables
		System.out.println("Introduzca el nombre de la persona");
		per1.nombre = sc.nextLine();
		
		System.out.println("Introduzca el DNI de la persona");
		per1.dni = sc.nextLine();
		
		System.out.println("Introduzca los apellidos de la persona");
		per1.apellidos = sc.nextLine();
		
		System.out.println("Introduzca la edad de la persona");
		per1.edad = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Introduzca el nombre de la persona");
		per2.nombre = sc.nextLine();
		
		System.out.println("Introduzca el DNI de la persona");
		per2.dni = sc.nextLine();
		
		System.out.println("Introduzca los apellidos de la persona");
		per2.apellidos = sc.nextLine();
		
		System.out.println("Introduzca la edad de la persona");
		per2.edad = sc.nextInt();
		sc.nextLine();
		
		System.out.println(per1.nombre + per1.apellidos + " con DNI " + per1.dni + (per1.edad >= 18 ? " es mayor de edad" : " no es mayor de edad"));
		System.out.println(per2.nombre + per2.apellidos + " con DNI " + per2.dni + (per2.edad >= 18 ? " es mayor de edad" : " no es mayor de edad"));
		
		sc.close();
	}

}
