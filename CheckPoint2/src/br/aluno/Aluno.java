package br.aluno;

public class Aluno {
	private int rm;
	private String nome;
	
	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Aluno(int rm, String nome) {
		this.rm = rm;
		this.nome = nome;
	}
	
	

}
