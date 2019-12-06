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
@Table(name = "CBALOTES")
public class CbalotesEntity {

    @Id
    @Column(name = "ID_CBALOTES", table = "CBALOTES", nullable = false)
    private Integer idCbalotes;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "CBALOTES", nullable = false)
    private int idSmaempre;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CBALOTES", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CBALOTES", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CBALOTES")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CBALOTES")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CBALOTES")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "ANO", table = "CBALOTES", nullable = false)
    private int ano;

    @Basic(optional = false)
    @Column(name = "NUMERO", table = "CBALOTES", nullable = false)
    private int numero;

    @Basic(optional = false)
    @Column(name = "ORIGEM", table = "CBALOTES", nullable = false, length = 18)
    private String origem;

    @Basic(optional = false)
    @Column(name = "SITUACAO", table = "CBALOTES", nullable = false)
    private String situacao;

    @Basic(optional = false)
    @Column(name = "DT_INICIO", table = "CBALOTES", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtInicio;

    @Basic(optional = false)
    @Column(name = "DT_FIM", table = "CBALOTES", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtFim;

    @Basic(optional = false)
    @Column(name = "VL_CAPA_LOTE", table = "CBALOTES", nullable = false)
    private double vlCapaLote;

    @Basic(optional = false)
    @Column(name = "VALOR", table = "CBALOTES", nullable = false)
    private double valor;

    @Basic
    @Column(name = "TAG", table = "CBALOTES")
    private String tag;

    public Integer getIdCbalotes() {
        return idCbalotes;
    }

    public void setIdCbalotes(Integer idCbalotes) {
        this.idCbalotes = idCbalotes;
    }

    public int getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(int idSmaempre) {
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Date getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(Date dtInicio) {
        this.dtInicio = dtInicio;
    }

    public Date getDtFim() {
        return dtFim;
    }

    public void setDtFim(Date dtFim) {
        this.dtFim = dtFim;
    }

    public double getVlCapaLote() {
        return vlCapaLote;
    }

    public void setVlCapaLote(double vlCapaLote) {
        this.vlCapaLote = vlCapaLote;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

}