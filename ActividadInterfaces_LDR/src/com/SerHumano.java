package com;

public class SerHumano extends SerVivo implements ISerHumanoMamiferos{

	@Override
	public void crecer() {
		System.out.println("El ser humano se desarrolla, es decir, crece.");
		
	}

	@Override
	public void mover() {
		System.out.println("El ser humano se mueve.");
		
	}

	@Override
	public void respirar() {
		System.out.println("El ser humano respira.");
		
	}

	@Override
	public void comer() {
		System.out.println("El ser humano come.");
		
	}

	@Override
	public void reproducir() {
		System.out.println("El ser humano se reproduce.");	
	}

	@Override
	public void mueren() {
		System.out.println("Todos los seres humanos mueren.");
		
	}

	@Override
	public void nacen() {
		System.out.println("Todos los humanos nacen.");
		
	}

	@Override
	public String cantar(String genero) {
		System.out.println("El humano canta el genero: " +  genero);
		return genero;
	}

}
