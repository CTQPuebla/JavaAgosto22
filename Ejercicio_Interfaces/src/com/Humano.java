package com;

public class Humano extends SerVivo implements IAnimalesHumanos{
	
	boolean concienciaPropia;
	boolean hablar;
	boolean moral;
	int numExtremidades;
	String nacionalidad;
	
	
	public Humano() {
		
	}

	
	
	

	public boolean isConcienciaPropia() {
		return concienciaPropia;
	}





	public void setConcienciaPropia(boolean concienciaPropia) {
		this.concienciaPropia = concienciaPropia;
	}





	public boolean isHablar() {
		return hablar;
	}





	public void setHablar(boolean hablar) {
		this.hablar = hablar;
	}





	public boolean isMoral() {
		return moral;
	}





	public void setMoral(boolean moral) {
		this.moral = moral;
	}





	public int getNumExtremidades() {
		return numExtremidades;
	}





	public void setNumExtremidades(int numExtremidades) {
		this.numExtremidades = numExtremidades;
	}





	public String getNacionalidad() {
		return nacionalidad;
	}





	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
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
	public String toString() {
		return "Humano [concienciaPropia=" + concienciaPropia + ", hablar=" + hablar + ", moral=" + moral
				+ ", numExtremidades=" + numExtremidades + ", nacionalidad=" + nacionalidad + ", nombre=" + nombre
				+ ", genero=" + genero + ", peso=" + peso + ", altura=" + altura + ", edad=" + edad + "]";
	}



//-------------------------------------------------------------------------------------------------------------------------


	//Métodos
	public String lenguaje(String metodo) {
		return metodo;
	}

	public String idioma(String idioma) {
		return idioma;
	}
	
	public String estadoCivil(String estado) {
		return estado;
	}
	
	public boolean trabajo(boolean yn) {
		return yn;
	}

	
}
