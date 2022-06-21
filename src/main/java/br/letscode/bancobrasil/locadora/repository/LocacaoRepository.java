package br.letscode.bancobrasil.locadora.repository;

import br.letscode.bancobrasil.locadora.model.Locacao;
import br.letscode.bancobrasil.locadora.model.Veiculo;

import java.util.List;

public class LocacaoRepository implements BaseRepository<Locacao, Long> {

    @Override
    public void salvar(Locacao locacao) {

    }

    @Override
    public void atualizar(Locacao locacao) {

    }

    @Override
    public Locacao getById(Long id) {
        return null;
    }

    @Override
    public List<Locacao> listarTodos() {
        return null;
    }

    @Override
    public void excluir(Locacao entity) {

    }
}
