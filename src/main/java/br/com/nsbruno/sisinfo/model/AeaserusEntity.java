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
@Table(name = "AEASERUS")
public class AeaserusEntity {

    @Id
    @Column(name = "ID_AEASERUS", table = "AEASERUS", nullable = false)
    private Integer idAeaserus;

    @Basic
    @Column(name = "ID_AEASERIE", table = "AEASERUS")
    private Integer idAeaserie;

    @Basic
    @Column(name = "ID_SMAUSUAR", table = "AEASERUS")
    private Integer idSmausuar;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEASERUS", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEASERUS", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEASERUS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEASERUS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEASERUS")
    private Integer ctInteg;

    public Integer getIdAeaserus() {
        return idAeaserus;
    }

    public void setIdAeaserus(Integer idAeaserus) {
        this.idAeaserus = idAeaserus;
    }

    public Integer getIdAeaserie() {
        return idAeaserie;
    }

    public void setIdAeaserie(Integer idAeaserie) {
        this.idAeaserie = idAeaserie;
    }

    public Integer getIdSmausuar() {
        return idSmausuar;
    }

    public void setIdSmausuar(Integer idSmausuar) {
        this.idSmausuar = idSmausuar;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
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

}