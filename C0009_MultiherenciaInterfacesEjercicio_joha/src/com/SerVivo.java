package com;

public abstract class SerVivo {

	protected String nombre;
	protected double peso;

	// Constructores
	public SerVivo() {
	}

	public SerVivo(String nombre, double peso) {
		this.nombre = nombre;
		this.peso = peso;
	}

	// Getter & Setter
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

	// Metodos abstractos
	public abstract void respirar();

	public abstract void alimentarse();

	public abstract void reproduccion();
}
