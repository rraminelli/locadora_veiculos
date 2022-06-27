package br.letscode.bancobrasil.locadora.message;

import br.letscode.bancobrasil.locadora.model.Mensagem;

public class SendMessagePersistir extends SendMessage {

    private SendMessage sendMessage;

    public SendMessagePersistir(SendMessage sendMessage) {
        this.sendMessage = sendMessage;
    }

    public void sendMessage(Mensagem mensagem) {

        try {
            System.out.println("Persistir a mensagem"); //ERRO
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            sendMessage.sendMessage(mensagem);
        }

    }

}
