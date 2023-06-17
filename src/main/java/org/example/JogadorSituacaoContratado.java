package org.example;

public class JogadorSituacaoContratado implements JogadorSituacao {

    private JogadorSituacaoContratado() {};
    private static JogadorSituacaoContratado instance = new JogadorSituacaoContratado();

    public static JogadorSituacaoContratado getInstance() {
        return instance;
    }

    public String getSituacao() {
        return "Contratado.";
    }

    public String contratar(Jogador jogador) {
        return "Jogador já está contratado.";
    }

    public String vender(Jogador jogador) {
        jogador.setSituacao(JogadorSituacaoVendido.getInstance());
        return "Jogador vendido.";
    }

    public String emprestar(Jogador jogador) {
        jogador.setSituacao(JogadorSituacaoEmprestado.getInstance());
        return "Jogador emprestado.";
    }

    public String demitir(Jogador jogador) {
        jogador.setSituacao(JogadorSituacaoDemitido.getInstance());
        return "Jogador demitido.";
    }
}
