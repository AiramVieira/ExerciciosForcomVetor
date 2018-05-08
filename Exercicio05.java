import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {

		int cadastro = Integer.parseInt(JOptionPane.showInputDialog("Quantos"
				+ " cadastros serão feitos?"));
		int[] qtdJogos = new int[cadastro];
		int num = 0;
		String[] nomeJogos = new String[cadastro];
		String nomeValor = "";
		
		for(int i = 0; i < qtdJogos.length; i++){
			num++;
			nomeJogos[i] = JOptionPane.showInputDialog("Digite o nome do "+num+"º jogo");
			qtdJogos[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos jogos do \""+nomeJogos[i]+"\" serão cadastrados"));
			
			nomeValor += "O jogo "+nomeJogos[i]+" tem "+qtdJogos[i]+" em estoques\n";
		}
		JOptionPane.showMessageDialog(null, nomeValor);
	}
}