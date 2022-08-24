package com;

import java.util.Date;

public class Cajero {
	
	int folioTransaccion, idCajero;
	Date fechaTransaccion;
	
	public Cajero(){
		
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
	
	
	
	
	//Comportamientos propios del objeto
	
	//Método que genera aleatoriamente un folio de la transacción
	public int generarFolio() {
		folioTransaccion = (int)(Math.random()*100);
		return folioTransaccion;
	}
	
	
	//Depósito
	public Ticket depositar(double monto, Cuenta cuenta) {
		//1) Validar que el monto por sí solo no se pase del máximo
		if(monto>cuenta.getSaldoMax()) {
			return new Ticket("Monto por encima del máximo permitido"); 
		//2) Validar que la suma del monto mas el saldo disponible no exceda el saldo máximo disponible	
		}else if(monto + cuenta.getSaldoDisponible()>cuenta.getSaldoMax()) {
			return new Ticket("El depósito llevaría por encima del máximo permitido");
		}else {
			//Actualizar el saldo de la cuenta
			cuenta.setSaldoDisponible(monto+cuenta.getSaldoDisponible());
			return new Ticket(cuenta.getNumeroCuenta(), new Date(), this.generarFolio(), cuenta.getSaldoDisponible()-monto, cuenta.getSaldoDisponible());
		}
	}
	
	//Retiro
	public Ticket retirar(double monto, Cuenta cuenta) {
		//1) Validar que el saldo disponible sea mayor al monto solicitado
		//2) Validar que el retiro no deje por debajo del mínimo a la cuenta
		//3) Retirar
		
		if(cuenta.getSaldoDisponible()<monto) {
			return new Ticket("Sin fondos suficientes");
		}else if(cuenta.getSaldoDisponible()-monto<cuenta.getSaldoMin()){
			return new Ticket("El retiro dejaría por debajo del mínimo a la cuenta");
		}else {
			cuenta.setSaldoDisponible(cuenta.getSaldoDisponible()-monto);
			return new Ticket(cuenta.getNumeroCuenta(), new Date(), this.generarFolio(), cuenta.getSaldoDisponible()+monto, cuenta.getSaldoDisponible());
		}
	}
	
	//Transferencia
	public Ticket transferencia(double monto, Cuenta cuenta, Cuenta cuenta2) {
		
		if(cuenta.getSaldoDisponible()<monto) {
			return new Ticket("Sin fondos suficientes");
		}else if(cuenta.getSaldoDisponible()-monto<cuenta.getSaldoMin()){
			return new Ticket("El retiro dejaría por debajo del mínimo a la cuenta");
		}else {
			if(monto>cuenta2.getSaldoMax()) {
				return new Ticket("Monto por encima del máximo permitido"); 	
			}else if(monto + cuenta2.getSaldoDisponible()>cuenta2.getSaldoMax()) {
				return new Ticket("El depósito llevaría por encima del máximo permitido");
			}else {
				cuenta.setSaldoDisponible(cuenta.getSaldoDisponible()-monto);
				cuenta2.setSaldoDisponible(monto+cuenta2.getSaldoDisponible());
				return new Ticket(cuenta.getNumeroCuenta(), cuenta2.getNumeroCuenta(),new Date(), this.generarFolio(), cuenta.getSaldoDisponible()+monto, cuenta.getSaldoDisponible());
			}
		}
	}

}
