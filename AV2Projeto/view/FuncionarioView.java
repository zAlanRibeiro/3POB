package view;

import java.util.InputMismatchException;
import java.util.Scanner;
import modelo.Funcionario;
import modelo.Gerente;
import modelo.GerenteDesenvolvedor;
import modelo.Desenvolvedor;
import modelo.Treinador;

public class FuncionarioView {
    private Scanner scanner;
    private controle.controleFuncionario controle;

    public FuncionarioView(controle.controleFuncionario controle) {
        this.controle = controle;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Funcionario");
            System.out.println("2. Listar Funcionarios");
            System.out.println("3. Alterar Funcionario");
            System.out.println("4. Excluir Funcionario");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = capturarInteiro();

            switch (opcao) {
                case 1 -> adicionarFuncionario();
                case 2 -> listarFuncionarios();
                case 3 -> alterarFuncionario();
                case 4 -> excluirFuncionario();
                case 0 -> System.out.println("Encerrando o programa.");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private void adicionarFuncionario() {
        System.out.println("Escolha o tipo de Funcionário:");
        System.out.println("1. Gerente");
        System.out.println("2. Desenvolvedor");
        System.out.println("3. Treinador");
        System.out.println("4. GerenteDesenvolvedor");
        int tipoFuncionario = capturarInteiro();

        String nome = capturarString("Nome do Funcionário: ");
        double salario = capturarDouble("Salário do Funcionário: ");

        Funcionario funcionario = null;

        switch (tipoFuncionario) {
            case 1:
                funcionario = new Gerente(nome, salario);
                break;
            case 2:
                funcionario = new Desenvolvedor(nome, salario);
                break;
            case 3:
                funcionario = new Treinador(nome, salario);
                break;
            case 4:
                funcionario = new GerenteDesenvolvedor(nome, salario);
                break;
            default:
                System.out.println("Tipo de funcionário inválido. Funcionário não criado.");
                return;
        }

        controle.cadastrarFuncionario(funcionario);
        System.out.println("Funcionário " + nome + " adicionado com sucesso!");
    }

    private void listarFuncionarios() {
        controle.listarFuncionarios();
    }

    private void alterarFuncionario() {
        String nome = capturarString("Digite o nome do Funcionário a ser alterado: ");
        double novoSalario = capturarDouble("Digite o novo salário: ");
        String novoNome = capturarString("Digite o novo nome: ");

        if (controle.atualizarFuncionario(nome, novoSalario, novoNome, novoSalario)) {
            System.out.println("Funcionário alterado com sucesso!");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    private void excluirFuncionario() {
        String nome = capturarString("Digite o nome do Funcionário a ser excluído: ");
        if (controle.excluirFuncionario(nome)) {
            System.out.println("Funcionário excluído com sucesso!");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    private String capturarString(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    private double capturarDouble(String mensagem) {
        double valor = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                System.out.print(mensagem);
                valor = scanner.nextDouble();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
                scanner.next();
            }
        }
        scanner.nextLine();
        return valor;
    }

    private int capturarInteiro() {
        int valor = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                valor = scanner.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
                scanner.next();
            }
        }
        scanner.nextLine();
        return valor;
    }
}
