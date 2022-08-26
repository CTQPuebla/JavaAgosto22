package com;

public class Animal extends SerVivo implements Nadar, Volar, Moverse{

	@Override
	public void nombre() {
		System.out.println("Pato");
		
	}

	@Override
	public void peso() {
		System.out.println("4kg");
		
	}

	@Override
	public void nadar() {
		System.out.println("Pato nadando");
	}

	@Override
	public void volar() {
		System.out.println("Pajaro volando");
		
	}

	@Override
	public void moverse() {
		System.out.println("Pato caminando");
		
	}
	
	


}
