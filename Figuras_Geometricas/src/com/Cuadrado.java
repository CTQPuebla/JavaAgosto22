package com;

public  class Cuadrado extends FiguraGeometrica {

	 double lado;
	 
	 
	 public Cuadrado() {
		 
	 }


	public Cuadrado(int lado) {
		super();
		this.lado = lado;
	}


	public double getLado() {
		return lado;
	}


	public void setLado(int lado) {
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
		return lado*lado;
	}


	@Override
	public double volumen() {
		return lado * lado *lado;
	}
	 
	 
}
