package br.letscode.bancobrasil.locadora.repository;

import br.letscode.bancobrasil.locadora.model.Locacao;
import br.letscode.bancobrasil.locadora.model.Veiculo;

import java.util.List;
import java.util.Random;

public class LocacaoRepository implements BaseRepository<Locacao, Long> {

    @Override
    public void persistir(Locacao locacao) {

    }

    @Override
    public Long criarId() {
        return new Random().nextLong();
    }

    @Override
    public void atualizar(Locacao locacao) {
        System.out.println("atualizando dados...");
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
