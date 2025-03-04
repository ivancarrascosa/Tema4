package CRUD.Ejercicio4;

import java.util.Objects;

/**
 * Clase disco que almacenará distintos discos de música con su autor, titulo,
 * duración y género
 */
public class Disco {

	enum Genero {
		ROCK, POP, JAZZ, BLUES
	}

	/**
	 * Código del disco
	 */
	int codigo;

	/**
	 * autor del disco
	 */
	String autor;

	/**
	 * Título del disco
	 */
	String titulo;

	/**
	 * Duración del disco
	 */
	int duracion;

	/**
	 * Género del disco
	 */
	Genero genero;
	
	/**
	 * Constuctor con el parámetro código
	 * @param codigo codigo del disco que vamos a crear
	 */
	public Disco(int codigo) {
		this.codigo = codigo;
	}
	
	
	/**
	 * Constructor con todos los atributos de un disco
	 * @param codigo codigo del disco que se va a crear
	 * @param autor autor del disco que se va a crear
	 * @param titulo titulo del disco que se va a crear
	 * @param duracion duracion del disco 
	 * @param genero genero del disco
	 */
	public Disco(int codigo, String autor, String titulo, int duracion, String genero) {
		super();
		this.codigo = codigo;
		if (autor != null && !autor.isBlank()) {
			this.autor = autor;			
		}
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;			
		}
		if (duracion > 0) {
			this.duracion = duracion;
		}
		genero = genero.toUpperCase();
		if (comprobarGenero(genero)) {
			this.genero = Genero.valueOf(genero);
		}
	}


	/**
	 * getter para el codigo de un disco
	 * @return codigo de un disco
	 */
	public int getCodigo() {
		return codigo;
	}
	
	/**
	 * getter para el autor de un disco
	 * @return autor de un disco
	 */
	public String getAutor() {
		return autor;
	}
	
	/**
	 * Getter para el titulo del disco 
	 * @return título del disco
	 */
	public String getTitulo() {
		return titulo;
	}
	
	/**
	 * Getter para la duracion del disco
	 * @return duracion del disco
	 */
	public int getDuracion() {
		return duracion;
	}
	
	/**
	 * Getter para el genero de un disco 
	 * @return genero del disco
	 */
	public Genero getGenero() {
		return genero;
	}
	
	/**
	 * Método to String que devuelve todos los atributos de un disco excepto su código
	 */
	@Override
	public String toString() {
		return "Disco [autor=" + autor + ", titulo=" + titulo + ", duracion=" + duracion + ", genero=" + genero + "]";
	}
	
	/**
	 * Generador del hashCode de un disco utilizando solo el código
	 */
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}
	
	/**
	 * Método equals que compara los códigos de dos discos
	 */
	@Override
	public boolean equals(Object obj) {
		Disco other = (Disco) obj;
		return codigo == other.codigo;
	}
	
	/**
	 * Método que comprueba si un genero introducido es correcto 
	 * @param genero genero que queremos comprobar si es correcto
	 * @return true si el género es correcto, false si no lo es 
	 */
	private boolean comprobarGenero(String genero) {
		boolean res = false;
		switch (genero) {
		case "ROCK", "POP", "JAZZ", "BLUES" -> res = true;
		}
		return res;

	}
	
	

}
