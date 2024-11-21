import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0, abaixo160 = 0, entre160e180 = 0, acima180 = 0;
        double altura;
        while (true) {
            System.out.print("Digite a altura ou -1 para encerrar: ");
            altura = scanner.nextDouble();
            if (altura == -1) {   
              break;
            }
            total++;
            if (altura < 1.60) {
              abaixo160++;
            }
            else if (altura <= 1.80){
              entre160e180++;
            }
            else{
              acima180++;
            }
        }

        System.out.println("Total de pessoas: " + total);
        System.out.println("Menor que 1.60: " + abaixo160);
        System.out.println("Entre 1.60 e 1.80: " + entre160e180);
        System.out.println("Maior que 1.80: " + acima180);
        scanner.close();
    }
}
