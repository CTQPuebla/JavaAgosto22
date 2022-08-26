package com;

public abstract  class Figurageo {
	
	double perimetro;
	double area;
	double volumen;
	
	
	public Figurageo() {
		
	}


//	public Figurageo(double perimetro, double area, double volumen) {
//		super();
//		this.perimetro = perimetro;
//		this.area = area;
//		this.volumen = volumen;
//	}
	


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
		return "Figurageo [perimetro=" + perimetro + ", area=" + area + ", volumen=" + volumen + "]";
	}

   public abstract double calcularPerimetro ();
   
   public abstract double calcularArea();
   
   public abstract  double calcularVolumen();
   
   

}
