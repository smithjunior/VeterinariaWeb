package modelo;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import org.hibernate.annotations.ManyToAny;
@Entity
public class Animal implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "nome",nullable = false,length = 100)
    private String nome;
    @Column(name = "nascimento", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar nascimento = Calendar.getInstance();
    @Column(name = "chip",nullable = false,length = 50)
    private String chip;
    @ManyToOne
    private Raca raca;
    @ManyToOne
    private Pelagem pelagem;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getNascimento() {
        return nascimento;
    }

    public void setNascimento(Calendar nascimento) {
        this.nascimento = nascimento;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public Pelagem getPelagem() {
        return pelagem;
    }

    public void setPelagem(Pelagem pelagem) {
        this.pelagem = pelagem;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 43 * hash + (this.nome != null ? this.nome.hashCode() : 0);
        hash = 43 * hash + (this.nascimento != null ? this.nascimento.hashCode() : 0);
        hash = 43 * hash + (this.chip != null ? this.chip.hashCode() : 0);
        hash = 43 * hash + (this.raca != null ? this.raca.hashCode() : 0);
        hash = 43 * hash + (this.pelagem != null ? this.pelagem.hashCode() : 0);
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
        final Animal other = (Animal) obj;
        if (this.id != other.id) {
            return false;
        }
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
            return false;
        }
        if (this.nascimento != other.nascimento && (this.nascimento == null || !this.nascimento.equals(other.nascimento))) {
            return false;
        }
        if ((this.chip == null) ? (other.chip != null) : !this.chip.equals(other.chip)) {
            return false;
        }
        if (this.raca != other.raca && (this.raca == null || !this.raca.equals(other.raca))) {
            return false;
        }
        if (this.pelagem != other.pelagem && (this.pelagem == null || !this.pelagem.equals(other.pelagem))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nome;
    }
    
}
