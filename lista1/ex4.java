import java.util.Scanner;

public class Faturamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o total de games vendidos: ");
        int jogos = scanner.nextInt();
        System.out.print("Digite o preço do game: ");
        double precoJogo = scanner.nextDouble();

        System.out.print("Digite o total de calculadoras vendidas: ");
        int calculadoras = scanner.nextInt();
        System.out.print("Digite o preço da calculadora: ");
        double precoCalculadora = scanner.nextDouble();

        System.out.print("Digite o total de canetas vendidas: ");
        int canetas = scanner.nextInt();
        System.out.print("Digite o preço da caneta: ");
        double precoCaneta = scanner.nextDouble();

        double faturamentoJogos = jogos * precoJogo;
        double faturamentoCalculadoras = calculadoras * precoCalculadora;
        double faturamentoCanetas = canetas * precoCaneta;

        double faturamentoTotal = faturamentoJogos + faturamentoCalculadoras+ faturamentoCanetas;

        System.out.println("Faturamento com games: R$ " + faturamentoJogos);
        System.out.println("Faturamento com calculadoras: R$ " + faturamentoCalculadoras);
        System.out.println("Faturamento com canetas: R$ " + faturamentoCanetas);
        System.out.println("Faturamento total: R$ " + faturamentoTotal);

        scanner.close();
    }
}
