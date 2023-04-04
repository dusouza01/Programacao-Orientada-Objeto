package main;

import java.util.Scanner;

import descobrir.*;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Descobrir d = new Descobrir();
		int numero;
		String msg;
		
		System.out.println("Númeor secreto é = "+d.getNumeroSecreto());
		
		do{
			System.out.println("Qual seu chute ??");
			numero = teclado.nextInt();
			msg = d.chutar(numero);
			System.out.println(msg);
	
			
		}while(!msg.equals("ACERTOU"));
		
		System.out.println("Número de tentativas: "+ d.getNumeroDeTentativas());
		
		

	}

}
