package br.letscode.bancobrasil.locadora.message;

import br.letscode.bancobrasil.locadora.domain.model.Mensagem;

public class SendMessageEmail extends SendMessage {

    public void sendMessage(Mensagem mensagem) {
        System.out.println("Enviando email...");
    }

}
