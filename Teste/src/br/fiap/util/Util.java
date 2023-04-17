package br.fiap.util;

//ou coloca o nome do método ou o *

import static javax.swing.JOptionPane.*;

import br.fiap.carga.Carga;
import br.fiap.cliente.Cliente;
import br.fiap.viagem.Viagem;

import static java.lang.Integer.*;

public class Util {

	private Viagem viagem = new Viagem();

	public void menu() {
		int opcao;
		// se o import nao for static, tem que colocar o Integer na frente do parseInt
		do {
			opcao = parseInt(showInputDialog(gerarMenu()));
			if (opcao < 1 || opcao > 6) {
				showMessageDialog(null, "Opção inválida");

			} else {
				switch (opcao) {
				case 1:
					reservar();
					break;

				case 3:
					visualizar();
					break;

				}
			}

		} while (opcao != 6);

	}

	private void visualizar() {
		showMessageDialog(null, viagem.getDados());

	}

	private void reservar() {
		String destino, nomeCliente;
		int cnpj;

		// toda janela grafica entra como string, estou transformando para int

		cnpj = parseInt(showInputDialog("CNPJ"));
		nomeCliente = showInputDialog("Cliente");
		destino = showInputDialog("Destino");

		Cliente cliente = new Cliente(cnpj, nomeCliente);
		Carga carga = new Carga(destino, cliente);

		if (viagem.reservar(carga)) {
			showMessageDialog(null, "Carga reservada com sucesso");
		} else {
			showMessageDialog(null, "Chame o administrador");
		}
	}

	private String gerarMenu() {
		String aux = "Sistema de Reserva\n";
		aux += "1.Realizar reserva\n";
		aux += "2.Pesquisar reserva\n";
		aux += "3.Visualizar reservas\n";
		aux += "4.Capacidade reservada\n";
		aux += "5.Cancelar Reserva\n";
		aux += "6.Encerrar programa\n";
		return aux;
	}

}
