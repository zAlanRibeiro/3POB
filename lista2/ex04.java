package lista2;
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Escreva seu sexo: ");
		String sexo = scanner.nextLine().toUpperCase();
		System.out.print("Escreva seu salário: ");
		double salario = scanner.nextDouble();
		if (sexo.equals("MASCULINO")){
			salario = salario - (salario * 0.05);
		}else{
			salario = salario - (salario * 0.03);
		}
		System.out.print("Seu salário é " + salario);
		scanner.close();
	}
}
