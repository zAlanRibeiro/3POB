package lista2;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Digite o ano que estamos: ");
		int anoAtual = scanner.nextInt();
		System.out.println("Digite o ano do seu nascimento: ");
		int anoNasc = scanner.nextInt();
		int idade = anoAtual - anoNasc;
		if (idade < 16) {
			System.out.println ("Não pode votar!");
		}else{
			System.out.println ("É eleitor!");
		}
		scanner.close();
	}
}
