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
@Table(name = "AEAIMCFO")
public class AeaimcfoEntity {

    @Id
    @Column(name = "ID_AEAIMCFO", table = "AEAIMCFO", nullable = false)
    private Integer idAeaimcfo;

    @Basic(optional = false)
    @Column(name = "ID_AEAITMFI", table = "AEAIMCFO", nullable = false)
    private Integer idAeaitmfi;

    @Basic(optional = false)
    @Column(name = "ID_CFANATOP", table = "AEAIMCFO", nullable = false)
    private Integer idCfanatop;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAIMCFO", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAIMCFO", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAIMCFO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAIMCFO")
    private Integer ctInteg;

    @Basic
    @Column(name = "DT_CAD", table = "AEAIMCFO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "PROD_SERV", table = "AEAIMCFO")
    private String prodServ;

    @Basic
    @Column(name = "TIPO", table = "AEAIMCFO")
    private String tipo;

    @Basic(optional = false)
    @Column(name = "PERCENTUAL", table = "AEAIMCFO", nullable = false)
    private double percentual;

    @Basic(optional = false)
    @Column(name = "VL_BASE_CALC", table = "AEAIMCFO", nullable = false)
    private double vlBaseCalc;

    @Basic(optional = false)
    @Column(name = "VALOR", table = "AEAIMCFO", nullable = false)
    private double valor;

    public Integer getIdAeaimcfo() {
        return idAeaimcfo;
    }

    public void setIdAeaimcfo(Integer idAeaimcfo) {
        this.idAeaimcfo = idAeaimcfo;
    }

    public Integer getIdAeaitmfi() {
        return idAeaitmfi;
    }

    public void setIdAeaitmfi(Integer idAeaitmfi) {
        this.idAeaitmfi = idAeaitmfi;
    }

    public Integer getIdCfanatop() {
        return idCfanatop;
    }

    public void setIdCfanatop(Integer idCfanatop) {
        this.idCfanatop = idCfanatop;
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

    public Date getDtCad() {
        return dtCad;
    }

    public void setDtCad(Date dtCad) {
        this.dtCad = dtCad;
    }

    public String getProdServ() {
        return prodServ;
    }

    public void setProdServ(String prodServ) {
        this.prodServ = prodServ;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public double getVlBaseCalc() {
        return vlBaseCalc;
    }

    public void setVlBaseCalc(double vlBaseCalc) {
        this.vlBaseCalc = vlBaseCalc;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}