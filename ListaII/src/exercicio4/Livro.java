package exercicio4;

public class Livro {

	int id;
	String titulo;
	String autor;
	// boolen é sempre inicalizado em false
	boolean disponivel;

	// metodo para simular o empréstimo do livro

	public void emprestar() {
		if (disponivel == true) {
			disponivel = false;
		}
	}

	// método para simular a devoluçao do livro
	public void devolver() {
		if (disponivel == false) {
			disponivel = true;
		}
	}
	// método para retornar os dados do livro
	public String getDados() {
		return id + "\n" + titulo + "\n" + autor + "\n" + disponivel;
		
	}

}
