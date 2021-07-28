import java.util.Scanner;
public class LendoDados {

	public static void main(String[] args) {
		String nome;
		System.out.println("Por favor, digite o seu nome: ");
		Scanner leitor = new Scanner(System.in);
		nome = leitor.next();
		System.out.println("Boa noite," + nome);
	}

}
