package br.letscode.bancobrasil.locadora.records;

public class TesteRecord {

    public static void main(String[] args) {

        ClienteRecord clienteRecord = new ClienteRecord("1", "Rodrigo");
        clienteRecord.id();
        clienteRecord.nome();

        clienteRecord = new ClienteRecord("1", "teste");


    }

}
