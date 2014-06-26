package modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.Generated;

@Entity
public class Logradouro {
    @Id
    @GeneratedValue
    private long id;
    @Column(name="descricao",nullable = false,length = 80)
    private String descricao;
    @ManyToOne(fetch = FetchType.LAZY)
    private Bairro bairro;

    public Logradouro() {
    }

    public Logradouro(long id) {
        this.id = id;
    }

    public Logradouro(long id, String descricao, Bairro bairro) {
        this.id = id;
        this.descricao = descricao;
        this.bairro = bairro;
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

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 67 * hash + (this.descricao != null ? this.descricao.hashCode() : 0);
        hash = 67 * hash + (this.bairro != null ? this.bairro.hashCode() : 0);
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
        final Logradouro other = (Logradouro) obj;
        if (this.id != other.id) {
            return false;
        }
        if ((this.descricao == null) ? (other.descricao != null) : !this.descricao.equals(other.descricao)) {
            return false;
        }
        if (this.bairro != other.bairro && (this.bairro == null || !this.bairro.equals(other.bairro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return descricao;
    }
    
        
}
