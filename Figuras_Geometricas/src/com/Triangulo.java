package com;

public  class Triangulo extends FiguraGeometrica {
	
	double base;
	double lado;
	
	public Triangulo() {
		
	}

	

	public Triangulo(double base, double lado) {
		super();
		this.base = base;
		this.lado = lado;
	}



	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", lado=" + lado + "]";
	}

	@Override
	public double perimetro() {
		return base*lado*lado;

		
	}

	@Override
	public double area() {
		return ((base*lado) / 2);
		
	}

	@Override
	public double volumen() {
		return ((1/3)* (lado * base));
	}

}
