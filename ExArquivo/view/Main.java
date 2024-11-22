package view;

import controller.PacienteController;
import model.Paciente;

import java.util.Scanner;

public class Main {
    private static final String FILE_PATH = "patients.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PacienteController controller = new PacienteController(FILE_PATH);

        while (true) {
            System.out.println("\n=== Gestão de Pacientes ===");
            System.out.println("1. Listar Pacientes");
            System.out.println("2. Incluir Paciente");
            System.out.println("3. Alterar Paciente");
            System.out.println("4. Excluir Paciente");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    for (Paciente p : controller.listarPacientes()) {
                        p.listarPaciente();
                    }
                }
                case 2 -> {
                    System.out.print("Número: ");
                    int numero = scanner.nextInt();
                    System.out.print("Peso: ");
                    double peso = scanner.nextDouble();
                    System.out.print("Altura: ");
                    double altura = scanner.nextDouble();
                    controller.incluirPaciente(new Paciente(numero, peso, altura));
                }
                case 3 -> {
                    System.out.print("Número do Paciente a alterar: ");
                    int numero = scanner.nextInt();
                    System.out.print("Novo Peso: ");
                    double peso = scanner.nextDouble();
                    System.out.print("Nova Altura: ");
                    double altura = scanner.nextDouble();
                    controller.alterarPaciente(numero, new Paciente(numero, peso, altura));
                }
                case 4 -> {
                    System.out.print("Número do Paciente a excluir: ");
                    int numero = scanner.nextInt();
                    controller.excluirPaciente(numero);
                }
                case 5 -> {
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opção inválida!");
            }
        }
    }
}
