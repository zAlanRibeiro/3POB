package lista2;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Escreva um número: ");
		int num1 = scanner.nextInt();
		System.out.print("Escreva outro número: ");
		int num2 = scanner.nextInt();
		if (num1 > num2){
			System.out.print(num1 + " maior que " + num2);
		}else if (num2 > num1){
				System.out.print(num2 + " maior que " + num1);
			}else {
				System.out.print("Números iguais!");
			}
		scanner.close();
	}
}
