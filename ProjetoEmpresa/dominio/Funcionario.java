package dominio;

public abstract class Funcionario {
	String matricula;
	String cpf;
	String nome;
	float salario;
	public Funcionario (String matricula, String cpf, String nome, float salario) {
		this.matricula = matricula;
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public float salario() {
		return salario;
	}
	
	public void mostrarInfo() {
		System.out.println("Matricula: " + matricula);
		System.out.println("CPF: " + cpf);
		System.out.println("Nome: " + nome);
		System.out.println("Salario: " + salario);
	}
}
