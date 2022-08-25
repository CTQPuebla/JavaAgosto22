package com;
//POJO P:PLAIN OLD JAVA OBJECT
public abstract class Profesionista {

	 String campoTrabajo;
	 String carrera;
	 String nombre;
	 int añosExperiencia;
	 
	 public Profesionista() {
		 
	 }

	public Profesionista(String campoTrabajo, String carrera, String nombre, int añosExperiencia) {
		super();
		this.campoTrabajo = campoTrabajo;
		this.carrera = carrera;
		this.nombre = nombre;
		this.añosExperiencia = añosExperiencia;
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

	public int getAñosExperiencia() {
		return añosExperiencia;
	}

	public void setAñosExperiencia(int añosExperiencia) {
		this.añosExperiencia = añosExperiencia;
	}

	@Override
	public String toString() {
		return "Profesionista [campoTrabajo=" + campoTrabajo + ", carrera=" + carrera + ", nombre=" + nombre
				+ ", añosExperiencia=" + añosExperiencia + "]";
	}
  //COMPORTAMIENTO ABSTRACTO
	public abstract void trabajar ();
	 
}
