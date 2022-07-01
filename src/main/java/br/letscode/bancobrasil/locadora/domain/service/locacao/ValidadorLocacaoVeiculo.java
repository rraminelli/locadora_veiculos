package br.letscode.bancobrasil.locadora.domain.service.locacao;

import br.letscode.bancobrasil.locadora.domain.model.Locacao;
import br.letscode.bancobrasil.locadora.domain.model.Veiculo;

public class ValidadorLocacaoVeiculo implements ValidadorLocacao {

    public void validar(final Locacao locacao) {

         final Veiculo veiculo = locacao.getVeiculo();

        if (veiculo == null) {
            throw new RuntimeException("Veiculo nao informado");
        }

    }

}
