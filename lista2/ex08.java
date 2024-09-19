package lista2;
import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print ("Escreva o código do produto: ");
		String codigo = scanner.nextLine();
		System.out.print("Qual o preço: ");
		double valor = scanner.nextDouble();
		System.out.print("Deseja pagar de qual forma? ");
		System.out.print("1 - Dinheiro, 2 - Cheque, 3 - Cartão débito, 4 - Cartão crédito");
		int escolha = scanner.nextInt();
		switch (escolha) {
			case 1:
				valor = valor - (valor * 0.10);
				break;
			case 2:
				valor = valor - (valor * 0.02);
				break;
			case 3:
				valor = valor - (valor * 0.05);
				break;
			case 4:
				valor = valor - (valor * 0.03);
				break;
			default:
				System.out.print("Opção de pagamento inválida!");
				break;
		}
		System.out.printf("O valor final do produto %s é: R$ %.2f\n", codigo, valor);
		scanner.close();
	}

}
