// abstract -> calsse que nao pode gerar objetos, nesse caso pq o emprega é superclasse

public abstract class Empregado {
	long matricula;
	String nome;
	
	@Override
	public String toString() {
		String aux = "";
		aux +="Nome: " + nome + "\n";
		aux +="Matrícula: " + matricula + "\n";
		return aux;
	}

	public Empregado(long matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}
	
	
	

}
