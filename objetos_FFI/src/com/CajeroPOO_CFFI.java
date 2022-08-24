package com;

import java.util.Date;

public class CajeroPOO_CFFI {

	int floioTransaccion;
	int idCAjero;
	Date fechaTransaccion;

	public CajeroPOO_CFFI() {

	}

	public CajeroPOO_CFFI(int floioTransaccion, int idCAjero, Date fechaTransaccion) {
		super();
		this.floioTransaccion = floioTransaccion;
		this.idCAjero = idCAjero;
		this.fechaTransaccion = fechaTransaccion;
	}

	public int getFloioTransaccion() {
		return floioTransaccion;
	}

	public void setFloioTransaccion(int floioTransaccion) {
		this.floioTransaccion = floioTransaccion;
	}

	public int getIdCAjero() {
		return idCAjero;
	}

	public void setIdCAjero(int idCAjero) {
		this.idCAjero = idCAjero;
	}

	public Date getFechaTransaccion() {
		return fechaTransaccion;
	}

	public void setFechaTransaccion(Date fechaTransaccion) {
		this.fechaTransaccion = fechaTransaccion;
	}

	@Override
	public String toString() {
		return "cajeroPOO [floioTransaccion=" + floioTransaccion + ", idCAjero=" + idCAjero + ", fechaTransaccion="
				+ fechaTransaccion + "]";
	}

	// comportamiento propio (metodo)
	// 50000
	// 30000
	// 20000
	// metodo que genera aleatorioamente un folio de la transsaccion

	public int generarFolio() {

		floioTransaccion = (int)(Math.random()* 100);
		return floioTransaccion;

	}

	// deposito

	public Ticket depositar(double monto, Cuenta cuenta) {
		// 1 valida que el monto por si solo no se pase del maxio

		if (monto > cuenta.getMax()) {
			return new Ticket("monto por encima de a maximo"); // sin datos

		} else if (monto + cuenta.getSaldoDisponible() > cuenta.getMax()) {
			return new Ticket("El deposito llevaria por encima de limte");

		} else {
			// actualizar el saldo de la ceunta
			cuenta.setSaldoDisponible(monto + cuenta.getSaldoDisponible());
			return new Ticket(this.generarFolio(), new Date(), cuenta.getSaldoDisponible() - monto,
					cuenta.getSaldoDisponible(), cuenta.getNumeroCuenta(), monto);
		}

	}

	// retiro
	public Ticket retirar(double monto, Cuenta cuenta) {
		// 1 valida que el saldo disponible sea mayor al monto solicitado
		// 2 valida que el retiro no dejje por debajo del minimo a la cuenta
		// 3 retiro

		if (cuenta.getSaldoDisponible() < monto) {
			return new Ticket("saldo insuficiente");
		} else if (cuenta.getSaldoDisponible() - monto < cuenta.getMin()) {
			return new Ticket("el retiro dejaria por debajo del minimo a la cuenta");

		} else {
			cuenta.setSaldoDisponible(cuenta.getSaldoDisponible() - monto);
			return new Ticket(this.generarFolio(), new Date(), cuenta.getSaldoDisponible() - monto,
					cuenta.getSaldoDisponible(), cuenta.getNumeroCuenta(), monto);
		}

	}

	// transferencia validar si a las dos les cabe
	// 1 monto
	// 2 cuenta origen
	// 3 cuenta destinatario

	public Ticket transferencia(double monto, Cuenta cuenta1, Cuenta cuenta2) {
		if (cuenta1.getSaldoDisponible() < monto) {
			return new Ticket("tas jodido");

		} else if (cuenta1.getSaldoDisponible() - monto < cuenta1.getMin()) {
			return new Ticket("te quedaria en menos pa");

		} else if (monto > cuenta2.getMax()) {
			return new Ticket("eres rico wey");

		} else if (monto + cuenta2.getSaldoDisponible() > cuenta2.getMax()) {
			return new Ticket("la transferencia te llevaria por encima del limite");

		} else {
			cuenta1.setSaldoDisponible(cuenta1.getSaldoDisponible() - monto);
			cuenta2.setSaldoDisponible(cuenta2.getSaldoDisponible() + monto);
			
			return new Ticket(this.generarFolio(),
					new Date(),
					cuenta2.getSaldoDisponible() - monto, 
					cuenta2.getSaldoDisponible(),
					cuenta1.getNumeroCuenta(),
					monto);
			
			
		}
		
	}

}
