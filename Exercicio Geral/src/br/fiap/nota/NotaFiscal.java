package br.fiap.nota;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import br.fiap.produto.ItemProduto;

public class NotaFiscal {
	private int numero;
	private String cliente;
	private List<ItemProduto> lista;

	public NotaFiscal(String cliente) {
		this.cliente = cliente;
		this.numero = gerarNumero();
		// instanciar uma das filhas
		this.lista = new ArrayList<>();
	}

	private int gerarNumero() {
		Random gerador = new Random();
		return gerador.nextInt(1000, 9999);
	}

	public void inserirItemProduto(ItemProduto item) {
		lista.add(item);

	}

	public double calcularTotal() {
		double total = 0;
		for (ItemProduto item : lista) {
			total += item.getQuantidade() * item.getProduto().getPreco();

		}

		System.out.print("Valor total-> ");
		return total;
	}

	public String getCliente() {
		return cliente;
	}

}
