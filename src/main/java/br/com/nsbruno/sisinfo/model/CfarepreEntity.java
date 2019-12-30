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
@Table(name = "CFAREPRE")
public class CfarepreEntity {

    @Id
    @Column(name = "ID_CFAREPRE", table = "CFAREPRE", nullable = false)
    private Integer idCfarepre;

    @Basic(optional = false)
    @Column(name = "ID_CFACLIFO_REPRE", table = "CFAREPRE", nullable = false)
    private Integer idCfaclifoRepre;

    @Basic(optional = false)
    @Column(name = "ID_CFACLIFO", table = "CFAREPRE", nullable = false)
    private Integer idCfaclifo;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFAREPRE", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFAREPRE", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFAREPRE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFAREPRE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFAREPRE")
    private Integer ctInteg;

    public Integer getIdCfarepre() {
        return idCfarepre;
    }

    public void setIdCfarepre(Integer idCfarepre) {
        this.idCfarepre = idCfarepre;
    }

    public Integer getIdCfaclifoRepre() {
        return idCfaclifoRepre;
    }

    public void setIdCfaclifoRepre(Integer idCfaclifoRepre) {
        this.idCfaclifoRepre = idCfaclifoRepre;
    }

    public Integer getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
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