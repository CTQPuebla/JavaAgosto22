package fig;

public abstract class FigGeometricas {
	double area;
	double perimetro;
	double volumen;
	 
	
	
	public FigGeometricas() {
		 
	}


	 


	public FigGeometricas(double area, double perimetro, double volumen) {
		super();
		this.area = area;
		this.perimetro = perimetro;
		this.volumen = volumen;
	}





	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}


	public double getPerimetro() {
		return perimetro;
	}


	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}


	public double getVolumen() {
		return volumen;
	}


	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}


	@Override
	public String toString() {
		return "FigGeometricas [area=" + area + ", perimetro=" + perimetro + ", volumen=" + volumen + "]";
	}

 public abstract void formula();
 
 
  
 


	 


 
}
