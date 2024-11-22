package modelo;

public class Desenvolvedor extends Funcionario {
    
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Desenvolvedor: " + getNome() + ", Salário: " + getSalario());
    }

    @Override
    public void funcao() {
        System.out.println("Desenvolver e manter sistemas de software.");
    }
}
