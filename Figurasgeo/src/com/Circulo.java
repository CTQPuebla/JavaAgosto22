package com;

public class Circulo extends Figurageo {
	
	double radio;
	
	
	public Circulo () {
		
	}


	public double getRadio() {
		return radio;
	}


	public void setRadio(double radio) {
		this.radio = radio;
	}


	public Circulo(double radio) {
		this.radio = radio;
	}


	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}


	@Override
	public double calcularPerimetro() {
		
		return Math.PI* 2 * radio ;
	}


	@Override
	public double calcularArea() {
		
		return Math.PI * Math.pow(this.radio,2);
	}


	@Override
	public double calcularVolumen() {
		
		return (4/3) * Math.PI * (radio*radio*radio);
	}
	

}
