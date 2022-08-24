package com;

public class Ropa {

	String color;
	String marca;
	double precio;
	double talla;

	public Ropa(){

	}

	public Ropa(String color, String marca, double precio, double talla) {
		super();
		this.color = color;
		this.marca = marca;
		this.precio = precio;
		this.talla = talla;
	}

	public Ropa(String color, String marca) {
		super();
		this.color = color;
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getTalla() {
		return talla;
	}

	public void setTalla(double talla) {
		this.talla = talla;
	}

	@Override
	public String toString() {
		return "Ropa [color=" + color + ", marca=" + marca + ", precio=" + precio + ", talla=" + talla + "]";
	}




}



