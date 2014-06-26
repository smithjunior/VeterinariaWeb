package modelo;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class PessoaFisica extends Pessoa{
    @Column(name="cpf",nullable = false,length = 15)
    private String cpf;

    public PessoaFisica() {
    }

    public PessoaFisica(long id, String nome) {
        super(id, nome);
    }

    public PessoaFisica(String cpf) {
        this.cpf = cpf;
    }

    public PessoaFisica(String cpf, long id, String nome) {
        super(id, nome);
        this.cpf = cpf;
    }
        
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.cpf != null ? this.cpf.hashCode() : 0);
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
        final PessoaFisica other = (PessoaFisica) obj;
        if ((this.cpf == null) ? (other.cpf != null) : !this.cpf.equals(other.cpf)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getNome();
    }
    
    
}
