package modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Veterinario implements Serializable{
    @Id
    @GeneratedValue
    private long id;
    @OneToOne(cascade = CascadeType.ALL)
    private PessoaFisica pessoaFisica;
    @Column(name="crvm",nullable = false,length = 30)
    private String crvm;

    public Veterinario() {
    }

    public Veterinario(long id) {
        this.id = id;
    }

    public Veterinario(long id, PessoaFisica pessoaFisica) {
        this.id = id;
        this.pessoaFisica = pessoaFisica;
    }

    public Veterinario(long id, PessoaFisica pessoaFisica, String crvm) {
        this.id = id;
        this.pessoaFisica = pessoaFisica;
        this.crvm = crvm;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public PessoaFisica getPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public String getCrvm() {
        return crvm;
    }

    public void setCrvm(String crvm) {
        this.crvm = crvm;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 97 * hash + (this.pessoaFisica != null ? this.pessoaFisica.hashCode() : 0);
        hash = 97 * hash + (this.crvm != null ? this.crvm.hashCode() : 0);
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
        final Veterinario other = (Veterinario) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.pessoaFisica != other.pessoaFisica && (this.pessoaFisica == null || !this.pessoaFisica.equals(other.pessoaFisica))) {
            return false;
        }
        if ((this.crvm == null) ? (other.crvm != null) : !this.crvm.equals(other.crvm)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return pessoaFisica.toString();
    }

   
    
}