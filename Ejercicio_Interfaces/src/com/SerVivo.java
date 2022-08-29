package com;

public abstract class SerVivo {
	
	String nombre;
	String genero;
	double peso;
	double altura;
	int edad;
	


	public SerVivo() {
		
	}
	
	

	public SerVivo(String nombre, String genero, double peso, double altura, int edad) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}
	

	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}

	
	int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}




	@Override
	public String toString() {
		return "SerVivo [nombre=" + nombre + ", genero=" + genero + ", peso=" + peso + ", altura=" + altura + ", edad="
				+ edad + "]";
	}


	
	
//-----------------------------------------------------------------------------------------------------------------------------------

	
	//Métodos
	public abstract String comunicacion(String expresion);
	public abstract String absorberEnergia(String alimento);
	public abstract String transformarOxigeno(String respiracion);
	public abstract String disminuirMetabolismo(String dormir);
	public abstract String reproduccion(String reproduccion);
	public abstract String enfermar(String enfermedad);

}