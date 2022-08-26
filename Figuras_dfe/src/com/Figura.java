package com;

public abstract class Figura {
	double area;
	double perimmetro;
	double volumen;
	
	public Figura(){
		
	}

	public Figura(double area, double perimmetro, double volumen) {
		super();
		this.area = area;
		this.perimmetro = perimmetro;
		this.volumen = volumen;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimmetro() {
		return perimmetro;
	}

	public void setPerimmetro(double perimmetro) {
		this.perimmetro = perimmetro;
	}

	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}

	@Override
	public String toString() {
		return "Figura [area=" + area + ", perimmetro=" + perimmetro + ", volumen=" + volumen + "]";
	}
//Comportamiento abstracto
	
	public abstract double perimetro();
	public abstract double area();
	public abstract double volumen();
	
}
