import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE, num;

        while (true) {
            System.out.print("Digite um número ou -1 para encerrar: ");
            num = scanner.nextInt();
            if (num == -1) {
              break;
            }
            if (num > maior) {
              maior = num;
            }
        }
        System.out.println("Maior número: " + maior);
        scanner.close();
    }
}
