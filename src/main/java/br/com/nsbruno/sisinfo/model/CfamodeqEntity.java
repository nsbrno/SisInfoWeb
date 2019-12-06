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
@Table(name = "CFAMODEQ")
public class CfamodeqEntity {

    @Id
    @Column(name = "ID_CFAMODEQ", table = "CFAMODEQ", nullable = false)
    private Integer idCfamodeq;

    @Basic
    @Column(name = "US_CAD", table = "CFAMODEQ", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFAMODEQ")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFAMODEQ")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFAMODEQ")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFAMODEQ", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "DESCRICAO", table = "CFAMODEQ", length = 40)
    private String descricao;

    public Integer getIdCfamodeq() {
        return idCfamodeq;
    }

    public void setIdCfamodeq(Integer idCfamodeq) {
        this.idCfamodeq = idCfamodeq;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}