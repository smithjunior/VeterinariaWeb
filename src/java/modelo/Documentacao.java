package modelo;

import java.util.Calendar;

public class Documentacao {

    private Documento documento;
    private Pessoa pessoa;
    private String numero;
    private final Calendar expedicao = Calendar.getInstance();
    private PessoaJuridica orgao;

    public Documentacao() {
    }

    public Documentacao(Documento documento, Pessoa pessoa) {
        this.documento = documento;
        this.pessoa = pessoa;
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public PessoaJuridica getOrgao() {
        return orgao;
    }

    public void setOrgao(PessoaJuridica orgao) {
        this.orgao = orgao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + (this.documento != null ? this.documento.hashCode() : 0);
        hash = 11 * hash + (this.pessoa != null ? this.pessoa.hashCode() : 0);
        hash = 11 * hash + (this.numero != null ? this.numero.hashCode() : 0);
        hash = 11 * hash + (this.expedicao != null ? this.expedicao.hashCode() : 0);
        hash = 11 * hash + (this.orgao != null ? this.orgao.hashCode() : 0);
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

    @Override
    public String toString() {
        return  documento.getDescricao();
    }
    
    
}
