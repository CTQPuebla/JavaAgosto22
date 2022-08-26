
public abstract class Figura {
	// Atributos
	protected double tama�oLado;
	protected double perimetro;
	protected double area;
	protected double volumen;

	// Constructores
	public Figura() {
	}

	public Figura(double tama�oLado) {
		this.tama�oLado = tama�oLado;
	}

	// Getter&Setter

	public double getTama�oLado() {
		return tama�oLado;
	}

	public void setTama�oLado(double tama�oLado) {
		this.tama�oLado = tama�oLado;
	}

	// Metodos abstractos
	public abstract void calcularArea();

	public abstract void calcularPerimetro();

	public abstract void calcularVolumen();

}
