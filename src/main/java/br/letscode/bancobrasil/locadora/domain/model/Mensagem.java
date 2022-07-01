package br.letscode.bancobrasil.locadora.domain.model;

import java.util.Objects;

public class Mensagem extends BaseModel<Long> {

    private Long idMensagem;
    private String assunto;
    private String mensagem;
    private Cliente cliente;

    public Long getIdMensagem() {
        return idMensagem;
    }

    public void setIdMensagem(Long idMensagem) {
        this.idMensagem = idMensagem;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mensagem mensagem1 = (Mensagem) o;
        return Objects.equals(idMensagem, mensagem1.idMensagem) && Objects.equals(assunto, mensagem1.assunto) && Objects.equals(mensagem, mensagem1.mensagem) && Objects.equals(cliente, mensagem1.cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMensagem, assunto, mensagem, cliente);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mensagem{");
        sb.append("idMensagem=").append(idMensagem);
        sb.append(", assunto='").append(assunto).append('\'');
        sb.append(", mensagem='").append(mensagem).append('\'');
        sb.append(", cliente=").append(cliente);
        sb.append('}');
        return sb.toString();
    }
}
