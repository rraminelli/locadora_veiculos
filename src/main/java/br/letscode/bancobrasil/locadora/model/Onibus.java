package br.letscode.bancobrasil.locadora.model;

import java.math.BigDecimal;

public class Onibus extends Veiculo implements AcrescimoLocacao {

    public enum TipoLeito {
        SEMI_LEITO,
        LEITO,
        EXECUTIVO
    }

    public enum CategoriaCNH {
        C, D;
    }

    private TipoLeito tipoLeito;
    private CategoriaCNH categoriaCNH;

    public TipoLeito getTipoLeito() {
        return tipoLeito;
    }

    public void setTipoLeito(TipoLeito tipoLeito) {
        this.tipoLeito = tipoLeito;
    }

    public CategoriaCNH getCategoriaCNH() {
        return categoriaCNH;
    }

    public void setCategoriaCNH(CategoriaCNH categoriaCNH) {
        this.categoriaCNH = categoriaCNH;
    }

    @Override
    public BigDecimal porcentagemAcrescimo() {
        return new BigDecimal(3);
    }

}
