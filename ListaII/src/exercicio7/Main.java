package exercicio7;

public class Main {

	public static void main(String[] args) {
	
		Produto p1=new Produto("camiseta java",1500);
		Produto p2=new Produto("camiseta python", 50);
		Produto p3=new Produto("camiseta C#", 70);
		
		//metodo sendo chamado pelo nome da classe é--> static
		
		System.out.println(Produto.total);
		
		
		
	}

}
