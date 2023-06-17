package org.example;

public class JogadorSituacaoDemitido implements JogadorSituacao {

    private JogadorSituacaoDemitido() {};
    private static JogadorSituacaoDemitido instance = new JogadorSituacaoDemitido();

    public static JogadorSituacaoDemitido getInstance() {
        return instance;
    }

    public String getSituacao() {
        return "Demitido.";
    }

    public String contratar(Jogador jogador) {
        jogador.setSituacao(JogadorSituacaoContratado.getInstance());
        return "Jogador contratado.";
    }

    public String vender(Jogador jogador) {
        return "Jogador demitido, venda não realizada.";
    }

    public String emprestar(Jogador jogador) {
        return "Jogador demitido, empréstimo não realizado.";
    }

    public String demitir(Jogador jogador) {
        return "Jogador já foi demitido.";
    }
}
