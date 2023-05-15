
public class EmpregadoHorista extends Empregado {

	int totalDeHorasTrabalhadas;
	double valorDaHoraTrabalhada;

	@Override
	public String toString() {
		String aux = super.toString();
		aux += "Total de horas trabalhadas" + totalDeHorasTrabalhadas + "\n";
		aux += "Valor de horas trabalhadas R$ " + valorDaHoraTrabalhada + "\n";
		aux += "Salário R$ " + calcularSalario() + "\n";

		return aux;

	}

	public double calcularSalario() {
		return totalDeHorasTrabalhadas * valorDaHoraTrabalhada;

	}

	public EmpregadoHorista(long matricula, String nome, int totalDeHorasTrabalhadas, double valorDaHoraTrabalhada) {
		super(matricula, nome);
		this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
		this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
	}

}
