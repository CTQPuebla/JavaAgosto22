package com;

public abstract class FBase {
	private double lado;
	private double alto;
	private String nombre;
	private double area;
	private double perimetro;
	public FBase() {
		
	}
	
	public FBase(double lado, double alto, String nombre) {
		super();
		this.lado = lado;
		this.alto = alto;
		this.nombre = nombre;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	@Override
	public String toString() {
		return "FBase [lado=" + lado + ", alto=" + alto + "]";
	}
	
	public abstract double calculaArea(double lado, double alto);
	
	public abstract double calculaPerimetro(double lado, double alto);
}
