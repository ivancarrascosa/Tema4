package boletin2.Ejercicio4;

import java.util.HashSet;
import java.util.Set;

public class PizzaCRUD {
	
	// Atributo que va a ser la coleccion donde almacenar nuestros objetos
	private Set<Pizza> pizzas = new HashSet<Pizza>();
	
	public void listarPizzas() {
		for (Pizza p : pizzas) {
			System.out.println(p);
			System.out.println("-------------------");
		}
	}
	
	public boolean añadePizza(Pizza p) {
		return pizzas.add(p);
	}
	
	public Pizza buscaPizza(int codigo) {
		Pizza p = null;
		
		for(Pizza pBusqueda : pizzas) {
			if(pBusqueda.getCodigo() == codigo) {
				p = pBusqueda;
			}
		}
		return p;
	}
}
