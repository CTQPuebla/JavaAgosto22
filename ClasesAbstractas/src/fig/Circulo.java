package fig;

public class Circulo extends FigGeometricas {
	 double pi=3.1416;
	double radio=3;
	
	
	public Circulo() {
		super();
	}

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

	public double getPi() {
		return pi;
	}

	@Override
	public String toString() {
		return "Circulo [pi=" + pi + ", radio=" + radio + "]";
	}

	@Override
	public void formula() {
		// TODO Auto-generated method stub
		System.out.println("circulo");
		area=(pi*radio)*(pi*radio) ;  
		System.out.println("el area es: "+area);
		perimetro=pi*(radio*2);
		System.out.println("el perimetro es:"+perimetro);
	}
	
	
	

}
