package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {

    Jogador jogador;

    @BeforeEach
    public void setUp() {
        jogador = new Jogador();
    }

    // Jogador Contratado

    @Test
    public void naoDeveContratarJogadorContratado() {
        jogador.setSituacao(JogadorSituacaoContratado.getInstance());
        assertEquals("Jogador já está contratado.", jogador.contratar());
    }

    @Test
    public void deveVenderJogadorContratado() {
        jogador.setSituacao(JogadorSituacaoContratado.getInstance());
        assertEquals("Jogador vendido.", jogador.vender());
    }

    @Test
    public void deveEmprestarJogadorContratado() {
        jogador.setSituacao(JogadorSituacaoContratado.getInstance());
        assertEquals("Jogador emprestado.", jogador.emprestar());
    }

    @Test
    public void deveDemitirJogadorContratado() {
        jogador.setSituacao(JogadorSituacaoContratado.getInstance());
        assertEquals("Jogador demitido.", jogador.demitir());
    }

    // Jogador Vendido

    @Test
    public void naoDeveContratarJogadorVendido() {
        jogador.setSituacao(JogadorSituacaoVendido.getInstance());
        assertEquals("Jogador vendido, contratação não realizada.", jogador.contratar());
    }

    @Test
    public void naoDeveVenderJogadorVendido() {
        jogador.setSituacao(JogadorSituacaoVendido.getInstance());
        assertEquals("Jogador já foi vendido.", jogador.vender());
    }

    @Test
    public void naoDeveEmprestarJogadorVendido() {
        jogador.setSituacao(JogadorSituacaoVendido.getInstance());
        assertEquals("Jogador vendido, empréstimo não realizado.", jogador.emprestar());
    }

    @Test
    public void naoDeveDemitirJogadorVendido() {
        jogador.setSituacao(JogadorSituacaoVendido.getInstance());
        assertEquals("Jogador vendido, demissão não realizada.", jogador.demitir());
    }

    // Jogador Emprestado

    @Test
    public void naoDeveContratarJogadorEmprestado() {
        jogador.setSituacao(JogadorSituacaoEmprestado.getInstance());
        assertEquals("Jogador emprestado, contratação não realizada.", jogador.contratar());
    }

    @Test
    public void DeveVenderJogadorEmprestado() {
        jogador.setSituacao(JogadorSituacaoEmprestado.getInstance());
        assertEquals("Jogador vendido.", jogador.vender());
    }

    @Test
    public void naoDeveEmprestarJogadorEmprestado() {
        jogador.setSituacao(JogadorSituacaoEmprestado.getInstance());
        assertEquals("Jogador já está emprestado.", jogador.emprestar());
    }

    @Test
    public void naoDeveDemitirJogadorEmprestado() {
        jogador.setSituacao(JogadorSituacaoEmprestado.getInstance());
        assertEquals("Jogador emprestado, demissão não realizada.", jogador.demitir());
    }

    // Jogador Demitido

    @Test
    public void deveContratarJogadorDemitido() {
        jogador.setSituacao(JogadorSituacaoDemitido.getInstance());
        assertEquals("Jogador contratado.", jogador.contratar());
    }

    @Test
    public void naoDeveVenderJogadorDemitido() {
        jogador.setSituacao(JogadorSituacaoDemitido.getInstance());
        assertEquals("Jogador demitido, venda não realizada.", jogador.vender());
    }

    @Test
    public void naoDeveEmprestarJogadorDemitido() {
        jogador.setSituacao(JogadorSituacaoDemitido.getInstance());
        assertEquals("Jogador demitido, empréstimo não realizado.", jogador.emprestar());
    }

    @Test
    public void naoDeveDemitirJogadorDemitido() {
        jogador.setSituacao(JogadorSituacaoDemitido.getInstance());
        assertEquals("Jogador já foi demitido.", jogador.demitir());
    }
}