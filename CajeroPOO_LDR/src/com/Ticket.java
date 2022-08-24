package com;

import java.util.Date;

public class Ticket 
{
	int folioTransaccion;
	Date fechaOperacion;
	//String numCuenta;
	String numCuentaOrigen;
	String numCuentaDestino;
	double saldoInicial;
	double saldoFinal;
	double montoTransaccion;
	
	
	public Ticket() {
	
	}
	
	public Ticket(String mensaje) {
		System.out.println(mensaje);
	}


	/*public Ticket(int folioTransaccion, Date fechaOperacion, String numCuenta, double saldoInicial, double saldoFinal,
			double montoTransaccion) {
		super();
		this.folioTransaccion = folioTransaccion;
		this.fechaOperacion = fechaOperacion;
		this.numCuenta = numCuenta;
		this.saldoInicial = saldoInicial;
		this.saldoFinal = saldoFinal;
		this.montoTransaccion = montoTransaccion;
	}*/


	public Ticket(int folioTransaccion, Date fechaOperacion, String numCuentaOrigen, double saldoInicial,
			double saldoFinal, double montoTransaccion) {
		this.folioTransaccion = folioTransaccion;
		this.fechaOperacion = fechaOperacion;
		this.numCuentaOrigen = numCuentaOrigen;
		this.saldoInicial = saldoInicial;
		this.saldoFinal = saldoFinal;
		this.montoTransaccion = montoTransaccion;
	}
	
	
	
	public Ticket(int folioTransaccion, Date fechaOperacion, String numCuentaOrigen, String numCuentaDestino,
			double saldoInicial, double saldoFinal, double montoTransaccion) {
		this.folioTransaccion = folioTransaccion;
		this.fechaOperacion = fechaOperacion;
		this.numCuentaOrigen = numCuentaOrigen;
		this.numCuentaDestino = numCuentaDestino;
		this.saldoInicial = saldoInicial;
		this.saldoFinal = saldoFinal;
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

	public String getNumCuentaOrigen() {
		return numCuentaOrigen;
	}

	public void setNumCuentaOrigen(String numCuentaOrigen) {
		this.numCuentaOrigen = numCuentaOrigen;
	}

	public String getNumCuentaDestino() {
		return numCuentaDestino;
	}

	public void setNumCuentaDestino(String numCuentaDestino) {
		this.numCuentaDestino = numCuentaDestino;
	}

	public double getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	public double getSaldoFinal() {
		return saldoFinal;
	}

	public void setSaldoFinal(double saldoFinal) {
		this.saldoFinal = saldoFinal;
	}

	public double getMontoTransaccion() {
		return montoTransaccion;
	}

	public void setMontoTransaccion(double montoTransaccion) {
		this.montoTransaccion = montoTransaccion;
	}

	@Override
	public String toString() {
		return "Ticket [folioTransaccion=" + folioTransaccion + ", fechaOperacion=" + fechaOperacion
				+ ", numCuentaOrigen=" + numCuentaOrigen + ", numCuentaDestino=" + numCuentaDestino + ", saldoInicial="
				+ saldoInicial + ", saldoFinal=" + saldoFinal + ", montoTransaccion=" + montoTransaccion + "]";
	}

	
	
	
	

}
