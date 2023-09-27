package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartaBuilderTest {

    @Test
    void deveRetornarExcecaoParaNomeVazio() {
        try {
            CartaBuilder cartaBuilder = new CartaBuilder();
            Carta carta = cartaBuilder
                    .setAtaque(200)
                    .setHp(850)
                    .setVelocidadeAtaque(180)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaCartaSemHp() {
        try {
            CartaBuilder cartaBuilder = new CartaBuilder();
            Carta carta = cartaBuilder
                    .setNome("Gigante")
                    .setAtaque(200)
                    .setHp(0)
                    .setVelocidadeAtaque(180)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Os status devem ser maiores que 0", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaCartaSemAtaque() {
        try {
            CartaBuilder cartaBuilder = new CartaBuilder();
            Carta carta = cartaBuilder
                    .setNome("Gigante")
                    .setAtaque(0)
                    .setHp(850)
                    .setVelocidadeAtaque(180)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Os status devem ser maiores que 0", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaCartaSemVelocidadeAtaque() {
        try {
            CartaBuilder cartaBuilder = new CartaBuilder();
            Carta carta = cartaBuilder
                    .setNome("Gigante")
                    .setAtaque(200)
                    .setHp(850)
                    .setVelocidadeAtaque(0)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Os status devem ser maiores que 0", e.getMessage());
        }
    }

    @Test
    void deveRetornarCartaValida() {
        CartaBuilder cartaBuilder = new CartaBuilder();
        Carta carta = cartaBuilder
                .setNome("Gigante")
                .setAtaque(200)
                .setHp(850)
                .setVelocidade(80)
                .setVelocidadeAtaque(120)
                .build();

        assertNotNull(carta);
    }

}