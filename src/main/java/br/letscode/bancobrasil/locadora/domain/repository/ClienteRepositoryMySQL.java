package br.letscode.bancobrasil.locadora.domain.repository;

import br.letscode.bancobrasil.locadora.domain.model.Cliente;

import java.util.List;
import java.util.Random;

public class ClienteRepositoryMySQL implements BaseRepository<Cliente, Long> {

    @Override
    public void salvar(Cliente entity) {
        BaseRepository.super.salvar(entity);
        System.out.println();
    }

    @Override
    public void persistir(Cliente cliente) {
        //Salvar cliente - MySQL

    }

    @Override
    public Long criarId() {
        return new Random().nextLong(); //MySQL
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
