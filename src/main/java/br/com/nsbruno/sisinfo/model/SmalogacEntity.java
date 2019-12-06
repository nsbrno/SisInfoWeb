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
@Table(name = "SMALOGAC")
public class SmalogacEntity {

    @Id
    @Column(name = "ID_SMALOGAC", table = "SMALOGAC", nullable = false)
    private Integer idSmalogac;

    @Basic
    @Column(name = "DT_ALT", table = "SMALOGAC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic(optional = false)
    @Column(name = "US_CAD", table = "SMALOGAC", nullable = false, length = 20)
    private String usCad;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMALOGAC", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "TELA", table = "SMALOGAC", length = 12)
    private String tela;

    @Basic
    @Column(name = "DT_SAIU", table = "SMALOGAC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtSaiu;

    public Integer getIdSmalogac() {
        return idSmalogac;
    }

    public void setIdSmalogac(Integer idSmalogac) {
        this.idSmalogac = idSmalogac;
    }

    public Date getDtAlt() {
        return dtAlt;
    }

    public void setDtAlt(Date dtAlt) {
        this.dtAlt = dtAlt;
    }

    public String getUsCad() {
        return usCad;
    }

    public void setUsCad(String usCad) {
        this.usCad = usCad;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public Date getDtSaiu() {
        return dtSaiu;
    }

    public void setDtSaiu(Date dtSaiu) {
        this.dtSaiu = dtSaiu;
    }

}