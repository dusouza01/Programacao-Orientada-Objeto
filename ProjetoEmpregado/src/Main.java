
public class Main {

	public static void main(String[] args) {
		
		
		Empregado[] empregado = new Empregado[3];
		
		
		empregado[0] = new EmpregadoComissionado(94251, "Eduardo", 86, 227);
		empregado[1] = new EmpregadoHorista(93220, "Lucas", 20, 50);
		empregado[2] = new EmpregadoComissionado(7777, "Osvaldo", 65, 376);
		
		for(Empregado e : empregado) {
			System.out.println(e.toString());
		}
	}

}
