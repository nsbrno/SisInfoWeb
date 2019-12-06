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
@Table(name = "AEALOCEQ")
public class AealoceqEntity {

    @Id
    @Column(name = "ID_AEALOCEQ", table = "AEALOCEQ", nullable = false)
    private Integer idAealoceq;

    @Basic(optional = false)
    @Column(name = "ID_CFAEQUIP", table = "AEALOCEQ", nullable = false)
    private int idCfaequip;

    @Basic(optional = false)
    @Column(name = "ID_AEAESTOQ", table = "AEALOCEQ", nullable = false)
    private int idAeaestoq;

    @Basic
    @Column(name = "ID_AEAEVEST", table = "AEALOCEQ")
    private Integer idAeaevest;

    @Basic
    @Column(name = "ID_AEAITTRA", table = "AEALOCEQ")
    private Integer idAeaittra;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEALOCEQ", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEALOCEQ", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEALOCEQ")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEALOCEQ")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEALOCEQ")
    private Integer ctInteg;

    @Basic
    @Column(name = "DT_MOVIMENTO", table = "AEALOCEQ")
    @Temporal(TemporalType.DATE)
    private Date dtMovimento;

    @Basic(optional = false)
    @Column(name = "PESO", table = "AEALOCEQ", nullable = false)
    private double peso;

    @Basic(optional = false)
    @Column(name = "KM", table = "AEALOCEQ", nullable = false)
    private double km;

    public Integer getIdAealoceq() {
        return idAealoceq;
    }

    public void setIdAealoceq(Integer idAealoceq) {
        this.idAealoceq = idAealoceq;
    }

    public int getIdCfaequip() {
        return idCfaequip;
    }

    public void setIdCfaequip(int idCfaequip) {
        this.idCfaequip = idCfaequip;
    }

    public int getIdAeaestoq() {
        return idAeaestoq;
    }

    public void setIdAeaestoq(int idAeaestoq) {
        this.idAeaestoq = idAeaestoq;
    }

    public Integer getIdAeaevest() {
        return idAeaevest;
    }

    public void setIdAeaevest(Integer idAeaevest) {
        this.idAeaevest = idAeaevest;
    }

    public Integer getIdAeaittra() {
        return idAeaittra;
    }

    public void setIdAeaittra(Integer idAeaittra) {
        this.idAeaittra = idAeaittra;
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

    public Date getDtMovimento() {
        return dtMovimento;
    }

    public void setDtMovimento(Date dtMovimento) {
        this.dtMovimento = dtMovimento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

}