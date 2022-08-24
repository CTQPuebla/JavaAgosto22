package com;

public class Cuenta {
	
	String numeroCuenta;
	double saldoDisponible;
	String tipoCuenta;
	
	double min;
	double max;
	
	
	
	public Cuenta() {
		
	}
	

	public Cuenta(String numeroCuenta, double saldoDisponible, String tipoCuenta, double min, double max) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldoDisponible = saldoDisponible;
		this.tipoCuenta = tipoCuenta;
		this.min = min;
		this.max = max;
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
	


	public double getMin() {
		return min;
	}


	public void setMin(double min) {
		this.min = min;
	}


	public double getMax() {
		return max;
	}


	public void setMax(double max) {
		this.max = max;
	}


	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", saldoDisponible=" + saldoDisponible + ", tipoCuenta="
				+ tipoCuenta + ", min=" + min + ", max=" + max + "]";
	}

	
	
	

}
