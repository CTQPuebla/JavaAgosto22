
public class Circulo extends Figura {

	// Atributos
	private double radio;
	//

	// Constructores
	public Circulo() {
		super();
	}

	// Getter & Setter
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	// Metodos abstractos
	
	// perimetro p = pi * d
	@Override
	public void calcularPerimetro() {
		perimetro = 3.1416 * (radio+radio);
		System.out.format("\nEl perimetro(circunferencia) es %.2f", perimetro);

	}

	// area a = pi * r^2

	@Override
	public void calcularArea() {
		area = 3.1416 * (radio*radio);
		System.out.format("\nEl area es %.2f", area);
	
	}

	// volumen v = 4/3 * pi * r^3
	@Override
	public void calcularVolumen() {
		volumen = (4 * 3.1416 * (radio*radio*radio))/3;
		System.out.format("\nEl volumen es %.2f", volumen);
	}

}
