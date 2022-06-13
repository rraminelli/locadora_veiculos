package br.letscode.bancobrasil.locadora.model;

import br.letscode.bancobrasil.locadora.service.VeiculoService;

import java.math.BigDecimal;

public abstract class Veiculo implements Comparable {

    private String cor;
    private String placa;
    private int anoFabricacao;
    private String marca;
    private String modelo;
    private BigDecimal precoLocacao;
    private int qtdePassageiros;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public BigDecimal getPrecoLocacao() {
        return precoLocacao;
    }

    public void setPrecoLocacao(BigDecimal precoLocacao) {
        this.precoLocacao = precoLocacao;
    }

    public int getQtdePassageiros() {
        return qtdePassageiros;
    }

    public void setQtdePassageiros(int qtdePassageiros) {
        this.qtdePassageiros = qtdePassageiros;
    }

    @Override
    public int compareTo(Object veiculoObj) {
        final Veiculo veiculo = (Veiculo) veiculoObj;
        return veiculo.getPrecoLocacao().compareTo(this.getPrecoLocacao());
    }

}
