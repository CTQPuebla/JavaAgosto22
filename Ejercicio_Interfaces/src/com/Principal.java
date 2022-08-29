package com;

public class Principal {
	public static void main(String[] args) {
		
		Planta p1 = new Planta();
		p1.setAltura(90);
		p1.setColor("Verde");
		p1.setEdad(1);
		p1.setGenero("Hermafrodita");
		p1.setHojas(true);
		p1.setNombre("Alga");
		p1.setPeso(70);
		p1.setRaiz(false);
		p1.setTallo(false);
		p1.absorberEnergia("Fotosintesis");
		p1.comunicacion("Quimica");
		p1.disminuirMetabolismo("Estado de reposo");
		p1.enfermar("Si");
		p1.floracion("No da flor");
		p1.frutar("No da fruto");
		p1.medioVida("Marino");
		p1.produccionOxigeno(true);
		p1.reproduccion("asexual");
		p1.transformarOxigeno("absorcion");
		
		Animal a1 = new Animal();
		a1.setNombre("Tigre");
		a1.setGenero("macho");
		a1.setPeso(400000);
		a1.setAltura(140);
		a1.setEdad(10);
		a1.setCobertura("Pelo");
		a1.setColor("Anaranjado, con rayas negras y blancas");
		a1.setGestacion("Viviparo");
		a1.absorberEnergia("Comida");
		a1.cazar(true);
		a1.comunicacion("Sonidos y olores");
		a1.construir(false);
		a1.cultivar(false);
		a1.desplazarse("Camina");
		a1.disminuirMetabolismo("Duerme");
		a1.enfermar("No");
		a1.flotar(true);
		a1.manipularObjetos(false);
		a1.medioVida("Terrestre");
		a1.morder(true);
		a1.picar(false);
		a1.reproduccion("Sexual");
		a1.saltar(true);
		a1.transformarOxigeno("Respira");
		a1.trepar(true);
	
		Humano h1 = new Humano();
		h1.setAltura(170);
		h1.setConcienciaPropia(true);
		h1.setEdad(35);
		h1.setGenero("Masculino");
		h1.setHablar(true);
		h1.setMoral(true);
		h1.setNacionalidad("Mexicana");
		h1.setNombre("Felipe");
		h1.setNumExtremidades(4);
		h1.setPeso(80000);
		h1.absorberEnergia("Comida");
		h1.cazar(true);
		h1.comunicacion("Habla");
		h1.construir(true);
		h1.cultivar(true);
		h1.desplazarse("Camina");
		h1.disminuirMetabolismo("Duerme");
		h1.enfermar("no");
		h1.estadoCivil("Soltero");
		h1.idioma("Español");
		h1.lenguaje("Voz");
		h1.manipularObjetos(true);
		h1.reproduccion("sexual");
		h1.trabajo(true);
		h1.transformarOxigeno("Respira");

		System.out.println(p1+"\n"+a1+"\n"+h1+"\n");
	}

}
