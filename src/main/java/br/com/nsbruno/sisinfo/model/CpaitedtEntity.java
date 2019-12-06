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
@Table(name = "CPAITEDT")
public class CpaitedtEntity {

    @Id
    @Column(name = "ID_CPAITEDT", table = "CPAITEDT", nullable = false)
    private Integer idCpaitedt;

    @Basic
    @Column(name = "ID_CPAEDITA", table = "CPAITEDT")
    private Integer idCpaedita;

    @Basic(optional = false)
    @Column(name = "ID_CPAAPONT", table = "CPAITEDT", nullable = false)
    private int idCpaapont;

    @Basic
    @Column(name = "US_CAD", table = "CPAITEDT", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CPAITEDT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CPAITEDT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CPAITEDT")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CPAITEDT", nullable = false, length = 16)
    private String guid;

    public Integer getIdCpaitedt() {
        return idCpaitedt;
    }

    public void setIdCpaitedt(Integer idCpaitedt) {
        this.idCpaitedt = idCpaitedt;
    }

    public Integer getIdCpaedita() {
        return idCpaedita;
    }

    public void setIdCpaedita(Integer idCpaedita) {
        this.idCpaedita = idCpaedita;
    }

    public int getIdCpaapont() {
        return idCpaapont;
    }

    public void setIdCpaapont(int idCpaapont) {
        this.idCpaapont = idCpaapont;
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

}