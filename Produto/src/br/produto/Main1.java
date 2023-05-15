package br.produto;

import java.util.ArrayList;

public class Main1 {

	public static void main(String[] args) {
		
		ArrayList<Produto> lista = new ArrayList<>();
		
//		inserindo objetos na lista
		lista.add(new Produto(1, "arroz", 10));
		lista.add(new Produto(2, "feijao", 10));
		lista.add(new Produto(3, "pedra", 10));
		
//		impressao dos dados usando o for tradicional
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
			
		}
		
		System.out.println();
		
		//impressao dos dados usando o foreach
		for(Produto p : lista) {
			System.out.println(p.toString());
		}
		
		
		
	}

}
