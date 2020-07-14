import classes.Estudante;

import java.util.Scanner;

public class Principal {
    private static Estudante estudante;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bem-vindo ao CCA (Colégio da caneta azul)!");
        String nome = obterDados("Digite seu nome:");
        double notaDoPrimeiroTrimestre = Double.parseDouble(obterDados("Digite sua nota do primeiro trimestre:"));
        double notaDoSegundoTrimestre = Double.parseDouble(obterDados("Digite sua nota do segundo trimestre:"));
        double notaDoTerceiroTrimestre = Double.parseDouble(obterDados("Digite sua nota do terceiro trimestre:"));
        estudante = new Estudante(nome, notaDoPrimeiroTrimestre, notaDoSegundoTrimestre, notaDoTerceiroTrimestre);
        estudante.exibirSituacaoDeEstudante();
    }

    private static String obterDados(String mensagemAoUsuario) {
        System.out.println(mensagemAoUsuario);
        return scanner.nextLine();
    }
}
