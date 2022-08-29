package fgs;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Cuadrado cuadrado1 = new Cuadrado();
		Triangulo triangulo1 = new Triangulo();
		Circulo circulo1 = new Circulo();
		
		System.out.println("\tCuadrado");
		System.out.println("ingresa lado: ");
		cuadrado1.setLado(leer());
		
		//System.out.println(cuadrado1.getLado());
		cuadrado1.area();
		cuadrado1.perimetro();
		cuadrado1.volumen();
		
		System.out.println("\tTriangulo");
		System.out.println("ingresa lado: ");
		triangulo1.setLado(leer());
		System.out.println("ingresa altura: ");
		triangulo1.setAltura(leer());
		triangulo1.area();
		triangulo1.perimetro();
		triangulo1.volumen();
		
		System.out.println("\tCirculo");
		System.out.println("ingresa radio: ");
		circulo1.setRadio(leer());
		System.out.println("ingresa diametro: ");
		circulo1.setDiametro(leer());
		circulo1.area();
		circulo1.perimetro();
		circulo1.volumen();
		

	}
	/*
	 * funciones hechas en main 
	 * public static tipoValorRetorno nombreFuncion()
	 * tiposValorRetorno .... int double boolean void 
	 * {}
	*/
	public static double leer() {
		Scanner leerNumero = new Scanner(System.in);
		double a = leerNumero.nextDouble();
		leerNumero.nextLine();
		return a;
	}
	

}
