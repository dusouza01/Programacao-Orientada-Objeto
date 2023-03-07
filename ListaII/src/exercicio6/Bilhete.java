package exercicio6;

public class Bilhete {
	// atributos ou propriedades ou variáveis de instância
	int id;
	String nome_usuario;
	double saldo;
	// "static" serve para mostrar que essa viarivel nao esta dentro do objeto, para que seja uma variavel que tenha o mesmo valor para todos!!
	static double tarifa=4.4;

	// metodo para consultar o saldo

	public double getSaldo() {
		return saldo;

	}

	// método para recarregar o bilhete
	public void carregar(double valor) {
		saldo+=valor;

	}
	//método para passar na catraca
	public void passarCatraca() {
		saldo-=tarifa;
		
	}
	//método para atualizar a tarifa base do metro
	//static casa com static, como eu celarei a tarifa static, o metodo tem que ser static
	public static void attTarifa(double porcentagem) {
		tarifa = tarifa + tarifa * porcentagem /100;
	}

}
