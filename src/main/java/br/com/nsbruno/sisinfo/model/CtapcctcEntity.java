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
@Table(name = "CTAPCCTC")
public class CtapcctcEntity {

    @Id
    @Column(name = "ID_CTAPCCTC", table = "CTAPCCTC", nullable = false)
    private Integer idCtapcctc;

    @Basic
    @Column(name = "ID_CTAPLCTA", table = "CTAPCCTC")
    private Integer idCtaplcta;

    @Basic
    @Column(name = "ID_CTACTCUS", table = "CTAPCCTC")
    private Integer idCtactcus;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CTAPCCTC", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CTAPCCTC", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CTAPCCTC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CTAPCCTC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CTAPCCTC")
    private Integer ctInteg;

    @Basic
    @Column(name = "DATA", table = "CTAPCCTC")
    @Temporal(TemporalType.DATE)
    private Date data;

    @Basic(optional = false)
    @Column(name = "SALDO_ANT_CRE", table = "CTAPCCTC", nullable = false)
    private double saldoAntCre;

    @Basic(optional = false)
    @Column(name = "SALDO_ANT_DEB", table = "CTAPCCTC", nullable = false)
    private double saldoAntDeb;

    @Basic(optional = false)
    @Column(name = "VALOR_CRE", table = "CTAPCCTC", nullable = false)
    private double valorCre;

    @Basic(optional = false)
    @Column(name = "VALOR_DEB", table = "CTAPCCTC", nullable = false)
    private double valorDeb;

    public Integer getIdCtapcctc() {
        return idCtapcctc;
    }

    public void setIdCtapcctc(Integer idCtapcctc) {
        this.idCtapcctc = idCtapcctc;
    }

    public Integer getIdCtaplcta() {
        return idCtaplcta;
    }

    public void setIdCtaplcta(Integer idCtaplcta) {
        this.idCtaplcta = idCtaplcta;
    }

    public Integer getIdCtactcus() {
        return idCtactcus;
    }

    public void setIdCtactcus(Integer idCtactcus) {
        this.idCtactcus = idCtactcus;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getSaldoAntCre() {
        return saldoAntCre;
    }

    public void setSaldoAntCre(double saldoAntCre) {
        this.saldoAntCre = saldoAntCre;
    }

    public double getSaldoAntDeb() {
        return saldoAntDeb;
    }

    public void setSaldoAntDeb(double saldoAntDeb) {
        this.saldoAntDeb = saldoAntDeb;
    }

    public double getValorCre() {
        return valorCre;
    }

    public void setValorCre(double valorCre) {
        this.valorCre = valorCre;
    }

    public double getValorDeb() {
        return valorDeb;
    }

    public void setValorDeb(double valorDeb) {
        this.valorDeb = valorDeb;
    }

}