package com;

public abstract class SerVivo {
	
	String nombre;
	double peso;

	public SerVivo() {
		
	}
	
	
	public SerVivo(String nombre, double peso) {
		super();
		this.nombre = nombre;
		this.peso = peso;
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


	public abstract void reproducirse();
	public abstract void respirar();
	public abstract void comer();
	

}
