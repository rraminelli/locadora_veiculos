package br.letscode.bancobrasil.locadora.domain.repository;

import br.letscode.bancobrasil.locadora.domain.model.Veiculo;

import java.util.List;

public class VeiculoRepository implements BaseRepository<Veiculo, String> {

    @Override
    public void persistir(Veiculo entity) {

    }

    @Override
    public String criarId() {
        return null;
    }

    @Override
    public Veiculo getById(String o) {
        return null;
    }

    @Override
    public List<Veiculo> listarTodos() {
        return null;
    }

    @Override
    public void excluir(Veiculo entity) {

    }

    @Override
    public void atualizar(Veiculo entity) {

    }
}
