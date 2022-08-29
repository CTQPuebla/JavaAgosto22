package com;

public abstract class SerVivo {

	String nombre;
	double peso;
	double altura;
	
	public SerVivo() {
		
	}

	
	public SerVivo(String nombre, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.altura = altura;
	}


	

	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}

	
	public abstract String Alimentacion(String a);
	public abstract String Adaptacion(String b);
	public abstract String Respiracion(String c);
	
	
	
	
}
