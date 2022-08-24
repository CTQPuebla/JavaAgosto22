package com;

import java.util.Date;

public class Ticket {
	
	int folioTransaccion;
	Date fechaOperacion;
	double saldoinicial;
	double saldoFinal;
	String numCuenta;
    double montoTransaccion;
    String numCuentaDestino;
    
    public String getNumCuentaDestino() {
		return numCuentaDestino;
	}
	public void setNumCuentaDestino(String numCuentaDestino) {
		this.numCuentaDestino = numCuentaDestino;
	}
	public Ticket(int folioTransaccion, Date fechaOperacion, double saldoinicial, double saldoFinal, String numCuenta,
			double montoTransaccion, String numCuentaDestino, String mensaje) {
		super();
		this.folioTransaccion = folioTransaccion;
		this.fechaOperacion = fechaOperacion;
		this.saldoinicial = saldoinicial;
		this.saldoFinal = saldoFinal;
		this.numCuenta = numCuenta;
		this.montoTransaccion = montoTransaccion;
		this.numCuentaDestino = numCuentaDestino;
		this.mensaje = mensaje;
	}


	String mensaje;
    
    public Ticket() {
    	
    }
    public Ticket(String mensaje) {
    	System.out.println(mensaje);
    	
    }
    
	@Override
	public String toString() {
		return "Ticket [folioTransaccion=" + folioTransaccion + ", fechaOperacion=" + fechaOperacion + ", saldoinicial="
				+ saldoinicial + ", saldoFinal=" + saldoFinal + ", numCuenta=" + numCuenta + ", montoTransaccion="
				+ montoTransaccion + ", numCuentaDestino=" + numCuentaDestino + ", mensaje=" + mensaje + "]";
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


	public double getSaldoinicial() {
		return saldoinicial;
	}


	public void setSaldoinicial(double saldoinicial) {
		this.saldoinicial = saldoinicial;
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


	public Ticket(int folioTransaccion, Date fechaOperacion, double saldoinicial, double saldoFinal, String numCuenta,
			double montoTransaccion) {
		super();
		this.folioTransaccion = folioTransaccion;
		this.fechaOperacion = fechaOperacion;
		this.saldoinicial = saldoinicial;
		this.saldoFinal = saldoFinal;
		this.numCuenta = numCuenta;
		this.montoTransaccion = montoTransaccion;
	}








}
