package modelo;

public class Gerente extends Funcionario {
    
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Gerente: " + getNome() + ", Salário: " + getSalario());
    }

    @Override
    public void funcao() {
        System.out.println("Gerenciar a equipe e tomar decisões estratégicas.");
    }
}
