package modelo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Cidade {
    @Id
    @GeneratedValue
    private long id;
    @Column(name="descricao",length = 80,nullable = false)
    private String descricao;
    @ManyToOne(fetch = FetchType.LAZY)
    private Estado estado;
    @OneToMany(cascade = CascadeType.REMOVE,mappedBy = "cidade")
    private List<Bairro> bairros = new ArrayList<Bairro>();

    public Cidade() {
    }

    public Cidade(long id, String descricao, Estado estado) {
        this.id = id;
        this.descricao = descricao;
        this.estado = estado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Bairro> getBairros() {
        return bairros;
    }

    public void setBairros(List<Bairro> bairros) {
        this.bairros = bairros;
    }

    
    public long getCidade() {
        return id;
    }

    public void setCidade(long id) {
        this.id = id;
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
    
      public void addCidade(Bairro bairro) {
        if (!getBairros().contains(bairro)) {
            getBairros().add(bairro);
            bairro.setCidade(this);
        }
    }

    public void removeCidade(Bairro bairro) {
        if (getBairros().contains(bairro)) {
            getBairros().remove(bairro);
            bairro.setCidade(null);
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 83 * hash + (this.descricao != null ? this.descricao.hashCode() : 0);
        hash = 83 * hash + (this.estado != null ? this.estado.hashCode() : 0);
        hash = 83 * hash + (this.bairros != null ? this.bairros.hashCode() : 0);
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
        if (this.id != other.id) {
            return false;
        }
        if ((this.descricao == null) ? (other.descricao != null) : !this.descricao.equals(other.descricao)) {
            return false;
        }
        if (this.estado != other.estado && (this.estado == null || !this.estado.equals(other.estado))) {
            return false;
        }
        if (this.bairros != other.bairros && (this.bairros == null || !this.bairros.equals(other.bairros))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return descricao;
    }

    
}
