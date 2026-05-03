package org.udemyCoder.campo_minado.modelo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.udemyCoder.campo_minado.excecao.ExplosaoException;

import static org.junit.jupiter.api.Assertions.*;

class CampoTest {
    private Campo campo;

    @BeforeEach
    void setUp() {
        this.campo = new Campo(3, 3);
    }

    @Test
    void teste_vizinho_real_esquerda() {
        final Campo campoVizinhoEsquerda = new Campo(3, 2);
        final boolean resultado = this.campo.adicionarVizinho(campoVizinhoEsquerda);

        assertTrue(resultado);
    }

    @Test
    void teste_vizinho_real_direita() {
        final Campo campoVizinhoDireita = new Campo(3, 4);
        final boolean resultado = this.campo.adicionarVizinho(campoVizinhoDireita);

        assertTrue(resultado);
    }

    @Test
    void teste_vizinho_real_acima() {
        final Campo campoVizinhoAcima = new Campo(2, 3);
        final boolean resultado = this.campo.adicionarVizinho(campoVizinhoAcima);

        assertTrue(resultado);
    }

    @Test
    void teste_vizinho_real_abaixo() {
        final Campo campoVizinhoAbaixo = new Campo(4, 3);
        final boolean resultado = this.campo.adicionarVizinho(campoVizinhoAbaixo);

        assertTrue(resultado);
    }

    @Test
    void valor_default_marcacao() {
        assertFalse(this.campo.isMarcado());
    }

    @Test
    void alternar_marcacao() {
        this.campo.alternarMarcacao();
        assertTrue(this.campo.isMarcado());
    }

    @Test
    void alternar_marcacao_aberto() {
        this.campo.setAberto(true);
        this.campo.alternarMarcacao();
        assertFalse(this.campo.isMarcado());
    }

    @Test
    void abrir_campo_nao_minado_e_nao_marcado() {
        assertTrue(this.campo.abrir());
    }

    @Test
    void abrir_campo_nao_minado_marcado() {
        this.campo.alternarMarcacao();
        assertFalse(this.campo.abrir());
    }

    @Test
    void abrir_campo_minado_marcado() {
        this.campo.alternarMarcacao();
        this.campo.setMinado(true);
        assertFalse(this.campo.abrir());
    }

    @Test
    void abrir_campo_com_vizinhos() {
        final Campo vizinhoDoPrimeiroVizinho = new Campo(1, 1);
        final Campo primeiroVizinho = new Campo(2, 2);
        primeiroVizinho.adicionarVizinho(vizinhoDoPrimeiroVizinho);

        this.campo.adicionarVizinho(primeiroVizinho);
        this.campo.abrir();

        assertTrue(primeiroVizinho.isAberto() && vizinhoDoPrimeiroVizinho.isAberto());
    }

    @Test
    void abrir_campo_com_vizinhos_campo_minado() {
        final Campo vizinhoDoPrimeiroVizinho = new Campo(1, 1);
        final Campo segundoVizinhoDoPrimeiroVizinho = new Campo(1, 2);
        segundoVizinhoDoPrimeiroVizinho.setMinado(true);

        final Campo primeiroVizinho = new Campo(2, 2);
        primeiroVizinho.adicionarVizinho(vizinhoDoPrimeiroVizinho);
        primeiroVizinho.adicionarVizinho(segundoVizinhoDoPrimeiroVizinho);

        this.campo.adicionarVizinho(primeiroVizinho);
        this.campo.abrir();

        assertTrue(primeiroVizinho.isAberto() && !vizinhoDoPrimeiroVizinho.isAberto());
    }

    @Test
    void abrir_campo_minado_nao_marcado() {
        this.campo.setMinado(true);
        final ExplosaoException exception = assertThrows(ExplosaoException.class, () -> this.campo.abrir());

        assertNotNull(exception);
        assertEquals("Fim de jogo!", exception.getMessage());
    }
}