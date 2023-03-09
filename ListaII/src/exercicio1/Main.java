package exercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Aluno a = new Aluno();
		System.out.print("Nome -->");
		a.nome = teclado.nextLine();
		System.out.print("RM -->");
		a.rm = teclado.nextInt();
		System.out.print("N1 -->");
		a.n1 = teclado.nextDouble();
		System.out.print("N2 -->");
		a.n2 = teclado.nextDouble();
		
		System.out.println("Média");
		System.out.println(a.media());

	}

}
