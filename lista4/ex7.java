import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> quadrados = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            numeros.add(numero);
            quadrados.add(numero * numero);
        }
        System.out.println("Quadrados: " + quadrados);
        scanner.close();
    }
}
