package com;

public class Triangulo extends Figurageo {
	
	double base;
	double altura;
	 
	
	public Triangulo() {
		
	}


	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}


	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + "]";
	}


	@Override
	public double calcularPerimetro() {
		
		return base + altura;
	}


	@Override
	public double calcularArea() {
		
		return base * altura / 2;
	}


	@Override
	public double calcularVolumen() {
		
		return ((base * altura)* altura) / 3;
	}

}
