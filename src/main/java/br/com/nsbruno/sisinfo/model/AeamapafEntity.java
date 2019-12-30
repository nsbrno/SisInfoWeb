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
@Table(name = "AEAMAPAF")
public class AeamapafEntity {

    @Id
    @Column(name = "ID_AEAMAPAF", table = "AEAMAPAF", nullable = false)
    private Integer idAeamapaf;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "AEAMAPAF", nullable = false)
    private Integer idSmaempre;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAMAPAF", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAMAPAF", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAMAPAF")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAMAPAF")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAMAPAF")
    private Integer ctInteg;

    @Basic
    @Column(name = "NUMERO_MAPA", table = "AEAMAPAF")
    private Integer numeroMapa;

    @Basic
    @Column(name = "DATA_MAPA", table = "AEAMAPAF")
    @Temporal(TemporalType.DATE)
    private Date dataMapa;

    @Basic(optional = false)
    @Column(name = "VL_MOVIMENTO_DIA", table = "AEAMAPAF", nullable = false)
    private double vlMovimentoDia;

    @Basic(optional = false)
    @Column(name = "VL_BASE_CALCULO", table = "AEAMAPAF", nullable = false)
    private double vlBaseCalculo;

    @Basic(optional = false)
    @Column(name = "VL_IMPOSTO_DEBITADO", table = "AEAMAPAF", nullable = false)
    private double vlImpostoDebitado;

    @Basic(optional = false)
    @Column(name = "VL_ISENTO", table = "AEAMAPAF", nullable = false)
    private double vlIsento;

    @Basic(optional = false)
    @Column(name = "VL_NAO_INCID", table = "AEAMAPAF", nullable = false)
    private double vlNaoIncid;

    @Basic(optional = false)
    @Column(name = "VL_SUBST_TRIB", table = "AEAMAPAF", nullable = false)
    private double vlSubstTrib;

    @Basic(optional = false)
    @Column(name = "VL_DESCONTO", table = "AEAMAPAF", nullable = false)
    private double vlDesconto;

    @Basic(optional = false)
    @Column(name = "VL_CANCELAMENTO", table = "AEAMAPAF", nullable = false)
    private double vlCancelamento;

    @Basic(optional = false)
    @Column(name = "VL_OUTROS_RECEB", table = "AEAMAPAF", nullable = false)
    private double vlOutrosReceb;

    @Basic(optional = false)
    @Column(name = "VL_BASE_CALC_SERV", table = "AEAMAPAF", nullable = false)
    private double vlBaseCalcServ;

    @Basic(optional = false)
    @Column(name = "VL_IMPOSTO_DEB_SERV", table = "AEAMAPAF", nullable = false)
    private double vlImpostoDebServ;

    @Basic(optional = false)
    @Column(name = "VL_SUB_TRIB_SERV", table = "AEAMAPAF", nullable = false)
    private double vlSubTribServ;

    @Basic(optional = false)
    @Column(name = "VL_ISENCAO_SERV", table = "AEAMAPAF", nullable = false)
    private double vlIsencaoServ;

    @Basic(optional = false)
    @Column(name = "VL_NAO_INCID_SERV", table = "AEAMAPAF", nullable = false)
    private double vlNaoIncidServ;

    @Basic(optional = false)
    @Column(name = "VL_DESCONTO_SERV", table = "AEAMAPAF", nullable = false)
    private double vlDescontoServ;

    @Basic(optional = false)
    @Column(name = "VL_CANCELAMENTO_SERV", table = "AEAMAPAF", nullable = false)
    private double vlCancelamentoServ;

    @Basic
    @Column(name = "FC_VL_CONTABIL_ICMS", table = "AEAMAPAF", precision = 15)
    private Double fcVlContabilIcms;

    @Basic
    @Column(name = "FC_VL_CONTABIL_ISS", table = "AEAMAPAF", precision = 15)
    private Double fcVlContabilIss;

    @Lob
    @Basic
    @Column(name = "OBSERVACAO", table = "AEAMAPAF")
    private byte[] observacao;

    public Integer getIdAeamapaf() {
        return idAeamapaf;
    }

    public void setIdAeamapaf(Integer idAeamapaf) {
        this.idAeamapaf = idAeamapaf;
    }

    public Integer getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(Integer idSmaempre) {
        this.idSmaempre = idSmaempre;
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

    public Integer getNumeroMapa() {
        return numeroMapa;
    }

    public void setNumeroMapa(Integer numeroMapa) {
        this.numeroMapa = numeroMapa;
    }

    public Date getDataMapa() {
        return dataMapa;
    }

    public void setDataMapa(Date dataMapa) {
        this.dataMapa = dataMapa;
    }

    public double getVlMovimentoDia() {
        return vlMovimentoDia;
    }

    public void setVlMovimentoDia(double vlMovimentoDia) {
        this.vlMovimentoDia = vlMovimentoDia;
    }

    public double getVlBaseCalculo() {
        return vlBaseCalculo;
    }

    public void setVlBaseCalculo(double vlBaseCalculo) {
        this.vlBaseCalculo = vlBaseCalculo;
    }

    public double getVlImpostoDebitado() {
        return vlImpostoDebitado;
    }

    public void setVlImpostoDebitado(double vlImpostoDebitado) {
        this.vlImpostoDebitado = vlImpostoDebitado;
    }

    public double getVlIsento() {
        return vlIsento;
    }

    public void setVlIsento(double vlIsento) {
        this.vlIsento = vlIsento;
    }

    public double getVlNaoIncid() {
        return vlNaoIncid;
    }

    public void setVlNaoIncid(double vlNaoIncid) {
        this.vlNaoIncid = vlNaoIncid;
    }

    public double getVlSubstTrib() {
        return vlSubstTrib;
    }

    public void setVlSubstTrib(double vlSubstTrib) {
        this.vlSubstTrib = vlSubstTrib;
    }

    public double getVlDesconto() {
        return vlDesconto;
    }

    public void setVlDesconto(double vlDesconto) {
        this.vlDesconto = vlDesconto;
    }

    public double getVlCancelamento() {
        return vlCancelamento;
    }

    public void setVlCancelamento(double vlCancelamento) {
        this.vlCancelamento = vlCancelamento;
    }

    public double getVlOutrosReceb() {
        return vlOutrosReceb;
    }

    public void setVlOutrosReceb(double vlOutrosReceb) {
        this.vlOutrosReceb = vlOutrosReceb;
    }

    public double getVlBaseCalcServ() {
        return vlBaseCalcServ;
    }

    public void setVlBaseCalcServ(double vlBaseCalcServ) {
        this.vlBaseCalcServ = vlBaseCalcServ;
    }

    public double getVlImpostoDebServ() {
        return vlImpostoDebServ;
    }

    public void setVlImpostoDebServ(double vlImpostoDebServ) {
        this.vlImpostoDebServ = vlImpostoDebServ;
    }

    public double getVlSubTribServ() {
        return vlSubTribServ;
    }

    public void setVlSubTribServ(double vlSubTribServ) {
        this.vlSubTribServ = vlSubTribServ;
    }

    public double getVlIsencaoServ() {
        return vlIsencaoServ;
    }

    public void setVlIsencaoServ(double vlIsencaoServ) {
        this.vlIsencaoServ = vlIsencaoServ;
    }

    public double getVlNaoIncidServ() {
        return vlNaoIncidServ;
    }

    public void setVlNaoIncidServ(double vlNaoIncidServ) {
        this.vlNaoIncidServ = vlNaoIncidServ;
    }

    public double getVlDescontoServ() {
        return vlDescontoServ;
    }

    public void setVlDescontoServ(double vlDescontoServ) {
        this.vlDescontoServ = vlDescontoServ;
    }

    public double getVlCancelamentoServ() {
        return vlCancelamentoServ;
    }

    public void setVlCancelamentoServ(double vlCancelamentoServ) {
        this.vlCancelamentoServ = vlCancelamentoServ;
    }

    public Double getFcVlContabilIcms() {
        return fcVlContabilIcms;
    }

    public void setFcVlContabilIcms(Double fcVlContabilIcms) {
        this.fcVlContabilIcms = fcVlContabilIcms;
    }

    public Double getFcVlContabilIss() {
        return fcVlContabilIss;
    }

    public void setFcVlContabilIss(Double fcVlContabilIss) {
        this.fcVlContabilIss = fcVlContabilIss;
    }

    public byte[] getObservacao() {
        return observacao;
    }

    public void setObservacao(byte[] observacao) {
        this.observacao = observacao;
    }

}