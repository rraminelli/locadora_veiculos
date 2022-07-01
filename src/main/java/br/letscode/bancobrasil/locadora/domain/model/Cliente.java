package br.letscode.bancobrasil.locadora.domain.model;

import java.util.Set;

public class Cliente extends BaseModel<Long> {

    @ID
    private Long idCliente;

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

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

}
