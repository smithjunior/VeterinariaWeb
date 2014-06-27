package modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "logradouro_id","pessoa_id","tipoEnderecamento" }))
public class Enderecamento implements Serializable {
 
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne   
    private Logradouro logradouro;
    @ManyToOne
    private Pessoa pessoa;    
    @Column(name="numero",length = 30,nullable = false)
    private String numero;
    @Column(name = "complemento",length = 100,nullable = false)
    private String complemento;
    @Enumerated(EnumType.STRING)
    private TipoEnderecoEnum tipoEnderecamento;
    @OneToOne(fetch = FetchType.LAZY)
    private PontoGeografico pontoGeografico;

    public Enderecamento() {
    }

    public Enderecamento(Long id) {
        this.id = id;
    }

    public Enderecamento(Long id, Logradouro logradouro, Pessoa pessoa) {
        this.id = id;
        this.logradouro = logradouro;
        this.pessoa = pessoa;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public TipoEnderecoEnum getTipoEnderecamento() {
        return tipoEnderecamento;
    }

    public void setTipoEnderecamento(TipoEnderecoEnum tipoEnderecamento) {
        this.tipoEnderecamento = tipoEnderecamento;
    }

    public PontoGeografico getPontoGeografico() {
        return pontoGeografico;
    }

    public void setPontoGeografico(PontoGeografico pontoGeografico) {
        this.pontoGeografico = pontoGeografico;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Logradouro getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 67 * hash + (this.logradouro != null ? this.logradouro.hashCode() : 0);
        hash = 67 * hash + (this.pessoa != null ? this.pessoa.hashCode() : 0);
        hash = 67 * hash + (this.numero != null ? this.numero.hashCode() : 0);
        hash = 67 * hash + (this.complemento != null ? this.complemento.hashCode() : 0);
        hash = 67 * hash + (this.tipoEnderecamento != null ? this.tipoEnderecamento.hashCode() : 0);
        hash = 67 * hash + (this.pontoGeografico != null ? this.pontoGeografico.hashCode() : 0);
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
        final Enderecamento other = (Enderecamento) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.logradouro != other.logradouro && (this.logradouro == null || !this.logradouro.equals(other.logradouro))) {
            return false;
        }
        if (this.pessoa != other.pessoa && (this.pessoa == null || !this.pessoa.equals(other.pessoa))) {
            return false;
        }
        if ((this.numero == null) ? (other.numero != null) : !this.numero.equals(other.numero)) {
            return false;
        }
        if ((this.complemento == null) ? (other.complemento != null) : !this.complemento.equals(other.complemento)) {
            return false;
        }
        if (this.tipoEnderecamento != other.tipoEnderecamento) {
            return false;
        }
        if (this.pontoGeografico != other.pontoGeografico && (this.pontoGeografico == null || !this.pontoGeografico.equals(other.pontoGeografico))) {
            return false;
        }
        return true;
    }
    
    
  
}
