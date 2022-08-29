package com;

public class Planta extends SerVivo implements IAnimalesPlantas {

	String color;
	boolean raiz;
	boolean tallo;
	boolean hojas;

	public Planta() {

	}

	
	
	

	public String getColor() {
		return color;
	}





	public void setColor(String color) {
		this.color = color;
	}





	public boolean isRaiz() {
		return raiz;
	}





	public void setRaiz(boolean raiz) {
		this.raiz = raiz;
	}





	public boolean isTallo() {
		return tallo;
	}





	public void setTallo(boolean tallo) {
		this.tallo = tallo;
	}





	public boolean isHojas() {
		return hojas;
	}





	public void setHojas(boolean hojas) {
		this.hojas = hojas;
	}





	@Override
	public String medioVida(String medio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String comunicacion(String expresion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String absorberEnergia(String alimento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String transformarOxigeno(String respiracion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String disminuirMetabolismo(String dormir) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String reproduccion(String reproduccion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String enfermar(String enfermedad) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

	@Override
	public String toString() {
		return "Planta [color=" + color + ", raiz=" + raiz + ", tallo=" + tallo + ", hojas=" + hojas + ", nombre="
				+ nombre + ", genero=" + genero + ", peso=" + peso + ", altura=" + altura + ", edad=" + edad + "]";
	}


	
//---------------------------------------------------------------------------------------------------------------------------



	// Métodos
	public boolean produccionOxigeno(boolean yn) {
		return yn;
	}
	public String floracion(String flor) {
		return flor;
	}
	public String frutar(String fruto) {
		return fruto;
	}
		
		
}
