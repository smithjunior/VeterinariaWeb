package modelo;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Documentacao {
    @EmbeddedId    
    private DocumentacaoPk id;    
    @Column(name = "numero",nullable = false,length = 20)
    private String numero;
    @Temporal(TemporalType.DATE)
    @Column(name = "expedicao",nullable = false)
    private Calendar expedicao = Calendar.getInstance();
    @ManyToOne(fetch = FetchType.LAZY)
    private PessoaJuridica orgao;

    public Documentacao() {
    }

    public Documentacao(DocumentacaoPk id) {
        this.id = id;
    }

    public DocumentacaoPk getId() {
        return id;
    }

    public void setId(DocumentacaoPk id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Calendar getExpedicao() {
        return expedicao;
    }

    public void setExpedicao(Calendar expedicao) {
        this.expedicao = expedicao;
    }

    public PessoaJuridica getOrgao() {
        return orgao;
    }

    public void setOrgao(PessoaJuridica orgao) {
        this.orgao = orgao;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 23 * hash + (this.numero != null ? this.numero.hashCode() : 0);
        hash = 23 * hash + (this.expedicao != null ? this.expedicao.hashCode() : 0);
        hash = 23 * hash + (this.orgao != null ? this.orgao.hashCode() : 0);
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
        final Documentacao other = (Documentacao) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.numero == null) ? (other.numero != null) : !this.numero.equals(other.numero)) {
            return false;
        }
        if (this.expedicao != other.expedicao && (this.expedicao == null || !this.expedicao.equals(other.expedicao))) {
            return false;
        }
        if (this.orgao != other.orgao && (this.orgao == null || !this.orgao.equals(other.orgao))) {
            return false;
        }
        return true;
    }
    
}
