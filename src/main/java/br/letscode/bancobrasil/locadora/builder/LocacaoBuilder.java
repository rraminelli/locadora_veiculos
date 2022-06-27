package br.letscode.bancobrasil.locadora.builder;

import br.letscode.bancobrasil.locadora.exceptions.ClienteNaoInformadoException;
import br.letscode.bancobrasil.locadora.model.*;

import java.time.LocalDateTime;
import java.util.HashSet;

public class LocacaoBuilder {

    private Cliente cliente;
    private Veiculo veiculo;
    private LocalDateTime inicio;
    private LocalDateTime fim;

    public LocacaoBuilder addCliente(Cliente cliente) {
        this.cliente = cliente;
        return this;
    }

    public LocacaoBuilder addVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
        return this;
    }

    public LocacaoBuilder addPeriodoLocacao(LocalDateTime inicio, LocalDateTime fim) {
        this.inicio = inicio;
        this.fim = fim;
        return this;
    }

    public LocacaoBuilder addCartaoCredito(CartaoCredito cartaoCredito) throws ClienteNaoInformadoException {
        if (cliente == null) {
            throw new ClienteNaoInformadoException("Cliente nao adicionado!!!");
        }
        if (cliente.getCartaoCreditos() == null) {
            cliente.setCartaoCreditos(new HashSet<>());
        }

       /* Cliente cliente = locacao.getCliente();
        Set<CartaoCredito> cc = cliente.getCartaoCreditos();
        cc.add(cartaoCredito);*/

        cliente.getCartaoCreditos().add(cartaoCredito);
        return this;
    }

    public Locacao build() {

        if (veiculo == null) {
            new RuntimeException("Veiculo nao informado");
        }

        if (cliente == null) {
            new RuntimeException("Cliente nao informado");
        }

        if (inicio == null || fim == null) {
            new RuntimeException("Periodo de locacao nao informado");
        }

        final Locacao locacao = new Locacao();
        locacao.setDataHoraDevolucao(inicio);
        locacao.setDataHoraDevolucao(fim);
        locacao.setVeiculo(veiculo);
        locacao.setCliente(cliente);
        locacao.setLocadora(new Locadora());

        return locacao;
    }



}
