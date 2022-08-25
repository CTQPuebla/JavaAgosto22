package fig;

public class Cuadrado extends FigGeometricas{
 
	int numLados=4;
	int altura=5;
	 
	
	
	
	public Cuadrado() {
		  
	}




	public Cuadrado(int numLados, int altura) {
		super();
		this.numLados = numLados;
		this.altura = altura;
	}

	



	public int getNumLados() {
		return numLados;
	}




	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}




	public int getAltura() {
		return altura;
	}




	public void setAltura(int altura) {
		this.altura = altura;
	}




	@Override
	public String toString() {
		return "Cuadrado [numLados=" + numLados + ", altura=" + altura + "]";
	}

 
	@Override
	public void formula() {
		// TODO Auto-generated method stub
		System.out.println("cuadrado");
		  area=numLados*altura;
		  System.out.println("area = "+area);
		  perimetro=numLados*numLados*numLados*numLados;
		  System.out.println("perimetro =  "+perimetro+"\n");
		 
	}
	
	
	

}
