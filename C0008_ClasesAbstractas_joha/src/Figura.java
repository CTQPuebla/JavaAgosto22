
public abstract class Figura {
	// Atributos
	protected double tamañoLado;
	protected double perimetro;
	protected double area;
	protected double volumen;

	// Constructores
	public Figura() {
	}

	public Figura(double tamañoLado) {
		this.tamañoLado = tamañoLado;
	}

	// Getter&Setter

	public double getTamañoLado() {
		return tamañoLado;
	}

	public void setTamañoLado(double tamañoLado) {
		this.tamañoLado = tamañoLado;
	}

	// Metodos abstractos
	public abstract void calcularArea();

	public abstract void calcularPerimetro();

	public abstract void calcularVolumen();

}
