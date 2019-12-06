package br.com.nsbruno.sisinfo.model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "RPAHISTO")
public class RpahistoEntity {

    @Id
    @Column(name = "ID_RPAHISTO", table = "RPAHISTO", nullable = false)
    private Integer idRpahisto;

    @Basic
    @Column(name = "ID_RPAPARCE", table = "RPAHISTO")
    private Integer idRpaparce;

    @Basic(optional = false)
    @Column(name = "ID_CFACLIFO", table = "RPAHISTO", nullable = false)
    private int idCfaclifo;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "RPAHISTO", nullable = false)
    private int idSmaempre;

    @Basic
    @Column(name = "ID_CFATPCOB_ANT", table = "RPAHISTO")
    private Integer idCfatpcobAnt;

    @Basic
    @Column(name = "ID_CFATPCOB", table = "RPAHISTO")
    private Integer idCfatpcob;

    @Basic
    @Column(name = "ID_RPAHIPAD", table = "RPAHISTO")
    private Integer idRpahipad;

    @Basic(optional = false)
    @Column(name = "GUID", table = "RPAHISTO", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "RPAHISTO", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "RPAHISTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "RPAHISTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "RPAHISTO")
    private Integer ctInteg;

    @Basic
    @Column(name = "DT_MOVIMENTO", table = "RPAHISTO")
    @Temporal(TemporalType.DATE)
    private Date dtMovimento;

    @Basic
    @Column(name = "DT_PROXIMO_CONTATO", table = "RPAHISTO")
    @Temporal(TemporalType.DATE)
    private Date dtProximoContato;

    @Lob
    @Basic
    @Column(name = "OBS", table = "RPAHISTO")
    private byte[] obs;

    public Integer getIdRpahisto() {
        return idRpahisto;
    }

    public void setIdRpahisto(Integer idRpahisto) {
        this.idRpahisto = idRpahisto;
    }

    public Integer getIdRpaparce() {
        return idRpaparce;
    }

    public void setIdRpaparce(Integer idRpaparce) {
        this.idRpaparce = idRpaparce;
    }

    public int getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(int idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public int getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(int idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdCfatpcobAnt() {
        return idCfatpcobAnt;
    }

    public void setIdCfatpcobAnt(Integer idCfatpcobAnt) {
        this.idCfatpcobAnt = idCfatpcobAnt;
    }

    public Integer getIdCfatpcob() {
        return idCfatpcob;
    }

    public void setIdCfatpcob(Integer idCfatpcob) {
        this.idCfatpcob = idCfatpcob;
    }

    public Integer getIdRpahipad() {
        return idRpahipad;
    }

    public void setIdRpahipad(Integer idRpahipad) {
        this.idRpahipad = idRpahipad;
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

    public Date getDtProximoContato() {
        return dtProximoContato;
    }

    public void setDtProximoContato(Date dtProximoContato) {
        this.dtProximoContato = dtProximoContato;
    }

    public byte[] getObs() {
        return obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

}