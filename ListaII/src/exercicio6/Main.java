package exercicio6;



public class Main {

	public static void main(String[] args) {
		

		Bilhete b = new Bilhete();
		b.carregar(1000);
		
		System.out.println(b.getSaldo());
		
		b.passarCatraca();
		b.passarCatraca();
		System.out.println(b.getSaldo());
		
		Bilhete.attTarifa(10);
		b.passarCatraca();
		b.passarCatraca();
		
		System.out.println(b.getSaldo());
		
		//Bilhete.tarifa---> Todos tem a mesma tarifa do metro// Tem que ser feito pelo Bilhete(Construtor)
		//System.out.println(Bilhete.tarifa);
		
		
		


	}

}
