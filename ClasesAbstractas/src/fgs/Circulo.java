package fgs;

public class Circulo extends Figuras{
	
	double diametro;
	double radio;
	

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		area=(Math.PI)*(radio*2*2);
		System.out.println("area: "+area);
	}

	@Override
	public void perimetro() {
		// TODO Auto-generated method stub
		perimetro= Math.PI*diametro;
		System.out.println("perimetro: "+perimetro);
	}

	@Override
	public void volumen() {
		// TODO Auto-generated method stub
		volumen = 4/3*Math.PI*(radio*3*3*3);
		System.out.println("volumen: "+volumen);
	}

}
