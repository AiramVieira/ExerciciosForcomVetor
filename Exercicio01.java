import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String[] nomes = new String[5];
		int num = 0;
		for(int i = 0; i < nomes.length; i++){
			num++;
			System.out.print(num+"º nome: ");
			nomes[i] = teclado.nextLine();
		}
	}
}