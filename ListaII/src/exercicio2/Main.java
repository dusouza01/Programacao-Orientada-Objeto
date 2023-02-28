package exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Paciente p1 = new Paciente();
		System.out.print("Nome do Paciente--> ");
		p1.nome = teclado.next();
		System.out.print("Altura--> ");
		p1.altura = teclado.nextDouble();
		System.out.print("Peso (em kgs) --> ");
		p1.peso = teclado.nextDouble();
		System.out.print("Quadril (em cm)--> ");
		p1.quadril = teclado.nextDouble();
		System.out.print("Idade--> ");
		p1.idade = teclado.nextInt();
		
		System.out.println("IMC = "+ String.format("%.2f", p1.resultadoImc()));
		System.out.println("BAI = "+ String.format("%.2f", p1.resultadoBai()));
		
		System.out.println("Freq. Máxima = " + String.format("%.2f", p1.freqMaxima()));
		
		double[] alvo = p1.freqAlvo();
		
		System.out.print("Início do intervalo = "+ String.format("%.2f", alvo[0]));
		System.out.print("Fim do intervalo = " + String.format("%.2f", alvo[1]));
		
	}

}
