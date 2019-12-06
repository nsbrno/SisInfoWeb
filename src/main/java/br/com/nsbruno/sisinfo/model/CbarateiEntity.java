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
@Table(name = "CBARATEI")
public class CbarateiEntity {

    @Id
    @Column(name = "ID_CBARATEI", table = "CBARATEI", nullable = false)
    private Integer idCbaratei;

    @Basic
    @Column(name = "ID_CBAPARTI", table = "CBARATEI")
    private Integer idCbaparti;

    @Basic
    @Column(name = "ID_CBALANCA", table = "CBARATEI")
    private Integer idCbalanca;

    @Basic(optional = false)
    @Column(name = "ID_CBACTCUS", table = "CBARATEI", nullable = false)
    private int idCbactcus;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CBARATEI", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CBARATEI", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CBARATEI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CBARATEI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CBARATEI")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "VL_RATEIO", table = "CBARATEI", nullable = false)
    private double vlRateio;

    public Integer getIdCbaratei() {
        return idCbaratei;
    }

    public void setIdCbaratei(Integer idCbaratei) {
        this.idCbaratei = idCbaratei;
    }

    public Integer getIdCbaparti() {
        return idCbaparti;
    }

    public void setIdCbaparti(Integer idCbaparti) {
        this.idCbaparti = idCbaparti;
    }

    public Integer getIdCbalanca() {
        return idCbalanca;
    }

    public void setIdCbalanca(Integer idCbalanca) {
        this.idCbalanca = idCbalanca;
    }

    public int getIdCbactcus() {
        return idCbactcus;
    }

    public void setIdCbactcus(int idCbactcus) {
        this.idCbactcus = idCbactcus;
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

    public double getVlRateio() {
        return vlRateio;
    }

    public void setVlRateio(double vlRateio) {
        this.vlRateio = vlRateio;
    }

}