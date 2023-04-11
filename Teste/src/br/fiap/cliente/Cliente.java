package br.fiap.cliente;

public class Cliente {
	private int cnpj;
	private String cliente;

	public Cliente(int cnpj, String nome_cliente) {
		super();
		this.cnpj = cnpj;
		this.cliente = cliente;
	}
	
	public String getDados() {
		String aux="";
		aux+="CNPJ: "+ cnpj+"\n";
		aux+="Nome da Empresa do Cliente: " + cliente;
		return aux;
		
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome_cliente() {
		return cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.cliente = nome_cliente;
	}

}
