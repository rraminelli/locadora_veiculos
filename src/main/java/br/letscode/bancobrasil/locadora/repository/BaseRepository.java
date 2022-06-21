package br.letscode.bancobrasil.locadora.repository;

import br.letscode.bancobrasil.locadora.model.BaseModel;

import java.util.List;

public interface BaseRepository<T extends BaseModel, ID> {

    default void salvar(T entity) {
        entity.logAlteracao();
    }

    void atualizar(T entity);

    T getById(ID id);

    List<T> listarTodos();

    void excluir(T entity);

}
