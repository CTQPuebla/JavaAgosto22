package com;

public class Principal {
public static void main(String[] args) {
	figurasgeo p = new cuadrado();
	p.area(3, 2);
	p.volumen(5, 6, 4);
	p.perimetro(3,2, 4);
	figurasgeo g = new triangulo();
	g.area(3, 2);
	g.volumen(5, 6, 4);
	g.perimetro(3,2, 4);
	figurasgeo x = new circulo();
	x.area(3, 2);
	x.volumen(5, 6, 4);
	x.perimetro(3,2, 4);
}
}
