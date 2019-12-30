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
@Table(name = "AEAROMAN")
public class AearomanEntity {

    @Id
    @Column(name = "ID_AEAROMAN", table = "AEAROMAN", nullable = false)
    private Integer idAearoman;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "AEAROMAN", nullable = false)
    private Integer idSmaempre;

    @Basic
    @Column(name = "ID_CFAAREAS", table = "AEAROMAN")
    private Integer idCfaareas;

    @Basic
    @Column(name = "ID_CFAEQUIP", table = "AEAROMAN")
    private Integer idCfaequip;

    @Basic
    @Column(name = "ID_CFACLIFO", table = "AEAROMAN")
    private Integer idCfaclifo;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAROMAN", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAROMAN", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAROMAN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAROMAN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAROMAN")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "NUMERO", table = "AEAROMAN", nullable = false)
    private Integer numero;

    @Basic(optional = false)
    @Column(name = "DT_ROMANEIO", table = "AEAROMAN", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtRomaneio;

    @Basic
    @Column(name = "DT_EMISSAO", table = "AEAROMAN")
    @Temporal(TemporalType.DATE)
    private Date dtEmissao;

    @Basic
    @Column(name = "DT_SAIDA", table = "AEAROMAN")
    @Temporal(TemporalType.DATE)
    private Date dtSaida;

    @Basic
    @Column(name = "DT_FECHAMENTO", table = "AEAROMAN")
    @Temporal(TemporalType.DATE)
    private Date dtFechamento;

    @Basic(optional = false)
    @Column(name = "VALOR", table = "AEAROMAN", nullable = false)
    private double valor;

    @Lob
    @Basic
    @Column(name = "OBS", table = "AEAROMAN")
    private byte[] obs;

    @Basic
    @Column(name = "SITUACAO", table = "AEAROMAN")
    private String situacao;

    public Integer getIdAearoman() {
        return idAearoman;
    }

    public void setIdAearoman(Integer idAearoman) {
        this.idAearoman = idAearoman;
    }

    public Integer getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(Integer idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdCfaareas() {
        return idCfaareas;
    }

    public void setIdCfaareas(Integer idCfaareas) {
        this.idCfaareas = idCfaareas;
    }

    public Integer getIdCfaequip() {
        return idCfaequip;
    }

    public void setIdCfaequip(Integer idCfaequip) {
        this.idCfaequip = idCfaequip;
    }

    public Integer getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
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

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getDtRomaneio() {
        return dtRomaneio;
    }

    public void setDtRomaneio(Date dtRomaneio) {
        this.dtRomaneio = dtRomaneio;
    }

    public Date getDtEmissao() {
        return dtEmissao;
    }

    public void setDtEmissao(Date dtEmissao) {
        this.dtEmissao = dtEmissao;
    }

    public Date getDtSaida() {
        return dtSaida;
    }

    public void setDtSaida(Date dtSaida) {
        this.dtSaida = dtSaida;
    }

    public Date getDtFechamento() {
        return dtFechamento;
    }

    public void setDtFechamento(Date dtFechamento) {
        this.dtFechamento = dtFechamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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

}