package com;

public abstract class FiguraGeometrica {

	double perimetro;
	double area;
	double volumen;
	
	public FiguraGeometrica() {
		
	}

	public FiguraGeometrica(double perimetro, double area, double volumen) {
		super();
		this.perimetro = perimetro;
		this.area = area;
		this.volumen = volumen;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}

	@Override
	public String toString() {
		return "FiguraGeometrica [perimetro=" + perimetro + ", area=" + area + ", volumen=" + volumen + "]";
	}
	
	
	public abstract double perimetro();
	
	public abstract double area();
	
	public abstract  double volumen();
	
	
}
