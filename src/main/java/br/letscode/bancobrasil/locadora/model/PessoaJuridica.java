package br.letscode.bancobrasil.locadora.model;

public class PessoaJuridica extends Pessoa {

    private String cnpj;

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public String getTipoPessoa() {
        return "Pessoa_Juridica";
    }
}
