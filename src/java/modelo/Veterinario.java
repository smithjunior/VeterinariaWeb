package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Veterinario extends PessoaFisica{
    @Column(name="crvm",nullable = false,length = 30)
    private String crvm;

    public Veterinario() {
    }

    public Veterinario(String crvm) {
        this.crvm = crvm;
    }

    public Veterinario(String crvm, String cpf) {
        super(cpf);
        this.crvm = crvm;
    }

    
    
    public String getCrvm() {
        return crvm;
    }

    
    public void setCrvm(String crvm) {
        this.crvm = crvm;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (this.crvm != null ? this.crvm.hashCode() : 0);
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
        if ((this.crvm == null) ? (other.crvm != null) : !this.crvm.equals(other.crvm)) {
            return false;
        }
        return true;
    }
    
    
}