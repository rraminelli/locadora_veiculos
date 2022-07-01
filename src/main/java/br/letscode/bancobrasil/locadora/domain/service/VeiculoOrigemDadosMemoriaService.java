package br.letscode.bancobrasil.locadora.domain.service;

import br.letscode.bancobrasil.locadora.domain.model.Carro;
import br.letscode.bancobrasil.locadora.domain.model.Moto;
import br.letscode.bancobrasil.locadora.domain.model.Onibus;
import br.letscode.bancobrasil.locadora.domain.model.Veiculo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class VeiculoOrigemDadosMemoriaService implements VeiculoService {

    private List<Veiculo> listaVeiculos;

    @Override
    public List<Veiculo> recuperarListaVeiculos() {
        listaVeiculos = new ArrayList<>();

        final Carro golf = new Carro();
        golf.setQtdePortas(4);
        golf.setAnoFabricacao(2022);
        golf.setCor("Preto");
        golf.setMarca("VW");
        golf.setModelo("Golf");
        golf.setPlaca("XYZ1234");
        golf.setPrecoLocacao(new BigDecimal(150.00));
        golf.setQtdePassageiros(5);
        listaVeiculos.add(golf);

        final Carro gol = new Carro();
        gol.setQtdePortas(4);
        gol.setAnoFabricacao(2021);
        gol.setCor("Branco");
        gol.setMarca("VW");
        gol.setModelo("Gol");
        gol.setPlaca("ABC1234");
        gol.setPrecoLocacao(new BigDecimal(130.00));
        gol.setQtdePassageiros(5);
        listaVeiculos.add(gol);

        final Onibus onibus = new Onibus();
        onibus.setAnoFabricacao(2021);
        onibus.setCor("Branco");
        onibus.setMarca("MERCEDES BENZ");
        onibus.setModelo("MPOLO VIAGGIO");
        onibus.setPlaca("AWW1234");
        onibus.setPrecoLocacao(new BigDecimal(240.00));
        onibus.setQtdePassageiros(54);
        onibus.setTipoLeito(Onibus.TipoLeito.EXECUTIVO);
        onibus.setCategoriaCNH(Onibus.CategoriaCNH.D);
        listaVeiculos.add(onibus);

        final Moto motoCG = new Moto();
        motoCG.setAnoFabricacao(2021);
        motoCG.setCor("Vermelho");
        motoCG.setMarca("Honda");
        motoCG.setModelo("CG 125");
        motoCG.setPlaca("CGA1234");
        motoCG.setPrecoLocacao(new BigDecimal(65.00));
        motoCG.setQtdePassageiros(54);
        motoCG.setTipoPartida(Moto.TipoPartida.ELETRICA);
        listaVeiculos.add(motoCG);

        return listaVeiculos;
    }
}
