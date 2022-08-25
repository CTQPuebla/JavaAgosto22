package com;

public  class Cuadrado extends Figura {

	double lado;
	
	public Cuadrado() {
		
	}

	public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}

	@Override
	public double perimetro() {
		return lado*4;
		
	}

	@Override
	public double area() {
		return (lado * lado);
		
	}

	@Override
	public double volumen() {
		return (lado*lado*lado);
		
	}
	
	
	
	
	
}
