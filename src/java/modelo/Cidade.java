package modelo;

public class Cidade {

    private long cidade;
    private String descricao;
    private Estado estado;

    public Cidade() {
    }

    public Cidade(long cidade, String descricao, Estado estado) {
        this.cidade = cidade;
        this.descricao = descricao;
        this.estado = estado;
    }

    public long getCidade() {
        return cidade;
    }

    public void setCidade(long cidade) {
        this.cidade = cidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (int) (this.cidade ^ (this.cidade >>> 32));
        hash = 59 * hash + (this.descricao != null ? this.descricao.hashCode() : 0);
        hash = 59 * hash + (this.estado != null ? this.estado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cidade other = (Cidade) obj;
        if (this.cidade != other.cidade) {
            return false;
        }
        if ((this.descricao == null) ? (other.descricao != null) : !this.descricao.equals(other.descricao)) {
            return false;
        }
        if (this.estado != other.estado && (this.estado == null || !this.estado.equals(other.estado))) {
            return false;
        }
        return true;
    }

}
