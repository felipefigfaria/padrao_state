package org.example;

public class Jogador {

    private String nome;
    private JogadorSituacao situacao;

    public Jogador() {
        this.situacao = JogadorSituacaoContratado.getInstance();
    }

    public void setSituacao(JogadorSituacao situacao) {
        this.situacao = situacao;
    }

    public String contratar() {
        return situacao.contratar(this);
    }

    public String vender() {
        return situacao.vender(this);
    }

    public String emprestar() {
        return situacao.emprestar(this);
    }

    public String demitir() {
        return situacao.demitir(this);
    }

    public String getNomeSituacao() {
        return situacao.getSituacao();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public JogadorSituacao getSituacao() {
        return situacao;
    }
}