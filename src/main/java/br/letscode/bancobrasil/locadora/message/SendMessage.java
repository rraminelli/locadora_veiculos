package br.letscode.bancobrasil.locadora.message;

import br.letscode.bancobrasil.locadora.domain.model.Mensagem;

public abstract class SendMessage {

    public abstract void sendMessage(Mensagem mensagem);

}
