package br.letscode.bancobrasil.locadora.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Locacao extends BaseModel {

    private Locadora locadora;
    private Veiculo veiculo;
    private Cliente cliente;
    private LocalDateTime dataHoraLocacao;
    private LocalDateTime dataHoraDevolucao;

    public Locadora getLocadora() {
        return locadora;
    }

    public void setLocadora(Locadora locadora) {
        this.locadora = locadora;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getDataHoraLocacao() {
        return dataHoraLocacao;
    }

    public void setDataHoraLocacao(LocalDateTime dataHoraLocacao) {
        this.dataHoraLocacao = dataHoraLocacao;
    }

    public LocalDateTime getDataHoraDevolucao() {
        return dataHoraDevolucao;
    }

    public void setDataHoraDevolucao(LocalDateTime dataHoraDevolucao) {
        this.dataHoraDevolucao = dataHoraDevolucao;
    }

    public BigDecimal calcularValorTotalLocacao() {

        final BigDecimal qtdeTotalDiasLocacao =
                new BigDecimal(ChronoUnit.DAYS.between(dataHoraLocacao, dataHoraDevolucao));

        System.out.println("Qtde dias locaçao: " + qtdeTotalDiasLocacao);
        System.out.println("Valor diario locaçao: " + veiculo.getPrecoLocacao());

        final BigDecimal valorTotalLocacao = veiculo.getPrecoLocacao()
                .multiply(qtdeTotalDiasLocacao);

        System.out.println("Valor locaçao antes acrescimo: R$ " + valorTotalLocacao);

        if (veiculo instanceof AcrescimoLocacao) {
            AcrescimoLocacao acrescimoLocacao = (AcrescimoLocacao) veiculo;
            BigDecimal acrescimo =
                    valorTotalLocacao.multiply(
                            acrescimoLocacao.porcentagemAcrescimo().divide(new BigDecimal(100)));
            System.out.println("Acrescimo: R$ " + acrescimo);
            return valorTotalLocacao.add(acrescimo);
        }

        return valorTotalLocacao;
    }

}
