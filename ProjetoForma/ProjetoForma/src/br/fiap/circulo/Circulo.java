package br.fiap.circulo;

import br.fiap.forma.Forma;

public class Circulo extends Forma {

	public Circulo(int cx, int cy, double raio) {
		super(cx, cy, raio);		
	}

	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(raio, 2);
	}

	@Override
	public String toString() {
		return "Circulo [cx=" + cx + ", cy=" + cy + ", raio=" + raio + "]";
	}	

}
