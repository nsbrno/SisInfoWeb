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
@Table(name = "CBALANCA")
public class CbalancaEntity {

    @Id
    @Column(name = "ID_CBALANCA", table = "CBALANCA", nullable = false)
    private Integer idCbalanca;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "CBALANCA", nullable = false)
    private Integer idSmaempre;

    @Basic(optional = false)
    @Column(name = "ID_CBALOTES", table = "CBALANCA", nullable = false)
    private Integer idCbalotes;

    @Basic(optional = false)
    @Column(name = "ID_CBAPLCTA_CRE", table = "CBALANCA", nullable = false)
    private Integer idCbaplctaCre;

    @Basic(optional = false)
    @Column(name = "ID_CBAPLCTA_DEB", table = "CBALANCA", nullable = false)
    private Integer idCbaplctaDeb;

    @Basic
    @Column(name = "ID_CBAITMOV", table = "CBALANCA")
    private Integer idCbaitmov;

    @Basic
    @Column(name = "ID_CBAITACE", table = "CBALANCA")
    private Integer idCbaitace;

    @Basic
    @Column(name = "ID_CBATALON", table = "CBALANCA")
    private Integer idCbatalon;

    @Basic
    @Column(name = "ID_CBAHIPAD", table = "CBALANCA")
    private Integer idCbahipad;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CBALANCA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CBALANCA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CBALANCA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CBALANCA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CBALANCA")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "SEQUENCIA", table = "CBALANCA", nullable = false)
    private Integer sequencia;

    @Basic(optional = false)
    @Column(name = "DT_MOVIMENTO", table = "CBALANCA", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtMovimento;

    @Basic
    @Column(name = "DT_CONCILIACAO", table = "CBALANCA")
    @Temporal(TemporalType.DATE)
    private Date dtConciliacao;

    @Basic
    @Column(name = "DT_PREDATADO", table = "CBALANCA")
    @Temporal(TemporalType.DATE)
    private Date dtPredatado;

    @Basic(optional = false)
    @Column(name = "ORIGEM", table = "CBALANCA", nullable = false)
    private String origem;

    @Basic
    @Column(name = "CONCILIADO", table = "CBALANCA")
    private String conciliado;

    @Basic
    @Column(name = "SERIE", table = "CBALANCA", length = 6)
    private String serie;

    @Basic
    @Column(name = "CHEQUE", table = "CBALANCA")
    private Integer cheque;

    @Basic(optional = false)
    @Column(name = "VALOR", table = "CBALANCA", nullable = false)
    private double valor;

    @Basic(optional = false)
    @Column(name = "VL_CONCILIADO", table = "CBALANCA", nullable = false)
    private double vlConciliado;

    @Basic(optional = false)
    @Column(name = "VL_RATEADO", table = "CBALANCA", nullable = false)
    private double vlRateado;

    @Lob
    @Basic
    @Column(name = "HISTORICO", table = "CBALANCA")
    private byte[] historico;

    @Basic
    @Column(name = "FAVORECIDO", table = "CBALANCA", length = 60)
    private String favorecido;

    public Integer getIdCbalanca() {
        return idCbalanca;
    }

    public void setIdCbalanca(Integer idCbalanca) {
        this.idCbalanca = idCbalanca;
    }

    public Integer getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(Integer idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdCbalotes() {
        return idCbalotes;
    }

    public void setIdCbalotes(Integer idCbalotes) {
        this.idCbalotes = idCbalotes;
    }

    public Integer getIdCbaplctaCre() {
        return idCbaplctaCre;
    }

    public void setIdCbaplctaCre(Integer idCbaplctaCre) {
        this.idCbaplctaCre = idCbaplctaCre;
    }

    public Integer getIdCbaplctaDeb() {
        return idCbaplctaDeb;
    }

    public void setIdCbaplctaDeb(Integer idCbaplctaDeb) {
        this.idCbaplctaDeb = idCbaplctaDeb;
    }

    public Integer getIdCbaitmov() {
        return idCbaitmov;
    }

    public void setIdCbaitmov(Integer idCbaitmov) {
        this.idCbaitmov = idCbaitmov;
    }

    public Integer getIdCbaitace() {
        return idCbaitace;
    }

    public void setIdCbaitace(Integer idCbaitace) {
        this.idCbaitace = idCbaitace;
    }

    public Integer getIdCbatalon() {
        return idCbatalon;
    }

    public void setIdCbatalon(Integer idCbatalon) {
        this.idCbatalon = idCbatalon;
    }

    public Integer getIdCbahipad() {
        return idCbahipad;
    }

    public void setIdCbahipad(Integer idCbahipad) {
        this.idCbahipad = idCbahipad;
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

    public Integer getSequencia() {
        return sequencia;
    }

    public void setSequencia(Integer sequencia) {
        this.sequencia = sequencia;
    }

    public Date getDtMovimento() {
        return dtMovimento;
    }

    public void setDtMovimento(Date dtMovimento) {
        this.dtMovimento = dtMovimento;
    }

    public Date getDtConciliacao() {
        return dtConciliacao;
    }

    public void setDtConciliacao(Date dtConciliacao) {
        this.dtConciliacao = dtConciliacao;
    }

    public Date getDtPredatado() {
        return dtPredatado;
    }

    public void setDtPredatado(Date dtPredatado) {
        this.dtPredatado = dtPredatado;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getConciliado() {
        return conciliado;
    }

    public void setConciliado(String conciliado) {
        this.conciliado = conciliado;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Integer getCheque() {
        return cheque;
    }

    public void setCheque(Integer cheque) {
        this.cheque = cheque;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getVlConciliado() {
        return vlConciliado;
    }

    public void setVlConciliado(double vlConciliado) {
        this.vlConciliado = vlConciliado;
    }

    public double getVlRateado() {
        return vlRateado;
    }

    public void setVlRateado(double vlRateado) {
        this.vlRateado = vlRateado;
    }

    public byte[] getHistorico() {
        return historico;
    }

    public void setHistorico(byte[] historico) {
        this.historico = historico;
    }

    public String getFavorecido() {
        return favorecido;
    }

    public void setFavorecido(String favorecido) {
        this.favorecido = favorecido;
    }

}