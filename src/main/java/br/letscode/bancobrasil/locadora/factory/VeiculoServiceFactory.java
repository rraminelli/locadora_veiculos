package br.letscode.bancobrasil.locadora.factory;

import br.letscode.bancobrasil.locadora.domain.service.*;
import br.letscode.bancobrasil.locadora.service.*;

/**
 * Pattern Factory
 */
public class VeiculoServiceFactory {

    private static VeiculoServiceFactory instance = null;

    private VeiculoServiceFactory () {

    }

    //Pattern Singleton
    public static VeiculoServiceFactory getInstance() {
        if (instance == null) {
            instance = new VeiculoServiceFactory();
        }
        return instance;
    }

    public VeiculoService getVeiculoService(final String tipoOrigemDados) {
        switch (tipoOrigemDados) {
            case (VeiculoService.TIPO_ORIGEM_DADOS_EM_MEMORIA) :
                return new VeiculoOrigemDadosMemoriaService();
            case (VeiculoService.TIPO_ORIGEM_DADOS_EM_ARQUIVO) :
                return new VeiculoOrigemDadosArquivoService();
            case (VeiculoService.TIPO_ORIGEM_DADOS_EM_BANCO_DADOS) :
                return new VeiculoOrigemDadosBancoService();
            case (VeiculoService.TIPO_ORIGEM_DADOS_API) :
                    return new VeiculoOrigemDadosAPI();
            default:
                throw new RuntimeException("Origem dos dados invalida");
        }
    }

}
