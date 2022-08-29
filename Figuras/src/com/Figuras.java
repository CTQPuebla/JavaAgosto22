package com;

public abstract class Figuras {

	double d1;
	double d2;
	double outro;
	
	public Figuras() {
	
	}

	public Figuras(double d1, double d2, double outro) {
		super();
		this.d1 = d1;
		this.d2 = d2;
		this.outro = outro;
	}

	public double getD1() {
		return d1;
	}

	public void setD1(double d1) {
		this.d1 = d1;
	}

	public double getD2() {
		return d2;
	}

	public void setD2(double d2) {
		this.d2 = d2;
	}

	public double getOutro() {
		return outro;
	}

	public void setOutro(double outro) {
		this.outro = outro;
	}

	@Override
	public String toString() {
		return "Figuras [d1=" + d1 + ", d2=" + d2 + ", outro=" + outro + "]";
	}

	public abstract void calcArea();
	public abstract void calcPerimetro();
	public abstract void calcV();

	public void calcArea(double d1) {
		
	}

	public void calcArea(double d1, double d2) {
		
	}


	public void calcPerimetro(double d1) {
		
	}

	public void calcV(double d1) {
		
	}

	public void calcPerimetro(double d1, double d2, double outro) {
		
	}

	public void calcV(double d1, double d2, double outro) {
		
	}
	
	
	
}
