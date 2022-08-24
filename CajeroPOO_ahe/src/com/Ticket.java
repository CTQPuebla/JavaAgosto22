package com;

import java.util.Date;

public class Ticket {
	int folioTransaccion;
	Date fechaOperacion;
	double saldoOficial;
	double saldoFinal;
	String numCuenta;
	double montoTransaccion;
    String numCuentaDestino;
	
	public Ticket() {
		
	}
	public Ticket(String mensaje) {
		System.out.println(mensaje);
		
	}
	

	public Ticket(int folioTransaccion, Date fechaOperacion, double saldoOficial, double saldoFinal, String numCuenta,
			double montoTransaccion,String numCuentaDestino) {
		this.folioTransaccion = folioTransaccion;
		this.fechaOperacion = fechaOperacion;
		this.saldoOficial = saldoOficial;
		this.saldoFinal = saldoFinal;
		this.numCuenta = numCuenta;
		this.montoTransaccion = montoTransaccion;
		this.numCuentaDestino = numCuentaDestino;
		
	}
	public Ticket(int folioTransaccion, Date fechaOperacion, double saldoOficial, double saldoFinal, String numCuenta,
			double montoTransaccion) {
		super();
		this.folioTransaccion = folioTransaccion;
		this.fechaOperacion = fechaOperacion;
		this.saldoOficial = saldoOficial;
		this.saldoFinal = saldoFinal;
		this.numCuenta = numCuenta;
		this.montoTransaccion = montoTransaccion;
		
		
	}

	public int getFolioTransaccion() {
		return folioTransaccion;
	}

	public void setFolioTransaccion(int folioTransaccion) {
		this.folioTransaccion = folioTransaccion;
	}

	public Date getFechaOperacion() {
		return fechaOperacion;
	}

	public void setFechaOperacion(Date fechaOperacion) {
		this.fechaOperacion = fechaOperacion;
	}

	public double getSaldoOficial() {
		return saldoOficial;
	}

	public void setSaldoOficial(double saldoOficial) {
		this.saldoOficial = saldoOficial;
	}

	public double getSaldoFinal() {
		return saldoFinal;
	}

	public void setSaldoFinal(double saldoFinal) {
		this.saldoFinal = saldoFinal;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public double getMontoTransaccion() {
		return montoTransaccion;
	}

	public void setMontoTransaccion(double montoTransaccion) {
		this.montoTransaccion = montoTransaccion;
	}
	

	public String getNumCuentaDestino() {
		return numCuentaDestino;
	}
	public void setNumCuentaDestino(String numCuentaDestino) {
		this.numCuentaDestino = numCuentaDestino;
	}
	@Override
	public String toString() {
		return "Ticket [folioTransaccion=" + folioTransaccion + ", fechaOperacion=" + fechaOperacion + ", saldoOficial="
				+ saldoOficial + ", saldoFinal=" + saldoFinal + ", numCuenta=" + numCuenta + ", montoTransaccion="
				+ montoTransaccion + ", numCuentaDestino=" + numCuentaDestino + "]";
	}
	
	
	
	

}
