package boletin2.Ejercicio2;

/**
 * Clase que almacena los libros de una bilioteca con sus respectivos títulos,
 * autor, numero de ejemplares y numero de ejemplares prestados
 */
public class Libro {
	enum Genero {
			NARRATIVO, LÍRICO, DRAMÁTICO, DIDÁCTICO, POÉTICO	
	}
	/**
	 * Título del libro
	 */
	private String titulo;
	/**
	 * Nombre del autor
	 */
	private String autor;
	/**
	 * Numero de ejemplares en la biblioteca
	 */
	private int ejemplares = 1;
	/**
	 * Numero de ejemplares prestados
	 */
	private int prestados = 0;
	/**
	 * Genero del libro
	 */
	private Genero genero = Genero.DIDÁCTICO;
	/**
	 * Constructor con título y autor 
	 * @param titulo título del libro
	 * @param autor autor del libro
	 */
	public Libro(String titulo, String autor) {
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;			
		}
		if (autor != null && !titulo.isBlank()) {
			this.autor = autor;			
		}
	
	}
	/**
	 * Constrcutor con los atributos libro, autor, ejemplares y prestados
	 * @param titulo titulo del libro
	 * @param autor autor del libro
	 * @param ejemplares ejemplares del libro
	 * @param prestados ejemplares prestados del libro 
	 */
	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;			
		}
		if (autor != null && !titulo.isBlank()) {
			this.autor = autor;			
		}
		if (ejemplares >= 0) {
			this.ejemplares = ejemplares;
		}
		if (prestados <= ejemplares && prestados >= 0) {
			this.prestados = prestados;
		}
	}
	
	public Libro(String titulo, String autor, int ejemplares, int prestados, String genero) {
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;			
		}
		if (autor != null && !titulo.isBlank()) {
			this.autor = autor;			
		}
		if (ejemplares >= 0) {
			this.ejemplares = ejemplares;
		}
		if (prestados <= ejemplares && prestados >= 0) {
			this.prestados = prestados;
		}
		genero = genero.toUpperCase();
		switch (genero) {
		case "NARRATIVO":
			this.genero = Genero.NARRATIVO;
			break;
		
		case "LÍRICO":
			this.genero = Genero.LÍRICO;
			break;
			
		case "DRAMÁTICO":
			this.genero = Genero.DRAMÁTICO;
			break;
		
		case "DIDÁCTICO":
			this.genero = Genero.DIDÁCTICO;
			break;
			
		case "POÉTICO":
			this.genero = Genero.POÉTICO;
			break;
		default:
			break;
		}
			
	}
	/**
	 * Getter para el título del libro
	 * @return título del libro
	 */
	public String getTitulo() {
		return titulo;
	}
	
	/**
	 * Setter para el título del libro
	 * @param titulo título que le queremos poner al libro
	 */
	public void setTitulo(String titulo) {
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;			
		}
	}
	/**
	 * Getter para el autor del libro
	 * @return autor del libro
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Getter para los ejemplares que hay en la biblioteca del libro
	 * @return numero de ejemplares que hay en la biblioteca de ese libro
	 */
	public int getEjemplares() {
		return ejemplares;
	}
	
	/**
	 * Setter para el número de ejemplares que hay de un libro
	 * @param ejemplares ejemplares que queremos poner de ese libro
	 */
	public void setEjemplares(int ejemplares) {
		if (ejemplares >= 0) {
			this.ejemplares = ejemplares;
		}
	}
	
	/**
	 * Getter para los libros prestados que hay de un libro
	 * @return número de ejemplares prestados de un libro
	 */
	public int getPrestados() {
		return prestados;
	}
	
	/**
	 * Getter para el género del libro
	 * @return Género del libro
	 */
	public Genero getGenero() {
		return genero;
	}
	
	/**
	 * Setter para el género del libro 
	 * @param genero género que queremos establecer al libro
	 */
	public void setGenero(String genero) {
		genero = genero.toUpperCase();
		switch (genero) {
		case "NARRATIVO":
			this.genero = Genero.NARRATIVO;
			break;
		
		case "LÍRICO":
			this.genero = Genero.LÍRICO;
			break;
			
		case "DRAMÁTICO":
			this.genero = Genero.DRAMÁTICO;
			break;
		
		case "DIDÁCTICO":
			this.genero = Genero.DIDÁCTICO;
			break;
			
		case "POÉTICO":
			this.genero = Genero.POÉTICO;
			break;
		default:
			break;
		}
	}
	
	/**
	 * Método que representa que se ha prestado un libro, aumentando en 1 el número de ejemplares prestados si es posible
	 * @return true si había ejemplares para prestar, false si no los había
	 */
	public boolean prestamo() {
		boolean res = true;
		if (this.prestados == this.ejemplares) {
			res = false;
		} else {
			this.prestados++;
		}
		return res;
	}
	/**
	 * Método que representa la devolución de un libro, disminuyendo en 1 el número de ejemplares prestados si es posible
	 * @return true si había algún ejemplar prestado, false si no había nada prestado
	 */
	public boolean devolucion() {
		boolean res = true;
		if (this.prestados == 0) {
			res = false;
		} else {
			this.prestados--;
		}
		return res;
	}
	/**
	 * Método to String para devolver una cadena con la información del libro 
	 * @return valor de los atributos del libro
	 */
	@Override
	public String toString() {
		return "titulo= " + titulo + "\nautor= " + autor + "\nejemplares= " + ejemplares + "\nprestados= "
				+ prestados + "\ngenero= " + genero;
	}
	
	/**
	 * Método equals para comparar dos libros
	 * @return True si coincide el título y el autor, false si no es así
	 */
	@Override
	public boolean equals(Object obj) {
		Libro other = (Libro) obj;
		return (this.autor.equals(other.autor) && this.titulo.equals(other.titulo));
	}
	
	
	
	
	
	
	
}
