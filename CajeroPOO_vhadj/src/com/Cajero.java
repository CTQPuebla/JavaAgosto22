package com;

import java.util.Date;

public class Cajero {
 
    int folioTransaccion; 
    int idCajero;
    Date fechaTransaccion;
    
	public Cajero() {

	}
    //constructores

	public Cajero(int folioTransaccion, int idCajero, Date fechaTransaccion) {
		super();
		this.folioTransaccion = folioTransaccion;
		this.idCajero = idCajero;
		this.fechaTransaccion = fechaTransaccion;
	}
	  //get set
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
	//toString 
	@Override
	public String toString() {
		return "Cajero [folioTransaccion=" + folioTransaccion + ", idCajero=" + idCajero + ", fechaTransaccion="
				+ fechaTransaccion + "]";
	}
	
	public int generarFolio() {
		return (int)(Math.random()*100);
	}
	
  //comportamiento propio
	//deposito
	
	public Ticket depositar(double monto,  Cuenta origen) {
		// valida que el monto por si solo no se pase del maximo
		if(monto>origen.getSaldoMax()) {
			 
			return new Ticket("monto por encima del maximo permitido");//sin datos
			
		}else if (monto+ origen.getSaldoDisponible()>origen.getSaldoMax()) {
			return new Ticket(" el deposito llevaria por encima del maximo permitido");
		}else {
			origen.setSaldoDisponible(monto+origen.getSaldoDisponible());
			return new Ticket(this.generarFolio(),
					  new Date(),
					  origen.getNumeroCuenta (),
					  origen.getSaldoDisponible() - monto, 
					  origen.getSaldoDisponible(), 
					  monto ) ;
	}
        
}
	    //retiro
	public Ticket retirar(double monto, Cuenta origen) {
		//validar que el saldo disponible sea mayor al monto solicitado
		//validar que el retiro no deje por debajo del minimo a la origen
		
		//retiro
		
		if (origen.getSaldoDisponible()<monto) {
			return new Ticket("sin fondos sufiientes");
		} else if (origen.getSaldoDisponible()-monto<origen.getSaldoMin()) {
			return new Ticket("el retiro dejaria por debajo del minimo a la origen");
		}else {
			origen.setSaldoDisponible(origen.getSaldoDisponible()-monto);
			return new Ticket(this.generarFolio(), 
					new Date(), 
					origen.getNumeroCuenta(),
					origen.getSaldoDisponible()+monto,
					origen.getSaldoDisponible(),
					monto ) ;
		}
		
 }
		//tranferencia
	
	public Ticket Transferir(double monto,Cuenta origen  , Cuenta destino) {
		if (origen.getSaldoDisponible()<monto&& monto!=0) {
			return new Ticket("sin fondos sufiientes");
		} else if (origen.getSaldoDisponible()-monto<origen.getSaldoMin()) {
			return new Ticket("la transferencia dejaria por debajo del minimo a la origen");
		}else {
			origen.setSaldoDisponible(origen.getSaldoDisponible()-monto);	
			destino.setSaldoDisponible(destino.getSaldoDisponible()+monto);
			return new Ticket(this.generarFolio() ,
					new Date(), 
					origen.getNumeroCuenta(),
					destino.getNumeroCuenta(),
					destino.getSaldoDisponible()-monto,
					destino.getSaldoDisponible(),
					monto ) ;
			
		}
			
		 
	}
	
	
}