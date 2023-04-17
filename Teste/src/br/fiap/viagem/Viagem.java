package br.fiap.viagem;

import br.fiap.carga.Carga;

public class Viagem {
	private double capacidade;
	private int index;
	private Carga[] carga;

	public Viagem() {
		this.capacidade = 10000;
		this.index = 0;
		this.carga = new Carga[20];

	}

	// metodo para reservar uma carga no navio
	public boolean reservar(Carga carga) {
		if (permitidoReservar(carga.getPeso())) {
			this.carga[index] = carga;
			index++;
			return true;

		}
		return false;
	}

	// metodo para retornar a capacidade reservada

	public double capacidadeReservada() {
		double total = 0;
		for (int i = 0; i < index; index++) {
			total += carga[i].getPeso();

		}
		return total;

	}

	// metodo para verificar se é possivel fazer a reserva
	public boolean permitidoReservar(double peso) {
		if (index < carga.length && capacidadeReservada() + peso <= capacidade) {
			return true;
		}
		return false;

	}
	// método para retornar os dados de todas as cargas reservadas

	public String getDados() {
		String aux = "";
		for (int i = 0; i < index; i++) {
			aux += carga[i].getDados() + "\n";

		}
		return aux;
	}
	//método para pesquisar uma carga pelo CNPJ
	//tem relacao com o método cancelar
	//vai retornar o índice do vetor
	public int pesquisar(int cnpj) {
		int aux = -1;
		for(int i =0; i< index;i++) {
			if(carga[i].getCliente().getCnpj() == cnpj) {
				aux = i;
			}
		}
		return aux;
		
	}

}
