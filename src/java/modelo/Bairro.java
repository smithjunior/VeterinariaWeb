package modelo;

import java.io.Serializable;
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
public class Bairro implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name="descricao",length = 80,nullable = false)
    private String descricao;
    @ManyToOne
    private Cidade cidade;
    @OneToMany(cascade = CascadeType.REMOVE,mappedBy = "bairro")
    private List<Logradouro> logradouros = new ArrayList<Logradouro>();

    public Bairro() {
    }

    public Bairro(Long id, String descricao, Cidade cidade) {
        this.id = id;
        this.descricao = descricao;
        this.cidade = cidade;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Logradouro> getLogradouros() {
        return logradouros;
    }

    public void setLogradouros(List<Logradouro> logradouros) {
        this.logradouros = logradouros;
    }

    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
      public void addCidade(Logradouro logradouro) {
        if (!getLogradouros().contains(logradouro)) {
            getLogradouros().add(logradouro);
            logradouro.setBairro(this);
        }
    }

    public void removeCidade(Logradouro logradouro) {
        if (getLogradouros().contains(logradouro)) {
            getLogradouros().remove(logradouro);
            logradouro.setBairro(null);
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 37 * hash + (this.descricao != null ? this.descricao.hashCode() : 0);
        hash = 37 * hash + (this.cidade != null ? this.cidade.hashCode() : 0);
        hash = 37 * hash + (this.logradouros != null ? this.logradouros.hashCode() : 0);
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
        final Bairro other = (Bairro) obj;
        if (this.id != other.id) {
            return false;
        }
        if ((this.descricao == null) ? (other.descricao != null) : !this.descricao.equals(other.descricao)) {
            return false;
        }
        if (this.cidade != other.cidade && (this.cidade == null || !this.cidade.equals(other.cidade))) {
            return false;
        }
        if (this.logradouros != other.logradouros && (this.logradouros == null || !this.logradouros.equals(other.logradouros))) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return  descricao;
    }
    
    
    
}
