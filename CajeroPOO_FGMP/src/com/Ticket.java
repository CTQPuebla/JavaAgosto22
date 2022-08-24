package com;

import java.util.Date;

public class Ticket {
	
	String numCuenta, mensaje;
	Date fechaOperacion;
	int folioTransaccion; 
	String cuentaD;
	double saldoInicial, saldoFinal;
	
	public Ticket() {
		
	}
	
	public Ticket(String mensaje) {
		System.out.println(mensaje);
	
	}
	

	public Ticket(String numCuenta, Date fechaOperacion, int folioTransaccion, double saldoInicial, double saldoFinal) {
		this.numCuenta = numCuenta;
		this.fechaOperacion = fechaOperacion;
		this.folioTransaccion = folioTransaccion;
		this.saldoInicial = saldoInicial;
		this.saldoFinal = saldoFinal;
	}
	
	public Ticket(String cuentaO, String cuentaD, Date fechaOperacion, int folioTransaccion, double saldoInicial, double saldoFinal) {
		this.cuentaD = cuentaD;
		this.numCuenta = cuentaO;
		this.fechaOperacion = fechaOperacion;
		this.folioTransaccion = folioTransaccion;
		this.saldoInicial = saldoInicial;
		this.saldoFinal = saldoFinal;
	}
	
	

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getCuentaD() {
		return cuentaD;
	}

	public void setCuentaD(String cuentaD) {
		this.cuentaD = cuentaD;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

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

	@Override
	public String toString() {
		return "Ticket [Cuenta Origen=" + numCuenta + ", fechaOperacion=" + fechaOperacion
				+ ", folioTransaccion=" + folioTransaccion + ", Cuenta Destino=" + cuentaD + ", saldoInicial=" + saldoInicial
				+ ", saldoFinal=" + saldoFinal + "]";
	}

}
