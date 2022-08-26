package com;

public abstract class SerVivo 
{
	String nombre;
	int peso;
	
	public SerVivo() {
		
		
	}

	public SerVivo(String nombre, int peso) {

		this.nombre = nombre;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public abstract void crecer();
	public abstract void mover();
	public abstract void respirar();
	public abstract void comer();
	public abstract void reproducir();
	public abstract void mueren();
	public abstract void nacen();

	

}
