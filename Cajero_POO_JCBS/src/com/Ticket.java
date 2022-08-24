package com;

import java.util.Date;

public class Ticket {
	
	int folioTransaccion;
	Date fechaOperacion;
	String numCuenta;
	double saldoInicial;
	double saldoFinal;
	double montoTransaccion;
	
	String mensaje;
	
	public Ticket() {
		
	}
	
	public Ticket(String mensaje) {
		System.out.println(mensaje);
	}
	
	public Ticket(int folioTransaccion, Date fechaOperacion, String numCuenta, double saldoInicial, double saldoFinal,
			double montoTransaccion) {
		super();
		this.folioTransaccion = folioTransaccion;
		this.fechaOperacion = fechaOperacion;
		this.numCuenta = numCuenta;
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

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
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
		return "Ticket [folioTransaccion=" + folioTransaccion + ", fechaOperacion=" + fechaOperacion + ", numCuenta="
				+ numCuenta + ", saldoInicial=" + saldoInicial + ", saldoFinal=" + saldoFinal + ", montoTransaccion="
				+ montoTransaccion + "]";
	}
	
	
}
