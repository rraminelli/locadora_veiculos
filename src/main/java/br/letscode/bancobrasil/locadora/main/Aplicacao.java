package br.letscode.bancobrasil.locadora.main;

import br.letscode.bancobrasil.locadora.model.*;
import br.letscode.bancobrasil.locadora.service.LocacaoService;

import java.math.BigDecimal;

public class Aplicacao {

    public static void main(String[] args) {

        Endereco enderecoCliente = new Endereco();
        enderecoCliente.setTipoLogradouro(Endereco.TipoLogradouro.RUA);
        enderecoCliente.setLogradouro("Rua A, 1");
        enderecoCliente.setCep("12345-000");

        PessoaFisica pessoa = new PessoaFisica();
        pessoa.setNome("Pedro");
        pessoa.setEndereco(enderecoCliente);
        pessoa.setCpf("13234545");

        Cliente cliente = new Cliente();
        cliente.setPessoa(pessoa);

        Veiculo gol = new Carro();
        gol.setCor("Preto");
        gol.setAnoFabricacao(2022);
        gol.setMarca("VW");
        gol.setModelo("Gol");
        gol.setPrecoLocacao(new BigDecimal(150.00));
        gol.setPlaca("XYZ1234");

        Locacao locacao = LocacaoService
                .getInstance()
                .addCliente(cliente)
                .addCartaoCredito(new CartaoCredito())
                .addVeiculo(gol)
                .build();

    }

}
