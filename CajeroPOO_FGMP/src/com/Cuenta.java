package com;

public class Cuenta {
	
	String numeroCuenta, tipoCuenta;
	double saldoDisponible, saldoMin, saldoMax;
	
	
	public Cuenta() {
		
	}

	public Cuenta(String numeroCuenta, String tipoCuenta, double saldoDisponible, double saldoMin, double saldoMax) {
		this.numeroCuenta = numeroCuenta;
		this.tipoCuenta = tipoCuenta;
		this.saldoDisponible = saldoDisponible;
		this.saldoMin = saldoMin;
		this.saldoMax = saldoMax;
	}


	public String getNumeroCuenta() {
		return numeroCuenta;
	}


	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}


	public String getTipoCuenta() {
		return tipoCuenta;
	}


	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}


	public double getSaldoDisponible() {
		return saldoDisponible;
	}


	public void setSaldoDisponible(double saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
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

	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", tipoCuenta=" + tipoCuenta + ", saldoDisponible="
				+ saldoDisponible + ", saldoMin=" + saldoMin + ", saldoMax=" + saldoMax + "]";
	}



	
	
}
