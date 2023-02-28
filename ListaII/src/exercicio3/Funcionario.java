package exercicio3;

public class Funcionario {
	int id;
	String nome;
	double salario;

	// metodo para retornar o salario líquido

	public double salarioLiquido(double desconto) {
		double sl;
		sl = salario - salario * desconto / 100;
		return sl;
	}

	// metodo para aumentar o salário do funcionario
	public void aumentarSalario(double aumento) {
		salario += salario * aumento / 100;

	}

	// metodo para retornar os dadods do funciário
	// String aceita todo o tipo de dado Ex:String,int,double,float e etc...

	public String getDados() {
		String aux = "";
		aux += "ID: " + id + "\n";
		aux += "Nome: " + nome + "\n";
		aux += "Salário: R$ " + String.format("%.2f", salario) + "\n";

		return aux;
	}

}