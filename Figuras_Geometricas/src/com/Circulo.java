package com;

public class Circulo extends FiguraGeometrica {

	double radio;

	public Circulo() {

	}

	public Circulo(double radio) {
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

	@Override
	public double perimetro() {
	
		return (Math.PI * 2) * radio;
	}

	@Override
	public double area() {
		return (Math.PI * (radio * radio));

	}

	@Override
	public double volumen() {
		return ((4 / 3) * Math.PI * (radio * radio * radio));

	}

}
