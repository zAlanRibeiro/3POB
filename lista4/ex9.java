import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listaA = new ArrayList<>();
        ArrayList<Integer> listaB = new ArrayList<>();
        ArrayList<Integer> listaC = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número para a lista A: ");
            listaA.add(scanner.nextInt());
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número para a lista B: ");
            listaB.add(scanner.nextInt());
        }
        for (int i = 0; i < 10; i++) {
            listaC.add(listaA.get(i) + listaB.get(i));
        }
        System.out.println("Lista C: " + listaC);
        scanner.close();
    }
}
