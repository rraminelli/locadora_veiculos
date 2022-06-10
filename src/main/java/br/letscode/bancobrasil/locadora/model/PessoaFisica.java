package br.letscode.bancobrasil.locadora.model;

public class PessoaFisica extends Pessoa {

    private String cpf;

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String getTipoPessoa() {
        return "Pessoa_Fisica";
    }
}
