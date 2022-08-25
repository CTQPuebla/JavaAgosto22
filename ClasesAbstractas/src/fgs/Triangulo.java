package fgs;

public class Triangulo extends Figuras {
	
	double altura;
	
	public Triangulo() {
		
	}
	

	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	@Override
	public void area() {
		// TODO Auto-generated method stub
		area= lado*altura;
		System.out.println("area:"+area);
	}

	@Override
	public void perimetro() {
		// TODO Auto-generated method stub
		perimetro= lado*lado*lado;
		System.out.println("perimetro: "+perimetro);
	}

	@Override
	public void volumen() {
		// TODO Auto-generated method stub
		volumen=((area*lado)*altura)/3;
		System.out.println("volumen: "+volumen);
	}

}
