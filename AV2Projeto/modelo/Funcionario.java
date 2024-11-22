package modelo;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String toFileString() {
        return nome + ";" + salario;
    }

    public static Funcionario fromFileString(String linha) {
        String[] dados = linha.split(";");
        if (dados.length != 3) {
            throw new IllegalArgumentException("Linha de dados inválida para criação de Funcionário: " + linha);
        }

        String tipo = dados[0];
        String nome = dados[1];
        double salario = Double.parseDouble(dados[2]);

        switch (tipo) {
            case "Gerente":
                return new Gerente(nome, salario);
            case "Desenvolvedor":
                return new Desenvolvedor(nome, salario);
            case "Treinador":
                return new Treinador(nome, salario);
            case "GerenteDesenvolvedor":
                return new GerenteDesenvolvedor(nome, salario);
            default:
                throw new IllegalArgumentException("Tipo de funcionário desconhecido: " + tipo);
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract void mostrarDetalhes();

    public abstract void funcao();
}
