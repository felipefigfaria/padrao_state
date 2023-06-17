package org.example;

public class JogadorSituacaoVendido implements JogadorSituacao {

    private JogadorSituacaoVendido() {};
    private static JogadorSituacaoVendido instance = new JogadorSituacaoVendido();

    public static JogadorSituacaoVendido getInstance() {
        return instance;
    }

    public String getSituacao() {
        return "Vendido.";
    }

    public String contratar(Jogador jogador) {
        return "Jogador vendido, contratação não realizada.";
    }

    public String vender(Jogador jogador) {
        return "Jogador já foi vendido.";
    }

    public String emprestar(Jogador jogador) {
        return "Jogador vendido, empréstimo não realizado.";
    }

    public String demitir(Jogador jogador) {
        return "Jogador vendido, demissão não realizada.";
    }
}