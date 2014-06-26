package modelo;

import java.io.Serializable;
import javax.persistence.Embeddable;
@Embeddable
public class EnderecamentoPk implements Serializable{
    private long pessoa_id;
    private long logradouro_id;

    public EnderecamentoPk() {
    }

    public EnderecamentoPk(long pessoa_id, long logradouro_id) {
        this.pessoa_id = pessoa_id;
        this.logradouro_id = logradouro_id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + (int) (this.pessoa_id ^ (this.pessoa_id >>> 32));
        hash = 23 * hash + (int) (this.logradouro_id ^ (this.logradouro_id >>> 32));
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
        final EnderecamentoPk other = (EnderecamentoPk) obj;
        if (this.pessoa_id != other.pessoa_id) {
            return false;
        }
        if (this.logradouro_id != other.logradouro_id) {
            return false;
        }
        return true;
    }
    
    
}
