import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
 
		Scanner teclado = new Scanner(System.in);
		int[] idades = new int[3];
		int num = 0;
		String nome = "";
		
		for(int i = 0; i < idades.length; i++){
			num++;
			System.out.println("Digite a "+num+"ª idade");
			nome += teclado.nextLine();
		}
	}
}