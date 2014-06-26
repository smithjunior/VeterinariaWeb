package modelo;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class RealizaProcedimentoPk implements  Serializable{
    
    private long procedimento_pk;
    private long animal_id;

    public RealizaProcedimentoPk() {
    }

    public RealizaProcedimentoPk(long procedimento_pk, long animal_id) {
        this.procedimento_pk = procedimento_pk;
        this.animal_id = animal_id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (int) (this.procedimento_pk ^ (this.procedimento_pk >>> 32));
        hash = 37 * hash + (int) (this.animal_id ^ (this.animal_id >>> 32));
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
        final RealizaProcedimentoPk other = (RealizaProcedimentoPk) obj;
        if (this.procedimento_pk != other.procedimento_pk) {
            return false;
        }
        if (this.animal_id != other.animal_id) {
            return false;
        }
        return true;
    }
    
    
}
