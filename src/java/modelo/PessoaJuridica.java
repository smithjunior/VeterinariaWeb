package modelo;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Entity
public class PessoaJuridica extends Pessoa{
    @Column(name="cnpj",nullable = false,length = 30)
    private String cnpj;

    public PessoaJuridica() {
    }

    public PessoaJuridica(long id, String nome) {
        super(id, nome);
    }

    public PessoaJuridica(String cnpj, long id, String nome) {
        super(id, nome);
        this.cnpj = cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (this.cnpj != null ? this.cnpj.hashCode() : 0);
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
        final PessoaJuridica other = (PessoaJuridica) obj;
        if ((this.cnpj == null) ? (other.cnpj != null) : !this.cnpj.equals(other.cnpj)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getNome();
    }

}