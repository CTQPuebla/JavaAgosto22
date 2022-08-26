package com;

public abstract class SerVivo {
	
	String nombre;
	String peso;
	
	SerVivo(){
		
	}

	public SerVivo(String nombre, String peso) {
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

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}
	
	public abstract void comer();
	public abstract void reproducirse();
	public abstract void dormir();
	
}
