package com;

import java.util.Date;

public class Cajero {
	
	int folioTransaccion;
	int idCajero;
	Date fechaTransaccion;
	
	
	
	public Cajero() {
		
	}
	public Cajero(int folioTransaccion, int idCajero, Date fechaTransaccion) {
		this.folioTransaccion = folioTransaccion;
		this.idCajero = idCajero;
		this.fechaTransaccion = fechaTransaccion;
	}
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
	@Override
	public String toString() {
		return "Cajero [folioTransaccion=" + folioTransaccion + ", idCajero=" + idCajero + ", fechaTransaccion="
				+ fechaTransaccion + "]";
	}
	
	public int generarFolio() {
		int f = (int) (Math.random() * 100);
		return  f;
	}
	
	//Comportamiento propio
	
	//Deposito
	public Ticket depositar(double monto, Cuenta cuenta) {
		
		if (monto > cuenta.getSaldoMax()) {
			return new Ticket("Monto pro encima del maximo permitido");
		}else if (monto + cuenta.getSaldoDisponible()>cuenta.getSaldoMax()) {
			return new Ticket("El deposito llevaria por encima del maximo permitido");
		}else {
			//actualizar el saldo de la cuenta
			   cuenta.setSaldoDisponible(monto + cuenta.getSaldoDisponible());
			   return new Ticket(this.generarFolio(), new Date(), cuenta.getNumeroCuenta(), cuenta.getSaldoDisponible() - monto, cuenta.getSaldoDisponible(),  monto);
		}
	
	}
	
	
	//Retiro
	public Ticket retirar(double monto, Cuenta cuenta) {
		if(cuenta.getSaldoDisponible() < monto) {
			return new Ticket("Sin fondos suficientes");
		}else if (cuenta.getSaldoDisponible() -monto < cuenta.getSaldoMin()) {
			return new Ticket("El retiro dejaria por debajo del minimo a la cuenta");
			
		}else {
			return new Ticket(this.generarFolio(), 
					new Date(), 
					cuenta.getNumeroCuenta(), 
					cuenta.getSaldoDisponible() - monto,
					cuenta.getSaldoDisponible(), 
					monto);
		}
	
	}
	
	
	//Transferencia
	
	public Ticket transferencia(double monto, Cuenta cuenta, Cuenta cuenta2) {
		if(cuenta.getSaldoDisponible() < monto) {
			return new Ticket("Sin fondos suficientes");
		}else if (cuenta.getSaldoDisponible() - monto < cuenta.getSaldoMin()) {
			return new Ticket("El retiro dejaria por debajo del minimo a la cuenta");
		}else {
			cuenta.setSaldoDisponible(cuenta.getSaldoDisponible() - monto);
			cuenta2.setSaldoDisponible(monto + cuenta2.getSaldoDisponible());
			return new Ticket(this.generarFolio(), 
					new Date(), 
					"Cuenta de origen: " + cuenta.getNumeroCuenta() + " cuenta destino: " + cuenta2.getNumeroCuenta(), 
					cuenta.getSaldoDisponible() - monto,
					cuenta.getSaldoDisponible(), 
					monto);			
		}
		
	}
	
	
	
	
	
	
	
}
