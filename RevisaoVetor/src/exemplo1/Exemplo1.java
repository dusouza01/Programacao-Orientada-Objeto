package exemplo1;

public class Exemplo1 {

	public static void main(String[] args) {
		int[] x = { 1, 2, 3 };
		String[] y = { "amora", "caqui", "pilha" };
		double[] z = { 0.25, 1.33, 5.09 };

		imprimir(x);
		imprimir(y);
		imprimir(z);
	}
	//z.lenght--> .lenght é o atributo. Se tivesse .lenght() -> seria um método
	private static void imprimir(double[] z) {
		System.out.println();
		// : ->associado
		for(double i : z) {
			System.out.print(i + "\t");
			
		}
	}

	private static void imprimir(String[] y) {
		System.out.println();
		for (String i : y) {
			System.out.print(i + "\t");
			
		}
	}

	private static void imprimir(int[] x) {
		for (int i : x) {
			System.out.print(i + "\t");
		}
		
	}

	

}
