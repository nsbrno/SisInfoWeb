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
@Table(name = "CBAITCON")
public class CbaitconEntity {

    @Id
    @Column(name = "ID_CBAITCON", table = "CBAITCON", nullable = false)
    private Integer idCbaitcon;

    @Basic
    @Column(name = "ID_CBALANCA", table = "CBAITCON")
    private Integer idCbalanca;

    @Basic
    @Column(name = "ID_CBAPARTI", table = "CBAITCON")
    private Integer idCbaparti;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CBAITCON", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CBAITCON", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CBAITCON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CBAITCON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CBAITCON")
    private Integer ctInteg;

    @Basic
    @Column(name = "DT_CONCILIACAO", table = "CBAITCON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtConciliacao;

    @Basic(optional = false)
    @Column(name = "VL_CONCILIADO", table = "CBAITCON", nullable = false)
    private double vlConciliado;

    public Integer getIdCbaitcon() {
        return idCbaitcon;
    }

    public void setIdCbaitcon(Integer idCbaitcon) {
        this.idCbaitcon = idCbaitcon;
    }

    public Integer getIdCbalanca() {
        return idCbalanca;
    }

    public void setIdCbalanca(Integer idCbalanca) {
        this.idCbalanca = idCbalanca;
    }

    public Integer getIdCbaparti() {
        return idCbaparti;
    }

    public void setIdCbaparti(Integer idCbaparti) {
        this.idCbaparti = idCbaparti;
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

    public Date getDtConciliacao() {
        return dtConciliacao;
    }

    public void setDtConciliacao(Date dtConciliacao) {
        this.dtConciliacao = dtConciliacao;
    }

    public double getVlConciliado() {
        return vlConciliado;
    }

    public void setVlConciliado(double vlConciliado) {
        this.vlConciliado = vlConciliado;
    }

}