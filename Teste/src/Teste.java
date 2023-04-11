import javax.swing.JOptionPane;

public class Teste {
	public static void main(String[] args) {

		String nome;
		int idade;
		double media;

//		nome = JOptionPane.showInputDialog("Inserir nome: ");
//		JOptionPane.showMessageDialog(null, "Boa Noite Senhor "+nome);

		// idade=Integer.parseInt(JOptionPane.showInputDialog("Idade"));
		
		media = Double.parseDouble(JOptionPane.showInputDialog("Média Aluno: "));
		JOptionPane.showMessageDialog(null, media);
		
		
		// janela grafica
		// JOptionPane.showMessageDialog(null, "Aula Java");

	}

}
