package exercicio17;

public class Ponto {
	int x ,y;
	
	//construtor
	public Ponto(int x , int y) {
		this.x=x;
		this.y=y;
	}
	//método para retornar os dados do ponto
	
	public String getDados() {
		return "("+ x +","+ y +")";
	}
	
	
	//método para calcular e retornar a distancia 
	public double calcularDistancia(Ponto p) {
		double distancia;
		distancia=Math.sqrt(Math.pow(x -p.x ,2 ) + Math.pow(y - p.y, 2));
		return distancia;
		
	}

}
