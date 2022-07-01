package br.letscode.bancobrasil.locadora.domain.service.locacao;

import br.letscode.bancobrasil.locadora.domain.model.Locacao;

import java.util.List;

public class RealizarLocacaoService {

    private List<ValidadorLocacao> validacoes;

    public RealizarLocacaoService(List<ValidadorLocacao> validacoes) {
        this.validacoes = validacoes;
    }

    public void realizarLocacao(Locacao locacao) {

        for (ValidadorLocacao validor : validacoes) {
            validor.validar(locacao);
        }

        //salvar

    }

}
