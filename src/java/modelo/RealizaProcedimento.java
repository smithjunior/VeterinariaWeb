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
@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "procedimento_id","animal_id","dataHora","veterinario"})) 
public class RealizaProcedimento implements Serializable {

    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    private Procedimento procedimento;
    @ManyToOne
    private Animal animal;
    @Column(name="dataHora",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataHora=  Calendar.getInstance();
    @Column(name="observacao",nullable = false,length = Integer.MAX_VALUE)
    private String observacao;
    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name="veterinario",nullable = false)
    private Veterinario veterinario;

    public RealizaProcedimento() {
    }

    public RealizaProcedimento(long id) {
        this.id = id;
    }

    public RealizaProcedimento(long id, Procedimento procedimento) {
        this.id = id;
        this.procedimento = procedimento;
    }

    public RealizaProcedimento(long id, Procedimento procedimento, Animal animal) {
        this.id = id;
        this.procedimento = procedimento;
        this.animal = animal;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Procedimento getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(Procedimento procedimento) {
        this.procedimento = procedimento;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 13 * hash + (this.procedimento != null ? this.procedimento.hashCode() : 0);
        hash = 13 * hash + (this.animal != null ? this.animal.hashCode() : 0);
        hash = 13 * hash + (this.dataHora != null ? this.dataHora.hashCode() : 0);
        hash = 13 * hash + (this.observacao != null ? this.observacao.hashCode() : 0);
        hash = 13 * hash + (this.veterinario != null ? this.veterinario.hashCode() : 0);
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
        if (this.id != other.id) {
            return false;
        }
        if (this.procedimento != other.procedimento && (this.procedimento == null || !this.procedimento.equals(other.procedimento))) {
            return false;
        }
        if (this.animal != other.animal && (this.animal == null || !this.animal.equals(other.animal))) {
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