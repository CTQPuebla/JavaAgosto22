package com;

public class SerHumano extends SerVivo implements IHablar, INadar {

	SerHumano() {
	}

	SerHumano(String nombre, double peso) {
		this.nombre = nombre;
		this.peso = peso;
	}

	// Metodos interfaces

	@Override
	public void nadar() {
		System.out.println("El humano " + this.nombre + " nada diferente al animal");
	}

	@Override
	public void hablar() {
		System.out.println("El humano puede hablar");
	}

	// Metodos abstractos
	@Override
	public void respirar() {
		System.out.println("El humano respira");
	}

	@Override
	public void alimentarse() {
		System.out.println("El humano se alimenta de plantas y animales por eso pesa " + this.peso + " kilos" );
	}

	@Override
	public void reproduccion() {
		System.out.println("El humano se reproduce");
	}

}
