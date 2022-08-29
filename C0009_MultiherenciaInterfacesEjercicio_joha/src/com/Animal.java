package com;

public class Animal extends SerVivo implements IVolar, INadar {

	// Constructor
	Animal() {
	}

	// Metodos interfaces

	@Override
	public void nadar() {
		System.out.println("El animal nada rapido");

	}

	@Override
	public void volar() {
		System.out.println("Este animal puede volar");

	}

	// Metodos abstractos

	@Override
	public void respirar() {
		System.out.println("El animal esta respirando");
	}

	@Override
	public void alimentarse() {
		System.out.println("El animal " + this.nombre + " se esta alimentando");
	}

	@Override
	public void reproduccion() {
		System.out.println("El animal esta cog......");
	}

}
