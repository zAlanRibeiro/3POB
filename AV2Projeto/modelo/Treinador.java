package modelo;

public class Treinador extends Funcionario{
	
	public Treinador(String nome, double salario) {
		super(nome, salario);
	}
	
    @Override
    public void mostrarDetalhes() {
        System.out.println("Treinador: " + getNome() + ", Salário: " + getSalario());
    }
    
    @Override
    public void funcao() {
    	System.out.println("Ensinar novas tecnologias e motivar a equipe.");
    }
}
