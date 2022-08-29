import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Triangulo triangulo1 = new Triangulo();
		Triangulo triangulo2 = new Triangulo(8, 15);
		System.out.println("*** Triangulo ***");
		System.out.println("Ingresa el tamaño del lado");
		triangulo1.setTamañoLado(leerDouble());
		System.out.println("Ingresa el tamaño de la altura");
		triangulo1.setAltura(leerDouble());
		triangulo1.calcularPerimetro();
		triangulo1.calcularArea();
		triangulo1.calcularVolumen();
		System.out.println("\ntriangulo 2");
		triangulo2.calcularPerimetro();
		triangulo2.calcularArea();
		triangulo2.calcularVolumen();
		System.out.println("\n*** Circulo ***");
		Circulo circulo1 = new Circulo();
		System.out.println("Ingresa el tamaño del radio");
		circulo1.setRadio(leerDouble());
		circulo1.calcularPerimetro();
		circulo1.calcularArea();
		circulo1.calcularVolumen();
		System.out.println("");
		System.out.println("\n*** Cuadrado ***");
		Cuadrado cuadrado1 = new Cuadrado();
		System.out.println("Ingresa el tamaño del lado");
		cuadrado1.setTamañoLado(leerDouble());
		cuadrado1.calcularPerimetro();
		cuadrado1.calcularArea();
		cuadrado1.calcularVolumen();
	}

	public static double leerDouble() {
		Scanner teclado = new Scanner(System.in);
		double valor = teclado.nextDouble();
		teclado.nextLine();
		return valor;
	}

}
