package dominio;

public abstract class cliente {
	protected String endereco;
	protected String telefone;

	  public cliente(String endereco, String telefone) {
          this.endereco = endereco;
          this.telefone = telefone;
      }
	  
	  public String getEndereco() {
		  return endereco;
	  }
	  
	  public String getTelefone() {
		  return telefone;
	  }
	  
	  public void mostrarInfo() {
          System.out.println("Endereço: " + endereco);
          System.out.println("Telefone: " + telefone);
      }
}
