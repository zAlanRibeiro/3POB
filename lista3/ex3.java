import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a idade: ");
            soma += scanner.nextInt();
        }
        System.out.println("Média das idades: " + (soma / 10.0));
        scanner.close();
    }
}
