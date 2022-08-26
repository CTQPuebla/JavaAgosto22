package com;

public class Perro extends SerVivo implements IAnimal {

	@Override
	public void extinguirse() {
		// TODO Auto-generated method stub
		System.out.println("ya no ha mas");
	}

	@Override
	public void volar() {
		// TODO Auto-generated method stub
		System.out.println("no puede");
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("ñom, ñom");
	}

	@Override
	public void reproducirse() {
		// TODO Auto-generated method stub
		System.out.println("reproduciendose ...");
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		System.out.println("ZzZzZz...");
	}

}
