package controle;

import java.util.ArrayList;
import java.io.*;
import modelo.Funcionario;
import modelo.Gerente;
import modelo.Desenvolvedor;
import modelo.Treinador;
import modelo.GerenteDesenvolvedor;

public class controleFuncionario {
    private ArrayList<Funcionario> funcionarios;

    public controleFuncionario() {
        funcionarios = new ArrayList<>();
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        salvarFuncionarios(funcionarios);
    }

    public void listarFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            funcionario.mostrarDetalhes();
        }
    }

    public void salvarFuncionarios(ArrayList<Funcionario> funcionarios) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("funcionarios.txt"))) {
            for (Funcionario funcionario : funcionarios) {
                writer.write(funcionario.toFileString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar funcionarios: " + e.getMessage());
        }
    }

    public ArrayList<Funcionario> carregarFuncionarios() {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("funcionarios.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                funcionarios.add(Funcionario.fromFileString(linha));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de funcionarios não encontrado. Será criado ao salvar novos funcionarios.");
        } catch (IOException e) {
            System.out.println("Erro ao carregar funcionarios: " + e.getMessage());
        }
        return funcionarios;
    }

    public boolean atualizarFuncionario(String nome, double salario, String novoNome, double novoSalario) {
        Funcionario funcionario = buscarFuncionarioNome(nome);
        if (funcionario != null) {
            funcionario.setNome(novoNome);
            funcionario.setSalario(novoSalario);
            salvarFuncionarios(funcionarios);
            return true;
        }
        return false;
    }

    public boolean excluirFuncionario(String nome) {
        Funcionario funcionario = buscarFuncionarioNome(nome);
        if (funcionario != null) {
            funcionarios.remove(funcionario);
            salvarFuncionarios(funcionarios);
            return true;
        }
        return false;
    }

    private Funcionario buscarFuncionarioNome(String nome) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equals(nome)) {
                return funcionario;
            }
        }
        return null;
    }

    public void adicionarFuncionario(String tipo, String nome, double salario) {
        Funcionario funcionario = null;

        switch (tipo) {
            case "Gerente":
                funcionario = new Gerente(nome, salario);
                break;
            case "Desenvolvedor":
                funcionario = new Desenvolvedor(nome, salario);
                break;
            case "Treinador":
                funcionario = new Treinador(nome, salario);
                break;
            case "GerenteDesenvolvedor":
                funcionario = new GerenteDesenvolvedor(nome, salario);
                break;
            default:
                System.out.println("Tipo de funcionário desconhecido.");
                return;
        }

        funcionarios.add(funcionario);
        salvarFuncionarios(funcionarios);
    }
}
