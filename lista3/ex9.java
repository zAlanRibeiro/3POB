public class Exercicio9 {
    public static void main(String[] args) {
        for (int fahrenheit = 100; fahrenheit <= 150; fahrenheit++) {
            double celsius = 5.0 / 9.0 * (fahrenheit - 32);
            System.out.printf("%d°F = %.2f°C%n", fahrenheit, celsius);
        }
    }
}
