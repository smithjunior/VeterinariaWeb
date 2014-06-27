package modelo;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "documento_id", "pessoa_id","numero","expedicao"}))
public class Documentacao implements Serializable {
    @Id
    @GeneratedValue
    private Long id; 
    @ManyToOne
    private Documento documento;
    @ManyToOne
    private Pessoa pessoa;
    @Column(name = "numero",nullable = false,length = 20)
    private String numero;
    @Temporal(TemporalType.DATE)
    @Column(name = "expedicao",nullable = false)
    private Calendar expedicao = Calendar.getInstance();
    @ManyToOne(fetch = FetchType.LAZY)
    private PessoaJuridica orgao;

    public Documentacao() {
    }

    public Documentacao(Long id) {
        this.id = id;
    }

    public Documentacao(Long id, Documento documento, Pessoa pessoa) {
        this.id = id;
        this.documento = documento;
        this.pessoa = pessoa;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 97 * hash + (this.documento != null ? this.documento.hashCode() : 0);
        hash = 97 * hash + (this.pessoa != null ? this.pessoa.hashCode() : 0);
        hash = 97 * hash + (this.numero != null ? this.numero.hashCode() : 0);
        hash = 97 * hash + (this.expedicao != null ? this.expedicao.hashCode() : 0);
        hash = 97 * hash + (this.orgao != null ? this.orgao.hashCode() : 0);
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
        if (this.id != other.id) {
            return false;
        }
        if (this.documento != other.documento && (this.documento == null || !this.documento.equals(other.documento))) {
            return false;
        }
        if (this.pessoa != other.pessoa && (this.pessoa == null || !this.pessoa.equals(other.pessoa))) {
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
