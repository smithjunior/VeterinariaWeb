package modelo;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class RealizaProcedimento {
    @EmbeddedId
    private RealizaProcedimentoPk id;
    @Column(name="dataHora",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataHora=  Calendar.getInstance();
    @Column(name="observacao",nullable = false,length = Integer.MAX_VALUE)
    private String observacao;
    @ManyToOne(fetch = FetchType.LAZY)
    private Veterinario veterinario;

    public RealizaProcedimento() {
    }

    public RealizaProcedimento(RealizaProcedimentoPk id) {
        this.id = id;
    }

    
    public RealizaProcedimentoPk getId() {
        return id;
    }

    public void setId(RealizaProcedimentoPk id) {
        this.id = id;
    }

    public Calendar getDataHora() {
        return dataHora;
    }

    public void setDataHora(Calendar dataHora) {
        this.dataHora = dataHora;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 53 * hash + (this.dataHora != null ? this.dataHora.hashCode() : 0);
        hash = 53 * hash + (this.observacao != null ? this.observacao.hashCode() : 0);
        hash = 53 * hash + (this.veterinario != null ? this.veterinario.hashCode() : 0);
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
        final RealizaProcedimento other = (RealizaProcedimento) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if (this.dataHora != other.dataHora && (this.dataHora == null || !this.dataHora.equals(other.dataHora))) {
            return false;
        }
        if ((this.observacao == null) ? (other.observacao != null) : !this.observacao.equals(other.observacao)) {
            return false;
        }
        if (this.veterinario != other.veterinario && (this.veterinario == null || !this.veterinario.equals(other.veterinario))) {
            return false;
        }
        return true;
    }

    
    
}