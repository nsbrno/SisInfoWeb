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
@Table(name = "CFAAVALI")
public class CfaavaliEntity {

    @Id
    @Column(name = "ID_CFAAVALI", table = "CFAAVALI", nullable = false)
    private Integer idCfaavali;

    @Basic(optional = false)
    @Column(name = "ID_CFACLIFO", table = "CFAAVALI", nullable = false)
    private Integer idCfaclifo;

    @Basic(optional = false)
    @Column(name = "ID_CFACLIFO_AVAL", table = "CFAAVALI", nullable = false)
    private Integer idCfaclifoAval;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFAAVALI", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFAAVALI", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFAAVALI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFAAVALI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFAAVALI")
    private Integer ctInteg;

    public Integer getIdCfaavali() {
        return idCfaavali;
    }

    public void setIdCfaavali(Integer idCfaavali) {
        this.idCfaavali = idCfaavali;
    }

    public Integer getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public Integer getIdCfaclifoAval() {
        return idCfaclifoAval;
    }

    public void setIdCfaclifoAval(Integer idCfaclifoAval) {
        this.idCfaclifoAval = idCfaclifoAval;
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