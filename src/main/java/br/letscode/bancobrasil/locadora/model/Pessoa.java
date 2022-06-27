package br.letscode.bancobrasil.locadora.model;

public abstract class Pessoa {

    private String nome;
    private Endereco endereco;
    private String email;
    private String celular;
    private String numeroWhatsApp;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNumeroWhatsApp() {
        return numeroWhatsApp;
    }

    public void setNumeroWhatsApp(String numeroWhatsApp) {
        this.numeroWhatsApp = numeroWhatsApp;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    protected abstract String getTipoPessoa();

}
