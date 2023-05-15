package br.fiap.main;

import br.fiap.cilindro.Cilindro;
import br.fiap.circulo.Circulo;
import br.fiap.forma.Forma;
import br.fiap.volume.Volume;

public class Main {

	public static void main(String[] args) {

		Forma [] forma = new Forma [4];
		
		//gerar 4 objetos
		
		//Quando eu coloco a forma no vetor, ela vira do tipo Forma
		forma[0] = new Circulo(1, 1, 1);
		forma[1] = new Cilindro(2, 2, 2, 2);
		forma[2] = new Circulo(3, 3, 3);
		forma[3] = new Cilindro(4, 4, 4, 4);
		
		//impressao dos dados dos objetos
		
		//Forma -> tipo ,,, f-> variavel,,,, forma -> vetor
		for(Forma f : forma) {
			System.out.println(f); // f.toString()
			
		}
		//impressao do valor da área de cada objeto
		System.out.println();
		
		for (Forma f : forma) {
			//instanceof --> instance de... nesse caso é uma instancia de Círculo
			if(f instanceof Circulo) {
				System.out.println("Circulo --> area= " + String.format("%.2f",f.calcularArea()));
			}else {
				System.out.println("Cilindro --> area= " + String.format("%.2f",f.calcularArea()));
			}
			
		}
		
		//impressao do valor do volume de cada objeto
		System.out.println();
		
		//Cilindro aux;
		// retornar para que o Cilindro seja do tipo Cilindro, quando estava no vetor estava no tipo Forma, to retransformando o Forma e Cilindro
//		for(Forma f : forma) {
//			if(f instanceof Cilindro) {
//				aux = (Cilindro)f;
//				System.out.println("volume --> "+ aux.calcularVolume());
//			}
//		}
		
		Volume aux;
		for(Forma f : forma) {
			if(f instanceof Volume) {
				aux = (Volume)f;
				System.out.println("volume --> " + aux.calcularVolume());
			}
		}
		

	}

}
