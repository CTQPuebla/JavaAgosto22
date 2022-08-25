
public abstract class Figura {
	// Atributos
	protected double tamaņoLado;
	protected double perimetro;
	protected double area;
	protected double volumen;

	// Constructores
	public Figura() {
	}

	public Figura(double tamaņoLado) {
		this.tamaņoLado = tamaņoLado;
	}

	// Getter&Setter

	public double getTamaņoLado() {
		return tamaņoLado;
	}

	public void setTamaņoLado(double tamaņoLado) {
		this.tamaņoLado = tamaņoLado;
	}

	// Metodos abstractos
	public abstract void calcularArea();

	public abstract void calcularPerimetro();

	public abstract void calcularVolumen();

}
