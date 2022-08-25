package com;
//POJO P:PLAIN OLD JAVA OBJECT
public abstract class Profesionista {

	 String campoTrabajo;
	 String carrera;
	 String nombre;
	 int a�osExperiencia;
	 
	 public Profesionista() {
		 
	 }

	public Profesionista(String campoTrabajo, String carrera, String nombre, int a�osExperiencia) {
		super();
		this.campoTrabajo = campoTrabajo;
		this.carrera = carrera;
		this.nombre = nombre;
		this.a�osExperiencia = a�osExperiencia;
	}

	public String getCampoTrabajo() {
		return campoTrabajo;
	}

	public void setCampoTrabajo(String campoTrabajo) {
		this.campoTrabajo = campoTrabajo;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getA�osExperiencia() {
		return a�osExperiencia;
	}

	public void setA�osExperiencia(int a�osExperiencia) {
		this.a�osExperiencia = a�osExperiencia;
	}

	@Override
	public String toString() {
		return "Profesionista [campoTrabajo=" + campoTrabajo + ", carrera=" + carrera + ", nombre=" + nombre
				+ ", a�osExperiencia=" + a�osExperiencia + "]";
	}
  //COMPORTAMIENTO ABSTRACTO
	public abstract void trabajar ();
	 
}
