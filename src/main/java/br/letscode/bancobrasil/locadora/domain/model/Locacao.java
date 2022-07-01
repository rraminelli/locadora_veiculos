package br.letscode.bancobrasil.locadora.domain.model;

import java.time.LocalDateTime;

public class Locacao extends BaseModel<Long> {

    @ID
    private Long numeroLocacao;
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

    public Long getNumeroLocacao() {
        return numeroLocacao;
    }

    public void setNumeroLocacao(Long numeroLocacao) {
        this.numeroLocacao = numeroLocacao;
    }

}
