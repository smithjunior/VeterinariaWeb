package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PontoGeografico {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "descricao",nullable = false,length = 80)
    private String descricao;
    @Column(name = "latitude",nullable = false,length = 10)
    private String latitude;
    @Column(name = "longitude",nullable = false,length = 10)
    private String longitude;
    @ManyToOne(fetch = FetchType.LAZY)
    private TipoLocal tipoLocal;

    public PontoGeografico() {
    }

    public PontoGeografico(long id) {
        this.id = id;
    }

    public PontoGeografico(long id, String descricao, String latitude, String longitude, TipoLocal tipoLocal) {
        this.id = id;
        this.descricao = descricao;
        this.latitude = latitude;
        this.longitude = longitude;
        this.tipoLocal = tipoLocal;
    }    
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public TipoLocal getTipoLocal() {
        return tipoLocal;
    }

    public void setTipoLocal(TipoLocal tipoLocal) {
        this.tipoLocal = tipoLocal;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 11 * hash + (this.descricao != null ? this.descricao.hashCode() : 0);
        hash = 11 * hash + (this.latitude != null ? this.latitude.hashCode() : 0);
        hash = 11 * hash + (this.longitude != null ? this.longitude.hashCode() : 0);
        hash = 11 * hash + (this.tipoLocal != null ? this.tipoLocal.hashCode() : 0);
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
        final PontoGeografico other = (PontoGeografico) obj;
        if (this.id != other.id) {
            return false;
        }
        if ((this.descricao == null) ? (other.descricao != null) : !this.descricao.equals(other.descricao)) {
            return false;
        }
        if ((this.latitude == null) ? (other.latitude != null) : !this.latitude.equals(other.latitude)) {
            return false;
        }
        if ((this.longitude == null) ? (other.longitude != null) : !this.longitude.equals(other.longitude)) {
            return false;
        }
        if (this.tipoLocal != other.tipoLocal && (this.tipoLocal == null || !this.tipoLocal.equals(other.tipoLocal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return descricao;
    }
    
    
}
