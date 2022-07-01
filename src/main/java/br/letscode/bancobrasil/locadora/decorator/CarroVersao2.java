package br.letscode.bancobrasil.locadora.decorator;

import br.letscode.bancobrasil.locadora.domain.model.Carro;
import br.letscode.bancobrasil.locadora.domain.model.Veiculo;

public class CarroVersao2 extends Veiculo {

    private Carro carro;

    public CarroVersao2(Carro carro) {
        this.carro = carro;
    }

    @Override
    public void setCor(String cor) {
        carro.setCor("COD_COR");
    }
}
