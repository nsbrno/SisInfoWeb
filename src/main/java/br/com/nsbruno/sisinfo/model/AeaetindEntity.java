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
@Table(name = "AEAETIND")
public class AeaetindEntity {

    @Id
    @Column(name = "ID_AEAETIND", table = "AEAETIND", nullable = false)
    private Integer idAeaetind;

    @Basic(optional = false)
    @Column(name = "ID_AEAITIND", table = "AEAETIND", nullable = false)
    private int idAeaitind;

    @Basic(optional = false)
    @Column(name = "ID_AEAETPRD", table = "AEAETIND", nullable = false)
    private int idAeaetprd;

    @Basic
    @Column(name = "US_CAD", table = "AEAETIND", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAETIND")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAETIND")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAETIND")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAETIND", nullable = false, length = 16)
    private String guid;

    @Basic(optional = false)
    @Column(name = "DT_MOVIMENTO", table = "AEAETIND", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtMovimento;

    @Basic
    @Column(name = "MIN_GASTOS", table = "AEAETIND")
    private Integer minGastos;

    public Integer getIdAeaetind() {
        return idAeaetind;
    }

    public void setIdAeaetind(Integer idAeaetind) {
        this.idAeaetind = idAeaetind;
    }

    public int getIdAeaitind() {
        return idAeaitind;
    }

    public void setIdAeaitind(int idAeaitind) {
        this.idAeaitind = idAeaitind;
    }

    public int getIdAeaetprd() {
        return idAeaetprd;
    }

    public void setIdAeaetprd(int idAeaetprd) {
        this.idAeaetprd = idAeaetprd;
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

    public Date getDtMovimento() {
        return dtMovimento;
    }

    public void setDtMovimento(Date dtMovimento) {
        this.dtMovimento = dtMovimento;
    }

    public Integer getMinGastos() {
        return minGastos;
    }

    public void setMinGastos(Integer minGastos) {
        this.minGastos = minGastos;
    }

}