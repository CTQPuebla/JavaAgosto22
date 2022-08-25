package com;

import java.util.Date;

public class Ticket {
	Date fechaOperacion;
	int folioTransaccion;
	String numeroCuentaOrigen;
	String numeroCuentaDestino;
	double saldoIncial;
	double saldoFinal;
	double montoTransaccion;
	String mensajeTicket;

	// Constructor
	public Ticket() {
	}

	public Ticket(String mensaje) {
		//this.mensajeTicket = mensajeTicket;
		System.out.println(mensaje);
	}

	public Ticket(Date fechaOperacion, int folioTransaccion, String numeroCuentaOrigen, double saldoIncial, double saldoFinal,
			double montoTransaccion) {
		this.fechaOperacion = fechaOperacion;
		this.folioTransaccion = folioTransaccion;
		this.numeroCuentaOrigen = numeroCuentaOrigen;
		this.saldoIncial = saldoIncial;
		this.saldoFinal = saldoFinal;
		this.montoTransaccion = montoTransaccion;
	}

	public Ticket(Date fechaOperacion, 
			int folioTransaccion, 
			String numeroCuentaOrigen, 
			double saldoIncial,
			double saldoFinal, 
			double montoTransaccion, 
			String numeroCuentaDestino) {
		this.fechaOperacion = fechaOperacion;
		this.folioTransaccion = folioTransaccion;
		this.numeroCuentaOrigen = numeroCuentaOrigen;
		this.saldoIncial = saldoIncial;
		this.saldoFinal = saldoFinal;
		this.montoTransaccion = montoTransaccion;
		this.numeroCuentaDestino = numeroCuentaDestino;
	}

	// Getter & Setter
	public Date getFechaOperacion() {
		return fechaOperacion;
	}

	public void setFechaOperacion(Date fechaOperacion) {
		this.fechaOperacion = fechaOperacion;
	}

	public int getFolioTransaccion() {
		return folioTransaccion;
	}

	public void setFolioTransaccion(int folioTransaccion) {
		this.folioTransaccion = folioTransaccion;
	}

	public String getNumeroCuentaOrigen() {
		return numeroCuentaOrigen;
	}

	public void setNumeroCuentaOrigen(String numeroCuentaOrigen) {
		this.numeroCuentaOrigen = numeroCuentaOrigen;
	}

	public String getNumeroCuentaDestino() {
		return numeroCuentaDestino;
	}

	public void setNumeroCuentaDestino(String numeroCuentaDestino) {
		this.numeroCuentaDestino = numeroCuentaDestino;
	}

	public double getSaldoIncial() {
		return saldoIncial;
	}

	public void setSaldoIncial(double saldoIncial) {
		this.saldoIncial = saldoIncial;
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

	public String getMensajeTicket() {
		return mensajeTicket;
	}

	public void setMensajeTicket(String mensajeTicket) {
		this.mensajeTicket = mensajeTicket;
	}
	
	// Metodo toString
	@Override
	public String toString() {
		return "Ticket [fechaOperacion=" + fechaOperacion + ", folioTransaccion=" + folioTransaccion
				+ ", numeroCuentaOrigen=" + numeroCuentaOrigen + ", numeroCuentaDestino=" + numeroCuentaDestino
				+ ", saldoIncial=" + saldoIncial + ", saldoFinal=" + saldoFinal + ", montoTransaccion="
				+ montoTransaccion + ", mensajeTicket=" + mensajeTicket + "]";
	}



	
	




}
