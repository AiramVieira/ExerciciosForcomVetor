import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		
		int[] qtdCamisa = new int[4];
		int num = 0;
		String tamanho = "";
		int tamanhoPP = 0;
		int tamanhoP = 0;
		int tamanhoM = 0;
		int tamanhoG = 0;
		int tamanhoGG = 0;
		int tamanhoXG = 0;
		int tamanhoXGG = 0;
			
		for(int i = 0; i < qtdCamisa.length; i++){
			num++;
			tamanho = JOptionPane.showInputDialog("Digite o tamanho da "+num+"ª camisa"
					+ "\n(Apenas \"PP\", \"P\",\"M\", \"G\", \"GG\",\"CG\",\"XGG\")");
			
			if(tamanho.equalsIgnoreCase("PP")){
				tamanhoPP++;
			}else if(tamanho.equalsIgnoreCase("P")){
				tamanhoP++;
			}else if(tamanho.equalsIgnoreCase("M")){
				tamanhoM++;
			}else if(tamanho.equalsIgnoreCase("G")){
				tamanhoG++;
			}else if(tamanho.equalsIgnoreCase("GG")){
				tamanhoGG++;
			}else if(tamanho.equalsIgnoreCase("XG")){
				tamanhoXG++;
			}else if(tamanho.equalsIgnoreCase("XGG")){
				tamanhoXGG++;
			}
		}
		JOptionPane.showMessageDialog(null, "A quantidade de camisas do tamanho PP é: "+tamanhoPP+
											"\nA quantidade de camisas do tamanho P é: "+tamanhoP+
											"\nA quantidade de camisas do tamanho M é: "+tamanhoM+
											"\nA quantidade de camisas do tamanho G é: "+tamanhoG+
											"\nA quantidade de camisas do tamanho GG é: "+tamanhoGG+
											"\nA quantidade de camisas do tamanho XG é: "+tamanhoXG+
											"\nA quantidade de camisas do tamanho XGG é: "+tamanhoXGG);
	}
}
