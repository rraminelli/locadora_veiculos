package br.letscode.bancobrasil.locadora.model;

public class Onibus extends Veiculo {

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
}
