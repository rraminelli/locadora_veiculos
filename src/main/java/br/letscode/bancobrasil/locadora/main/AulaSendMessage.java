package br.letscode.bancobrasil.locadora.main;

import br.letscode.bancobrasil.locadora.message.*;
import br.letscode.bancobrasil.locadora.model.Cliente;
import br.letscode.bancobrasil.locadora.model.Mensagem;

import java.util.ArrayList;
import java.util.List;

public class AulaSendMessage {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        Mensagem mensagem = new Mensagem();
        mensagem.setMensagem("Envio promocao");
        mensagem.setAssunto("Promocao do dia");
        mensagem.setCliente(cliente);

        enviarMensagem(mensagem, new ArrayList<>());
    }

    static void enviarMensagem(Mensagem mensagem, List<String> tiposMensagens) {

        SendMessage sendMessage = new SendMessagePersistir(
                new SendMessageWhatsApp(
                    new SendMessageSMS(
                        new SendMessageEmail())));
        sendMessage.sendMessage(mensagem);


    }

}
