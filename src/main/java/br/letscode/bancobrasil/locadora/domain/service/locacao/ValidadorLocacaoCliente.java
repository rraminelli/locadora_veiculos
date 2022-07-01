package br.letscode.bancobrasil.locadora.domain.service.locacao;

import br.letscode.bancobrasil.locadora.domain.model.Cliente;
import br.letscode.bancobrasil.locadora.domain.model.Locacao;

public class ValidadorLocacaoCliente implements ValidadorLocacao {

    public void validar(Locacao locacao) {

        final Cliente cliente = locacao.getCliente();

        if (cliente == null) {
            throw new RuntimeException("Cliente nao informado");
        }

        if (cliente.getPessoa().getEmail() == null) {
            throw new RuntimeException("Email nao informado");
        }

        if (cliente.getPessoa().getCelular() == null) {
            throw new RuntimeException("Celular nao informado");
        }



    }

}
