package controle;

import modelo.Paciente;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class controlePaciente {
    private final String filePath;

    public controlePaciente(String filePath) {
        this.filePath = filePath;
    }

    public List<Paciente> listarPacientes() {
        List<Paciente> pacientes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                pacientes.add(Paciente.fromString(line));
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        return pacientes;
    }

    public void incluirPaciente(Paciente paciente) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            bw.write(paciente.toString());
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Erro ao salvar o paciente: " + e.getMessage());
        }
    }

    public void alterarPaciente(int numero, Paciente pacienteAtualizado) {
        List<Paciente> pacientes = listarPacientes();
        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getNumero() == numero) {
                pacientes.set(i, pacienteAtualizado);
                salvarPacientes(pacientes);
                return;
            }
        }
        System.out.println("Paciente não encontrado!");
    }

    public void excluirPaciente(int numero) {
        List<Paciente> pacientes = listarPacientes();
        pacientes.removeIf(p -> p.getNumero() == numero);
        salvarPacientes(pacientes);
    }

    private void salvarPacientes(List<Paciente> pacientes) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (Paciente p : pacientes) {
                bw.write(p.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar os pacientes: " + e.getMessage());
        }
    }
}
