
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
		
	public Triangulo(double tama�oLado, double altura) {
		super(tama�oLado);
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
		perimetro = tama�oLado + tama�oLado + tama�oLado;
		System.out.println("\nEl perimetro es " + perimetro);
	}

	// area a = (b * h) / 2
	@Override
	public void calcularArea() {
		area = (tama�oLado * altura) / 2;
		System.out.println("El area es " + area);

	}

	// volumen v = (areaBase * h )/3
	@Override
	public void calcularVolumen() {
		volumen = ((tama�oLado * tama�oLado) * altura) / 3;
		System.out.println("El volumen es " + volumen);
	}

}
