package com;

public class Principal {
	public static void main(String[] args) {
		
		Perro p = new Perro();
		Arbol a = new Arbol();
		Mexicano m = new Mexicano();
		
		System.out.println("Perro");
		p.extinguirse();
		p.comer();
		p.volar();
		
		System.out.println("\n Arbol");
		a.fotosintesis();
		a.comer();
		
		System.out.println("\nMexicano");
		m.trabajar();
		m.dormir();
		
	}
}
