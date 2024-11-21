import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0, menores = 0, maiores = 0;
        int idade;
        while (true) {
            System.out.print("Digite a idade ou -1 para encerrar: ");
            idade = scanner.nextInt();
            if (idade == -1) {
              break;
            }
            total++;
            if (idade < 18) {
              menores++;
            }
            else {
              maiores++;
            }
        }
        System.out.println("Total de pessoas: " + total);
        System.out.println("Menores de 18: " + (menores * 100.0 / total) + "%");
        System.out.println("Maiores ou iguais a 18: " + (maiores * 100.0 / total) + "%");
        scanner.close();
    }
}
