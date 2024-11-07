package controle;

import dominio.Paciente;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ControlePacientes {
	private ArrayList<Paciente> pacientes;
	private final String arqPacientes = "pacientes.txt";
	
	public ControlePacientes() {
		this.pacientes = new ArrayList<>();
		carregarPacientes();
	}

	private void carregarPacientes() {
		try (BufferedReader reader = new BufferedReader(new FileReader(arqPacientes))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                int numero = Integer.parseInt(dados[0]);
                double altura = Double.parseDouble(dados[1]);
                double peso = Double.parseDouble(dados[2]);
                pacientes.add(new Paciente(numero, peso, altura));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de produtos não encontrado. Será criado ao salvar novos produtos.");
        } catch (IOException e) {
            System.out.println("Erro ao carregar produtos: " + e.getMessage());
        }
	}
	
	private void salvarPaciente() {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(arqPacientes))) {
            for (Paciente paciente : pacientes) {
                writer.write(paciente.getNum() + ";" + paciente.getAltura() + ";" + paciente.getPeso());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar produtos: " + e.getMessage());
        }
    }
	
	public void addPacientes(int numero, double peso, double altura) {
		Paciente paciente = new Paciente(numero, peso, altura);
		pacientes.add(paciente);
		salvarPaciente();
		System.out.println("Paciente adicionado com sucesso!");
	}
	
	public void listarPacientes() {
		if (pacientes.isEmpty()) {
			System.out.println("Lista de Pacientes está vazia!");
		}else {
			for (Paciente paciente: pacientes) {
				paciente.listarPacientes();
			}
		}
	}
	
	private Paciente buscarPacienteNum(int numero) {
		for (Paciente paciente: pacientes) {
			if (paciente.getNum() == numero) {
				return paciente;
			}
		}
		return null;
		
	}
	
	public void alterarPaciente(int numero) {
		Paciente paciente = buscarPacienteNum(numero);
		if (paciente != null) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Escreva a nova altura do paciente: ");
			double novaAltura = scanner.nextDouble();
			System.out.println("Escreva o novo peso do paciente: ");
			double novoPeso = scanner.nextDouble();
			paciente.setAltura(novaAltura);
			paciente.setPeso(novoPeso);
			salvarPaciente();
			System.out.println("Paciente alterado com sucesso!");
			scanner.close();
		}else{
        	System.out.println("Paciente com numero " + numero + " não encontrado!");
		}
	}
	
	public void removerPaciente(int numero) {
		Paciente paciente = buscarPacienteNum(numero);
		if (paciente != null) {
			pacientes.remove(paciente);
			salvarPaciente();
			System.out.println("Paciente alterado com sucesso!");
		}else {
			System.out.println("Paciente com numero " + numero + " não encontrado!");
		}
	}
	
	public static void main(String[] args) {
		ControlePacientes controle = new ControlePacientes();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Paciente");
            System.out.println("2. Listar Paciente");
            System.out.println("3. Alterar Paciente");
            System.out.println("4. Excluir Paciente");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Numero do Paciente: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer do scanner
                    System.out.print("Peso do Paciente: ");
                    double peso = scanner.nextDouble();
                    System.out.print("Altura do Paciente: ");
                    double altura = scanner.nextDouble();
                    controle.addPacientes(numero, peso, altura);
                    break;
                case 2:
                    controle.listarPacientes();
                    break;
                case 3:
                    System.out.print("Numero do Paciente a alterar: ");
                    int numeroAlt = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer
                    controle.alterarPaciente(numeroAlt);
                    break;
                case 4:
                    System.out.print("Numero do Paciente a excluir: ");
                    int numeroExcluir = scanner.nextInt();
                    controle.removerPaciente(numeroExcluir);
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
	}

}
