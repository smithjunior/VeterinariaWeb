package modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class DocumentacaoPk implements Serializable{

    private long pessoa_id;
    private long documento_id;

    public DocumentacaoPk() {
    }

    public DocumentacaoPk(long pessoa_id, long documento_id) {
        this.pessoa_id = pessoa_id;
        this.documento_id = documento_id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + (int) (this.pessoa_id ^ (this.pessoa_id >>> 32));
        hash = 71 * hash + (int) (this.documento_id ^ (this.documento_id >>> 32));
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
        final DocumentacaoPk other = (DocumentacaoPk) obj;
        if (this.pessoa_id != other.pessoa_id) {
            return false;
        }
        if (this.documento_id != other.documento_id) {
            return false;
        }
        return true;
    }
    
    
   
}
