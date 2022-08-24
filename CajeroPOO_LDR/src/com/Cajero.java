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
	
	
	//Comportamientos Propios, es deceir, los metodos
	//50000
	//30000
	//20000
	
	//Metodo que genera aleatoriamente un folio de la transaccion
	public int generarFolio() {
		folioTransaccion= (int)(Math.random() * 100);
		return folioTransaccion;
	}
	
	//DEPOSITO
	public Ticket depositar(double monto, Cuenta cuenta) {
		//CASO 1: valida que el monto por si solo no se pase del maximo
		if(monto>cuenta.getSaldoMax()) {
			return new Ticket("Monto por encima del maximo permitido.");	//Sin datos
		}
		else if(monto + cuenta.getSaldoDisponible()>cuenta.getSaldoMax()){
			return new Ticket("El deposito llevaría por encima del maximo permitido.");
		}
		else {
			//Actualizar el saldo de la cuenta
			//			30,000			30,000 + 20,000 = 50,000
			cuenta.setSaldoDisponible(monto + cuenta.getSaldoDisponible());
			return new Ticket(this.generarFolio(), 
							  		   new Date(), 
							  		   cuenta.getNumeroCuenta(), 
							  		   cuenta.getSaldoDisponible() - monto, 
							  		   cuenta.getSaldoDisponible(), monto);
		}
	}
	
	//RETIRO
	public Ticket retirar(double monto, Cuenta cuenta) {
		//1: Valida que el saldo disponible sea mayor al monto solicitado
		//2: Valida que el retiro no deje por debajo del minimo a la cuenta
		//3: Retiro
		if(cuenta.getSaldoDisponible() < monto) {
			return new Ticket("Sin fondos suficientes");
		}else if(cuenta.getSaldoDisponible()-monto < cuenta.getSaldoMin()) {
			return new Ticket("El retiro dejaría por debajo del minimo a la cuenta");
		}else {
			cuenta.setSaldoDisponible(cuenta.getSaldoDisponible() - monto);
			return new Ticket(this.generarFolio(), 
								new Date(), 
								cuenta.getNumeroCuenta(), 
								cuenta.getSaldoDisponible() + monto, 
								cuenta.getSaldoDisponible(), monto);	
		      }
	}
	
	//TRANSFERENCIA
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
		  return new Ticket(this.generarFolio(),
				  						new Date(), 
				  						origen.getNumeroCuenta(),
				  						destino.getNumeroCuenta(),
				  						destino.getSaldoDisponible()-monto,
				  						destino.getSaldoDisponible(),
				  						monto);
}}}
