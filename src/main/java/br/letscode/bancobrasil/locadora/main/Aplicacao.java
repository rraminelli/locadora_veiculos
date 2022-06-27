package br.letscode.bancobrasil.locadora.main;

import br.letscode.bancobrasil.locadora.builder.LocacaoBuilder;
import br.letscode.bancobrasil.locadora.exceptions.ClienteNaoInformadoException;
import br.letscode.bancobrasil.locadora.exceptions.OrigemDadosVeiculoException;
import br.letscode.bancobrasil.locadora.exceptions.VeiculoNaoEncontradoException;
import br.letscode.bancobrasil.locadora.factory.VeiculoServiceFactory;
import br.letscode.bancobrasil.locadora.model.*;
import br.letscode.bancobrasil.locadora.service.VeiculoService;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.*;

public class Aplicacao {

    private static final Scanner scanner = new Scanner(System.in);
    private static VeiculoService veiculoService;

    public static void main(String[] args) {

        System.out.println(
                "==============================\n" +
                "======== Bem-vindo \u26D0 ========\n" +
                "==============================");

        boolean executar;
        do {
            try {
                iniciarPrograma(args);
                executar = false;
            } catch (VeiculoNaoEncontradoException e) {
                System.err.println(e.getMessage());
                executar = true;
            }
        } while (executar);

    }

    private static void iniciarPrograma(String... args) throws VeiculoNaoEncontradoException {

        final List<Veiculo> listaVeiculos = recuperarListaVeiculos(args);

        final Veiculo veiculoEscolhido = listarVeiculosSelecionar(listaVeiculos);



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

            LocalDateTime inicio = LocalDateTime.now();
            LocalDateTime fim =
                    LocalDateTime.of(2022, 6, 20, 10, 0);

            Locacao locacao = new LocacaoBuilder()
                    .addCliente(cliente)
                    .addCartaoCredito(new CartaoCredito())
                    .addVeiculo(veiculoEscolhido)
                    .addPeriodoLocacao(inicio, fim)
                    .build();

            System.out.println("Preco total: R$ " + locacao.calcularValorTotalLocacao());

        } catch (ClienteNaoInformadoException e) {
            System.out.println(e.getMessage());
            System.out.println("Cliente nao informado. Entre com os dados do cliente.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //throw new Exception(e);
        } finally {
            System.out.println("Executando finally...");
        }

    }

    private static String getOrigemDados(final String[] args) {

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

    private static List<Veiculo> recuperarListaVeiculos(final String... args) {
        final String origemDados = getOrigemDados(args);
        veiculoService = VeiculoServiceFactory.getInstance().getVeiculoService(origemDados);
        return veiculoService.recuperarListaVeiculos();
    }

    private static Veiculo listarVeiculosSelecionar(final List<Veiculo> listaVeiculos) throws VeiculoNaoEncontradoException {

        System.out.println(VeiculoService.TIPO_ORDENACAO_PRECO_ASC);
        System.out.println(VeiculoService.TIPO_ORDENACAO_PRECO_DESC);
        System.out.println(VeiculoService.TIPO_ORDENACAO_ANO_DESC);
        System.out.println(VeiculoService.TIPO_ORDENACAO_ANO_DESC);
        System.out.print("Entre com a ordenaçao dos veiculos: ");

        final String tipoOrdenacao = scanner.nextLine();

        Collections.sort(listaVeiculos, veiculoService.getComparator(tipoOrdenacao));

        System.out.println("Veiculos disponiveis:");
        for (Veiculo veiculo : listaVeiculos) {
            System.out.println("======");
            System.out.println(veiculo);
        }

        System.out.print("\nDigite a placa do veiculo para locaçao: ");
        final String placaVeiculo = scanner.nextLine();

        for (Veiculo veiculo : listaVeiculos) {
            if (veiculo.getPlaca().equals(placaVeiculo)) {
                System.out.println("Veiculo escolhido: " + veiculo);
                return veiculo;
            }
        }

        throw new VeiculoNaoEncontradoException("Veiculo nao encontrado ou nao informado.");
    }

}
