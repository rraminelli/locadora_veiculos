package br.letscode.bancobrasil.locadora.model;

import java.math.BigDecimal;

public abstract class Veiculo extends BaseModel implements Comparable {

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Veiculo{");
        sb.append("cor='").append(cor).append('\'');
        sb.append(", placa='").append(placa).append('\'');
        sb.append(", anoFabricacao=").append(anoFabricacao);
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", precoLocacao=").append(precoLocacao);
        sb.append(", qtdePassageiros=").append(qtdePassageiros);
        sb.append('}');
        return sb.toString();
    }
}
