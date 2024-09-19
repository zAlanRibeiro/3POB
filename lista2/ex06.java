package lista2;
import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Escreva o salário minimo: ");
		double salarioMin = scanner.nextDouble();
		System.out.print("Digite seu salário: ");
		double salarioBruto = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();
		double salarioLiquido;
		if (salarioBruto < salarioMin) {
			salarioLiquido = salarioBruto - (salarioBruto * 0.02);
		}else if (salarioBruto == salarioMin) {
			salarioLiquido = salarioBruto - (salarioBruto * 0.05);
		}else {
			salarioLiquido = salarioBruto - (salarioBruto * 0.08);
		}
		System.out.print("Olá funcionário " +nome+ ", seu salário bruto é: " +salarioBruto+ " e seu salário liquido é: " +salarioLiquido);
		scanner.close();
	}

}
