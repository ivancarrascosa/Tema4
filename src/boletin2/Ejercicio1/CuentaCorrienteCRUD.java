package boletin2.Ejercicio1;

import java.util.HashSet;
import java.util.Set;

public class CuentaCorrienteCRUD {
	/**
	 * Creo un atributo que es un conjunto para la lista de discos
	 */
	private Set<CuentaCorriente> cuentasCorrientes = new HashSet<CuentaCorriente>();

	public boolean crearCuenta(CuentaCorriente CC) {
		return cuentasCorrientes.add(CC);
	}

	public void mostrarSaldo(CuentaCorriente CC) {
		CC = encontrarCuenta(CC);
		if (CC != null) {
			System.out.println("El saldo de la cuenta es: " + CC.getSaldo());
		} else {
			System.out.println("Cuenta no encontrada.");
		}
	}

	public boolean eliminarCuenta(CuentaCorriente CC) {
		return cuentasCorrientes.remove(CC);
	}

	public void ingresarDinero(CuentaCorriente CC, float ingreso) {
		CC = encontrarCuenta(CC);
		if (CC != null) {
			CC.setSaldo(CC.getSaldo() + ingreso);
			System.out.println("Dinero ingresado correctamente.");
		} else {
			System.out.println("Cuenta no encontrada");
		}
	}

	public void retirarDinero(CuentaCorriente CC, float gasto) {
		CC = encontrarCuenta(CC);
		if (CC != null) {
			if (CC.getSaldo() >= gasto) {
				CC.setSaldo(CC.getSaldo() - gasto);
				System.out.println("Saldo retirado correctamente");
			} else {
				System.out.println("Saldo insuficiente");
			}
		} else {
			System.out.println("Cuenta no encontrada");
		}
	}

	private CuentaCorriente encontrarCuenta(CuentaCorriente CC) {
		for (CuentaCorriente cuenta : cuentasCorrientes) {
			if (CC.equals(cuenta)) {
				CC = cuenta;
			}
		}
		return CC;
	}
}
