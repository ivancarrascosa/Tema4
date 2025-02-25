package boletin4.Ejercicio4;

import java.util.HashSet;
import java.util.Set;

public class DiscoCRUD {
	/**
	 * Conjuto para almacenar los discos
	 */
	private Set<Disco> discos = new HashSet<Disco>();

	/**
	 * Método para listar los discos del conjunto
	 */
	public void listarDiscos() {
		for (Disco disco : discos) {
			System.out.println(disco);
			System.out.println("---------------------------");
		}
	}

	/**
	 * Método para añadir un disco al conjunto
	 * 
	 * @param d disco que se quiere añadir
	 * @return true si el disco se ha podido añadir, false si ya estaba en el
	 *         conjunto
	 */
	public boolean nuevoDisco(Disco d) {
		return discos.add(d);
	}

	/**
	 * Método para eliminar un disco del conjunto
	 * 
	 * @param d disco que se quiere eliminar del conjunto
	 * @return true si se ha podido eliminar del conjunto, false si no se ha podido
	 *         porque no estaba en el conjunto
	 */
	public boolean eliminarDisco(Disco d) {
		return discos.remove(d);
	}
}
