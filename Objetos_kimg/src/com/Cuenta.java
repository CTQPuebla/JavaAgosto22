package com;

public class Cuenta {
	 
	String ncuenta;
	double sdisponible;
	String tipocuenta;
	
	double saldomin;
	double saldomax;
	
	
	
	public Cuenta () {
		
	}



	public Cuenta(String ncuenta, double sdisponible, String tipocuenta, double saldomin, double saldomax) {
		super();
		this.ncuenta = ncuenta;
		this.sdisponible = sdisponible;
		this.tipocuenta = tipocuenta;
		this.saldomin = saldomin;
		this.saldomax = saldomax;
	}



	public String getNcuenta() {
		return ncuenta;
	}



	public void setNcuenta(String ncuenta) {
		this.ncuenta = ncuenta;
	}



	public double getSdisponible() {
		return sdisponible;
	}



	public void setSdisponible(double sdisponible) {
		this.sdisponible = sdisponible;
	}



	public String getTipocuenta() {
		return tipocuenta;
	}



	public void setTipocuenta(String tipocuenta) {
		this.tipocuenta = tipocuenta;
	}



	public double getSaldomin() {
		return saldomin;
	}



	public void setSaldomin(double saldomin) {
		this.saldomin = saldomin;
	}



	public double getSaldomax() {
		return saldomax;
	}



	public void setSaldomax(double saldomax) {
		this.saldomax = saldomax;
	}



	@Override
	public String toString() {
		return "Cuenta [ncuenta=" + ncuenta + ", sdisponible=" + sdisponible + ", tipocuenta=" + tipocuenta
				+ ", saldomin=" + saldomin + ", saldomax=" + saldomax + "]";
	}


	

}
