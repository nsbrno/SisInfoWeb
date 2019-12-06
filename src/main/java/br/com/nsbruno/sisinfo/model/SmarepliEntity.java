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
@Table(name = "SMAREPLI")
public class SmarepliEntity {

    @Id
    @Column(name = "ID_SMAREPLI", table = "SMAREPLI", nullable = false)
    private Integer idSmarepli;

    @Basic
    @Column(name = "ID_SMAARQUI", table = "SMAREPLI")
    private Integer idSmaarqui;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMAREPLI", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMAREPLI", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMAREPLI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMAREPLI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMAREPLI")
    private Integer ctInteg;

    @Basic
    @Column(name = "SEQUENCIA", table = "SMAREPLI")
    private Integer sequencia;

    @Basic
    @Column(name = "TIPO", table = "SMAREPLI")
    private String tipo;

    @Basic
    @Column(name = "CAMPO", table = "SMAREPLI", length = 40)
    private String campo;

    public Integer getIdSmarepli() {
        return idSmarepli;
    }

    public void setIdSmarepli(Integer idSmarepli) {
        this.idSmarepli = idSmarepli;
    }

    public Integer getIdSmaarqui() {
        return idSmaarqui;
    }

    public void setIdSmaarqui(Integer idSmaarqui) {
        this.idSmaarqui = idSmaarqui;
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

    public Integer getSequencia() {
        return sequencia;
    }

    public void setSequencia(Integer sequencia) {
        this.sequencia = sequencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

}