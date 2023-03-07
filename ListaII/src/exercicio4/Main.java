package exercicio4;

import java.util.Scanner;

public class Main {
	// se nao usar o static,Livro vira atributo do objeto Main
	static Scanner teclado = new Scanner(System.in);
	static Livro livro = new Livro();

	public static void main(String[] args) {

		int opcao;
		do {
			System.out.println(gerarMenu());
			opcao = teclado.nextInt();
			if (opcao < 1 || opcao > 5) {
				System.out.println("Opção inválida");
			} else {
				if (opcao == 1) {
					cadastrar();
				} else if (opcao == 2) {
					pesquisar();
				} else if (opcao == 3) {
					emprestar();
				} else if (opcao == 4) {
					devolver();
				}
			}
			System.out.println("--------------");
		} while (opcao != 5);

		teclado.close();
	}

	public static void devolver() {
		livro.devolver();

	}

	public static void emprestar() {
		livro.emprestar();

	}

	public static void pesquisar() {
		System.out.println(livro.getDados());

	}

	public static void cadastrar() {
		System.out.print("ID -->");
		livro.id = teclado.nextInt();
		teclado.nextLine();
		System.out.print("Título -->");
		livro.titulo = teclado.nextLine();
		System.out.print("Autor -->");
		livro.autor = teclado.nextLine();
		System.out.println("-------------");
		// para o livro comecar disponivel, a variável boolean é inicializada em false
		livro.disponivel = true;
	}

	public static String gerarMenu() {
		String aux = "Escolha uma opção\n";
		aux += "1. Cadastrar\n";
		aux += "2. Pesquisar\n";
		aux += "3. Emprestar\n";
		aux += "4. Devolver\n";
		aux += "5. Finalizar\n";
		return aux;
	}

}
