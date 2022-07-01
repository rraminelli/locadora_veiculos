package br.letscode.bancobrasil.locadora.message;

import br.letscode.bancobrasil.locadora.domain.model.Mensagem;

public class SendMessageSMS extends SendMessage {

    private SendMessage sendMessage;

    public SendMessageSMS(SendMessage sendMessage) {
        this.sendMessage = sendMessage;
    }

    public void sendMessage(Mensagem mensagem) {
        System.out.println("Enviando SMS...");
        sendMessage.sendMessage(mensagem);
    }

}
