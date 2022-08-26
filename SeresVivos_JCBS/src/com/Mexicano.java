package com;

public class Mexicano extends SerVivo implements ISerHumano {

	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		System.out.println("habla habla");
	}

	@Override
	public void escribir() {
		// TODO Auto-generated method stub
		System.out.println("ha escrito un libro");
	}

	@Override
	public void trabajar() {
		// TODO Auto-generated method stub
		System.out.println("no quiere");
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("ñom ñom");
	}

	@Override
	public void reproducirse() {
		// TODO Auto-generated method stub
		System.out.println("*se reproduce*");
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		System.out.println("ZzZzZz...");
	}

}
