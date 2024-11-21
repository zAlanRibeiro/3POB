import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> codigos = new ArrayList<>();
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> telefones = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            System.out.print("Digite o código: ");
            codigos.add(scanner.nextInt());
            System.out.print("Digite o nome: ");
            nomes.add(scanner.next());
            System.out.print("Digite o telefone: ");
            telefones.add(scanner.next());
        }
        while (true) {
            System.out.print("Digite o código para consulta ou -1 para sair: ");
            int consulta = scanner.nextInt();
            if (consulta == -1) {
              break;
            }
            int index = codigos.indexOf(consulta);
            if (index != -1) {
                System.out.println("Nome: " + nomes.get(index) + ", Telefone: " + telefones.get(index));
            } else {
                System.out.println("Código não encontrado.");
            }
        }
        scanner.close();
    }
}
