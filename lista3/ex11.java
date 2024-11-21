import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a massa inicial (gramas): ");
        double massa = scanner.nextDouble();
        int tempo = 0;
        while (massa >= 0.5) {
            massa = massa/2;
            tempo += 50;
        }
        System.out.println("Massa final: " + massa + " g");
        System.out.println("Tempo necessário: " + tempo + " segundos");
        scanner.close();
    }
}
