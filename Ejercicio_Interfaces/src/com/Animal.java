package com;

public class Animal extends SerVivo implements IAnimalesPlantas, IAnimalesHumanos {
	
	String color;
	String cobertura;
	String gestacion;
	

	public Animal() {
		
	}




	public String getColor() {
		return color;
	}




	public void setColor(String color) {
		this.color = color;
	}




	public String getCobertura() {
		return cobertura;
	}




	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}




	public String getGestacion() {
		return gestacion;
	}




	public void setGestacion(String gestacion) {
		this.gestacion = gestacion;
	}




	@Override
	public String comunicacion(String expresion) {
		return expresion;
	}
	
	
	
	
	@Override
	public String absorberEnergia(String alimento) {
		return alimento;
	}
	


	
	@Override
	public String transformarOxigeno(String respiracion) {
		return respiracion;
	}




	@Override
	public String disminuirMetabolismo(String dormir) {
		return dormir;
	}




	@Override
	public String reproduccion(String reproduccion) {
		return reproduccion;
	}




	@Override
	public String enfermar(String enfermedad) {
		return enfermedad;
	}
	
	


	@Override
	public String desplazarse(String medio) {
		return medio;
	}



	@Override
	public boolean cazar(boolean yn) {
		return yn;
	}



	@Override
	public boolean manipularObjetos(boolean yn) {
		return yn;
	}



	@Override
	public boolean construir(boolean yn) {
		return yn;
	}



	@Override
	public boolean cultivar(boolean yn) {
		return yn;
	}



	@Override
	public String medioVida(String medio) {
		return medio;
	}



	@Override
	public String toString() {
		return "Animal [color=" + color + ", cobertura=" + cobertura + ", gestacion=" + gestacion + ", nombre=" + nombre
				+ ", genero=" + genero + ", peso=" + peso + ", altura=" + altura + ", edad=" + edad + "]";
	}


	
//-----------------------------------------------------------------------------------------------------------------------------------

	
	//Métodos
	public boolean morder(boolean yn) {
		return yn;
	}
	
	public boolean trepar(boolean yn) {
		return yn;
	}
	
	public boolean picar(boolean yn) {
		return yn;
	}
	
	public boolean saltar(boolean yn) {
		return yn;
	}
	
	public boolean flotar(boolean yn) {
		return yn;
	}
	
	
		
}