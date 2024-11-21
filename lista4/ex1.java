import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> alturas = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            System.out.print("Digite o nome da pessoa: ");
            nomes.add(scanner.next());
            System.out.print("Digite a altura da pessoa: ");
            alturas.add(scanner.nextDouble());
        }
        System.out.println("Pessoas com altura maior que 1,70m:");
        for (int i = 0; i < nomes.size(); i++) {
            if (alturas.get(i) > 1.70) {
                System.out.println("Nome: " + nomes.get(i) + ", Altura: " + alturas.get(i));
            }
        }
        scanner.close();
    }
}
