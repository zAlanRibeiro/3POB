import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numeros.add(scanner.nextInt());
        }
        Collections.sort(numeros);
        System.out.println("Ordem crescente: " + numeros);
        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("Ordem decrescente: " + numeros);
        scanner.close();
    }
}
