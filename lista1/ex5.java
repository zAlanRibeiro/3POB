import java.util.Scanner;

public class PontuacaoFutebol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da equipe de futebol: ");
        scanner.nextLine();
        String Equipe = scanner.nextLine();

        System.out.print("Digite a quantidade de vitórias: ");
        int vitorias = scanner.nextInt();
        System.out.print("Digite a quantidade de empates: ");
        int empates = scanner.nextInt();
        System.out.print("Digite a quantidade de derrotas: ");
        int derrotas = scanner.nextInt();

        int pontosGanhos = vitorias * 3 + empates;
        int pontosPerdidos = derrotas * 0;

        System.out.println("Equipe: " + Equipe);
        System.out.println("Pontos ganhos: " + pontosGanhos);
        System.out.println("Pontos perdidos: " + pontosPerdidos);

        scanner.close();
    }
}
