package com;

import java.util.Date;

public class Cajero {

	int folioTransaccion;
	int idcajero;
	Date fechaTransaccion;

	public Cajero() {
	}

	public int getFolioTransaccion() {
		return folioTransaccion;
	}

	public void setFolioTransaccion(int folioTransaccion) {
		this.folioTransaccion = folioTransaccion;
	}

	public int getIdcajero() {
		return idcajero;
	}

	public void setIdcajero(int idcajero) {
		this.idcajero = idcajero;
	}

	public Date getFechaTransaccion() {
		return fechaTransaccion;
	}

	public void setFechaTransaccion(Date fechaTransaccion) {
		this.fechaTransaccion = fechaTransaccion;
	}

	public Cajero(int folioTransaccion, int idcajero, Date fechaTransaccion) {
		super();
		this.folioTransaccion = folioTransaccion;
		this.idcajero = idcajero;
		this.fechaTransaccion = fechaTransaccion;
	}

	// Comportamiento propio

	// Metodo que genera aleatorio
	public int generarFolio() {
		folioTransaccion = (int)(Math.random()*100);
		return folioTransaccion;
	}

	// Deposito

	public Ticket depositar(double monto, Cuenta cuenta) {

		// Caso1. Valida que el monto por si solo no se oase del maximo

		if (monto > cuenta.getSaldoMax()) {
			return new Ticket("Monto por encima del maximo permitido"); // Sin datos
		} else if (monto + cuenta.getSaldoDisponible() > cuenta.getSaldoMax()) {
			return new Ticket("El deposito llegaria por encima del maximo permitido");
		} else {

			// Actualizar el saldo de la cuenta

			cuenta.setSaldoDisponible(monto + cuenta.getSaldoDisponible());
			return new Ticket(this.getFolioTransaccion(), new Date(), cuenta.getSaldoDisponible() - monto,
					cuenta.getSaldoDisponible(), cuenta.getNumeroCuenta(), monto);
		}

	}

	// Retiro
	public Ticket retirar(double monto, Cuenta cuenta) {
		// 1 Valida que el saldo disponible sea mayor al monto solicitado
		// 2 Valida que el retiro no deje por debajo del minimo a la cuenta
		// 3 Retiro

		if (cuenta.getSaldoDisponible() < monto) {
			return new Ticket("Sin fondos suficientes");
		} else if (cuenta.getSaldoDisponible() - monto < cuenta.getSaldoMin()) {
			return new Ticket("El retiro dejaria por debajo del minimo a la cuenta");
		} else {
			cuenta.setSaldoDisponible(cuenta.getSaldoDisponible() - monto);
			return new Ticket(this.getFolioTransaccion(), new Date(), cuenta.getSaldoDisponible() + monto,
					cuenta.getSaldoDisponible(), cuenta.getNumeroCuenta(), monto);
		}
	}
//Transferencia
	
	public Ticket tranferencia(double monto, Cuenta cuenta, Cuenta numCuentadestino) {
		if(cuenta.getSaldoDisponible() < monto) {
			return new Ticket("Sin fomdos suficientes");
		}else if (cuenta.getSaldoDisponible() - monto < cuenta.getSaldoMin()) {
		return new Ticket("La transferencia estaria por debajo del miimo");	
		}else if(monto>numCuentadestino.getSaldoMax()) {
			return new Ticket("Estas por encima del limmite");
		}else if (monto+ numCuentadestino.getSaldoDisponible()>cuenta.getSaldoMax()) {
			return new Ticket("Encima del limite");
		}else {
			cuenta.setSaldoDisponible(cuenta.getSaldoDisponible()-monto);
			numCuentadestino.setSaldoDisponible(numCuentadestino.getSaldoDisponible()+monto);
			
			return new Ticket(this.generarFolio(),
					          numCuentadestino.getSaldoDisponible()-monto,
					          numCuentadestino.getSaldoDisponible(),
					          cuenta.getNumeroCuenta(),
					          monto,
					          numCuentadestino.getNumeroCuenta());
			
	
	
		}
	
	
	}
	
}
