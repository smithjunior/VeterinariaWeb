package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Estado implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    @Column(name="descricao",length = 80,nullable = false)
    private String descricao;
    @OneToMany(cascade = CascadeType.REMOVE,mappedBy = "estado")
    private List<Cidade> cidades = new ArrayList<Cidade>();

    public Estado() {
    }

    public Estado(long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }
    
     public void addCidade(Cidade cidade) {
        if (!getCidades().contains(cidade)) {
            getCidades().add(cidade);
            cidade.setEstado(this);
        }
    }

    public void removeCidade(Cidade cidade) {
        if (getCidades().contains(cidade)) {
            getCidades().remove(cidade);
            cidade.setEstado(null);
        }
    }

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 53 * hash + (this.descricao != null ? this.descricao.hashCode() : 0);
        hash = 53 * hash + (this.cidades != null ? this.cidades.hashCode() : 0);
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
        final Estado other = (Estado) obj;
        if (this.id != other.id) {
            return false;
        }
        if ((this.descricao == null) ? (other.descricao != null) : !this.descricao.equals(other.descricao)) {
            return false;
        }
        if (this.cidades != other.cidades && (this.cidades == null || !this.cidades.equals(other.cidades))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return descricao;
    }

    
}
