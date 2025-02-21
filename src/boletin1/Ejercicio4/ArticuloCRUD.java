package boletin1.Ejercicio4;

import java.util.HashSet;
import java.util.Set;

public class ArticuloCRUD {
	
	Set<Articulo> articulos = new HashSet<>();
	
	public void listarArticulos() {
		for(Articulo art : articulos) {
			System.out.println(art);
			System.out.println("-------------------");
		}
	}
	/**
	 * Método para añadir al conjunto un artículo
	 * @param art artículo que queremos añadir
	 * @return true si no estaba en el conjunto y se ha añadido, false si ya estaba en el conjunto y no se ha podido añadir
	 */
	public boolean altaArticulo(Articulo art) {
		return articulos.add(art);
	}
	
	/**
	 * Metodo para eliminar un artículo del conjunto de artículos
	 * @param art Objeto Articulo con el nombre del artículo que deseamos eliminar
	 * @return True si el artículo se encontraba en el conjunto y se ha eliminado, false si no se ha encontrado
	 */
	public boolean bajaArticulo(Articulo art) {
		return articulos.remove(art);
	}
	
	public Articulo cambiarPrecio(Articulo art, double precio) {
		Articulo articuloEncontrado = buscarArticulo(art);
		if(articuloEncontrado != null) {
			art = articuloEncontrado;
			art.setPrecio(precio);
		}
		return articuloEncontrado;
	}
	
	public Articulo aumentarStock(Articulo art, int aumentoStock) {
		Articulo articuloEncontrado = buscarArticulo(art);
		if(articuloEncontrado != null) {
			art = articuloEncontrado;
			art.setCuantosQuedan(aumentoStock + art.getCuantosQuedan());
		}
		return art;
	}
	
	public boolean disminuirStock(Articulo art, int disminucionStock ) {
		int unidadesRestantes = art.getCuantosQuedan();
		boolean stockReducido = false;
		if (unidadesRestantes >= disminucionStock) {
			art.setCuantosQuedan(unidadesRestantes - disminucionStock);
			stockReducido = true;
		}
		return stockReducido;
	}
	
	public Articulo buscarArticulo(Articulo art) {
		Articulo articulo = null;
		for (Articulo artTemp : articulos) {
			if (art.equals(artTemp)) {
				articulo = artTemp;
			}
			
		}
		return articulo;
	}
	
	
}
