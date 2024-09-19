package lista2;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print ("Escreva 1° nota: ");
		int nota1 = scanner.nextInt();
		System.out.print ("Escreva 2° nota: ");
		int nota2 = scanner.nextInt();
		int media = (nota1 + nota2) / 2;
		if (media < 7) {
			System.out.println("Reprovado!");
		}else {
			System.out.println("Aprovado!");
		}
		scanner.close();
	}

}
