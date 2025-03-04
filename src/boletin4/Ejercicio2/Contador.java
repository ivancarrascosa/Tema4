package boletin4.Ejercicio2;

public class Contador {
	private int cont = 0;

	public Contador(int cont) {
		if (cont >= 0) {
			this.cont = cont;
		}
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		if (cont >= 0) {
			this.cont = cont;
		}
	}

	@Override
	public String toString() {
		return "Contador [cont=" + cont + "]";
	}
	
	public void incrementar() {
		this.cont++;
	}
	
	public void decrementar() {
		this.cont--;
		if (this.cont == -1) {
			this.cont = 0;
		}
	}
	
	
	
}


