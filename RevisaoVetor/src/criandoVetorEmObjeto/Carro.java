package criandoVetorEmObjeto;

public class Carro {
	String marca;
	String modelo;
	double valor;

	public Carro(String marca, String modelo, double valor) {
		// o atributo do objeto vai receber o valor da variavel
		this.marca = marca;
		this.modelo = modelo;
		this.valor = valor;

	}

	public String getDados() {
		return marca + "\n" + modelo + "\n" + valor + "\n";

	}

}
