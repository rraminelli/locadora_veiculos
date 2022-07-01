package br.letscode.bancobrasil.locadora.domain.model;

public class Endereco {

    public enum TipoLogradouro {
        RUA,
        AVENIDA,
        QUADRA;
    }

    private String logradouro;
    private String cidade;
    private String estado;
    private String cep;
    private TipoLogradouro tipoLogradouro;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public TipoLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }
}
