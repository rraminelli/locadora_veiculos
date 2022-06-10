package br.letscode.bancobrasil.locadora.service;

import br.letscode.bancobrasil.locadora.model.CartaoCredito;
import br.letscode.bancobrasil.locadora.model.Cliente;
import br.letscode.bancobrasil.locadora.model.Locacao;
import br.letscode.bancobrasil.locadora.model.Veiculo;

import java.util.HashSet;

public class LocacaoService {

    private static LocacaoService locacaoService;
    private Locacao locacao;

    private LocacaoService() {
        this.locacao = new Locacao();
    }

    //Singleton
    public static LocacaoService getInstance() {
        if (locacaoService == null) {
            locacaoService = new LocacaoService();
        }
        return locacaoService;
    }

    public LocacaoService addCliente(Cliente cliente) {
        locacao.setCliente(cliente);
        return this;
    }

    public LocacaoService addVeiculo(Veiculo veiculo) {
        locacao.setVeiculo(veiculo);
        return this;
    }

    public LocacaoService addCartaoCredito(CartaoCredito cartaoCredito) {
        if (locacao.getCliente() == null) {
            throw new IllegalArgumentException("Cliente nao adicionado!!!");
        }
        if (locacao.getCliente().getCartaoCreditos() == null) {
            locacao.getCliente().setCartaoCreditos(new HashSet<>());
        }
        locacao.getCliente().getCartaoCreditos().add(cartaoCredito);
        return this;
    }

    public Locacao build() {
        return locacao;
    }



}
