package br.livro;

public class Livro {
	private String autor;
	private String titulo;
	private boolean disponivel;
	
	
	public Livro(String autor, String titulo) {
		this.autor = autor;
		this.titulo = titulo;
		this.disponivel=false;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public boolean isDisponivel() {
		return disponivel;
	}


	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	

}
