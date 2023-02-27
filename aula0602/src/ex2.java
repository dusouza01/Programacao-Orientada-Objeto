import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int i,cont;
		int j;
		int maior = 0;
		int n;
		
		System.out.print("Informe o valor de i ->");
		i = teclado.nextInt();
		System.out.print("Informe o valor de j ->");
		j = teclado.nextInt();
		
		for(; i<=j;i++) {
			n=i;
			cont=0;
			
			while(true) {
				cont++;
				if(n==1) {
					break;
				}
				if(n % 2 != 0) {
					n = 3 * n+1;
					
				}else {
					n = n /2;
				}
			}
			if(cont>maior) {
				maior=cont;
	}
			
		}
		System.out.println(maior);
		teclado.close();
		
	}

}
