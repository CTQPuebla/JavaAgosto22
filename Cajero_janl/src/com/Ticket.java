package com;

import java.util.Date;

public class Ticket {
	Date fechaOperacion;
	double saldoInicial;
	double saldoFInal;
	int folioTransaccion;
	String numCuentaOrigen;
	double montoTransaccion;
	String numCuentaDestino;
	
	public Ticket() {
		
	}
	public Ticket(String mensaje) {
		System.out.println(mensaje);
		
	}
	public Ticket(Date fechaOperacion, double saldoInicial, double saldoFInal, int folioTransaccion,
			String numCuentaOrigen, double montoTransaccion) {
		super();
		this.fechaOperacion = fechaOperacion;
		this.saldoInicial = saldoInicial;
		this.saldoFInal = saldoFInal;
		this.folioTransaccion = folioTransaccion;
		this.numCuentaOrigen = numCuentaOrigen;
		this.montoTransaccion = montoTransaccion;
	}
	public Ticket(Date fechaOperacion, double saldoInicial, double saldoFInal, int folioTransaccion,
			String numCuentaOrigen, double montoTransaccion, String numCuentaDestino) {
		super();
		this.fechaOperacion = fechaOperacion;
		this.saldoInicial = saldoInicial;
		this.saldoFInal = saldoFInal;
		this.folioTransaccion = folioTransaccion;
		this.numCuentaOrigen = numCuentaOrigen;
		this.montoTransaccion = montoTransaccion;
		this.numCuentaDestino = numCuentaDestino;
	}
	public Date getFechaOperacion() {
		return fechaOperacion;
	}
	public void setFechaOperacion(Date fechaOperacion) {
		this.fechaOperacion = fechaOperacion;
	}
	public double getSaldoInicial() {
		return saldoInicial;
	}
	public void setSaldoInicial(double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}
	public double getSaldoFInal() {
		return saldoFInal;
	}
	public void setSaldoFInal(double saldoFInal) {
		this.saldoFInal = saldoFInal;
	}
	public int getFolioTransaccion() {
		return folioTransaccion;
	}
	public void setFolioTransaccion(int folioTransaccion) {
		this.folioTransaccion = folioTransaccion;
	}
	public String getNumCuentaOrigen() {
		return numCuentaOrigen;
	}
	public void setNumCuentaOrigen(String numCuentaOrigen) {
		this.numCuentaOrigen = numCuentaOrigen;
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
		return "Ticket [fechaOperacion=" + fechaOperacion + ", saldoInicial=" + saldoInicial + ", saldoFInal="
				+ saldoFInal + ", folioTransaccion=" + folioTransaccion + ", numCuentaOrigen=" + numCuentaOrigen
				+ ", montoTransaccion=" + montoTransaccion + ", numCuentaDestino=" + numCuentaDestino + "]";
	}



	
}
