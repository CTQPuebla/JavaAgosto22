package com;

public class Principal {
	public static void main(String[] args) {
		
		
		Humano h = new Humano();
		
		
		h.setBailar("baila");
		h.setCantar("canta");
		h.setComer("come");
		h.setRazonar("razona");
		h.setReproducirse("se reproduce");
		h.setRespirar("respira");
		h.sobrevivir("sobrevive");
		h.adaptarse();
		System.out.println("el humano realiza mas acciones que las plantas y los animales");
		
		Animal a = new Animal();
		
		
		a.setCazar("caza");
		a.setComer("come");
		a.setComunicarse("se comunica");
		a.setReproducirse("se reproduce");
		a.setRespirar("respira");
		
		System.out.println("los animales tienen menos atributos que los humanos");
		
		Planta p = new Planta();
		
		p.setFotosintesis("realiza fotosintesis");
		p.respirar();
		p.reproducirse();
		
		System.out.println("la planta tiene distintos atributos que los humanos y animales");
		
		
		
		
		
		
	}

}
