package empleado;

import java.util.HashSet;

public class ListaEmpleados {
	private HashSet<Empleado> conjuntoEmpleados = new HashSet<Empleado>();
	
	public void listarEmpleados() {
		for (Empleado empleado : conjuntoEmpleados) {
			System.out.println(empleado);
			System.out.println("-------------------");
		}
	}
	
	public boolean añadirEmpleado(Empleado empleado) {
		return conjuntoEmpleados.add(empleado);
	}
	
	public boolean modificarHorasExtra(Empleado empleado, int horasExtra) {
		boolean res = false;
		for (Empleado empleadoTemp : conjuntoEmpleados) {
			if (empleadoTemp.equals(empleado)) {
				empleado = empleadoTemp;
				res = true;
			}
		}
		empleado.setHorasExtra(horasExtra);
		return res;
	}
	
	public void cambiarImporteHorasExtra(double importe) {
		Empleado.setImporteHorasExtra(importe);
	}
	
	public boolean eliminarEmpleado(Empleado empleado) {
		return conjuntoEmpleados.remove(empleado);
	}
	
	
}
