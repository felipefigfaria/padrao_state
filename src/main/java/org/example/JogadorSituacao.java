package org.example;

public interface JogadorSituacao {

    String getSituacao();

    String contratar(Jogador jogador);

    String vender(Jogador jogador);

    String emprestar(Jogador jogador);

    String demitir(Jogador jogador);

}
