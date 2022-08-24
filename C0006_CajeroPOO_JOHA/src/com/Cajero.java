package com;

import java.util.Date;

public class Cajero {
	int folioTransaccion;
	int idCajero;
	Date fechaTransaccion;

	// Constructores
	public Cajero() {
	}

	public Cajero(int folioTransaccion, int idCajero, Date fechaTransaccion) {
		this.folioTransaccion = folioTransaccion;
		this.idCajero = idCajero;
		this.fechaTransaccion = fechaTransaccion;
	}

	// Getter & Setter
	public int getFolioTransaccion() {
		return folioTransaccion;
	}

	public void setFolioTransaccion(int folioTransaccion) {
		this.folioTransaccion = folioTransaccion;
	}

	public int getIdCajero() {
		return idCajero;
	}

	public void setIdCajero(int idCajero) {
		this.idCajero = idCajero;
	}

	public Date getFechaTransaccion() {
		return fechaTransaccion;
	}

	public void setFechaTransaccion(Date fechaTransaccion) {
		this.fechaTransaccion = fechaTransaccion;
	}

	// Metodo toString
	@Override
	public String toString() {
		return "Cajero [folioTransaccion=" + folioTransaccion + ", idCajero=" + idCajero + ", fechaTransaccion="
				+ fechaTransaccion + "]";
	}

	// Metodos propios
	
	public int generarFolio() {
		folioTransaccion = (int)( Math.random() * 100);
		return folioTransaccion;
	}
	
	// Deposito
	public Ticket depositar(double monto, Cuenta cuenta) {
		// 1 Valida que el monto por si solo no se pase del maximo
		if (monto > cuenta.getSaldoMax()) {
			// Ticket con mensaje
			return new Ticket("Operacion no valida\nMonto por encima del maximo permitido");
		} else if (monto + cuenta.getSaldoDisponible() > cuenta.getSaldoMax()) {
			return new Ticket("Operacion no valida\nEl deposito sobrepasa el maximo saldo permitido de tu cuenta");
		} else {
			// Actualizar el saldo de la cuenta
			cuenta.setSaldoDisponible(monto + cuenta.getSaldoDisponible());
			return new Ticket(new Date(), this.generarFolio(), cuenta.getNumeroCuenta(),
					cuenta.getSaldoDisponible() - monto, cuenta.getSaldoDisponible(), monto);
		}
	}

	// Retiro
	public Ticket retirar(double monto, Cuenta cuenta) {
		// 1 Validar que el saldo disponible sea mayor al monto solicitado
		if (cuenta.getSaldoDisponible() < monto ) {
			return new Ticket("Sin saldo suficiente");
		} // 2 Validar que el retiro no deje por debajo del minimo a la cuenta
		else if (cuenta.getSaldoDisponible() - monto < cuenta.getSaldoMin()) {
			return new Ticket("El retiro dejaria por debajo del minimo a la cuenta");
		} // 3 Retiro
		else {
			cuenta.setSaldoDisponible(cuenta.getSaldoDisponible() - monto);
			return new Ticket(new Date(), this.generarFolio(), cuenta.getNumeroCuenta(),
					cuenta.getSaldoDisponible()+monto, cuenta.getSaldoDisponible(), monto);
		}
	}

	// Transferencia
	public Ticket transferir(double monto, Cuenta cuentaOrigen, Cuenta cuentaDestino) {
		if (cuentaOrigen.getSaldoDisponible() < monto && monto != 0) {
			return new Ticket("Sin saldo suficiente para la transferencia");
		} else if (cuentaOrigen.getSaldoDisponible() - monto < cuentaOrigen.getSaldoMin() && monto != 0) {
			return new Ticket("La transferencia dejaria por debajo del minimo a la cuenta");
		} else {
			cuentaDestino.setSaldoDisponible(cuentaDestino.getSaldoDisponible() + monto);
			cuentaOrigen.setSaldoDisponible(cuentaOrigen.getSaldoDisponible() - monto);
			return new Ticket(new Date(),
					this.generarFolio(), 
					cuentaOrigen.getNumeroCuenta(),
					cuentaOrigen.getSaldoDisponible()+monto, 
					cuentaOrigen.getSaldoDisponible(),
					monto,
					cuentaDestino.getNumeroCuenta());
		}
	}

}
