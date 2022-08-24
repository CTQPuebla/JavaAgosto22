package com;

import java.util.Date;

public class Ticket {

	int folioTransaccion;
	Date fechaOperacion;
	double saldoInicial;
	double saldoFinal;
	String numCuenta;
	double montoTransaccion;
	String mensaje;
	String numCuentadestino;
	
	public Ticket() {
		
	}
	public Ticket(String mensaje) {
		System.out.println(mensaje);
	}

	public Ticket(int folioTransaccion, Date fechaOperacion, double saldoInicial, double saldoFinal, String numCuenta,
			double montoTransaccion, String numCuentadestino) {
		super();
		this.folioTransaccion = folioTransaccion;
		this.fechaOperacion = fechaOperacion;
		this.saldoInicial = saldoInicial;
		this.saldoFinal = saldoFinal;
		this.numCuenta = numCuenta;
		this.montoTransaccion = montoTransaccion;
		this.numCuentadestino = numCuentadestino;
	}
	public Ticket(int folioTransaccion, Date fechaOperacion, double saldoInicial, double saldoFinal, String numCuenta,
			double montoTransaccion) {
		super();
		this.folioTransaccion = folioTransaccion;
		this.fechaOperacion = fechaOperacion;
		this.saldoInicial = saldoInicial;
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

	public String getNumCuentadestino() {
		return numCuentadestino;
	}
	public void setNumCuentadestino(String numCuentadestino) {
		this.numCuentadestino = numCuentadestino;
	}
	@Override
	public String toString() {
		return "Ticket [folioTransaccion=" + folioTransaccion + ", fechaOperacion=" + fechaOperacion + ", saldoInicial="
				+ saldoInicial + ", saldoFinal=" + saldoFinal + ", numCuenta=" + numCuenta + ", montoTransaccion="
				+ montoTransaccion + ", numCuentadestino=" + numCuentadestino + "]";
	}
	
	
	
	
	
	
	
}
