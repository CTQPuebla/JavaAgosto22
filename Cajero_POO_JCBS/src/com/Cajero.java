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
	
	//Comportamiento propio
	
	public int generaFolio() {
		return (int) (Math.random()*100);
	}
	
	//Deposito
		public Ticket depositar(double monto, Cuenta cuenta) {
			//1 valida que el monto por si solo no se pase del maximo
			
			if (monto>cuenta.getSaldoMax()) {
				return new Ticket("Monto por encima del maximo permitido"); //sin datos
			}else if(monto + cuenta.getSaldoDisponible() > cuenta.getSaldoMax()) {
				return new Ticket("el deposito llevaria por encima del maximo permitido");
			}else {
				//Actualizar el saldo de la cuenta
				cuenta.setSaldoDisponible(monto+cuenta.getSaldoDisponible());
				return new Ticket(this.generaFolio(), 
								  new Date(), 
								  cuenta.getNumeroCuenta(),
								  cuenta.getSaldoDisponible() - monto,
								  cuenta.getSaldoDisponible(), 
								  monto);
			}
		}
	//Retiro
		public Ticket retiro(double monto, Cuenta cuenta) {
			// 1 valida si cuenta con saldo suficiente.
			// 2 valida que el retiro no deje por debajo del minimo a la cuenta.
			// 3 retiro
			
			if (cuenta.getSaldoDisponible()<monto) {
				return new Ticket("Fondos insuficientes");
			}else if(cuenta.getSaldoDisponible()-monto < cuenta.getSaldoMin()) {
				return new Ticket("El monto a retirar excede el saldo minimo de la cuenta");
			}else {
				cuenta.setSaldoDisponible(cuenta.getSaldoDisponible()-monto);
				return new Ticket(this.generaFolio(),
								  new Date(),
								  cuenta.getNumeroCuenta(),
								  cuenta.saldoDisponible+monto,
								  cuenta.getSaldoDisponible(),
								  monto);
			}			
		}
	//Transferencia
	
		public Ticket transferencia(double monto, Cuenta cuentaOrigen, Cuenta cuentaDestino) {
			
			if (cuentaOrigen.getSaldoDisponible()<monto) {
				return new Ticket("Fondos insuficientes");
			}else if(cuentaOrigen.getSaldoDisponible()-monto<cuentaOrigen.getSaldoMin()) {
				return new Ticket("la tranferencia dejaria los fondos por debajo del saldo minimo");
			}else if(cuentaDestino.getSaldoDisponible()+monto>cuentaDestino.getSaldoMax()) {
				return new Ticket("no se puede realizar la transferencia por que excede el monto maximo");				
			}else {
				cuentaDestino.setSaldoDisponible(cuentaDestino.getSaldoDisponible()+monto);
				cuentaOrigen.setSaldoDisponible(cuentaOrigen.getSaldoDisponible()-monto);
				return new Ticket(this.generaFolio(),
								  new Date(),
								  cuentaDestino.getNumeroCuenta(),
								  cuentaDestino.getSaldoDisponible()-monto,
								  cuentaDestino.getSaldoDisponible(),
								  monto);
			}
			
		}
		
}