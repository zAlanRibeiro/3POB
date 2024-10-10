package controle;

import java.util.ArrayList;
import java.util.Scanner;

import dominio.cliente;
import dominio.PessoaFisica;
import dominio.PessoaJuridica;

public class controlaCliente {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		ArrayList<cliente> clientes = new ArrayList<>();
		
        System.out.println("Sistema de Gerenciamento de Funcionários");
        System.out.println("----------------------------------------");

        boolean continuar = true;
        
        while (continuar) {
            System.out.println("\nEscolha o tipo de cliente:");
            System.out.println("1. Pessoa Fisica");
            System.out.println("2. Pessoa Juridica");
            System.out.println("3. Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            if (opcao == 1) {
                System.out.print("Endereço: ");
                String endereco = scanner.nextLine();
                System.out.print("Telefone: ");
                String telefone = scanner.nextLine();
                System.out.print("CPF: ");
                String cpf = scanner.nextLine();
                System.out.print("Nome: ");
                String nome = scanner.nextLine();

                PessoaFisica fc = new PessoaFisica(endereco, telefone, cpf, nome);
                clientes.add(fc);

            } else if (opcao == 2) {
                System.out.print("Endereço: ");
                String endereco = scanner.nextLine();
                System.out.print("Telefone: ");
                String telefone = scanner.nextLine();
                System.out.print("CNPj: ");
                String cnpj = scanner.nextLine();
                System.out.print("Razão Social: ");
                String razaoSocial = scanner.nextLine();

                PessoaJuridica fh = new PessoaJuridica(endereco, telefone, cnpj, razaoSocial);
                clientes.add(fh);

            } else if (opcao == 3) {
                continuar = false;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        
        scanner.close();
        System.out.println("\nRelatório de Clientes:");
        System.out.println("--------------------------");
        for (cliente f : clientes) {
            f.mostrarInfo();
            System.out.println();
        }

	}

}
