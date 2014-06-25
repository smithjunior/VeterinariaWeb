package modelo;

public class Enderecamento {

    private Logradouro logradouro;
    private Pessoa pessoa;
    private String numero;
    private String complemento;
    private TipoEnderecoEnum tipoEnderecamento;
    private PontoGeografico pontoGeografico;

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
