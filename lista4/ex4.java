import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> notas = new ArrayList<>();
        double somaNotas = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome do aluno: ");
            nomes.add(scanner.next());
            System.out.print("Digite a nota: ");
            double nota = scanner.nextDouble();
            notas.add(nota);
            somaNotas += nota;
        }
        double media = somaNotas / 10;
        System.out.println("Nota média da turma: " + media);
        System.out.println("Alunos com nota acima da média:");
        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i) > media) {
                System.out.println("Nome: " + nomes.get(i) + ", Nota: " + notas.get(i));
            }
        }
        scanner.close();
    }
}
