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
@Table(name = "SMARLPRN")
public class SmarlprnEntity {

    @Id
    @Column(name = "ID_SMARLPRN", table = "SMARLPRN", nullable = false)
    private Integer idSmarlprn;

    @Basic(optional = false)
    @Column(name = "ID_SMAUSURL", table = "SMARLPRN", nullable = false)
    private int idSmausurl;

    @Basic
    @Column(name = "ID_SMAUSUAR", table = "SMARLPRN")
    private Integer idSmausuar;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMARLPRN", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMARLPRN", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMARLPRN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMARLPRN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMARLPRN")
    private Integer ctInteg;

    @Basic
    @Column(name = "MICRO", table = "SMARLPRN", length = 40)
    private String micro;

    @Basic
    @Column(name = "IMPRESSORA", table = "SMARLPRN", length = 40)
    private String impressora;

    public Integer getIdSmarlprn() {
        return idSmarlprn;
    }

    public void setIdSmarlprn(Integer idSmarlprn) {
        this.idSmarlprn = idSmarlprn;
    }

    public int getIdSmausurl() {
        return idSmausurl;
    }

    public void setIdSmausurl(int idSmausurl) {
        this.idSmausurl = idSmausurl;
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

    public String getMicro() {
        return micro;
    }

    public void setMicro(String micro) {
        this.micro = micro;
    }

    public String getImpressora() {
        return impressora;
    }

    public void setImpressora(String impressora) {
        this.impressora = impressora;
    }

}