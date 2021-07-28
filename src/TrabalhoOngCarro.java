import java.util.Scanner;
public class TrabalhoOngCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kminicio;
		int kmfinal;
		double litrosgas;
		double kmrodados;
		double consumomedio;
		
		Scanner kmini = new Scanner(System.in);
		Scanner kmfim = new Scanner(System.in);
		Scanner litros = new Scanner(System.in);
		
		System.out.println("Sistema para calcular a média de consumo de combustível");
		System.out.println("Digite o KM Inicial");
		kminicio = kmini.nextInt();
		System.out.println("Digite o KM Final");
		kmfinal = kmfim.nextInt();
		System.out.println("Digite o a quantidade de combustível abastecida em litros");
		litrosgas = litros.nextDouble();
		
		kmrodados = kmfinal - kminicio;
		
		System.out.println("A distância em KM rodados foram: " + kmrodados);
		
		consumomedio = kmrodados / litrosgas;
		
		System.out.println("o Consumo médio por KM foi: " + consumomedio + "km por litro");
		
	}

}
