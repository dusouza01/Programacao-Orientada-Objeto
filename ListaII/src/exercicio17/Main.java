package exercicio17;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random gerador= new Random();
		
		Ponto origem = new Ponto(0,0);
		
		Ponto[] ponto= new Ponto [gerador.nextInt(2, 10)];
		
		for (int i = 0; i < ponto.length; i++) {
			ponto[i] = new Ponto(gerador.nextInt(10), gerador.nextInt(10));
			System.out.println(ponto[i].getDados());
			System.out.println("Distancia = "+ ponto[i].calcularDistancia(origem));
			System.out.println();
			
		}
		
		
	
		
		
	}

}
