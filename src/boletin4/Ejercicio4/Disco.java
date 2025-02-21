package boletin4.Ejercicio4;

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
	
	
	public Disco(int codigo) {
		this.codigo = codigo;
	}
	
	

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



	public int getCodigo() {
		return codigo;
	}
	
	public String getAutor() {
		return autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public Genero getGenero() {
		return genero;
	}
	
	
	@Override
	public String toString() {
		return "Disco [autor=" + autor + ", titulo=" + titulo + ", duracion=" + duracion + ", genero=" + genero + "]";
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		Disco other = (Disco) obj;
		return codigo == other.codigo;
	}

	private boolean comprobarGenero(String genero) {
		boolean res = false;
		switch (genero) {
		case "ROCK", "POP", "JAZZ", "BLUES" -> res = true;
		}
		return res;

	}
	
	

}
