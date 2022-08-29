package com;

public class Cuadrado extends Figurageo {
	
	double lado;
	
	public Cuadrado () {
		
	}

	public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}

	@Override
	public double calcularPerimetro() {
		
		return lado*4;
		
		
	}

	@Override
	public double calcularArea() {
		
		return lado*lado;
	}

	@Override
	public double calcularVolumen() {
		
		return Math.pow(lado ,3 );
	
	}
	
	
	
	
	
	

}
