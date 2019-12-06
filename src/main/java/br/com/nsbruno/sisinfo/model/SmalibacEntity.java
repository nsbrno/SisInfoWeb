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
@Table(name = "SMALIBAC")
public class SmalibacEntity {

    @Id
    @Column(name = "ID_SMALIBAC", table = "SMALIBAC", nullable = false)
    private Integer idSmalibac;

    @Basic
    @Column(name = "ID_SMALIBER", table = "SMALIBAC")
    private Integer idSmaliber;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMALIBAC", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMALIBAC", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMALIBAC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMALIBAC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMALIBAC")
    private Integer ctInteg;

    @Basic
    @Column(name = "COD_TRANSACAO", table = "SMALIBAC")
    private Integer codTransacao;

    @Basic
    @Column(name = "USER_ADDR", table = "SMALIBAC", length = 20)
    private String userAddr;

    @Basic
    @Column(name = "ACAO", table = "SMALIBAC")
    private String acao;

    @Basic
    @Column(name = "OBS", table = "SMALIBAC", length = 128)
    private String obs;

    public Integer getIdSmalibac() {
        return idSmalibac;
    }

    public void setIdSmalibac(Integer idSmalibac) {
        this.idSmalibac = idSmalibac;
    }

    public Integer getIdSmaliber() {
        return idSmaliber;
    }

    public void setIdSmaliber(Integer idSmaliber) {
        this.idSmaliber = idSmaliber;
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

    public Integer getCodTransacao() {
        return codTransacao;
    }

    public void setCodTransacao(Integer codTransacao) {
        this.codTransacao = codTransacao;
    }

    public String getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

}