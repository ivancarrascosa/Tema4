package boletin2.Ejercicio2;

public class LibroMain {

	public static void main(String[] args) {
		Libro l1 = new Libro("MIau miau", "Pepe", 5, 2, "narrativo");
		Libro l2 = new Libro("MIau miau", "Pepe");
		System.out.println(l1.toString());
		l1.devolucion();
		l1.devolucion();
		System.out.println(l1.toString());
		l1.devolucion();
		System.out.println(l1.toString());
		l1.prestamo();
		l1.prestamo();
		l1.prestamo();
		l1.prestamo();
		System.out.println(l1.toString());
		l1.prestamo();
		l1.prestamo();
		System.out.println(l1.toString());
		System.out.println(l1.equals(l2));
	}

}
