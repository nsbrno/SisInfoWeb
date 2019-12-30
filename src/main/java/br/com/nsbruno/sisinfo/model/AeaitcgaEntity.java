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
@Table(name = "AEAITCGA")
public class AeaitcgaEntity {

    @Id
    @Column(name = "ID_AEAITCGA", table = "AEAITCGA", nullable = false)
    private Integer idAeaitcga;

    @Basic(optional = false)
    @Column(name = "ID_AEACARGA", table = "AEAITCGA", nullable = false)
    private Integer idAeacarga;

    @Basic(optional = false)
    @Column(name = "ID_AEAROMAN", table = "AEAITCGA", nullable = false)
    private Integer idAearoman;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAITCGA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAITCGA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAITCGA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAITCGA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAITCGA")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "SEQUENCIA", table = "AEAITCGA", nullable = false)
    private Integer sequencia;

    @Basic(optional = false)
    @Column(name = "VL_ROMANEIO", table = "AEAITCGA", nullable = false)
    private double vlRomaneio;

    public Integer getIdAeaitcga() {
        return idAeaitcga;
    }

    public void setIdAeaitcga(Integer idAeaitcga) {
        this.idAeaitcga = idAeaitcga;
    }

    public Integer getIdAeacarga() {
        return idAeacarga;
    }

    public void setIdAeacarga(Integer idAeacarga) {
        this.idAeacarga = idAeacarga;
    }

    public Integer getIdAearoman() {
        return idAearoman;
    }

    public void setIdAearoman(Integer idAearoman) {
        this.idAearoman = idAearoman;
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

    public double getVlRomaneio() {
        return vlRomaneio;
    }

    public void setVlRomaneio(double vlRomaneio) {
        this.vlRomaneio = vlRomaneio;
    }

}