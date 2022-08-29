package com;

public class Circulo extends Figura {

	double radio;

	public Circulo() {

	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	public double perimetro() {
		return (Math.PI * 2) * radio;
	}

	public double area() {
		
		return (Math.PI * (radio*radio));
		
	}

	public double volumen() {

		return ((4/3)*Math.PI*(radio*radio*radio));
	}

}
