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
@Table(name = "CFACCRED")
public class CfaccredEntity {

    @Id
    @Column(name = "ID_CFACCRED", table = "CFACCRED", nullable = false)
    private Integer idCfaccred;

    @Basic
    @Column(name = "ID_CBAPLCTA_TAXA", table = "CFACCRED")
    private Integer idCbaplctaTaxa;

    @Basic
    @Column(name = "ID_CFAPORTA", table = "CFACCRED")
    private Integer idCfaporta;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFACCRED", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFACCRED", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFACCRED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFACCRED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFACCRED")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "CFACCRED", nullable = false)
    private Integer codigo;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "CFACCRED", nullable = false, length = 40)
    private String descricao;

    @Basic(optional = false)
    @Column(name = "PARCELA_FIM1", table = "CFACCRED", nullable = false)
    private Integer parcelaFim1;

    @Basic(optional = false)
    @Column(name = "PARCELA_FIM2", table = "CFACCRED", nullable = false)
    private Integer parcelaFim2;

    @Basic(optional = false)
    @Column(name = "PARCELA_FIM3", table = "CFACCRED", nullable = false)
    private Integer parcelaFim3;

    @Basic(optional = false)
    @Column(name = "TAXA1", table = "CFACCRED", nullable = false)
    private double taxa1;

    @Basic(optional = false)
    @Column(name = "TAXA2", table = "CFACCRED", nullable = false)
    private double taxa2;

    @Basic(optional = false)
    @Column(name = "TAXA3", table = "CFACCRED", nullable = false)
    private double taxa3;

    @Basic(optional = false)
    @Column(name = "TAXA_DEB", table = "CFACCRED", nullable = false)
    private double taxaDeb;

    @Basic(optional = false)
    @Column(name = "DIAS_DEB", table = "CFACCRED", nullable = false)
    private Integer diasDeb;

    @Basic(optional = false)
    @Column(name = "DIAS_CRE", table = "CFACCRED", nullable = false)
    private Integer diasCre;

    @Basic
    @Column(name = "ANTECIPA", table = "CFACCRED")
    private String antecipa;

    @Basic(optional = false)
    @Column(name = "TARIFA_POR_TRANSACAO", table = "CFACCRED", nullable = false)
    private double tarifaPorTransacao;

    @Basic(optional = false)
    @Column(name = "TAXA_INTERMEDIACAO", table = "CFACCRED", nullable = false)
    private double taxaIntermediacao;

    public Integer getIdCfaccred() {
        return idCfaccred;
    }

    public void setIdCfaccred(Integer idCfaccred) {
        this.idCfaccred = idCfaccred;
    }

    public Integer getIdCbaplctaTaxa() {
        return idCbaplctaTaxa;
    }

    public void setIdCbaplctaTaxa(Integer idCbaplctaTaxa) {
        this.idCbaplctaTaxa = idCbaplctaTaxa;
    }

    public Integer getIdCfaporta() {
        return idCfaporta;
    }

    public void setIdCfaporta(Integer idCfaporta) {
        this.idCfaporta = idCfaporta;
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

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getParcelaFim1() {
        return parcelaFim1;
    }

    public void setParcelaFim1(Integer parcelaFim1) {
        this.parcelaFim1 = parcelaFim1;
    }

    public Integer getParcelaFim2() {
        return parcelaFim2;
    }

    public void setParcelaFim2(Integer parcelaFim2) {
        this.parcelaFim2 = parcelaFim2;
    }

    public Integer getParcelaFim3() {
        return parcelaFim3;
    }

    public void setParcelaFim3(Integer parcelaFim3) {
        this.parcelaFim3 = parcelaFim3;
    }

    public double getTaxa1() {
        return taxa1;
    }

    public void setTaxa1(double taxa1) {
        this.taxa1 = taxa1;
    }

    public double getTaxa2() {
        return taxa2;
    }

    public void setTaxa2(double taxa2) {
        this.taxa2 = taxa2;
    }

    public double getTaxa3() {
        return taxa3;
    }

    public void setTaxa3(double taxa3) {
        this.taxa3 = taxa3;
    }

    public double getTaxaDeb() {
        return taxaDeb;
    }

    public void setTaxaDeb(double taxaDeb) {
        this.taxaDeb = taxaDeb;
    }

    public Integer getDiasDeb() {
        return diasDeb;
    }

    public void setDiasDeb(Integer diasDeb) {
        this.diasDeb = diasDeb;
    }

    public Integer getDiasCre() {
        return diasCre;
    }

    public void setDiasCre(Integer diasCre) {
        this.diasCre = diasCre;
    }

    public String getAntecipa() {
        return antecipa;
    }

    public void setAntecipa(String antecipa) {
        this.antecipa = antecipa;
    }

    public double getTarifaPorTransacao() {
        return tarifaPorTransacao;
    }

    public void setTarifaPorTransacao(double tarifaPorTransacao) {
        this.tarifaPorTransacao = tarifaPorTransacao;
    }

    public double getTaxaIntermediacao() {
        return taxaIntermediacao;
    }

    public void setTaxaIntermediacao(double taxaIntermediacao) {
        this.taxaIntermediacao = taxaIntermediacao;
    }

}