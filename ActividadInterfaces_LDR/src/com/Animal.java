package com;

public class Animal extends SerVivo implements IAnimalAcuatico{

	@Override
	public void crecer() {
		System.out.println("El animal se reproduce.");
		
	}

	@Override
	public void mover() {
		System.out.println("El animal se mueve.");
		
	}

	@Override
	public void respirar() {
		System.out.println("El  animal respira.");
		
	}

	@Override
	public void comer() {
		System.out.println("El animal come.");
		
	}

	@Override
	public void reproducir() {
		System.out.println("El animal se reproduce");
		
	}

	@Override
	public void mueren() {
		System.out.println("El animal muere.");
		
	}

	@Override
	public void nacen() {
		System.out.println("El animal nace.");
		
	}
	
	@Override
	public String nadar(String animal) {
		System.out.println("El animal: " + animal +  " nada");
		return animal;
	}

	@Override
	public String desovar(String animal) {
		System.out.println("El animal: " + animal + "pone huevos.");
		return animal;
	}

}
