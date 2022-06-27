package br.letscode.bancobrasil.locadora.decorator;

import br.letscode.bancobrasil.locadora.model.Carro;

public class TesteDecorator {

    public static void main(String[] args) {

        //new StringVersao2("teste").charAt(0);

        Carro carrov1 = new Carro();

        new CarroVersao2(carrov1).setCor("PRETO");



    }

}
