import java.util.Scanner;
public class TrabalhoOng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double doacaobrl;
		double taxausd;
		double doacaousd;
		
		Scanner doacao = new Scanner(System.in);
		Scanner taxa = new Scanner(System.in);
		System.out.println("Sistema para convers�o dos valores em D�lares para Real");
		System.out.println("Digite o valor da doa��o em D�lar");
		doacaousd = doacao.nextDouble();
		System.out.println("Digite a taxa de convers�o BRL/USD");
		taxausd = taxa.nextDouble();
		doacaobrl = doacaousd * taxausd;
		System.out.println("O valor da doa��o em Real �: " + doacaobrl);
		
	}

}
