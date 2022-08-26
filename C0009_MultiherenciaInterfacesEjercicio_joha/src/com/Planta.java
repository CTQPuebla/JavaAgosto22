package com;

public class Planta extends SerVivo implements IFotosintesis {

	Planta() {
	}
	
	Planta(String nombre, double peso){
		this.nombre=nombre;
		this.peso=peso;
	}

	// Metodos interfaces

	@Override
	public void fotosintesis() {
		System.out.println("La planta realiza la fotosintesis");
	}

	// Metodos abstractos
	@Override
	public void respirar() {
		System.out.println("La planta respira");
	}

	@Override
	public void alimentarse() {
		System.out.println("La planta se alimenta ");
	}

	@Override
	public void reproduccion() {
		System.out.println("La planta realiza su reproduccion");
	}

}
