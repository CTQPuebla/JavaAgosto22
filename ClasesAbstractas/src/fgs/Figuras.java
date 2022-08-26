package fgs;

public abstract class Figuras {
	
	String color;
	double area;
	double perimetro;
	double volumen;
	double lado;
	
	public Figuras() {
		
	}
	

	public Figuras(String color, double area, double perimetro, double volumen, double lado) {
		super();
		this.color = color;
		this.area = area;
		this.perimetro = perimetro;
		this.volumen = volumen;
		this.lado = lado;
	}


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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


	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}


	@Override
	public String toString() {
		return "Figuras [color=" + color + ", area=" + area + ", perimetro=" + perimetro + ", volumen=" + volumen
				+ ", lado=" + lado + "]";
	}


	//metodos abstractos 
	public abstract void area();
	public abstract void perimetro();
	public abstract void volumen();
	

}
