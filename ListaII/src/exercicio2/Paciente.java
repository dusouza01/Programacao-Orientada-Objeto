package exercicio2;

public class Paciente {
	//atributos ou viariável de insância
	String nome;
	double altura;
	double peso;
	double quadril;
	int idade;
	

	//metodo para calcular e retornar o IMC
	public double resultadoImc() {
		double imc;
		imc = peso / (altura*altura);
		return imc;
		
	}
	//metodo para retornar o BAI
	public double resultadoBai() {
		double bai;
		bai = (quadril / (altura*Math.sqrt(altura)))-18;
		
		return bai;
		
	}
	//metodo para calcular e retornar a frequência máxima
	public double freqMaxima() {
		return 220-idade;
		
	}
	
	//metodo para calcular e retornar a frequência alvo
	public double[] freqAlvo(){
		double []alvo = new double[2];
		alvo[0]= freqMaxima()*0.5;
		alvo[1]= freqMaxima()*0.85;
		
		return alvo;
		
	}
	
}
	
