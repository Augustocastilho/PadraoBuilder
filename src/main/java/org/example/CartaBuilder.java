package org.example;

public class CartaBuilder {

    private Carta carta;

    public CartaBuilder() { carta = new Carta(); }

    public Carta build() {
        if (carta.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (carta.getHp() <= 0 || carta.getAtaque() <= 0 || carta.getVelocidadeAtaque() <= 0) {
            throw new IllegalArgumentException("Os status devem ser maiores que 0");
        }
        return carta;
    }

    public CartaBuilder setNome(String nome) {
        carta.setNome(nome);
        return this;
    }

    public CartaBuilder setHp(int hp) {
        carta.setHp(hp);
        return this;
    }

    public CartaBuilder setAtaque(int atk) {
        carta.setAtaque(atk);
        return this;
    }

    public CartaBuilder setVelocidade(int velo) {
        carta.setVelocidade(velo);
        return this;
    }

    public CartaBuilder setVelocidadeAtaque(int veloAtk) {
        carta.setVelocidadeAtaque(veloAtk);
        return this;
    }

}
