import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaAlturas = 0, maiorAltura = 0;
        String maisAlto = "";
        String nome;
        double altura;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome: ");
            nome = scanner.next();
            System.out.print("Digite a altura: ");
            altura = scanner.nextDouble();
            somaAlturas += altura;
            if (altura > maiorAltura) {
                maiorAltura = altura;
                maisAlto = nome;
            }
        }
        System.out.println("Altura média: " + (somaAlturas / 10));
        System.out.println("Mais alto: " + maisAlto + " com " + maiorAltura + " m");
        scanner.close();
    }
}
