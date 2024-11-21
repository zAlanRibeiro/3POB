import java.util.Scanner;

public class SalariosEmpregados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a matrícula do primeiro empregado: ");
        int matricula1 = scanner.nextInt();
      
        System.out.print("Digite o salário do primeiro empregado: ");
        double salario1 = scanner.nextDouble();
      
        System.out.print("Digite a matrícula do segundo empregado: ");
        int matricula2 = scanner.nextInt();
      
        System.out.print("Digite o salário do segundo empregado: ");
        double salario2 = scanner.nextDouble();
      
        double desconto1 = salario1 * 0.05;
        double acrescimo2 = salario2 * 0.09;
        double salarioFinal1 = salario1 - desconto1;
        double salarioFinal2 = salario2 + acrescimo2;
      
        System.out.println("Empregado 1:");
        System.out.println("Matrícula: " + matricula1);
        System.out.println("Desconto: R$ " + desconto1);
        System.out.println("Salário final: R$ " + salarioFinal1);
      
        System.out.println("Empregado 2:");
        System.out.println("Matrícula: " + matricula2);
        System.out.println("Acréscimo: R$ " + acrescimo2);
        System.out.println("Salário final: R$ " + salarioFinal2);
        scanner.close();
    }
}
