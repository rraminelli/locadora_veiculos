package br.letscode.bancobrasil.locadora.message;

import br.letscode.bancobrasil.locadora.domain.model.Mensagem;

public class SendMessageWhatsApp extends SendMessage {

    private SendMessage sendMessage;

    public SendMessageWhatsApp(SendMessage sendMessage) {
        this.sendMessage = sendMessage;
    }

    public void sendMessage(Mensagem mensagem) {
        System.out.println("Enviando WhatsApp");
        sendMessage.sendMessage(mensagem);
    }

}
