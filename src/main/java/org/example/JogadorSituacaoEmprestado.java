package org.example;

public class JogadorSituacaoEmprestado implements JogadorSituacao {

    private JogadorSituacaoEmprestado() {};
    private static JogadorSituacaoEmprestado instance = new JogadorSituacaoEmprestado();

    public static JogadorSituacaoEmprestado getInstance() {
        return instance;
    }

    public String getSituacao() {
        return "Emprestado.";
    }

    public String contratar(Jogador jogador) {
        return "Jogador emprestado, contratação não realizada.";
    }

    public String vender(Jogador jogador) {
        jogador.setSituacao(JogadorSituacaoVendido.getInstance());
        return "Jogador vendido.";
    }

    public String emprestar(Jogador jogador) {
        return "Jogador já está emprestado.";
    }

    public String demitir(Jogador jogador) {
        return "Jogador emprestado, demissão não realizada.";
    }
}