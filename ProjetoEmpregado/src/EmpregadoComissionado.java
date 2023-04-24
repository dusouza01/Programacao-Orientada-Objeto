//extends -> extensao "continuacao" de empregado

public class EmpregadoComissionado extends Empregado {
	
	double totalDeVendas;
	double comissao;
	
	@Override
	public String toString() {
		String aux = super.toString();
		aux += "Total de Vendas R$ " + totalDeVendas + "\n";
		aux += "Comissao " + comissao + "\n";
		return aux;
		
		
		
	}

}
