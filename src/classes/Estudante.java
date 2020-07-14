package classes;

public class Estudante {
    private String nome;
    private double notaDoPrimeiroTrimessstre;
    private double notaDoSegundoTrimestre;
    private double notaDoTerceiroTrimesstre;

    public Estudante(String nome, double notaDoPrimeiroTrimessstre, double notaDoSegundoTrimestre, double notaDoTerceiroTrimesstre) {
        this.nome = nome;
        this.notaDoPrimeiroTrimessstre = notaDoPrimeiroTrimessstre;
        this.notaDoSegundoTrimestre = notaDoSegundoTrimestre;
        this.notaDoTerceiroTrimesstre = notaDoTerceiroTrimesstre;
    }

    public void exibirSituacaoDeEstudante() {
        double notaNecessariaParaAprovacao = 60.0;
        double mediaAnual = (notaDoPrimeiroTrimessstre + notaDoSegundoTrimestre + notaDoTerceiroTrimesstre);
        double pontosQueFaltamParaAprovacao;
        if (mediaAnual < notaNecessariaParaAprovacao) {
            pontosQueFaltamParaAprovacao = notaNecessariaParaAprovacao - mediaAnual;
            System.out.printf("Você foi reprovado por %.2f pontos.%n", pontosQueFaltamParaAprovacao);
        } else {
            System.out.printf("Você foi aprovado com %.2f de média anual.%n", mediaAnual);
        }
    }
}
