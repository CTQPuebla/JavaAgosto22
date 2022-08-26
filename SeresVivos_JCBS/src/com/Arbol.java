package com;

public class Arbol extends SerVivo implements IPlanta{

	@Override
	public void fotosintesis() {
		// TODO Auto-generated method stub
		System.out.println("FOTOSINTESIS");
	}

	@Override
	public void noMoverse() {
		// TODO Auto-generated method stub
		System.out.println("no se movio");
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("ahora tienes mas oxigeno, de nada.");
	}

	@Override
	public void reproducirse() {
		// TODO Auto-generated method stub
		System.out.println("*Se reproduce*");
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		System.out.println("ZzZzZzZ....");
	}

}
