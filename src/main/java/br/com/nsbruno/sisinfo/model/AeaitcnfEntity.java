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
@Table(name = "AEAITCNF")
public class AeaitcnfEntity {

    @Id
    @Column(name = "ID_AEAITCNF", table = "AEAITCNF", nullable = false)
    private Integer idAeaitcnf;

    @Basic
    @Column(name = "ID_AEAITSAI", table = "AEAITCNF")
    private Integer idAeaitsai;

    @Basic
    @Column(name = "ID_AEAITROM", table = "AEAITCNF")
    private Integer idAeaitrom;

    @Basic
    @Column(name = "ID_AEAITENT", table = "AEAITCNF")
    private Integer idAeaitent;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAITCNF", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAITCNF", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAITCNF")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAITCNF")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAITCNF")
    private Integer ctInteg;

    @Basic
    @Column(name = "DT_CONFERENCIA", table = "AEAITCNF")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtConferencia;

    @Basic(optional = false)
    @Column(name = "QUANTIDADE", table = "AEAITCNF", nullable = false)
    private double quantidade;

    @Lob
    @Basic
    @Column(name = "OBS", table = "AEAITCNF")
    private byte[] obs;

    @Basic
    @Column(name = "SITUACAO", table = "AEAITCNF")
    private String situacao;

    @Basic
    @Column(name = "BAIXA_POR_CONF", table = "AEAITCNF")
    private String baixaPorConf;

    @Basic
    @Column(name = "TRANSACAO", table = "AEAITCNF")
    private Integer transacao;

    public Integer getIdAeaitcnf() {
        return idAeaitcnf;
    }

    public void setIdAeaitcnf(Integer idAeaitcnf) {
        this.idAeaitcnf = idAeaitcnf;
    }

    public Integer getIdAeaitsai() {
        return idAeaitsai;
    }

    public void setIdAeaitsai(Integer idAeaitsai) {
        this.idAeaitsai = idAeaitsai;
    }

    public Integer getIdAeaitrom() {
        return idAeaitrom;
    }

    public void setIdAeaitrom(Integer idAeaitrom) {
        this.idAeaitrom = idAeaitrom;
    }

    public Integer getIdAeaitent() {
        return idAeaitent;
    }

    public void setIdAeaitent(Integer idAeaitent) {
        this.idAeaitent = idAeaitent;
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

    public Date getDtConferencia() {
        return dtConferencia;
    }

    public void setDtConferencia(Date dtConferencia) {
        this.dtConferencia = dtConferencia;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public byte[] getObs() {
        return obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getBaixaPorConf() {
        return baixaPorConf;
    }

    public void setBaixaPorConf(String baixaPorConf) {
        this.baixaPorConf = baixaPorConf;
    }

    public Integer getTransacao() {
        return transacao;
    }

    public void setTransacao(Integer transacao) {
        this.transacao = transacao;
    }

}