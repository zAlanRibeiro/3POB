public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0, masculino = 0, feminino = 0;
        String sexo;
        while (true) {
            System.out.print("Digite o sexo (M/F) ou sair para terminar: ");
            sexo = scanner.next().toLowerCase();
            if (sexo.equals("sair")) break;
            total++;
            if (sexo.equals("m")) masculino++;
            else if (sexo.equals("f")) feminino++;
        }
        System.out.println("Total de pessoas: " + total);
        System.out.println("Masculino: " + masculino);
        System.out.println("Feminino: " + feminino);
        scanner.close();
    }
}
