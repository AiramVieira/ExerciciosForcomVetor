import java.util.Random;

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {

		Random random = new Random();
		int[] numeros = new int[10];
		int soma = 0;
		double media = 0;
		int numPar = 0;
		int positivo = 0;
		int numImpar = 0;
		int negativo = 0;
		int numNeutro = 0;
		String text = "";

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(30)-15;
			soma += numeros[i];
			media = soma / numeros.length;

			if (numeros[i] % 2 == 0) {
				numPar++;
			} else {
				numImpar++;
			}
			if (numeros[i] > 0) {
				positivo++;
			} else if (numeros[i] == 0) {
				numNeutro++;
			} else {
				negativo++;
			}
			text += "N�meros armazenados: " + numeros[i]+"\n";
		}
		JOptionPane.showMessageDialog(null,text + 
										   "\nA somat�ria final dos n�meros: " + soma + 
										   "\nA m�dia dos n�meros: " + media +
										   "\nQuantidade de n�meros pares: " + numPar + 
										   "\nQuantidade de n�meros positivos; " + positivo +
										   "\nQuantidade de n�meros �mpares: " + numImpar + 
										   "\nQuantidade de n�meros negativos: " + negativo + 
										   "\nQuantidade de n�meros neutros: " + numNeutro);
	}
}
