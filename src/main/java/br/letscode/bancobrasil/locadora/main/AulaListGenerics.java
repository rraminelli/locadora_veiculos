package br.letscode.bancobrasil.locadora.main;

import br.letscode.bancobrasil.locadora.domain.model.Carro;
import br.letscode.bancobrasil.locadora.domain.model.Cliente;
import br.letscode.bancobrasil.locadora.domain.model.Locacao;
import br.letscode.bancobrasil.locadora.domain.model.Veiculo;
import br.letscode.bancobrasil.locadora.domain.repository.*;
import br.letscode.bancobrasil.locadora.model.*;
import br.letscode.bancobrasil.locadora.repository.*;

import java.util.List;

public class AulaListGenerics {

    public static void main(String[] args) {

        /*List<Veiculo> veiculoList = new ArrayList();
        veiculoList.add(new Carro());
        ordenarLista(veiculoList);

        List<Onibus> carros = new ArrayList<>();
        carros.add(new Onibus());
        ordenarLista(carros);*/

        BaseRepository<Cliente, Long> clienteRepository = createClienteRepository("MYSQL");
        Cliente cliente = new Cliente(); // clienteRepository.getById(1L);

        System.out.println("antes ID: " + cliente.getIdCliente());
        clienteRepository.salvar(cliente);
        System.out.println("depois ID: " + cliente.getIdCliente());


        BaseRepository<Locacao, Long> locacaoRepository = new LocacaoRepository();
        Locacao locacao = new Locacao();
        System.out.println("locacao antes ID: " + locacao.getNumeroLocacao());
        locacaoRepository.salvar(locacao);
        System.out.println("locacao depois ID: " + locacao.getNumeroLocacao());

        VeiculoRepository veiculoRepository = new VeiculoRepository();
        veiculoRepository.persistir(new Carro());
        veiculoRepository.getById("AAA2563");

    }

    private static BaseRepository<Cliente, Long> createClienteRepository(String tipoBancoDados) {
        if ("ORACLE".equals(tipoBancoDados)) {
            return new ClienteRepositoryOracle();
        } else if ("MYSQL".equals(tipoBancoDados)) {
            return new ClienteRepositoryMySQL();
        } else {
            return null;
        }

    }

    static void ordenarLista(List<? extends Veiculo> veiculoList) {
        if (veiculoList.get(0) instanceof Carro) {
            Veiculo veiculo = (Carro) veiculoList.get(0);
        }
    }

}
