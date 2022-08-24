package com;

import java.util.Date;

public class Ticket {

	int foliotransaccion;
	Date fechaoperacion;
	String ncuenta;
	double saldoicial;
	double saldofinal;
	double montotransaccion;
	String mensaje;
	String ncuentad;

	public Ticket() {

	}

	public Ticket(String mensaje) {
		System.out.println(mensaje);

	}

	public Ticket(int foliotransaccion, Date fechaoperacion, String ncuenta, double saldoicial, double saldofinal,
			double montotransaccion) {
		super();
		this.foliotransaccion = foliotransaccion;
		this.fechaoperacion = fechaoperacion;
		this.ncuenta = ncuenta;
		this.saldoicial = saldoicial;
		this.saldofinal = saldofinal;
		this.montotransaccion = montotransaccion;
	}

	public Ticket(int foliotransaccion, Date fechaoperacion, String ncuentad, String ncuenta, double saldoicial,
			double saldofinal, double montotransaccion) {
		super();
		this.foliotransaccion = foliotransaccion;
		this.fechaoperacion = fechaoperacion;
		this.ncuentad = ncuentad;
		this.ncuenta = ncuenta;
		this.saldoicial = saldoicial;
		this.saldofinal = saldofinal;
		this.montotransaccion = montotransaccion;

	}

	public int getFoliotransaccion() {
		return foliotransaccion;
	}

	public void setFoliotransaccion(int foliotransaccion) {
		this.foliotransaccion = foliotransaccion;
	}

	public Date getFechaoperacion() {
		return fechaoperacion;
	}

	public void setFechaoperacion(Date fechaoperacion) {
		this.fechaoperacion = fechaoperacion;
	}

	public String getNcuenta() {
		return ncuenta;
	}

	public void setNcuenta(String ncuenta) {
		this.ncuenta = ncuenta;
	}

	public double getSaldoicial() {
		return saldoicial;
	}

	public void setSaldoicial(double saldoicial) {
		this.saldoicial = saldoicial;
	}

	public double getSaldofinal() {
		return saldofinal;
	}

	public void setSaldofinal(double saldofinal) {
		this.saldofinal = saldofinal;
	}

	public double getMontotransaccion() {
		return montotransaccion;
	}

	public void setMontotransaccion(double montotransaccion) {
		this.montotransaccion = montotransaccion;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getNcuentad() {
		return ncuentad;
	}

	public void setNcuentad(String ncuentad) {
		this.ncuentad = ncuentad;
	}

	@Override
	public String toString() {
		return "Ticket [foliotransaccion=" + foliotransaccion + ", fechaoperacion=" + fechaoperacion + ", ncuenta="
				+ ncuenta + ", saldoicial=" + saldoicial + ", saldofinal=" + saldofinal + ", montotransaccion="
				+ montotransaccion + ", mensaje=" + mensaje + ", ncuentad=" + ncuentad + "]";
	}

}
