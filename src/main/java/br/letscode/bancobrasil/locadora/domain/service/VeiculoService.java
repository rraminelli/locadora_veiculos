package br.letscode.bancobrasil.locadora.domain.service;

import br.letscode.bancobrasil.locadora.domain.model.Veiculo;

import java.util.Comparator;
import java.util.List;

public interface VeiculoService {

    String TIPO_ORIGEM_DADOS_EM_MEMORIA = "EM_MEMORIA";
    String TIPO_ORIGEM_DADOS_EM_BANCO_DADOS = "EM_BANCO_DADOS";
    String TIPO_ORIGEM_DADOS_EM_ARQUIVO = "EM_ARQUIVO";
    String TIPO_ORIGEM_DADOS_API = "API";

    String TIPO_ORDENACAO_PRECO_ASC = "PRECO_ASC";
    String TIPO_ORDENACAO_PRECO_DESC = "PRECO_DESC";
    String TIPO_ORDENACAO_ANO_ASC = "ANO_ASC";
    String TIPO_ORDENACAO_ANO_DESC = "ANO_DESC";

    List<Veiculo> recuperarListaVeiculos();

    default Comparator getComparator(final String tipoOrdenacao) {
            return new Comparator() {
                @Override
                public int compare(Object veiculoObj1, Object veiculoObj2) {
                    final Veiculo veiculo1 = (Veiculo) veiculoObj1;
                    final Veiculo veiculo2 = (Veiculo) veiculoObj2;
                    
                    if (TIPO_ORDENACAO_PRECO_ASC.equals(tipoOrdenacao)) {
                        return veiculo1.getPrecoLocacao().compareTo(veiculo2.getPrecoLocacao());
                    } else if (TIPO_ORDENACAO_PRECO_DESC.equals(tipoOrdenacao)) {
                        return veiculo2.getPrecoLocacao().compareTo(veiculo1.getPrecoLocacao());
                    } else if (TIPO_ORDENACAO_ANO_ASC.equals(tipoOrdenacao)) {
                        return Integer.valueOf(veiculo1.getAnoFabricacao()).compareTo(veiculo2.getAnoFabricacao());
                    } else if (TIPO_ORDENACAO_ANO_DESC.equals(tipoOrdenacao)) {
                        return Integer.valueOf(veiculo2.getAnoFabricacao()).compareTo(veiculo1.getAnoFabricacao());
                    } else {
                        return 0;
                    }
                }
            };
        }

}
