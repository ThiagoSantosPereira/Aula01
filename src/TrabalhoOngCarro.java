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
		
		System.out.println("Sistema para calcular a m�dia de consumo de combust�vel");
		System.out.println("Digite o KM Inicial");
		kminicio = kmini.nextInt();
		System.out.println("Digite o KM Final");
		kmfinal = kmfim.nextInt();
		System.out.println("Digite o a quantidade de combust�vel abastecida em litros");
		litrosgas = litros.nextDouble();
		
		kmrodados = kmfinal - kminicio;
		
		System.out.println("A dist�ncia em KM rodados foram: " + kmrodados);
		
		consumomedio = kmrodados / litrosgas;
		
		System.out.println("o Consumo m�dio por KM foi: " + consumomedio + "km por litro");
		
	}

}
