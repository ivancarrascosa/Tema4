package boletin2.Ejercicio4;

import java.util.Scanner;

public class PizzaMain {
	
	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opc;
		
		int codigo;
		
		PizzaCRUD pizzas = new PizzaCRUD();
		
		Pizza pizza;
		// MAIN: SIEMPRE DO WHILE CON SWITCH DENTRO
		do {
			menu();
			System.out.println("Elige una opción");
			opc = reader.nextInt();
			switch(opc) {
			case 1 -> pizzas.listarPizzas();
			case 2 -> {
				pizza = creaPizza();
				pizzas.añadePizza(pizza);
			}
			case 3 -> {
				codigo = pedirCodigo();
				pizza = pizzas.buscaPizza(codigo);
				if (pizza != null) {
					pizza.setEstado("Servida");
				} else {
					System.out.println("La pizza no existe");
				}

			}
			case 4 -> System.out.println("Saliendo del sistema...");
			default -> System.out.println("Opción no válida");
			}
		} while(opc != 4);
		
		reader.close();
	}
	
	static void menu() {
		System.out.println("1. Listado de pizzas");
		System.out.println("2. Nuevo pedido");
		System.out.println("3. Pizza servida");
		System.out.println("4. Salir");
	}
	
	static Pizza creaPizza() {
		int codigo;
		String tamaño;
		String tipo;
		Pizza p = null;
		
		codigo = pedirCodigo();
		
		System.out.println("Introduzca el tamaño de la pizza: ");
		tamaño = reader.next();
		reader.nextLine();
		
		System.out.println("Introduzca el tipo de la pizza");
		tipo = reader.next();
		reader.nextLine();
		
		p = new Pizza(codigo,tamaño,tipo);
		
		return p;
	}

	public static int pedirCodigo() {
		int codigo;
		System.out.println("Introduzca el codigo de la pizza: ");
		codigo = reader.nextInt();
		reader.nextLine();
		return codigo;
	}

}
