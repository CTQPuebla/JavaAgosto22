
public class Cuadrado extends Figura {

	// Constructor

	public Cuadrado() {
	}

	// Metodos abstractos

	// perimetro p = l + l + l + l
	@Override
	public void calcularPerimetro() {
		perimetro = tamaņoLado * 4;
		System.out.format("\nEl perimetro es %.2f", perimetro);
	}

	// area a = l * l
	@Override
	public void calcularArea() {
		area = tamaņoLado * tamaņoLado;
		System.out.format("\nEl area es %.2f", area);
	}

	// volumen v =a^3
	@Override
	public void calcularVolumen() {
		volumen = tamaņoLado * tamaņoLado * tamaņoLado;
		System.out.format("\nEl volumen es %.2f", volumen);
	}

}
