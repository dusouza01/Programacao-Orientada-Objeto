
public class EmpregadoHorista extends Empregado {
	int totalDeHorasTrabalhadas;
	double valorDaHoraTrabalhada;
	
	
	@Override
	public String toString() {
		String aux = super.toString();
		aux+= "Total de horas trabalhadas"+ totalDeHorasTrabalhadas+ "\n";
		aux+= "Valor de horas trabalhadas R$ "+ totalDeHorasTrabalhadas+ "\n";
		return aux;
		
		
		
		
	}
	

}
