import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0, pares = 0, impares = 0, num;
        while (true) {
            System.out.print("Digite um número ou -1 para encerrar: ");
            num = scanner.nextInt();
            if (num == -1) {
              break;
            }
            total++;
            if (num % 2 == 0) {
              pares++;
            }
            else {
              impares++;
            }
        }

        System.out.println("Total de números: " + total);
        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
        scanner.close();
    }
}
