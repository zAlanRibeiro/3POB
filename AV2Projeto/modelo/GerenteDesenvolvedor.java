package modelo;

public class GerenteDesenvolvedor extends Funcionario {
	
	public GerenteDesenvolvedor (String nome, double salario) {
		super(nome, salario);
	}
	
    @Override
    public void mostrarDetalhes() {
        System.out.println("Gerente Desenvolvedor: " + getNome() + ", Salário: " + getSalario());
    }
    
    @Override
    public void funcao() {
    	System.out.println("Possuem responsabilidades de desenvolvedor e gerente.");
    }
}
