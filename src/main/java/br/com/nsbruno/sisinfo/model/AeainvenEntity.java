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
@Table(name = "AEAINVEN")
public class AeainvenEntity {

    @Id
    @Column(name = "ID_AEAINVEN", table = "AEAINVEN", nullable = false)
    private Integer idAeainven;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "AEAINVEN", nullable = false)
    private Integer idSmaempre;

    @Basic
    @Column(name = "ID_AEAAGINV", table = "AEAINVEN")
    private Integer idAeaaginv;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAINVEN", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAINVEN", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAINVEN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAINVEN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAINVEN")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "DT_MOVIMENTO", table = "AEAINVEN", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtMovimento;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "AEAINVEN", nullable = false)
    private Integer codigo;

    @Basic(optional = false)
    @Column(name = "ABERTO", table = "AEAINVEN", nullable = false)
    private String aberto;

    @Basic(optional = false)
    @Column(name = "QTDE_LANCADA", table = "AEAINVEN", nullable = false)
    private double qtdeLancada;

    @Basic(optional = false)
    @Column(name = "QTDE_LANCADA_C", table = "AEAINVEN", nullable = false)
    private double qtdeLancadaC;

    public Integer getIdAeainven() {
        return idAeainven;
    }

    public void setIdAeainven(Integer idAeainven) {
        this.idAeainven = idAeainven;
    }

    public Integer getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(Integer idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdAeaaginv() {
        return idAeaaginv;
    }

    public void setIdAeaaginv(Integer idAeaaginv) {
        this.idAeaaginv = idAeaaginv;
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

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getAberto() {
        return aberto;
    }

    public void setAberto(String aberto) {
        this.aberto = aberto;
    }

    public double getQtdeLancada() {
        return qtdeLancada;
    }

    public void setQtdeLancada(double qtdeLancada) {
        this.qtdeLancada = qtdeLancada;
    }

    public double getQtdeLancadaC() {
        return qtdeLancadaC;
    }

    public void setQtdeLancadaC(double qtdeLancadaC) {
        this.qtdeLancadaC = qtdeLancadaC;
    }

}