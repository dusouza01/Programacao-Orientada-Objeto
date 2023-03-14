package exercicio3;

public class Main {

	public static void main(String[] args) {
		// new(cria o objeto na memoria) Funcionario() --> Método construtor, copia os
		// atributos para dentro do objeto

		Funcionario f = new Funcionario(120, "Agesandro", 1000);

		System.out.println(f.getDados());

		f.aumentarSalario(50);

		System.out.println(f.getDados());

	}

}
