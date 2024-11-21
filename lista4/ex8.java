import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int maior = Integer.MIN_VALUE, frequencia = 0;
        for (int i = 0; i < 9; i++) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            numeros.add(numero);
            if (numero > maior) {
              maior = numero;
            }
        }
        System.out.println("Maior número: " + maior);
        System.out.print("Posições: ");
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == maior) {
                frequencia++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nFrequência: " + frequencia);
        scanner.close();
    }
}
