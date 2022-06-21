package br.letscode.bancobrasil.locadora.model;

import java.util.Set;

public class Cliente extends BaseModel {

    private Pessoa pessoa;
    private Set<CartaoCredito> cartaoCreditos;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Set<CartaoCredito> getCartaoCreditos() {
        return cartaoCreditos;
    }

    public void setCartaoCreditos(Set<CartaoCredito> cartaoCreditos) {
        this.cartaoCreditos = cartaoCreditos;
    }
}
