package exemplo1;

public class Exemplo2 {

	
	public static void main(String[] args) {
		int total;
		
		
		total=somar(2,3);
		System.out.println("total = "+total);
		
		
		
		total=somar(2,3,1);
		System.out.println("total = "+total);
		
		total=somar(2,3,1,2,3,4);
		System.out.println("total = "+total);
	}
	public static int somar(int ...x) {
		int total=0;
		// i nesse for -> controla a variavel internamente
		for(int i : x) {
			total+= i;
			
		}
		return total;
		
	}

}
