package com;

public class Cuadrado extends Figura{
	
	private double lado;
	
	public Cuadrado() {
		
	}
	
	
	public Cuadrado(double area, double perimetro, double volumen, double lado) {
		super(area, perimetro, volumen);
		this.lado = lado;
	}

	


	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}


	@Override
	public void area() {
		setArea(getLado()*getLado());
		
	}

	@Override
	public void perimetro() {
		setPerimetro(getLado()*4);
		
	}

	@Override
	public void volumen() {
		setVolumen(Math.pow(getLado(), 3));
		
	}


	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}

	
	
	
	
	

}
