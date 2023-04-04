package descobrir;

public class Descobrir {
	//privado so consegue usar dentro da classe
	private int numeroSecreto;
	private int numeroDeTentativas;
	
	
	public Descobrir() {
		numeroSecreto=(int)(Math.random() * 1001);
		numeroDeTentativas=0;
		
	}
	
	public String chutar(int numChut) {

		numeroDeTentativas++;
		if (numChut ==numeroSecreto) {
			return "ACERTOU";
		}else if (numChut>numeroSecreto) {
			return "ACIMA";
			
		}
		return "ABAIXO";
			
		
	}
	//metodo para descobrir o valor
	public int getNumeroSecreto() {
		return numeroSecreto;
		
	}

	public int getNumeroDeTentativas() {
		return numeroDeTentativas;
	}
}

