package br.letscode.bancobrasil.locadora.domain.model;

import java.time.YearMonth;

public class CartaoCredito {

    private String numero;
    private YearMonth validade;
    private String codigoSeguranca;
    private Cliente cliente;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public YearMonth getValidade() {
        return validade;
    }

    public void setValidade(YearMonth validade) {
        this.validade = validade;
    }

    public String getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public void setCodigoSeguranca(String codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
