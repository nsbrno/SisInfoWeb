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
@Table(name = "CFASELEC")
public class CfaselecEntity {

    @Id
    @Column(name = "ID_CFASELEC", table = "CFASELEC", nullable = false)
    private Integer idCfaselec;

    @Basic(optional = false)
    @Column(name = "ID_CFACLIFO", table = "CFASELEC", nullable = false)
    private int idCfaclifo;

    @Basic(optional = false)
    @Column(name = "ID_CFACLIFO_USUAR", table = "CFASELEC", nullable = false)
    private int idCfaclifoUsuar;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFASELEC", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFASELEC", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFASELEC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFASELEC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFASELEC")
    private Integer ctInteg;

    public Integer getIdCfaselec() {
        return idCfaselec;
    }

    public void setIdCfaselec(Integer idCfaselec) {
        this.idCfaselec = idCfaselec;
    }

    public int getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(int idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public int getIdCfaclifoUsuar() {
        return idCfaclifoUsuar;
    }

    public void setIdCfaclifoUsuar(int idCfaclifoUsuar) {
        this.idCfaclifoUsuar = idCfaclifoUsuar;
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