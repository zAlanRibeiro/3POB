package dominio;

public class PessoaJuridica extends cliente{
	private String cnpj;
	private String razaoSocial;

	public PessoaJuridica(String endereco, String telefone, String razaoSocial, String cnpj) {
		super(endereco, telefone);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
        return cnpj;
    }

	public String getRazaoSocial() {
        return razaoSocial;
    }
	
	  @Override
	    public void mostrarInfo() {
	        super.mostrarInfo();
	        System.out.println("CNPj: " + cnpj);
	        System.out.println("RazaoSOcial: " + razaoSocial);
	    }
}
