package br.letscode.bancobrasil.locadora.repository;

import br.letscode.bancobrasil.locadora.model.Cliente;

import java.util.List;

public class ClienteRepositoryMySQL implements BaseRepository<Cliente, String> {

    @Override
    public void salvar(Cliente cliente) {

    }

    @Override
    public void atualizar(Cliente cliente) {

    }

    @Override
    public Cliente getById(String id) {
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
