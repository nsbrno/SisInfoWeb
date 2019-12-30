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
@Table(name = "CBASALDO")
public class CbasaldoEntity {

    @Id
    @Column(name = "ID_CBASALDO", table = "CBASALDO", nullable = false)
    private Integer idCbasaldo;

    @Basic
    @Column(name = "ID_SMAEMPRE", table = "CBASALDO")
    private Integer idSmaempre;

    @Basic(optional = false)
    @Column(name = "ID_CBAPLCTA", table = "CBASALDO", nullable = false)
    private Integer idCbaplcta;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CBASALDO", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CBASALDO", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CBASALDO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CBASALDO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CBASALDO")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "DT_MOVIMENTO", table = "CBASALDO", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtMovimento;

    @Basic(optional = false)
    @Column(name = "VL_ANTERIOR", table = "CBASALDO", nullable = false)
    private double vlAnterior;

    @Basic(optional = false)
    @Column(name = "VL_CREDITO", table = "CBASALDO", nullable = false)
    private double vlCredito;

    @Basic(optional = false)
    @Column(name = "VL_DEBITO", table = "CBASALDO", nullable = false)
    private double vlDebito;

    @Basic(optional = false)
    @Column(name = "VL_CON_ANTERIOR", table = "CBASALDO", nullable = false)
    private double vlConAnterior;

    @Basic(optional = false)
    @Column(name = "VL_CON_CREDITO", table = "CBASALDO", nullable = false)
    private double vlConCredito;

    @Basic(optional = false)
    @Column(name = "VL_CON_DEBITO", table = "CBASALDO", nullable = false)
    private double vlConDebito;

    public Integer getIdCbasaldo() {
        return idCbasaldo;
    }

    public void setIdCbasaldo(Integer idCbasaldo) {
        this.idCbasaldo = idCbasaldo;
    }

    public Integer getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(Integer idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdCbaplcta() {
        return idCbaplcta;
    }

    public void setIdCbaplcta(Integer idCbaplcta) {
        this.idCbaplcta = idCbaplcta;
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

    public double getVlAnterior() {
        return vlAnterior;
    }

    public void setVlAnterior(double vlAnterior) {
        this.vlAnterior = vlAnterior;
    }

    public double getVlCredito() {
        return vlCredito;
    }

    public void setVlCredito(double vlCredito) {
        this.vlCredito = vlCredito;
    }

    public double getVlDebito() {
        return vlDebito;
    }

    public void setVlDebito(double vlDebito) {
        this.vlDebito = vlDebito;
    }

    public double getVlConAnterior() {
        return vlConAnterior;
    }

    public void setVlConAnterior(double vlConAnterior) {
        this.vlConAnterior = vlConAnterior;
    }

    public double getVlConCredito() {
        return vlConCredito;
    }

    public void setVlConCredito(double vlConCredito) {
        this.vlConCredito = vlConCredito;
    }

    public double getVlConDebito() {
        return vlConDebito;
    }

    public void setVlConDebito(double vlConDebito) {
        this.vlConDebito = vlConDebito;
    }

}