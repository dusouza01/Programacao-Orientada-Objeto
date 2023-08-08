package exercicio.main;

import exercicio.conta.ContaBancaria;
import exercicio.excecao.ContaExcecao;

public class Main {

	public static void main(String[] args) {

		ContaBancaria cb = new ContaBancaria(700, 1000);
		try {
			//cb.sacar(2000);
			cb.depositar(5000);
		} catch (ContaExcecao e) {
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			System.out.println(e);
		}
		finally {
			System.out.println("estou no finally");
		}

	}

}
