package br.letscode.bancobrasil.locadora.main;

import br.letscode.bancobrasil.locadora.domain.model.*;
import br.letscode.bancobrasil.locadora.model.*;

public class TesteCast {

    public static void main(String[] args) {

        String documento = "";
        Pessoa pessoaCliente = getClientePessoa();
        if (pessoaCliente instanceof PessoaFisica) {
            documento = ((PessoaFisica) pessoaCliente).getCpf();
        } else if (pessoaCliente instanceof PessoaJuridica) {
            documento = ((PessoaJuridica) pessoaCliente).getCnpj();
        }
        System.out.println("Doc " + documento);
    }

    public static Pessoa getClientePessoa() {

        Cliente cliente = new Cliente();
        cliente.setPessoa(new PessoaJuridica());

        Locacao locacao = new Locacao();
        locacao.setCliente(cliente);
        return locacao.getCliente().getPessoa();

    }

}
