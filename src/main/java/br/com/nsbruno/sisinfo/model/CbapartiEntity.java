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
@Table(name = "CBAPARTI")
public class CbapartiEntity {

    @Id
    @Column(name = "ID_CBAPARTI", table = "CBAPARTI", nullable = false)
    private Integer idCbaparti;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "CBAPARTI", nullable = false)
    private Integer idSmaempre;

    @Basic(optional = false)
    @Column(name = "ID_CBAPLCTA", table = "CBAPARTI", nullable = false)
    private Integer idCbaplcta;

    @Basic(optional = false)
    @Column(name = "ID_CBALOTES", table = "CBAPARTI", nullable = false)
    private Integer idCbalotes;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CBAPARTI", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CBAPARTI", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CBAPARTI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CBAPARTI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CBAPARTI")
    private Integer ctInteg;

    @Basic
    @Column(name = "ORIGEM", table = "CBAPARTI")
    private String origem;

    @Basic
    @Column(name = "COD_ID_ORIGEM", table = "CBAPARTI")
    private Integer codIdOrigem;

    @Basic
    @Column(name = "COD_ID_AGRUPADOR", table = "CBAPARTI")
    private Integer codIdAgrupador;

    @Basic
    @Column(name = "LOTE", table = "CBAPARTI")
    private Integer lote;

    @Basic
    @Column(name = "D_C", table = "CBAPARTI")
    private String dC;

    @Basic
    @Column(name = "DT_MOVIMENTO", table = "CBAPARTI")
    @Temporal(TemporalType.DATE)
    private Date dtMovimento;

    @Basic
    @Column(name = "DT_CONCILIACAO", table = "CBAPARTI")
    @Temporal(TemporalType.DATE)
    private Date dtConciliacao;

    @Basic
    @Column(name = "DT_PREDATADO", table = "CBAPARTI")
    @Temporal(TemporalType.DATE)
    private Date dtPredatado;

    @Basic
    @Column(name = "SERIE", table = "CBAPARTI", length = 6)
    private String serie;

    @Basic
    @Column(name = "CHEQUE", table = "CBAPARTI")
    private Integer cheque;

    @Basic(optional = false)
    @Column(name = "VL_LANCADO", table = "CBAPARTI", nullable = false)
    private double vlLancado;

    @Basic(optional = false)
    @Column(name = "VL_CONCILIADO", table = "CBAPARTI", nullable = false)
    private double vlConciliado;

    @Basic(optional = false)
    @Column(name = "VL_RATEADO", table = "CBAPARTI", nullable = false)
    private double vlRateado;

    @Lob
    @Basic
    @Column(name = "HISTORICO", table = "CBAPARTI")
    private byte[] historico;

    @Basic
    @Column(name = "FAVORECIDO", table = "CBAPARTI", length = 60)
    private String favorecido;

    public Integer getIdCbaparti() {
        return idCbaparti;
    }

    public void setIdCbaparti(Integer idCbaparti) {
        this.idCbaparti = idCbaparti;
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

    public Integer getIdCbalotes() {
        return idCbalotes;
    }

    public void setIdCbalotes(Integer idCbalotes) {
        this.idCbalotes = idCbalotes;
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

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public Integer getCodIdOrigem() {
        return codIdOrigem;
    }

    public void setCodIdOrigem(Integer codIdOrigem) {
        this.codIdOrigem = codIdOrigem;
    }

    public Integer getCodIdAgrupador() {
        return codIdAgrupador;
    }

    public void setCodIdAgrupador(Integer codIdAgrupador) {
        this.codIdAgrupador = codIdAgrupador;
    }

    public Integer getLote() {
        return lote;
    }

    public void setLote(Integer lote) {
        this.lote = lote;
    }

    public String getDC() {
        return dC;
    }

    public void setDC(String dC) {
        this.dC = dC;
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

    public double getVlLancado() {
        return vlLancado;
    }

    public void setVlLancado(double vlLancado) {
        this.vlLancado = vlLancado;
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