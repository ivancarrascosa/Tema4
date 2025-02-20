package boletin1.Ejercicio4;

import java.util.Scanner;

public class MainArticulo {
	
	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Variable para almacenar la opcion que elija el usuario
		char opc;
		
		// Creo un objeto de tipo articuloCRUD 
		ArticuloCRUD articulos = new ArticuloCRUD();
		
		// Creo una variable para el nombre del articulo, otra para el precio y otra para cuantos quedan
		String nombre;
		double precio;
		int stock;
		
		// Creo un objeto de tipo Articulo
		Articulo articulo;
		/* Creo un objeto de la clase Articulo
		Articulo pijama = new Articulo("pijama", 24.5, 50);
		Articulo cosas = new Articulo("cosaaa", 64, 0);*/
		
		//Asigno valores a los atributos pijama.nombre = "pijama"; pijama.precio =
		//24.5; pijama.cuantosQuedan = 50; Esto es del ejercicio anterior
		 
		/*System.out.println("Precio:" + pijama.getPrecio() + "€ - IVA:21% - " + "PVP:" + pijama.getPrecio() * Articulo.IVA + "€");
		pijama.setPrecio(10);
		System.out.println("Precio:" + cosas.getPrecio() + "€ - IVA:21% - " + "PVP:" + cosas.getPrecio() * Articulo.IVA + "€");*/
		
		do {
			mostrarMenu();
			opc = reader.nextLine().toCharArray()[0];
			
			switch (opc) {
			case 'a' -> {
				articulos.listarArticulos();
			}
			case 'b' -> {
				System.out.println("Introduzca el nombre del artículo");
				nombre = reader.nextLine();
				System.out.println("Introduzca el precio del artículo");
				precio = reader.nextDouble();
				reader.nextLine();
				System.out.println("Introduzca las unidades restantes del artículo");
				stock = reader.nextInt();
				reader.nextLine();
				articulo = new Articulo(nombre, precio, stock);
				if (articulos.altaArticulo(articulo)) {
					System.out.println("Articulo introducido correctamente.");
				} else {
					System.out.println("Error al introducir artículo, artículo ya existente.");
				}
			}
			
			case 'c' -> {
				System.out.println("Introduzca el nombre del artículo");
				nombre = reader.nextLine();
				articulo = new Articulo(nombre);
				if (articulos.bajaArticulo(articulo)) {
					System.out.println("Articulo eliminado correctamente.");
				} else {
					System.out.println("Articulo no encontrado.");
				}
			}
			
			case 'd' -> {
				System.out.println("Introduzca el nombre del artículo cuyo precio quieres cambiar:");
				nombre = reader.nextLine();
				System.out.println("Introduzca el precio que quiere ponerle al artículo:");
				precio = reader.nextDouble();
				reader.nextLine();
				articulo = new Articulo(nombre);
				if(articulos.cambiarPrecio(articulo, precio) != null) {
					System.out.println("Precio cambiado correctamente.");
				} else {
					System.out.println("No se ha encontrado el producto que buscabas.");
				}
			}
			
			case 'e' -> {
				System.out.println("Introduzca el artículo del cual ha entrado mercancía");
				nombre = reader.nextLine();
				System.out.println("Introduzca la cantidad que ha entrado de la mercancía");
				stock = reader.nextInt();
				reader.nextLine();
				articulo = new Articulo(nombre);
				if(articulos.aumentarStock(articulo, stock) != null) {
					System.out.println("Stock aumentado correctamente");
				} else {
					System.out.println("No se ha encontrado el artículo");
				}
			}
			
			case 'f' -> {
				System.out.println("Introduzca el artículo del cual ha salido mercancía");
				nombre = reader.nextLine();
				System.out.println("Introduzca el stock que ha salido del almacén");
				stock = reader.nextInt();
				reader.nextLine();
				articulo = new Articulo(nombre);
				if (articulos.buscarArticulo(articulo) != null) {
					articulo = articulos.buscarArticulo(articulo);
					if (articulos.disminuirStock(articulo, stock)) {
						System.out.println("Se ha reducido el stock correctamente");
					} else {
						System.out.println("No hay suficiente stock");
					}
				} else {
					System.out.println("No se ha encontrado el artículo");
				}
			}
			
			case 'g' -> System.out.println("Saliendo del programa...");
			default ->
			System.out.println("Seleccione una opción correcta.");
			}
		} while (opc != 'g');
		
		
	}
	
	public static void mostrarMenu() {
		System.out.println("a. Listado");
		System.out.println("b. Alta");
		System.out.println("c. Baja");
		System.out.println("d. Modificación");
		System.out.println("e. Entrada de mercancía");
		System.out.println("f. Salida de mercancía");
		System.out.println("g. Salir");
	}
}
