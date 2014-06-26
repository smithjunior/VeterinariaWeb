package modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Enderecamento {
    @EmbeddedId
    private EnderecamentoPk id;
    @Column(name="numero",length = 30,nullable = false)
    private String numero;
    @Column(name = "complemento",length = 100,nullable = false)
    private String complemento;
    @Enumerated(EnumType.STRING)
    private TipoEnderecoEnum tipoEnderecamento;
    @OneToOne(fetch = FetchType.LAZY)
    private PontoGeografico pontoGeografico;

    public EnderecamentoPk getId() {
        return id;
    }

    public void setId(EnderecamentoPk id) {
        this.id = id;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 83 * hash + (this.numero != null ? this.numero.hashCode() : 0);
        hash = 83 * hash + (this.complemento != null ? this.complemento.hashCode() : 0);
        hash = 83 * hash + (this.tipoEnderecamento != null ? this.tipoEnderecamento.hashCode() : 0);
        hash = 83 * hash + (this.pontoGeografico != null ? this.pontoGeografico.hashCode() : 0);
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
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
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
