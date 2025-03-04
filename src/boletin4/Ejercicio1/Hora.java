package boletin4.Ejercicio1;

public class Hora {
	int hora = 0;
	int minuto = 0;
	int segundo = 0;
	public Hora(int hora, int minuto, int segundo) {
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		}
		if (minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
		}
		if (segundo >= 0 && segundo <= 59)
		this.segundo = segundo;
	}
	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}
	
	public int getSegundo() {
		return segundo;
	}
	
	public void incrementarSegundo() {
		this.segundo++;
		if (this.segundo == 60) {
			this.minuto++;
			this.segundo = 0;
			if (this.minuto == 60) {
				this.hora++;
				this.minuto = 0;
			} if (this.hora == 24) {
				this.hora = 0;
			}
		}
	}
	
	@Override
	public String toString() {
		return "Hora [hora=" + hora + ", minuto=" + minuto + ", segundo=" + segundo + "]";
	}
	
	
	
	
}
