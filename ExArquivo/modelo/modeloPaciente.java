package modelo;

public class Paciente {
    private int numero;
    private double peso;
    private double altura;

    public Paciente(int numero, double peso, double altura) {
        this.numero = numero;
        this.peso = peso;
        this.altura = altura;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void listarPaciente() {
        System.out.printf("Paciente %d - Peso: %.2f, Altura: %.2f%n", numero, peso, altura);
    }

    @Override
    public String toString() {
        return numero + "," + peso + "," + altura;
    }

    public static Paciente fromString(String line) {
        String[] parts = line.split(",");
        return new Paciente(Integer.parseInt(parts[0]), Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
    }
}
