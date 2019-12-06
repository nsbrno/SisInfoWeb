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
@Table(name = "AEAREFER")
public class AeareferEntity {

    @Id
    @Column(name = "ID_AEAREFER", table = "AEAREFER", nullable = false)
    private Integer idAearefer;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAREFER", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAREFER", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAREFER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAREFER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAREFER")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "AEAREFER", nullable = false, length = 50)
    private String descricao;

    public Integer getIdAearefer() {
        return idAearefer;
    }

    public void setIdAearefer(Integer idAearefer) {
        this.idAearefer = idAearefer;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}