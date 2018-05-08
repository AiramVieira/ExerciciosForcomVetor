import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {

		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite"
				+ "a quantidade de preços que quer cadastrar"));
		double[] qtdPrecos = new double[quantidade];
	    double precoTotal = 0;
	    int num = 0;
	    String preco = "";
	    
	    for(int i = 0; i < qtdPrecos.length; i++){
	    	num++;   	
	    	qtdPrecos[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+num+"º valor"));    	
	    	precoTotal += qtdPrecos[i];
	    	preco += "O "+num+"º preço digitado foi: "+qtdPrecos[i]+"\n";
	    }    
	    	JOptionPane.showMessageDialog(null, preco+
	    		"\nO valor total é: "+precoTotal);
	}
}