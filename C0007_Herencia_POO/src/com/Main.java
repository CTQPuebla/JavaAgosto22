package com;

public class Main {

	public static void main(String[] args) {
		Persona p1 = new Persona("padre", 99, "masculino", "mexicana");
		System.out.println(p1);
		Empleado e1 = new Empleado();
		e1.setNombre("hijo");
		e1.setEdad(20);
		e1.setSexo("masculino");
		e1.setNacionalidad("mexicana");
		System.out.println(e1);
		e1.trabajar("laptop");
		Gerente gerente1 = new Gerente();
		gerente1.trabajar("edificio");
	}
}
