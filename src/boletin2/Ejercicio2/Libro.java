package boletin2.Ejercicio2;
/**
 * Clase que almacena los libros de una bilioteca con sus respectivos títulos,
 * autor, numero de ejemplares y numero de ejemplares prestados
 */
public class Libro {
	enum GENEROS {
			Narrativo, Lírico, Dramático, Didáctico, Poético	
	}
	/**
	 * Título del libro
	 */
	String titulo;
	/**
	 * Nombre del autor
	 */
	String autor;
	/**
	 * Numero de ejemplares en la biblioteca
	 */
	int ejemplares;
	/**
	 * Numero de ejemplares prestados
	 */
	int prestados;
	/**
	 * Genero del libro
	 */
	GENEROS genero;
	public Libro(String titulo, String autor) {
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;			
		}
		if (autor != null && !titulo.isBlank()) {
			this.autor = autor;			
		}
		
	}
	
	
}
