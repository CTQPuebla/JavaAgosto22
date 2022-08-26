
public class Triangulo extends Figura {

	// Atributos
	private double altura;

	// Constructores
	public Triangulo() {
		super();
	}

	public Triangulo(double altura) {
		super();
		this.altura = altura;
	}
		
	public Triangulo(double tamañoLado, double altura) {
		super(tamañoLado);
		this.altura = altura;
	}

	// Getter&Setter
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// Metodos abstractos
	// perimetro p = l + l + l
	@Override
	public void calcularPerimetro() {
		perimetro = tamañoLado + tamañoLado + tamañoLado;
		System.out.println("\nEl perimetro es " + perimetro);
	}

	// area a = (b * h) / 2
	@Override
	public void calcularArea() {
		area = (tamañoLado * altura) / 2;
		System.out.println("El area es " + area);

	}

	// volumen v = (areaBase * h )/3
	@Override
	public void calcularVolumen() {
		volumen = ((tamañoLado * tamañoLado) * altura) / 3;
		System.out.println("El volumen es " + volumen);
	}

}
