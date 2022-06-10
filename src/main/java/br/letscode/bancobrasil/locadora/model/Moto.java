package br.letscode.bancobrasil.locadora.model;

public class Moto extends Veiculo {

    public enum TipoPartida {
        MANUAL,
        ELETRICA
    }

    private TipoPartida tipoPartida;

    public TipoPartida getTipoPartida() {
        return tipoPartida;
    }

    public void setTipoPartida(TipoPartida tipoPartida) {
        this.tipoPartida = tipoPartida;
    }
}
