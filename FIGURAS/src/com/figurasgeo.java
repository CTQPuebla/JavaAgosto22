package com;

public abstract class figurasgeo {

double dato1;
double dato2;
double dato3;
public figurasgeo() {
	
}



public figurasgeo(double dato1, double dato2, double dato3) {
	super();
	this.dato1 = dato1;
	this.dato2 = dato2;
	this.dato3 = dato3;
}



public double getDato1() {
	return dato1;
}



public void setDato1(double dato1) {
	this.dato1 = dato1;
}



public double getDato2() {
	return dato2;
}



public void setDato2(double dato2) {
	this.dato2 = dato2;
}



public double getDato3() {
	return dato3;
}



public void setDato3(double dato3) {
	this.dato3 = dato3;
}



@Override
public String toString() {
	return "figurasgeo [dato1=" + dato1 + ", dato2=" + dato2 + ", dato3=" + dato3 + "]";
}



public abstract void area();
public abstract void perimetro();
public abstract void volumen();



public void area(double dato1, double dato2) {
	// TODO Auto-generated method stub
	
}
public void perimetro(double dato1, double dato2, double dato3) {
	
	
}
public void volumen(double dato1, double dato2, double dato3) {
	// TODO Auto-generated method stub
	
}


}
