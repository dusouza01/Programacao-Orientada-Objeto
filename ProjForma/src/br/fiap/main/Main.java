package br.fiap.main;

import br.fiap.cilindro.Cilindro;
import br.fiap.circulo.Circulo;
import br.fiap.forma.Forma;

public class Main {

	public static void main(String[] args) {

		Forma [] forma = new Forma [4];
		
		//gerar 4 objetos
		
		forma[0] = new Circulo(1, 1, 1);
		forma[1] = new Cilindro(2, 2, 2, 2);
		forma[2] = new Circulo(3, 3, 3);
		forma[3] = new Cilindro(4, 4, 4, 4);
		
		//impressao dos dados dos objetos
		
		//Forma -> tipo ,,, f-> variavel,,,, forma -> vetor
		for(Forma f : forma) {
			System.out.println(f); // f.toString()
			
		}
		

	}

}
