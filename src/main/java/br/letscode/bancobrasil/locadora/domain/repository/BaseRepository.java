package br.letscode.bancobrasil.locadora.domain.repository;

import br.letscode.bancobrasil.locadora.domain.model.BaseModel;

import java.util.List;

public interface BaseRepository<T extends BaseModel<ID>, ID> {

    default void salvar(T entity) {
        entity.logAlteracao();
        entity.setId(criarId());
        persistir(entity);
    }

    void persistir(T entity);

    ID criarId();

    void atualizar(T entity);

    T getById(ID id);

    List<T> listarTodos();

    void excluir(T entity);

}
