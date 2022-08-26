package com;

public class Main {

	public static void main(String[] args) {
		System.out.println("*** Ejercicio interfaces ***");
		System.out.println("\n--- Animal ---");
		Animal animal1 = new Animal();
		animal1.setNombre("Chispas");
		animal1.setPeso(20);
		animal1.nadar();
		System.out.println("El animal se llama "+ animal1.getNombre() + " pesa " + animal1.getPeso() + " kilos");
		animal1.alimentarse();
		System.out.println("\n--- Planta ---");
		Planta planta1 = new Planta("bugambilia",0.5);
		System.out.println("Esa planta es una " + planta1.getNombre() + " me imagino que pesa " + planta1.getPeso() + " kilos");
		planta1.fotosintesis();
		planta1.alimentarse();
		System.out.println("\n--- Humano ---");
		SerHumano humano1 = new SerHumano("Juan",88);
		humano1.alimentarse();
		humano1.nadar();
		
	}

}
