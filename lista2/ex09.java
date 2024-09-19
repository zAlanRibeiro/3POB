package lista2;
import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Lado X: ");
		int x = scanner.nextInt();
		System.out.print("Lado Y: ");
		int y = scanner.nextInt();
		System.out.print("Lado Z: ");
		int z = scanner.nextInt();
		if (x < y + z && y < x + z && z < x + y) {
			if (x == z && x == y) {
				System.out.print("Equilatero!");
			}else if (x != y && x != z && y != z) {
				System.out.print("Isóceles");
			}else {
				System.out.print("Escaleno!");
			}
		}else {
			System.out.print("Não formam um triangulo!");
		}
		scanner.close();
	}

}
