package com;

import java.util.Date;

public class Cajero {
	int folioTransaccion;
	int idCajero;
	Date fechaTransaccion;

	public Cajero() {

	}

	public Cajero(int folioTransaccion, int idCajero, Date fechaTransaccion) {
		super();
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

	/*
	 * COmportamiento del cajero
	 * 
	 * Deposito Retiro Transferencia
	 */

	// Depoito
	public int generarFolio() {
		folioTransaccion = (int)(Math.random()*100);
		return folioTransaccion;
	}

	public Ticket depositar(double monto, Cuenta origen) {
		if (monto > origen.getSaldoMax()) {
			return new Ticket("monto por encima del maximo permitido");// sin datos
		} else if (monto + origen.getSaldoDisponible() > origen.getSaldoMax()) {
			return new Ticket("El deposito llevaria por encima del maximo permitido");
		} else {
			// actualizar el saldo de la cuenta
			origen.setSaldoDisponible(monto + origen.getSaldoDisponible());
			return new Ticket(new Date(), origen.getSaldoDisponible() - monto, origen.getSaldoDisponible(),
					this.generarFolio(), origen.getNumeroCuenta(), monto);
		}

	}

	// retiro
	public Ticket retirar(double monto, Cuenta origen) {
		// 1 validar fondos
		// 2 validadr que el retino no deje por debajo del minimo a la cuenta
		// 3 retiro

		if (origen.getSaldoDisponible() < monto) {
			return new Ticket("sin fondos");
		} else if (origen.getSaldoDisponible() - monto < origen.getSaldoMin()) {
			return new Ticket("dejarias por debajo del minimo");
		} else {
			origen.setSaldoDisponible(origen.getSaldoDisponible()-monto);
				return new Ticket(new Date(), origen.getSaldoDisponible()+monto, origen.getSaldoDisponible(),this.generarFolio() , origen.getNumeroCuenta(), monto);
		}
		
	}
	//trasnferencia
//public Ticket trasnferir(double monto,Cuenta cuenta_origen, Cuenta cuenta_destino) {
//	this.retirar(monto,cuenta_origen);
//	this.depositar(monto,cuenta_destino);
//	return new Ticket((this.retirar(monto,cuenta_origen) +"\n\n"+ this.depositar(monto,cuenta_destino)));
//			
	public Ticket trasnferir(double monto, Cuenta origen, Cuenta destino) {
	
		//validaciones para retirar el dinero de la cuenta
		
		if(origen.getSaldoDisponible()<monto) {
			return new Ticket("sin saldo suficiente");
		}else if(origen.getSaldoDisponible()-monto<origen.getSaldoMin()) {
			return new Ticket("el retiro dejaria por debajao del minimo");
			//validadr para depositar el dinero de la cuenta
		
		}else if(monto>destino.getSaldoMax()) {
			return new Ticket("monto por encima del permitido");
		}else if (monto+destino.getSaldoDisponible()>destino.getSaldoMax()) {
			return new Ticket("el deposito llevarioa por encima del monto maximo");
		}else {
			//afectacion de los daldo s de las cuentas
			origen.setSaldoDisponible(origen.getSaldoDisponible()-monto);
			destino.setSaldoDisponible(destino.getSaldoDisponible()+monto);		
		return new Ticket(new Date(), destino.getSaldoDisponible()-monto, destino.getSaldoDisponible(), this.generarFolio(), origen.getNumeroCuenta(), monto, destino.getNumeroCuenta());
	
		
			
		}
	
	
	
}

}

