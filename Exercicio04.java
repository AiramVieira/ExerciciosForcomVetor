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
			tamanho = JOptionPane.showInputDialog("Digite o tamanho da "+num+"� camisa"
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
		JOptionPane.showMessageDialog(null, "A quantidade de camisas do tamanho PP �: "+tamanhoPP+
											"\nA quantidade de camisas do tamanho P �: "+tamanhoP+
											"\nA quantidade de camisas do tamanho M �: "+tamanhoM+
											"\nA quantidade de camisas do tamanho G �: "+tamanhoG+
											"\nA quantidade de camisas do tamanho GG �: "+tamanhoGG+
											"\nA quantidade de camisas do tamanho XG �: "+tamanhoXG+
											"\nA quantidade de camisas do tamanho XGG �: "+tamanhoXGG);
	}
}
