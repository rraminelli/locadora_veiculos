package br.letscode.bancobrasil.locadora.domain.service.locacao;

import br.letscode.bancobrasil.locadora.domain.model.Locacao;

public class ValidadorLocacaoPeriodo implements ValidadorLocacao {

    public void validar(final Locacao locacao) {
        if (locacao.getDataHoraLocacao() == null || locacao.getDataHoraDevolucao() == null) {
            throw new RuntimeException("Periodo de locacao nao informado");
        }

        if (locacao.getDataHoraDevolucao().isBefore(locacao.getDataHoraLocacao())) {
            throw new RuntimeException("Data de locacao nao pode ser maior que a data de devolucao");
        }
    }

}
