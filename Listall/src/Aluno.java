
public class Aluno {

	// atributos ou propriedades ou variáveis de instância
	String nome;
	int rm;
	double nota1;
	double nota2;
	
	// método para calcular e retornar a média do aluno
	public double calcularMedia() {
		double media;
		media = (nota1 + nota2) / 2;
		return media;
	}
}