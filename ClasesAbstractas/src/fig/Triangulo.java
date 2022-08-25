package fig;

public class Triangulo extends FigGeometricas{
	double base=5;
	double altura=4;
	
	public Triangulo() {
		 
	}

	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + "]";
	}

	@Override
	public void formula() {
		// TODO Auto-generated method stub
		System.out.println("trianguo");
		area=(base*altura)/2;
		System.out.println("el area es: "+area);
		perimetro=base*base*base;
		System.out.println("el perimetro es: "+perimetro+" \n");
		
	}
	
	

}
