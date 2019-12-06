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
@Table(name = "SMADIRTE")
public class SmadirteEntity {

    @Id
    @Column(name = "ID_SMADIRTE", table = "SMADIRTE", nullable = false)
    private Integer idSmadirte;

    @Basic
    @Column(name = "ID_SMAARQUI", table = "SMADIRTE")
    private Integer idSmaarqui;

    @Basic
    @Column(name = "ID_SMAUSUAR", table = "SMADIRTE")
    private Integer idSmausuar;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMADIRTE", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMADIRTE", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMADIRTE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMADIRTE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMADIRTE")
    private Integer ctInteg;

    @Basic
    @Column(name = "CAMPO", table = "SMADIRTE", length = 40)
    private String campo;

    @Basic
    @Column(name = "FORMATO", table = "SMADIRTE")
    private String formato;

    public Integer getIdSmadirte() {
        return idSmadirte;
    }

    public void setIdSmadirte(Integer idSmadirte) {
        this.idSmadirte = idSmadirte;
    }

    public Integer getIdSmaarqui() {
        return idSmaarqui;
    }

    public void setIdSmaarqui(Integer idSmaarqui) {
        this.idSmaarqui = idSmaarqui;
    }

    public Integer getIdSmausuar() {
        return idSmausuar;
    }

    public void setIdSmausuar(Integer idSmausuar) {
        this.idSmausuar = idSmausuar;
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

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

}