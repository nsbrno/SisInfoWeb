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
@Table(name = "APACONTR")
public class ApacontrEntity {

    @Id
    @Column(name = "ID_APACONTR", table = "APACONTR", nullable = false)
    private Integer idApacontr;

    @Basic
    @Column(name = "ID_APADIZIM", table = "APACONTR")
    private Integer idApadizim;

    @Basic
    @Column(name = "ID_CFACLIFO", table = "APACONTR")
    private Integer idCfaclifo;

    @Basic
    @Column(name = "ID_APACONTP", table = "APACONTR")
    private Integer idApacontp;

    @Basic
    @Column(name = "US_CAD", table = "APACONTR", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "APACONTR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "APACONTR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "APACONTR")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "APACONTR", nullable = false, length = 16)
    private String guid;

    @Basic(optional = false)
    @Column(name = "DT_CONTRIBUICAO", table = "APACONTR", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtContribuicao;

    @Basic(optional = false)
    @Column(name = "ANO", table = "APACONTR", nullable = false)
    private Integer ano;

    @Basic(optional = false)
    @Column(name = "MES", table = "APACONTR", nullable = false)
    private Integer mes;

    @Basic(optional = false)
    @Column(name = "VALOR", table = "APACONTR", nullable = false)
    private double valor;

    @Basic
    @Column(name = "DT_PREVISAO", table = "APACONTR")
    @Temporal(TemporalType.DATE)
    private Date dtPrevisao;

    @Basic
    @Column(name = "PERIODO", table = "APACONTR")
    private String periodo;

    @Basic
    @Column(name = "COMPLEMENTO", table = "APACONTR")
    private String complemento;

    @Basic
    @Column(name = "NUM_RECIBO", table = "APACONTR")
    private Integer numRecibo;

    @Lob
    @Basic
    @Column(name = "OBS", table = "APACONTR")
    private byte[] obs;

    public Integer getIdApacontr() {
        return idApacontr;
    }

    public void setIdApacontr(Integer idApacontr) {
        this.idApacontr = idApacontr;
    }

    public Integer getIdApadizim() {
        return idApadizim;
    }

    public void setIdApadizim(Integer idApadizim) {
        this.idApadizim = idApadizim;
    }

    public Integer getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public Integer getIdApacontp() {
        return idApacontp;
    }

    public void setIdApacontp(Integer idApacontp) {
        this.idApacontp = idApacontp;
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

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Date getDtContribuicao() {
        return dtContribuicao;
    }

    public void setDtContribuicao(Date dtContribuicao) {
        this.dtContribuicao = dtContribuicao;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDtPrevisao() {
        return dtPrevisao;
    }

    public void setDtPrevisao(Date dtPrevisao) {
        this.dtPrevisao = dtPrevisao;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Integer getNumRecibo() {
        return numRecibo;
    }

    public void setNumRecibo(Integer numRecibo) {
        this.numRecibo = numRecibo;
    }

    public byte[] getObs() {
        return obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

}