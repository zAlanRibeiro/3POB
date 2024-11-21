import java.util.Scanner;

public class PorcentagemAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código da turma: ");
        int codigo = scanner.nextInt();
        System.out.print("Quantidade de alunos do sexo masculino: ");
        int masculino = scanner.nextInt();
        System.out.print("Quantidade de alunos do sexo feminino: ");
        int feminino = scanner.nextInt();
        System.out.print("Quantidade de alunos aprovados: ");
        int aprovados = scanner.nextInt();

        int totalAlunos = masculino + feminino;
        int reprovados = totalAlunos - aprovados;

        double porcentagemMasculino = (double) masculino / totalAlunos * 100;
        double porcentagemFeminino = (double) feminino / totalAlunos * 100;
        double porcentagemReprovados = (double) reprovados / totalAlunos * 100;

        System.out.println("Porcentagem de alunos do sexo masculino: " + porcentagemMasculino + "%");
        System.out.println("Porcentagem de alunos do sexo feminino: " + porcentagemFeminino + "%");
        System.out.println("Porcentagem de alunos reprovados: " + porcentagemReprovados + "%");
        System.out.println("Total de alunos da turma: " + totalAlunos);
        scanner.close();
    }
}
