package br.letscode.bancobrasil.locadora.domain.service.locacao;

import br.letscode.bancobrasil.locadora.domain.model.AcrescimoLocacao;
import br.letscode.bancobrasil.locadora.domain.model.Locacao;

import java.math.BigDecimal;
import java.time.temporal.ChronoUnit;

public class LocacaoService {

    public BigDecimal calcularValorTotalLocacao(final Locacao locacao) {

        final BigDecimal qtdeTotalDiasLocacao =
                new BigDecimal(ChronoUnit.DAYS.between(
                        locacao.getDataHoraLocacao(), locacao.getDataHoraDevolucao()));

        System.out.println("Qtde dias locaçao: " + qtdeTotalDiasLocacao);
        System.out.println("Valor diario locaçao: " + locacao.getVeiculo().getPrecoLocacao());

        final BigDecimal valorTotalLocacao = locacao.getVeiculo().getPrecoLocacao().multiply(qtdeTotalDiasLocacao);

        System.out.println("Valor locaçao antes acrescimo: R$ " + valorTotalLocacao);

        if (locacao.getVeiculo() instanceof AcrescimoLocacao) {
            AcrescimoLocacao acrescimoLocacao = (AcrescimoLocacao) locacao.getVeiculo();
            BigDecimal acrescimo =
                    valorTotalLocacao.multiply(
                            acrescimoLocacao.porcentagemAcrescimo().divide(new BigDecimal(100)));
            System.out.println("Acrescimo: R$ " + acrescimo);
            return valorTotalLocacao.add(acrescimo);
        }

        return valorTotalLocacao;
    }

}
