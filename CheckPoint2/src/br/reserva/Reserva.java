package br.reserva;

import br.aluno.Aluno;
import br.livro.Livro;

public class Reserva {
	private Aluno aluno;
	private Livro livro;
	private String data;
	
	public String getDados() {
		String aux = "";
		aux+="Nome: " + aluno.getNome() + "\n";
		aux+="Título: " + livro.getTitulo()+ "\n";
		aux+="Data da reserva:" + getData()+ "\n";
		System.out.println();
		return aux;
	}
	
	
	public Reserva(Aluno aluno, Livro livro, String data) {
		this.aluno = aluno;
		this.livro = livro;
	}


	public Aluno getAluno() {
		return aluno;
	}


	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}


	public Livro getLivro() {
		return livro;
	}


	public void setLivro(Livro livro) {
		this.livro = livro;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public Reserva(Aluno aluno, Livro livro) {
		this.aluno = aluno;
		this.livro = livro;
		this.data = "24/04/2023";
	}
	
	
	
	

}
