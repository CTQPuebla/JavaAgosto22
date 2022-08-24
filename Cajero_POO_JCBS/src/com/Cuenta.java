package com;

public class Cuenta {
	String numeroCuenta;
	double saldoDisponible;
	String tipoCuenta;
	
	double saldoMin;
	double saldoMax;
	
	public Cuenta() {
		
	}

	
	public Cuenta(String numeroCuenta, double saldoDisponible, String tipoCuenta, double saldoMin, double saldoMax) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldoDisponible = saldoDisponible;
		this.tipoCuenta = tipoCuenta;
		this.saldoMin = saldoMin;
		this.saldoMax = saldoMax;
	}


	public double getSaldoMin() {
		return saldoMin;
	}


	public void setSaldoMin(double saldoMin) {
		this.saldoMin = saldoMin;
	}


	public double getSaldoMax() {
		return saldoMax;
	}


	public void setSaldoMax(double saldoMax) {
		this.saldoMax = saldoMax;
	}


	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldoDisponible() {
		return saldoDisponible;
	}

	public void setSaldoDisponible(double saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}


	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", saldoDisponible=" + saldoDisponible + ", tipoCuenta="
				+ tipoCuenta + ", saldoMin=" + saldoMin + ", saldoMax=" + saldoMax + "]";
	}

	
	
	
}
