package br.letscode.bancobrasil.locadora.domain.repository;

import br.letscode.bancobrasil.locadora.domain.model.Cliente;

import java.util.List;

public class ClienteRepositoryOracle implements BaseRepository<Cliente, Long> {
    @Override
    public void persistir(Cliente cliente) {

    }

    @Override
    public Long criarId() {
        return 0L; //sequence - Oracle
    }

    @Override
    public void atualizar(Cliente cliente) {

    }

    @Override
    public Cliente getById(Long id) {
        return null;
    }

    @Override
    public List<Cliente> listarTodos() {
        return null;
    }

    @Override
    public void excluir(Cliente entity) {

    }
}
