package com;

public abstract class Figura {
	private double area;
	private double perimetro;
	private double volumen;
	
	public Figura() {
		
	}
	
	

	public Figura(double area, double perimetro, double volumen) {
		this.area = area;
		this.perimetro = perimetro;
		this.volumen = volumen;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}
	
	public abstract void area();
	public abstract void perimetro();
	public abstract void volumen();
	
	
	

}
