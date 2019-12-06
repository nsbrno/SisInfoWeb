package br.com.nsbruno.sisinfo.model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CCACLCON")
public class CcaclconEntity {

    @Id
    @Column(name = "ID_CCACLCON", table = "CCACLCON", nullable = false)
    private Integer idCcaclcon;

    @Basic
    @Column(name = "ID_CCACARGO", table = "CCACLCON")
    private Integer idCcacargo;

    @Basic
    @Column(name = "ID_CCACLASI", table = "CCACLCON")
    private Integer idCcaclasi;

    @Basic
    @Column(name = "US_CAD", table = "CCACLCON", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CCACLCON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CCACLCON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CCACLCON")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CCACLCON", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "ORDEM", table = "CCACLCON", length = 6)
    private String ordem;

    public Integer getIdCcaclcon() {
        return idCcaclcon;
    }

    public void setIdCcaclcon(Integer idCcaclcon) {
        this.idCcaclcon = idCcaclcon;
    }

    public Integer getIdCcacargo() {
        return idCcacargo;
    }

    public void setIdCcacargo(Integer idCcacargo) {
        this.idCcacargo = idCcacargo;
    }

    public Integer getIdCcaclasi() {
        return idCcaclasi;
    }

    public void setIdCcaclasi(Integer idCcaclasi) {
        this.idCcaclasi = idCcaclasi;
    }

    public String getUsCad() {
        return usCad;
    }

    public void setUsCad(String usCad) {
        this.usCad = usCad;
    }

    public Date getDtCad() {
        return dtCad;
    }

    public void setDtCad(Date dtCad) {
        this.dtCad = dtCad;
    }

    public Date getDtAlt() {
        return dtAlt;
    }

    public void setDtAlt(Date dtAlt) {
        this.dtAlt = dtAlt;
    }

    public Integer getCtInteg() {
        return ctInteg;
    }

    public void setCtInteg(Integer ctInteg) {
        this.ctInteg = ctInteg;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getOrdem() {
        return ordem;
    }

    public void setOrdem(String ordem) {
        this.ordem = ordem;
    }

}