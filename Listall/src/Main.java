import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		// criação do objeto aluno 1
		Aluno a1 = new Aluno();
		System.out.print("Nome --> ");
		a1.nome = teclado.nextLine();
		System.out.print("RM --> ");
		a1.rm = teclado.nextInt();
		System.out.print("Nota 1 --> ");
		a1.nota1 = teclado.nextDouble();
		System.out.print("Nota 2 --> ");
		a1.nota2 = teclado.nextDouble();
		
		System.out.println("Nome do aluno --> " + a1.nome);
		System.out.println("Média do aluno --> " + a1.calcularMedia());
		

	}
}
