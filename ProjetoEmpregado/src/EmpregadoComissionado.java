//extends -> extensao "continuacao" de empregado

public class EmpregadoComissionado extends Empregado {

	double totalDeVendas;
	double comissao;

	@Override
	public String toString() {
		String aux = super.toString();
		aux += "Total de Vendas R$ " + totalDeVendas + "\n";
		aux += "Comissao " + comissao + "\n";
		aux += "Salário " + calcularSalario() + "\n";
		
		return aux;

	}
	
	public double calcularSalario() {
		return totalDeVendas * comissao / 100;
	}

	public EmpregadoComissionado(long matricula, String nome,double totalDeVendas,double comissao) {
		super(matricula, nome);
		this.totalDeVendas=totalDeVendas;
		this.comissao= comissao;

	}

}
