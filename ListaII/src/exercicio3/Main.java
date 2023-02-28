package exercicio3;

public class Main {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		f.nome="Eduardo";
		f.id = 120;
		f.salario=1000.00;
		
		System.out.println(f.getDados());
		
		f.aumentarSalario(50);
		
		System.out.println(f.getDados());
		
		
	}

}
