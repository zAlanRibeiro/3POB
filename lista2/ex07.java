package lista2;
import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Escreva o 1° número: ");
		int num1 = scanner.nextInt();
		System.out.print("Escreva o 2° número: ");
		int num2 = scanner.nextInt();
		System.out.print("Escreva o 3° número: ");
		int num3 = scanner.nextInt();
		if (num1 > num2 && num1 > num2) {
			System.out.print(num1+" é o maior número!");
		}else if (num2 > num1 && num2 > num3) {
			System.out.print(num2+" é o maior número!");
		}else {
			System.out.print(num3+" é o maior número!");
		}
		scanner.close();
	}

}
