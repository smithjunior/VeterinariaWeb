package modelo;

import java.util.Calendar;

public class RealizaProcedimento {

    private Animal animal;
    private Procedimento procedimento;
    private Calendar dataHora=  Calendar.getInstance();
    private String observacao;
    private Veterinario veterinario;

    public RealizaProcedimento() {
    }

    public RealizaProcedimento(Animal animal, Procedimento procedimento) {
        this.animal = animal;
        this.procedimento = procedimento;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Procedimento getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(Procedimento procedimento) {
        this.procedimento = procedimento;
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
        hash = 79 * hash + (this.animal != null ? this.animal.hashCode() : 0);
        hash = 79 * hash + (this.procedimento != null ? this.procedimento.hashCode() : 0);
        hash = 79 * hash + (this.dataHora != null ? this.dataHora.hashCode() : 0);
        hash = 79 * hash + (this.observacao != null ? this.observacao.hashCode() : 0);
        hash = 79 * hash + (this.veterinario != null ? this.veterinario.hashCode() : 0);
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
        if (this.animal != other.animal && (this.animal == null || !this.animal.equals(other.animal))) {
            return false;
        }
        if (this.procedimento != other.procedimento && (this.procedimento == null || !this.procedimento.equals(other.procedimento))) {
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