package criandoVetorEmObjeto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		// gerando vetor do tipo Carro!!
		Carro c[] = new Carro[3];
		String marca, modelo;
		double valor;

		// entrada de dados e a geração dos objetos
		for (int i = 0; i < c.length; i++) {
			System.out.print("Marca ->");
			marca = teclado.next();
			System.out.print("Modelo ->");
			modelo = teclado.next();
			System.out.print("Valor R$ ->");
			valor = teclado.nextDouble();
			c[i] = new Carro(marca, modelo, valor);
			System.out.println();
		}

		for (Carro carro : c) {
			System.out.println(carro.getDados());
		}

		// saída de dados --> imprimir os dados de todos os carros

	}

}
