package com;

public class Triangulo extends Figura{
	
	private double altura;
	private double base;
	private double largo;
	
	

	public Triangulo() {
		
	}

	public Triangulo(double area, double perimetro, double volumen, double altura, double base, double largo) {
		super(area, perimetro, volumen);
		this.altura = altura;
		this.base = base;
		this.largo = largo;
	}
	
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	@Override
	public void area() {
		setArea((getAltura()*getBase())/2);
	}

	@Override
	public void perimetro() {
		setPerimetro((getAltura()+getBase()+getLargo()));
		
	}

	@Override
	public void volumen() {
		setVolumen(((getAltura()*getBase())/2)*getLargo());
		
	}

}
