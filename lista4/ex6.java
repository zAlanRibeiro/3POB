import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int positivos = 0, negativos = 0, nulos = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            numeros.add(numero);
            if (numero > 0) {
              positivos++;
            }
            else if (numero < 0) {
              negativos++;
            }
            else {
              nulos++;
            }
        }
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Nulos: " + nulos);
        scanner.close();
    }
}
