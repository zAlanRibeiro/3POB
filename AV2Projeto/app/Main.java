package app;

import controle.controleFuncionario;
import view.FuncionarioView;

public class Main {
    public static void main(String[] args) {
        controleFuncionario controle = new controleFuncionario();
        FuncionarioView view = new FuncionarioView(controle);
        view.exibirMenu();
    }
}
