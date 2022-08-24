package com;

public class Tenis {
	
	double talla;
	String color;
	double precio;
	String marca;
	  
	
	
	public Tenis () {
		
	}
	
	public Tenis(double talla, String color, double precio, String marca) {
		this.talla = talla;
		this.color = color;
		this.precio = precio;
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Tenis [talla=" + talla + ", color=" + color + ", precio=" + precio + ", marca=" + marca + "]";
	}

	public double getTalla() {
		return talla;
	}

	public void setTalla(double talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
	
	
	
	
	

}
