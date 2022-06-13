package br.letscode.bancobrasil.locadora.main;

import br.letscode.bancobrasil.locadora.exceptions.ClienteNaoInformadoException;
import br.letscode.bancobrasil.locadora.exceptions.OrigemDadosVeiculoException;
import br.letscode.bancobrasil.locadora.factory.VeiculoServiceFactory;
import br.letscode.bancobrasil.locadora.model.*;
import br.letscode.bancobrasil.locadora.service.LocacaoService;
import br.letscode.bancobrasil.locadora.service.VeiculoService;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

public class Aplicacao {

    public static void main(String[] args) throws Exception {

        final String origemDados = getOrigemDados(args);

        //Recuperar a lista de veiculos
        final VeiculoService veiculoService = VeiculoServiceFactory.getInstance().getVeiculoService(origemDados);
        final List<Veiculo> listaVeiculos =  veiculoService.recuperarListaVeiculos();

        //Collections.sort(listaVeiculos, veiculoService.getComparator(VeiculoService.TIPO_ORDENACAO_PRECO_DESC));
        Collections.sort(listaVeiculos, veiculoService.getComparator(VeiculoService.TIPO_ORDENACAO_PRECO_ASC));

        for (Veiculo veiculo : listaVeiculos) {
            System.out.println("======");
            System.out.println("Tipo: " + veiculo.getClass().getName());
            System.out.println("Veiculo: " + veiculo.getMarca() + " - " + veiculo.getModelo());
            System.out.println("Preço: " + veiculo.getPrecoLocacao());
            System.out.println("======");
        }











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

        try {
            Locacao locacao = LocacaoService
                    .getInstance()
                    .addCliente(cliente)
                    .addCartaoCredito(new CartaoCredito())
                    //.addVeiculo(gol)
                    .build();
        } catch (ClienteNaoInformadoException e) {
            System.out.println(e.getMessage());
            System.out.println("Cliente nao informado. Entre com os dados do cliente.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception(e);
        } finally {
            System.out.println("Executando finally...");
        }

    }

    static String getOrigemDados(final String[] args) {

        String origemDados;

        if (args.length != 0 && !args[0].isBlank()) {
          origemDados = args[0];
        } else {
            final Properties prop = new Properties();
            final String filePath = Aplicacao.class.getClassLoader().getResource("config.properties").getPath();

            try (InputStream stream = new FileInputStream(filePath)) {
                prop.load(stream);
            } catch (IOException e) {
                throw new OrigemDadosVeiculoException("Arquivo props nao encontrado.");
            }

            /*InputStream stream = null;
            try {
                stream = new FileInputStream(filePath);
                prop.load(stream);
            } catch (IOException e) {
                throw new OrigemDadosVeiculoException("Arquivo props nao encontrado.");
            } finally {
                try {
                    stream.close();
                } catch (IOException e) {
                    throw new OrigemDadosVeiculoException("Falha ao fechar arquivo.");
                }
            }*/

            origemDados = prop.getProperty("origemDadosVeiculos");
        }

        if (origemDados.isBlank()) {
            throw new OrigemDadosVeiculoException("Origem de dados é obrigataria!");
        }

        return origemDados;

    }

}
