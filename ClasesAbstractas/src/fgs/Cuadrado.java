package fgs;

public class Cuadrado extends Figuras {
	
	public Cuadrado() {
		
	}
	
	//implemenetado metodos abstractos
	

	@Override
	public void area() {
		// TODO Auto-generated method stub
		area = lado * lado;
		System.out.println("area: "+area);
	}

	@Override
	public void perimetro() {
		// TODO Auto-generated method stub
		perimetro = lado*4;
		System.out.println("perimetro: "+perimetro);
	}

	@Override
	public void volumen() {
		// TODO Auto-generated method stub
		volumen = lado*lado*lado;
		System.out.println("volumen: "+volumen);
	}
	

}
