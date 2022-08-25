package com;

import java.util.Date;

public class Ticket {
	int folioTransaccion;
	Date fechaOperacion;
	String numeroCuentaOrigen;
	String numeroCuentaDestino;
	double saldoInicial;
	double salfoFinal;
	double montoTransaccion;
	
	public Ticket() {
		
	}
	public Ticket(String mensaje) {
		System.out.println(mensaje);
	}
   

	 
	public Ticket(int folioTransaccion, Date fechaOperacion, String numeroCuentaOrigen, String numeroCuentaDestino,
			double saldoInicial, double salfoFinal, double montoTransaccion) {
		super();
		this.folioTransaccion = folioTransaccion;
		this.fechaOperacion = fechaOperacion;
		this.numeroCuentaOrigen = numeroCuentaOrigen;
		this.numeroCuentaDestino = numeroCuentaDestino;
		this.saldoInicial = saldoInicial;
		this.salfoFinal = salfoFinal;
		this.montoTransaccion = montoTransaccion;
	}
	public Ticket(int folioTransaccion, Date fechaOperacion, String numeroCuentaOrigen, double saldoInicial,
			double salfoFinal, double montoTransaccion) {
		super();
		this.folioTransaccion = folioTransaccion;
		this.fechaOperacion = fechaOperacion;
		this.numeroCuentaOrigen = numeroCuentaOrigen;
		this.saldoInicial = saldoInicial;
		this.salfoFinal = salfoFinal;
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

	public String getnumeroCuentaOrigen() {
		return numeroCuentaOrigen;
	}

	public void setnumeroCuentaOrigen(String numeroCuentaOrigen) {
		this.numeroCuentaOrigen = numeroCuentaOrigen;
	}

	public double getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	public double getSalfoFinal() {
		return salfoFinal;
	}

	public void setSalfoFinal(double salfoFinal) {
		this.salfoFinal = salfoFinal;
	}

	public double getMontoTransaccion() {
		return montoTransaccion;
	}

	public void setMontoTransaccion(double montoTransaccion) {
		this.montoTransaccion = montoTransaccion;
	}
	

	public String getnumeroCuentaDestino() {
		return numeroCuentaDestino;
	}
	public void setnumeroCuentaDestino(String numeroCuentaDestino) {
		this.numeroCuentaDestino = numeroCuentaDestino;
	}
	@Override
	public String toString() {
		return "Ticket [folioTransaccion=" + folioTransaccion + ", fechaOperacion=" + fechaOperacion + ", numeroCuentaOrigen="
				+ numeroCuentaOrigen + ", numeroCuentaDestino=" + numeroCuentaDestino + ", \nsaldoInicial=" + saldoInicial + ", salfoFinal="
				+ salfoFinal + ", montoTransaccion=" + montoTransaccion + "]";
	}
	 
	 

}
