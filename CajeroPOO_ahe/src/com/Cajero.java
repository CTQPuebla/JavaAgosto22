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

	// Comportamiento propio
	public int generarfolio() {
		folioTransaccion = (int) (Math.random()*1000);
		return folioTransaccion;
		
		

	}

	// Deposito
	public Ticket depositar(double monto, Cuenta cuenta) {
		// valida que el monto por si solo no se pase del maximo
		if (monto > cuenta.getMax()) {

			return new Ticket("operacion no valida :Monto por encima del maximo permitido"); // sin datos

		} else if (monto + cuenta.getSaldoDisponible() > cuenta.getMax()) {
			return new Ticket("eldepositollevaria por encima del maximo permitido");
		} else {
			cuenta.setSaldoDisponible(monto + cuenta.getSaldoDisponible());
			return new Ticket(this.generarfolio(), new Date(), cuenta.getSaldoDisponible(),
					cuenta.getSaldoDisponible() + monto, cuenta.getNumeroCuenta(), monto);

		}

	}

	// Retiro
	public Ticket retirar(double monto, Cuenta cuenta) {
		//1 valida que el saldo disponible sea mayor al monto solicitado
		// 2 valida que el retiro no deje por de bajo del minimo a la cuenta
		//Rtiro
		
		if(cuenta.getSaldoDisponible()<monto){
			return new Ticket("sin saldo disponible");
			
		}else if (cuenta.getSaldoDisponible()-monto<cuenta.getMin()) {
			return new Ticket("El retiro dejaria por debajo del minimo a la cuenta");
			}else {
				cuenta.setSaldoDisponible(cuenta.getSaldoDisponible()-monto);
				return new Ticket(this.generarfolio(),
						new Date(),
						cuenta.getSaldoDisponible(),
						cuenta.getSaldoDisponible()+monto,
						cuenta.getNumeroCuenta(),
						monto);
			}
	}

	// Transferencia
	public Ticket tranferencia(double monto, Cuenta cuenta, Cuenta numCuentaDestino) {
		
		if(cuenta.getSaldoDisponible()<monto) {
			return new Ticket("No te alcanza");
			}else if (cuenta.getSaldoDisponible()-monto<cuenta.getMin()) {
				return new Ticket("Saldo por debajo del limite");
			}else if(monto>numCuentaDestino.getMax()) {
				return new Ticket("Tepasas del limite");
			}else if (monto + numCuentaDestino.getSaldoDisponible()>numCuentaDestino.getMax()) {
				return new Ticket("por encima del limite");
			}else {
				cuenta.setSaldoDisponible(cuenta.getSaldoDisponible()-monto);
				numCuentaDestino.setSaldoDisponible(numCuentaDestino.getSaldoDisponible()+monto);
				
				return new Ticket(this.generarfolio(),
						      new Date(),
						      numCuentaDestino.getSaldoDisponible()-monto,
						      numCuentaDestino.getSaldoDisponible(),
						      cuenta.getNumeroCuenta(),
						      monto,
						      numCuentaDestino.getNumeroCuenta());
				
			}
			
		
	}

}
