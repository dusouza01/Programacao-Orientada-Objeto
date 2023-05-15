package br.main;

import java.util.Scanner;

import br.reserva.*;
import br.livro.*;
import br.aluno.*;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Reserva reservas[] = new Reserva[3];

		int i = 0;

		do {
			System.out.println("Entre com os dados da reserva"+(i+1)+":");
			System.out.print("Nome do Aluno#" + (i + 1) + " ");
			String nome = teclado.nextLine();
			System.out.print("RM:");
			int rm = teclado.nextInt();
			String tituloLivro = teclado.nextLine();
	    	System.out.print("Autor livro: ");
	    	String autorLivro = teclado.nextLine();

			Aluno aluno = new Aluno(rm, nome);
			Livro livro = new Livro(tituloLivro, autorLivro);
			Reserva reserva = new Reserva(aluno, livro);
			reservas[i]=reserva;
			i++;

		} while (i < reservas.length);
		
		for(Reserva r :reservas) {
			System.out.println(r.getDados());
		}

	}

}
