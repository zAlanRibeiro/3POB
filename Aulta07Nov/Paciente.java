package dominio;

public class Paciente {
	private int numero;
	private double peso;
	private double altura;
	
	public Paciente (int numero, double peso, double altura) {
		this.numero = numero;
		this.peso = peso;
		this.altura = altura;
	}
	
	//Setters
	public void setNum(int numero) {
		this.numero = numero;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//Getters
	public int getNum() {
		return numero;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	//ListarPacientes
	public void listarPacientes() {
		System.out.println("Numero: " + numero);
		System.out.println("Peso: " + peso);
		System.out.println("Altura: " + altura);
	}
}
