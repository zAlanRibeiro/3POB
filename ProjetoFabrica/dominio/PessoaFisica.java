package dominio;

public class PessoaFisica extends cliente {
	private String cpf;
	private String nome;

	public PessoaFisica(String endereco, String telefone, String cpf, String nome) {
		super(endereco, telefone);
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String getCpf() {
        return cpf;
    }

	public String getNome() {
        return nome;
    }
	
	  @Override
	    public void mostrarInfo() {
	        super.mostrarInfo();
	        System.out.println("CPF: " + cpf);
	        System.out.println("Nome: " + nome);
	    }

}
