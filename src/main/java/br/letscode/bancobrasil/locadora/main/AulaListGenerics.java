package br.letscode.bancobrasil.locadora.main;

import br.letscode.bancobrasil.locadora.model.*;
import br.letscode.bancobrasil.locadora.repository.BaseRepository;
import br.letscode.bancobrasil.locadora.repository.ClienteRepositoryMySQL;
import br.letscode.bancobrasil.locadora.repository.ClienteRepositoryOracle;
import br.letscode.bancobrasil.locadora.repository.LocacaoRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AulaListGenerics {

    public static void main(String[] args) {



        List<Veiculo> veiculoList = new ArrayList();
        veiculoList.add(new Carro());
        ordenarLista(veiculoList);

        List<Onibus> carros = new ArrayList<>();
        carros.add(new Onibus());
        ordenarLista(carros);

        BaseRepository<Cliente, String> clienteRepository = createClienteRepository("MYSQL");
        Cliente cliente = clienteRepository.getById("364585121323");

        BaseRepository<Locacao, Long> locacaoRepository = new LocacaoRepository();
        //Locacao locacao = locacaoRepository.getById(new Carro());

    }

    private static BaseRepository<Cliente, String> createClienteRepository(String tipoBancoDados) {
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
