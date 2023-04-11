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
	
	//metodo para reservar uma carga no navio
	public boolean reservar(Carga carga) {
		if(permitidoReservar(carga.getPeso())) {
			this.carga[index] = carga;
			index ++;
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
	
	//metodo para verificar se é possivel fazer a reserva
	public boolean permitidoReservar(double peso) {
		if(index < carga.length && capacidadeReservada()+peso <=capacidade ) {
			return true;
		}
		return false;
		
		

	}

}
