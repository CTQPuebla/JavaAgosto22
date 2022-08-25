package com;

public class Circulo extends Figura {
	private double radio;
	private double diametro;
	
	public Circulo() {
		
	}
	
	
	public Circulo(double area, double perimetro, double volumen, double radio, double diametro) {
		super(area, perimetro, volumen);
		this.radio = radio;
		this.diametro = diametro;
	}
	
	
	
	public double getRadio() {
		return radio;
	}



	public void setRadio(double radio) {
		this.radio = radio;
	}



	public double getDiametro() {
		return diametro;
	}



	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}


	@Override
	public void area() {
		setArea((Math.pow(getRadio(), 2) * Math.PI));
		
	}
	@Override
	public void perimetro() {
		setPerimetro((getDiametro() * Math.PI));
		
	}
	@Override
	public void volumen() {
		setVolumen((1.33 * Math.PI)*(Math.pow(getRadio(), 3)));	
	}



	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", diametro=" + diametro + "]";
	}
	
	
	

}
