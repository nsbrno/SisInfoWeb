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
@Table(name = "AEAITRET")
public class AeaitretEntity {

    @Id
    @Column(name = "ID_AEAITRET", table = "AEAITRET", nullable = false)
    private Integer idAeaitret;

    @Basic(optional = false)
    @Column(name = "ID_AEAITSAI", table = "AEAITRET", nullable = false)
    private Integer idAeaitsai;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAITRET", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAITRET", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAITRET")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAITRET")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAITRET")
    private Integer ctInteg;

    @Basic
    @Column(name = "DT_RETORNO", table = "AEAITRET")
    @Temporal(TemporalType.DATE)
    private Date dtRetorno;

    @Basic(optional = false)
    @Column(name = "QUANTIDADE", table = "AEAITRET", nullable = false)
    private double quantidade;

    public Integer getIdAeaitret() {
        return idAeaitret;
    }

    public void setIdAeaitret(Integer idAeaitret) {
        this.idAeaitret = idAeaitret;
    }

    public Integer getIdAeaitsai() {
        return idAeaitsai;
    }

    public void setIdAeaitsai(Integer idAeaitsai) {
        this.idAeaitsai = idAeaitsai;
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

    public Date getDtRetorno() {
        return dtRetorno;
    }

    public void setDtRetorno(Date dtRetorno) {
        this.dtRetorno = dtRetorno;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

}