package br.produto;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


public class Main2 {

	public static void main(String[] args) {
		
		int x , y;
		double res;
		
		x = parseInt(showInputDialog("Primeiro valor"));
		y = parseInt(showInputDialog("Segundo valor"));
		
		res = (double) x / y;
		showMessageDialog(null, res);
		

	}

}
