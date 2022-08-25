
public class Cuadrado extends Figura {

	// Constructor

	public Cuadrado() {
	}

	// Metodos abstractos

	// perimetro p = l + l + l + l
	@Override
	public void calcularPerimetro() {
		perimetro = tama�oLado * 4;
		System.out.format("\nEl perimetro es %.2f", perimetro);
	}

	// area a = l * l
	@Override
	public void calcularArea() {
		area = tama�oLado * tama�oLado;
		System.out.format("\nEl area es %.2f", area);
	}

	// volumen v =a^3
	@Override
	public void calcularVolumen() {
		volumen = tama�oLado * tama�oLado * tama�oLado;
		System.out.format("\nEl volumen es %.2f", volumen);
	}

}
